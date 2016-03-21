package carimartinez123.sillystories;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class NewStoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_story);




    }

    public void goToSelections(View view)
    {
        Intent intent;
        if(view.getId() == R.id.story1Button) {
            BookContent.setTitle("Ride to the Airport");
            BookContent.generateGrammarTypes("Ride to the Airport");
            intent = new Intent(this, CharacterSelectionActivity.class);
            startActivity(intent);
        }



    }



}
