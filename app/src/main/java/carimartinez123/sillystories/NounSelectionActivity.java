package carimartinez123.sillystories;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
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
    private boolean noun9Selected = false;
    private boolean noun10Selected = false;
    private boolean noun11Selected = false;

    private Button button0;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;
    private Button button11;
    private Button doneButton;
    private TextView nounNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noun_selection);
        button0 = (Button)findViewById(R.id.noun0Button);
        button1 = (Button)findViewById(R.id.noun1Button);
        button2 = (Button)findViewById(R.id.noun2Button);
        button3 = (Button)findViewById(R.id.noun3Button);
        button4 = (Button)findViewById(R.id.noun4Button);
        button5 = (Button)findViewById(R.id.noun5Button);
        button6 = (Button)findViewById(R.id.noun6Button);
        button7 = (Button)findViewById(R.id.noun7Button);
        button8 = (Button)findViewById(R.id.noun8Button);
        button9 = (Button)findViewById(R.id.noun9Button);
        button10 = (Button)findViewById(R.id.noun10Button);
        button11 = (Button)findViewById(R.id.noun11Button);

        nounNum = (TextView) findViewById(R.id.nounNumTextView);
        doneButton = (Button) findViewById(R.id.doneNounsButton);
        doneButton.setEnabled(false);
        updateNounNum();

    }
    @Override
    public void onBackPressed() {

        //disable back button
    }

    @Override
    public void onResume()
    {
        super.onResume();
        

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
        
        if(view.getId() == R.id.noun0Button) {
            if(!noun0Selected && (BookContent.getNouns().size() < BookContent.getNumNouns())) {
                noun0Selected = true;
                button0.setTextColor(Color.BLACK);
                BookContent.getNouns().add(getString(R.string.noun0));
            }
            else
            {
                if(noun0Selected) {
                    noun0Selected = false;
                    button0.setTextColor(Color.WHITE);
                    BookContent.getNouns().remove(getString(R.string.noun0));
                }
            }
            updateNounNum();

        }
        else if(view.getId() == R.id.noun1Button) {
            if(!noun1Selected && (BookContent.getNouns().size() < BookContent.getNumNouns())) {
                noun1Selected = true;
                button1.setTextColor(Color.BLACK);
                BookContent.getNouns().add(getString(R.string.noun1));
            }
            else
            {
                if(noun1Selected) {
                    noun1Selected = false;
                    button1.setTextColor(Color.WHITE);
                    BookContent.getNouns().remove(getString(R.string.noun1));
                }
            }
            updateNounNum();

        }
        else if(view.getId() == R.id.noun2Button) {
            if(!noun2Selected && (BookContent.getNouns().size() < BookContent.getNumNouns())) {
                noun2Selected = true;
                button2.setTextColor(Color.BLACK);
                BookContent.getNouns().add(getString(R.string.noun2));
            }
            else
            {
                if(noun2Selected) {
                    noun2Selected = false;
                    button2.setTextColor(Color.WHITE);
                    BookContent.getNouns().remove(getString(R.string.noun2));
                }
            }
            updateNounNum();

        }
        else if(view.getId() == R.id.noun3Button) {
            if(!noun3Selected) {
                noun3Selected = true;
                button3.setTextColor(Color.BLACK);
                BookContent.getNouns().add(getString(R.string.noun3));
            }
            else
            {
                if(noun3Selected) {
                    noun3Selected = false;
                    button3.setTextColor(Color.WHITE);
                    BookContent.getNouns().remove(getString(R.string.noun3));
                }
            }
            updateNounNum();

        }
        else if(view.getId() == R.id.noun4Button) {
            if(!noun4Selected && (BookContent.getNouns().size() < BookContent.getNumNouns())) {
                noun4Selected = true;
                button4.setTextColor(Color.BLACK);
                BookContent.getNouns().add(getString(R.string.noun4));
            }
            else
            {
                if(noun4Selected) {
                    noun4Selected = false;
                    button4.setTextColor(Color.WHITE);
                    BookContent.getNouns().remove(getString(R.string.noun4));
                }
            }
            updateNounNum();

        }
        else if(view.getId() == R.id.noun5Button) {
            if(!noun5Selected && (BookContent.getNouns().size() < BookContent.getNumNouns())) {
                button5.setTextColor(Color.BLACK);
                noun5Selected = true;
                BookContent.getNouns().add(getString(R.string.noun5));
            }
            else
            {
                if(noun5Selected) {
                    noun5Selected = false;
                    button5.setTextColor(Color.WHITE);
                    BookContent.getNouns().remove(getString(R.string.noun5));
                }
            }
            updateNounNum();

        }
        else if(view.getId() == R.id.noun6Button) {
            if(!noun6Selected && (BookContent.getNouns().size() < BookContent.getNumNouns())) {
                noun6Selected = true;
                button6.setTextColor(Color.BLACK);
                BookContent.getNouns().add(getString(R.string.noun6));
            }
            else
            {
                if(noun6Selected) {
                    noun6Selected = false;
                    button6.setTextColor(Color.WHITE);
                    BookContent.getNouns().remove(getString(R.string.noun6));
                }
            }
            updateNounNum();

        }
        else if(view.getId() == R.id.noun7Button) {
            if(!noun7Selected && (BookContent.getNouns().size() < BookContent.getNumNouns())) {
                noun7Selected = true;
                button7.setTextColor(Color.BLACK);
                BookContent.getNouns().add(getString(R.string.noun7));
            }
            else {
                if (noun7Selected) {
                    noun7Selected = false;
                    button7.setTextColor(Color.WHITE);
                    BookContent.getNouns().remove(getString(R.string.noun7));
                }
            }
            updateNounNum();

        }
        else if(view.getId() == R.id.noun8Button) {
            if(!noun8Selected && (BookContent.getNouns().size() < BookContent.getNumNouns())) {
                noun8Selected = true;
                button8.setTextColor(Color.BLACK);
                BookContent.getNouns().add(getString(R.string.noun8));
            }
            else
            {
                if(noun8Selected) {
                    noun8Selected = false;
                    button8.setTextColor(Color.WHITE);
                    BookContent.getNouns().remove(getString(R.string.noun8));
                }
            }
            updateNounNum();

        }

        else if(view.getId() == R.id.noun9Button) {
            if(!noun9Selected && (BookContent.getNouns().size() < BookContent.getNumNouns())) {
                noun9Selected = true;
                button9.setTextColor(Color.BLACK);
                BookContent.getNouns().add(getString(R.string.noun9));
            }
            else
            {
                if(noun9Selected) {
                    noun9Selected = false;
                    button9.setTextColor(Color.WHITE);
                    BookContent.getNouns().remove(getString(R.string.noun9));
                }
            }
            updateNounNum();

        }
        else if(view.getId() == R.id.noun10Button) {
            if(!noun10Selected && (BookContent.getNouns().size() < BookContent.getNumNouns())) {
                noun10Selected = true;
                button10.setTextColor(Color.BLACK);
                BookContent.getNouns().add(getString(R.string.noun10));
            }
            else
            {
                if(noun10Selected) {
                    noun10Selected = false;
                    button10.setTextColor(Color.WHITE);
                    BookContent.getNouns().remove(getString(R.string.noun10));
                }
            }
            updateNounNum();

        }
        else if(view.getId() == R.id.noun11Button) {
            if(!noun11Selected && (BookContent.getNouns().size() < BookContent.getNumNouns())) {
                noun11Selected = true;
                button11.setTextColor(Color.BLACK);
                BookContent.getNouns().add(getString(R.string.noun11));
            }
            else
            {
                if(noun11Selected) {
                    noun11Selected = false;
                    button11.setTextColor(Color.WHITE);
                    BookContent.getNouns().remove(getString(R.string.noun11));
                }
            }
            updateNounNum();

        }
        else if(view.getId() == R.id.doneNounsButton)
        {

            if(BookContent.getNouns().size() < BookContent.getNumNouns()) {
                Log.d("TEST", "Size of BookContent.nouns less than required number of nouns for this story!");

            }
            else {
                Log.d("TEST", "Nouns list: " + BookContent.getNouns().toString());
                Intent intent = new Intent(this, AdverbSelectionActivity.class);
                startActivity(intent);
            }
        }

    }

}
