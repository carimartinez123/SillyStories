package carimartinez123.sillystories;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class BookActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        TextView storyTextView = (TextView)findViewById(R.id.storyText);
        BookContent.generateText(BookContent.getTitle());
        storyTextView.setText(BookContent.getText());

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
