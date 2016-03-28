package carimartinez123.sillystories;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.io.File;
import java.util.ArrayList;

public class SavedStoryActivity extends AppCompatActivity {
    private Spinner savedStorySpinner;
    private static ArrayAdapter<String> adapter;
    private static File fileToDelete = null;
    private static ArrayList<String> filenameList;
    private Bundle savedInstanceState;
    private SpinnerOnItemSelectedListener listener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saved_story);
        savedStorySpinner = (Spinner) findViewById(R.id.savedStorySpinner);
        initSpinner();

    }



    public void initSpinner(){

        filenameList = getSavedFiles();
        adapter = new ArrayAdapter<>(SavedStoryActivity.this, R.layout.spinner_layout, filenameList);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        savedStorySpinner.setAdapter(adapter);
        addListenerOnSpinnerItemSelection();
    }

    public ArrayList<String> getSavedFiles()
    {
        File[] fileList = getFilesDir().listFiles();
        ArrayList<String> filenameList = new ArrayList();
        for(int i = 0; i < fileList.length; i++){
            filenameList.add(fileList[i].getName());
        }
        return filenameList;
    }

    public void addListenerOnSpinnerItemSelection() {
        listener = (new SpinnerOnItemSelectedListener());
        savedStorySpinner.setOnItemSelectedListener(listener);
    }

    public void startBook(View v){

        Intent intent = new Intent(this, BookActivity.class);
        startActivity(intent);
        finish();

    }

    public void deleteBook(View v){

       if(fileToDelete != null)
       {
           AlertDialog confirmDeleteBox = AskOption(fileToDelete.getName());
           confirmDeleteBox.show();
           initSpinner();


       }
        recreate();
    }

    public static void setFileToDelete(File fileToDelete) {
        SavedStoryActivity.fileToDelete = fileToDelete;

    }

    private AlertDialog AskOption(String filename) {
        AlertDialog myQuittingDialogBox =new AlertDialog.Builder(this)
                //set message, title, and icon
                .setTitle("Delete")
                .setMessage("Do you want to delete " + filename + "?")


                .setPositiveButton("Delete", new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int whichButton) {
                        deleteFile(fileToDelete.getName());
                        filenameList.remove(fileToDelete.getName());
                        adapter.notifyDataSetChanged();
                        dialog.dismiss();
                        recreate();
                    }

                })



                .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.dismiss();

                    }
                })
                .create();
        return myQuittingDialogBox;

    }
}
