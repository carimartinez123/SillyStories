package carimartinez123.sillystories;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class NounSelectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noun_selection);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    public void getNouns(View view)
    {

        if(view.getId() == R.id.umbrellaButton) {

            BookContent.getNouns().add("umbrella");

        }
        else if(view.getId() == R.id.wigButton) {

            BookContent.getNouns().add("wig");

        }
        else if(view.getId() == R.id.shirtButton) {

            BookContent.getNouns().add("shirt");

        }
        else if(view.getId() == R.id.doneNounsButton)
        {
            int i = 0;
            while(i < BookContent.getNouns().size()) {
                System.out.println(BookContent.getNouns().get(i));
                i++;
            }
            Intent intent = new Intent(this, AdjectiveSelectionActivity.class);
            startActivity(intent);
        }

    }

}
