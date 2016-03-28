package carimartinez123.sillystories;

import android.content.Intent;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Scanner;

/**
 * Created by cari_martinez123 on 3/15/2016.
 */

public class SpinnerOnItemSelectedListener implements AdapterView.OnItemSelectedListener {
    private String savedStoryFilename;
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        savedStoryFilename = parent.getItemAtPosition(position).toString();
        Log.d("TEST", savedStoryFilename);
        File savedStoryFile = new File(MainActivity.appDirectory.toString() + "/" + savedStoryFilename);
        Log.d("TEST", savedStoryFile.getName());
        SavedStoryActivity.setFileToDelete(savedStoryFile);

        String text = "ERROR READING FILE!";
        try {
            text = readFile(savedStoryFile);
            Log.d("TEST", text);
        } catch (IOException e) {
            e.printStackTrace();
        }
        BookContent.setText(text);
        BookContent.setTitle(savedStoryFilename.substring(0, savedStoryFilename.lastIndexOf('.')));

    }


    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        savedStoryFilename = parent.getItemAtPosition(0).toString();
        File savedStoryFile = new File(MainActivity.appDirectory.toString() + "/" + savedStoryFilename);
        SavedStoryActivity.setFileToDelete(savedStoryFile);

        String text = "ERROR READING FILE!";
        try {
            text = readFile(savedStoryFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        BookContent.setText(text);
        BookContent.setTitle(savedStoryFilename.substring(0, savedStoryFilename.lastIndexOf('.')));
    }

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

    public void setSavedStoryFilename(String savedStoryFilename) {
        this.savedStoryFilename = savedStoryFilename;
    }
}
