package carimartinez123.sillystories;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;

import android.widget.ListView;

import android.widget.Toast;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SavedStoryActivity extends AppCompatActivity {

    private String selectedFilename;
    private static ArrayAdapter<String> adapter;
    private static File selectedFile = null;
    private static ArrayList<String> filenameList;
    private static ListView savedStoryListView;
    private Button startStoryButton;
    private Button deleteStoryButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saved_story);
        startStoryButton = (Button) findViewById(R.id.startStoryButton);
        deleteStoryButton = (Button) findViewById(R.id.deleteStoryButton);


        savedStoryListView = (ListView) findViewById(R.id.savedStoryListView);

        initListView();

    }

    private void initListView()
    {

        filenameList = getSavedFiles();
        adapter = new ArrayAdapter(this, R.layout.textview,filenameList);
        savedStoryListView.setAdapter(adapter);
        savedStoryListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapter, View v, int position, long id) {
                selectedFilename = (String) adapter.getItemAtPosition(position);
                selectedFile = new File(MainActivity.appDirectory.toString() + "/" + selectedFilename + ".txt");
            }
        });


    }

    public ArrayList<String> getSavedFiles()
    {
        String filename;
        File[] fileList = getFilesDir().listFiles();
        ArrayList<String> filenameList = new ArrayList();
        for(int i = 0; i < fileList.length; i++){
            filename = fileList[i].getName();
            filenameList.add(filename.substring(0,filename.lastIndexOf('.')));
        }
        return filenameList;
    }

    public void startBook(View v){
        if(selectedFilename == null)
        {
            Toast selectToast = Toast.makeText(this, "Pick a story!", Toast.LENGTH_SHORT);
            selectToast.show();

        }
        else
        {
            String text="ERROR READING FILE!";
            try {

                text = readFile(selectedFile);

            } catch (IOException e) {
                Log.d("TEST", text);
            }
            BookContent.setText(text);
            BookContent.setTitle(text.substring(0, '\n'));
            Intent intent = new Intent(this, BookActivity.class);
            intent.putExtra("savedStory", true);
            startActivity(intent);
            finish();
        }
    }

    /**This method taken directly from http://stackoverflow.com/questions/326390/how-to-create-a-java-string-from-the-contents-of-a-file**/

    private String readFile(File filename) throws IOException {


        StringBuilder fileContents = new StringBuilder((int)filename.length());
        Scanner scanner = new Scanner(filename);
        String lineSeparator = System.getProperty("line.separator");

        try {
            while(scanner.hasNextLine()) {
                fileContents.append(scanner.nextLine() + lineSeparator);
            }
            return fileContents.toString();
        } finally {
            scanner.close();
        }
    }
    public void deleteBook(View v){

       if(selectedFile == null)
       {
           Toast selectToast = Toast.makeText(this, "Pick a story!", Toast.LENGTH_SHORT);
           selectToast.show();
       }
       else{

           AlertDialog confirmDeleteBox = AskOption(selectedFile.getName());
           confirmDeleteBox.show();



       }

    }


    private AlertDialog AskOption(String filename) {
        AlertDialog deleteDialog =new AlertDialog.Builder(this)

                .setTitle("Delete")
                .setMessage("Do you want to delete " + filename + "?")


                .setPositiveButton("Delete", new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int whichButton) {
                        deleteFile(selectedFile.getName());
                        filenameList.remove(selectedFile.getName());
                        adapter.notifyDataSetChanged();
                        dialog.dismiss();
                        initListView();
                        recreate();
                    }

                })



                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.dismiss();

                    }
                })
                .create();
        return deleteDialog;

    }
}
