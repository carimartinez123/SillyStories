package carimartinez123.sillystories;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NounSelectionActivity extends AppCompatActivity {


    private boolean noun0Selected = false;
    private boolean noun1Selected = false;
    private boolean noun2Selected = false;
    private boolean noun3Selected = false;
    private boolean noun4Selected = false;
    private boolean noun5Selected = false;
    private boolean noun6Selected = false;
    private boolean noun7Selected = false;
    private boolean noun8Selected = false;

    /*private String noun2 = getString(R.string.noun2);
    private String noun3 = getString(R.string.noun3);
    private String noun4 = getString(R.string.noun4);
    private String noun5 = getString(R.string.noun5);
    private String noun6 = getString(R.string.noun6);
    private String noun7 = getString(R.string.noun7);
    private String noun8 = getString(R.string.noun8);
*/
    private TextView nounNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        System.out.println("STARTING NOUNS");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noun_selection);
        nounNum = (TextView) findViewById(R.id.nounNumTextView);
        nounNum.setText("Pick " + (BookContent.getNumNouns() - BookContent.getNouns().size()) + " nouns:");
        Button doneButton = (Button) findViewById(R.id.doneNounsButton);
        doneButton.setEnabled(false);


    }
    @Override
    public void onResume()
    {
        super.onResume();
        for(String str: BookContent.getNouns())
        {
            Button doneButton = (Button) findViewById(R.id.doneNounsButton);
            doneButton.setEnabled(false);
            BookContent.getNouns().remove(str);
            updateNounNum();
        }

    }


    private void updateNounNum()
    {
        int nounsLeft = BookContent.getNumNouns() - BookContent.getNouns().size();
        if(nounsLeft > 1) {
            nounNum.setText("Pick " + nounsLeft + " nouns:");
        }
        else if (nounsLeft == 1)
        {
            nounNum.setText("Pick " + nounsLeft + " noun:");
        }
        else
        {
            nounNum.setText("Click done!");
            Button doneButton = (Button) findViewById(R.id.doneNounsButton);
            doneButton.setEnabled(true);
        }
    }

    public void getNouns(View view)
    {

        if(view.getId() == R.id.noun0Button && !noun0Selected) {
            noun0Selected = true;
            BookContent.getNouns().add(getString(R.string.noun0));
            updateNounNum();

        }
        else if(view.getId() == R.id.noun1Button && !noun1Selected) {
            noun1Selected = true;
            BookContent.getNouns().add(getString(R.string.noun1));
            updateNounNum();


        }
        else if(view.getId() == R.id.noun2Button && !noun2Selected) {
            noun2Selected = true;
            BookContent.getNouns().add(getString(R.string.noun2));
            updateNounNum();

        }
        else if(view.getId() == R.id.noun3Button && !noun3Selected) {
            noun3Selected = true;
            BookContent.getNouns().add(getString(R.string.noun3));
            updateNounNum();

        }
        else if(view.getId() == R.id.noun4Button && !noun4Selected) {
            noun6Selected = true;
            BookContent.getNouns().add(getString(R.string.noun4));
            updateNounNum();


        }
        else if(view.getId() == R.id.noun5Button && !noun5Selected) {
            noun5Selected = true;
            BookContent.getNouns().add(getString(R.string.noun5));
            updateNounNum();

        }
        else if(view.getId() == R.id.noun6Button && !noun6Selected) {
            noun6Selected = true;
            BookContent.getNouns().add(getString(R.string.noun6));
            updateNounNum();


        }

        else if(view.getId() == R.id.noun7Button && !noun7Selected) {
            noun7Selected = true;
            BookContent.getNouns().add(getString(R.string.noun7));
            updateNounNum();


        }

        else if(view.getId() == R.id.noun8Button && !noun8Selected) {
            noun8Selected = true;
            BookContent.getNouns().add(getString(R.string.noun8));
            updateNounNum();


        }
        else if(view.getId() == R.id.doneNounsButton)
        {

            if(BookContent.getNouns().size() != BookContent.getNumNouns()) {

            }
            else {
                Intent intent = new Intent(this, AdjectiveSelectionActivity.class);
                startActivity(intent);
            }
        }

    }

}
/*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noun_selection);


    }

    public void getNouns(View view)
    {
        System.out.println(getString(R.string.noun0));
        if(view.getId() == R.id.noun0Button) {

            BookContent.getNouns().add("umbrella");

        }
        else if(view.getId() == R.id.noun1Button) {

            BookContent.getNouns().add("wig");

        }
        else if(view.getId() == R.id.noun2Button) {

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

*/