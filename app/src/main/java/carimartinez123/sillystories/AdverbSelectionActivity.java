package carimartinez123.sillystories;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AdverbSelectionActivity extends AppCompatActivity {

    private final int SELECTABLE_ADVS = 12;

    private boolean [] advSelected = new boolean[SELECTABLE_ADVS];

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
    private TextView advNum;
    private Button[] buttons = new Button[SELECTABLE_ADVS];
    private String[] advs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adverb_selection);
        Resources res = getResources();
        advs = res.getStringArray(R.array.adv_array);
        button0 = (Button)findViewById(R.id.adv0Button);
        button1 = (Button)findViewById(R.id.adv1Button);
        button2 = (Button)findViewById(R.id.adv2Button);
        button3 = (Button)findViewById(R.id.adv3Button);
        button4 = (Button)findViewById(R.id.adv4Button);
        button5 = (Button)findViewById(R.id.adv5Button);
        button6 = (Button)findViewById(R.id.adv6Button);
        button7 = (Button)findViewById(R.id.adv7Button);
        button8 = (Button)findViewById(R.id.adv8Button);
        button9 = (Button)findViewById(R.id.adv9Button);
        button10 = (Button)findViewById(R.id.adv10Button);
        button11 = (Button)findViewById(R.id.adv11Button);
        doneButton = (Button) findViewById(R.id.doneAdvsButton);
        advNum = (TextView) findViewById(R.id.advNumTextView);


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

        advSelected[0] = false;
        advSelected[1] = false;
        advSelected[2] = false;
        advSelected[3] = false;
        advSelected[4] = false;
        advSelected[5] = false;
        advSelected[6] = false;
        advSelected[7] = false;
        advSelected[8] = false;
        advSelected[9] = false;
        advSelected[10] = false;
        advSelected[11] = false;

        doneButton.setEnabled(false);
        Utils.setButtonText(buttons, advs);
        Utils.updateWordTypeNum(advNum, doneButton, BookContent.getNumAdvs(), BookContent.getAdvs().size());

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


    public void getAdvs(View view)
    {

        int index_pressed = Utils.getIndex(buttons, view);
        boolean needWords = BookContent.getAdvs().size() < BookContent.getNumAdvs();
        Utils.selectWord(needWords, advSelected, buttons, index_pressed, BookContent.getAdvs(), advs);
        Utils.updateWordTypeNum(advNum, doneButton, BookContent.getNumAdvs(), BookContent.getAdvs().size());


    }

    public void advsDone(View view)
    {

        if(BookContent.getAdvs().size() < BookContent.getNumAdvs()) {
            Log.d("TEST", "Size of BookContent.advs less than required number of advs for this story!");

        }
        else {
            Log.d("TEST", "Advs list: " + BookContent.getAdvs().toString());
            Intent intent = new Intent(this, AdjectiveSelectionActivity.class);
            startActivity(intent);
            finish();
        }
    }



}
