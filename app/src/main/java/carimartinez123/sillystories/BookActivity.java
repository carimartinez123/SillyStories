package carimartinez123.sillystories;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class BookActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);
        TextView storyTextView = (TextView)findViewById(R.id.storyText);
        BookContent.generateText(BookContent.getTitle());
        storyTextView.setText(Html.fromHtml(BookContent.getText()));

    }

    @Override
    public void onBackPressed() {

        //disable back button
    }

    public void restart()
    {


        Intent restartIntent = new Intent(this, MainActivity.class);
        restartIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); //Set this flag
        startActivity(restartIntent);
        finish();

    }

    public void saveStory(View v){

        int i = 1;
        File file = new File(getFilesDir(), BookContent.getTitle() + ".txt");
        while(file.exists()){
            file = new File(getFilesDir(), BookContent.getTitle() + i + ".txt");
            i++;
        }

        try {
            PrintWriter writer = new PrintWriter(getFilesDir() + "/" + file.getName());
            writer.println(BookContent.getText());
            writer.close();
            Toast savedToast = Toast.makeText(BookActivity.this, "Story saved!", Toast.LENGTH_LONG);
            savedToast.show();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }


}
