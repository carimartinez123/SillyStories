package carimartinez123.sillystories;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class NewStoryActivity extends AppCompatActivity {

    Button storyButton1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_story);
        storyButton1 = (Button)findViewById(R.id.story1Button);
        storyButton1.setTextColor(Color.BLACK);



    }
    @Override
    public void onResume()
    {
        super.onResume();
        storyButton1.setTextColor(Color.BLACK);
    }

    public void goToSelections(View view)
    {
        Intent intent;
        if(view.getId() == R.id.story1Button) {
            storyButton1.setTextColor(Color.WHITE);
            BookContent.setTitle("Ride to the Airport");
            BookContent.generateGrammarTypes("Ride to the Airport");
            intent = new Intent(this, CharacterSelectionActivity.class);
            startActivity(intent);
            finish();
        }



    }



}
