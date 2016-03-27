package carimartinez123.sillystories;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

public class NounSelectionActivity extends AppCompatActivity {
    private final int SELECTABLE_NOUNS = 12;
    
    private boolean [] nounSelected = new boolean[SELECTABLE_NOUNS];

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
    private Button[] buttons = new Button[SELECTABLE_NOUNS];
    private String[] nouns;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noun_selection);
        Resources res = getResources();
        nouns = res.getStringArray(R.array.noun_array);
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
        doneButton = (Button) findViewById(R.id.doneNounsButton);
        nounNum = (TextView) findViewById(R.id.nounNumTextView);


        buttons[0] = button0;
        buttons[1] = button1;
        buttons[2] = button2;
        buttons[3] = button3;
        buttons[4] = button4;
        buttons[5] = button5;
        buttons[6] = button6;
        buttons[7] = button7;
        buttons[8] = button8;
        buttons[9] = button9;
        buttons[10] = button10;
        buttons[11] = button11;

        nounSelected[0] = false;
        nounSelected[1] = false;
        nounSelected[2] = false;
        nounSelected[3] = false;
        nounSelected[4] = false;
        nounSelected[5] = false;
        nounSelected[6] = false;
        nounSelected[7] = false;
        nounSelected[8] = false;
        nounSelected[9] = false;
        nounSelected[10] = false;
        nounSelected[11] = false;

        doneButton.setEnabled(false);
        Utils.setButtonText(buttons, nouns);
        Utils.updateWordTypeNum(nounNum, doneButton, BookContent.getNumNouns(), BookContent.getNouns().size());

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


    public void getNouns(View view)
    {

        int index_pressed = Utils.getIndex(buttons, view);
        boolean needWords = BookContent.getNouns().size() < BookContent.getNumNouns();
        Utils.selectWord(needWords, nounSelected, buttons, index_pressed, BookContent.getNouns(), nouns);
        Utils.updateWordTypeNum(nounNum, doneButton, BookContent.getNumNouns(), BookContent.getNouns().size());


    }

    public void nounsDone(View view)
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
