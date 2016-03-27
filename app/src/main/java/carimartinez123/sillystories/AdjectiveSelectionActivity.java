package carimartinez123.sillystories;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AdjectiveSelectionActivity extends AppCompatActivity {


    private boolean adj0Selected = false;
    private boolean adj1Selected = false;
    private boolean adj2Selected = false;
    private boolean adj3Selected = false;
    private boolean adj4Selected = false;
    private boolean adj5Selected = false;
    private boolean adj6Selected = false;
    private boolean adj7Selected = false;
    private boolean adj8Selected = false;

    private TextView adjNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adjective_selection);
        adjNum = (TextView) findViewById(R.id.adjNumTextView);
        adjNum.setText("Pick " + (BookContent.getNumAdjs() - BookContent.getAdjs().size()) + " Adjectives:");
        Button doneButton = (Button) findViewById(R.id.doneAdjsButton);
        doneButton.setEnabled(false);


    }
    @Override
    public void onResume()
    {
        super.onResume();


    }
    @Override
    public void onBackPressed() {

        //disable back button
    }

    private void updateAdjNum()
    {
        int adjsLeft = BookContent.getNumAdjs() - BookContent.getAdjs().size();
        if(adjsLeft > 1) {
            adjNum.setText("Pick " + adjsLeft + " Adjectives:");
        }
        else if (adjsLeft == 1)
        {
            adjNum.setText("Pick " + adjsLeft + " Adjective:");
        }
        else
        {
            adjNum.setText("Click done!");
            Button doneButton = (Button) findViewById(R.id.doneAdjsButton);
            doneButton.setEnabled(true);
        }
    }

    public void getAdjs(View view)
    {

        if(view.getId() == R.id.adj0Button && !adj0Selected) {
            adj0Selected = true;
            BookContent.getAdjs().add(getString(R.string.adj0));
            updateAdjNum();

        }
        else if(view.getId() == R.id.adj1Button && !adj1Selected) {
            adj1Selected = true;
            BookContent.getAdjs().add(getString(R.string.adj1));
            updateAdjNum();


        }
        else if(view.getId() == R.id.adj2Button && !adj2Selected) {
            adj2Selected = true;
            BookContent.getAdjs().add(getString(R.string.adj2));
            updateAdjNum();

        }
        else if(view.getId() == R.id.adj3Button && !adj3Selected) {
            adj3Selected = true;
            BookContent.getAdjs().add(getString(R.string.adj3));
            updateAdjNum();

        }
        else if(view.getId() == R.id.adj4Button && !adj4Selected) {
            adj4Selected = true;
            BookContent.getAdjs().add(getString(R.string.adj4));
            updateAdjNum();


        }
        else if(view.getId() == R.id.adj5Button && !adj5Selected) {
            adj5Selected = true;
            BookContent.getAdjs().add(getString(R.string.adj5));
            updateAdjNum();

        }
        else if(view.getId() == R.id.adj6Button && !adj6Selected) {
            adj6Selected = true;
            BookContent.getAdjs().add(getString(R.string.adj6));
            updateAdjNum();


        }

        else if(view.getId() == R.id.adj7Button && !adj7Selected) {
            adj7Selected = true;
            BookContent.getAdjs().add(getString(R.string.adj7));
            updateAdjNum();


        }

        else if(view.getId() == R.id.adj8Button && !adj8Selected) {
            adj8Selected = true;
            BookContent.getAdjs().add(getString(R.string.adj8));
            updateAdjNum();


        }
        else if(view.getId() == R.id.doneAdjsButton)
        {

            if(BookContent.getAdjs().size() < BookContent.getNumAdjs()) {
                Log.d("TEST", "Size of BookContent.adj less than required number of adjs for this story!");

            }
            else {
                Intent intent = new Intent(this, BookActivity.class);
                startActivity(intent);
            }
        }

    }

}
/*
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
*/