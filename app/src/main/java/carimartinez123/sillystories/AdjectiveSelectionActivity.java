package carimartinez123.sillystories;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class AdjectiveSelectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adjective_selection);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
    public void getAdjs(View view)
    {

        if(view.getId() == R.id.stinkyButton) {

            BookContent.getAdjs().add("stinky");

        }
        else if(view.getId() == R.id.sillyButton) {

            BookContent.getAdjs().add("silly");

        }
        else if(view.getId() == R.id.suspiciousButton) {

            BookContent.getAdjs().add("suspicious");

        }
        else if(view.getId() == R.id.doneAdjsButton)
        {
            int i = 0;
            while(i < BookContent.getAdjs().size()) {
                System.out.println(BookContent.getAdjs().get(i));
                i++;
            }
            Intent intent = new Intent(this, BookActivity.class);
            startActivity(intent);
        }

    }


}
