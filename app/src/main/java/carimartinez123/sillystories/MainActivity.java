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

import java.io.File;

public class MainActivity extends AppCompatActivity {
    public static File appDirectory;
    private Button newButton;
    private Button savedButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
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
    public void startStory(View view)
    {
        Intent intent;
        if(view.getId() == R.id.savedStoryButton) {
            savedButton.setTextColor(Color.WHITE);
            intent = new Intent(this, SavedStoryActivity.class);
        }
        else
        {
            newButton.setTextColor(Color.WHITE);
            intent = new Intent(this, NewStoryActivity.class);
        }
        startActivity(intent);
    }

}
