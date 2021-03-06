package carimartinez123.sillystories;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.io.File;

public class MainActivity extends AppCompatActivity {
    public static File appDirectory;
    private Button newButton;
    private Button savedButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        resetData();
        setContentView(R.layout.activity_main);
        newButton = (Button)findViewById(R.id.newStoryButton);
        savedButton = (Button)findViewById(R.id.savedStoryButton);
        newButton.setTextColor(Color.BLACK);
        savedButton.setTextColor(Color.BLACK);
        appDirectory = getFilesDir();

    }

    @Override
    public void onResume()
    {
        super.onResume();
        savedButton.setTextColor(Color.BLACK);
        newButton.setTextColor(Color.BLACK);

    }

    public void resetData()
    {
        BookContent.getChars().clear();
        BookContent.getNouns().clear();
        BookContent.getAdjs().clear();
        BookContent.getAdvs().clear();
        BookContent.getNums().clear();
        BookContent.getPlaces().clear();
        BookContent.getWeathers().clear();

    }
    public void startStory(View view)
    {
        Intent intent = new Intent(this, NewStoryActivity.class);
        newButton.setTextColor(Color.WHITE);
        startActivity(intent);
    }

    public void startSavedStory(View view)
    {
        File[] fileList = getFilesDir().listFiles();
        if(fileList.length < 1)
        {
            Toast unimplementedToast = Toast.makeText(this, "No saved stories!", Toast.LENGTH_LONG);
            unimplementedToast.show();
        }
        else
        {
            Intent intent = new Intent(this, SavedStoryActivity.class);
            savedButton.setTextColor(Color.WHITE);
            startActivity(intent);
        }
    }
    public void customize(View view)

        {
            Toast unimplementedToast = Toast.makeText(this, "Not yet implemented", Toast.LENGTH_LONG);
            unimplementedToast.show();
        }




}
