package carimartinez123.sillystories;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.io.File;
import java.util.ArrayList;

public class SavedStoryActivity extends AppCompatActivity {
    private Spinner savedStorySpinner;
    private static File fileToDelete = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saved_story);
        savedStorySpinner = (Spinner) findViewById(R.id.savedStorySpinner);
        initSpinner();





    }

    public void initSpinner(){
        savedStorySpinner = (Spinner) findViewById(R.id.savedStorySpinner);
        File[] fileList = getFilesDir().listFiles();
        ArrayList<String> filenameList = new ArrayList();
        for(int i = 0; i < fileList.length; i++){
            filenameList.add(fileList[i].getName());
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<>(SavedStoryActivity.this, android.R.layout.simple_spinner_item, filenameList);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        savedStorySpinner.setAdapter(adapter);
        addListenerOnSpinnerItemSelection();
    }



    public void addListenerOnSpinnerItemSelection() {

        savedStorySpinner.setOnItemSelectedListener(new SpinnerOnItemSelectedListener());
    }

    public void startBook(View v){

        Intent intent = new Intent(this, BookActivity.class);
        startActivity(intent);

    }

    public void deleteBook(View v){

       if(fileToDelete != null)
       {
           deleteFile(fileToDelete.getName());
       }

    }

    public static void setFileToDelete(File fileToDelete) {
        SavedStoryActivity.fileToDelete = fileToDelete;
    }
}
