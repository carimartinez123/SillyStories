package carimartinez123.sillystories;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AdjectiveSelectionActivity extends AppCompatActivity {


    private final int SELECTABLE_ADJS = 12;

    private boolean [] adjSelected = new boolean[SELECTABLE_ADJS];

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
    private TextView adjNum;
    private Button[] buttons = new Button[SELECTABLE_ADJS];
    private String[] adjs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adjective_selection);
        Resources res = getResources();
        adjs = res.getStringArray(R.array.adj_array);
        button0 = (Button)findViewById(R.id.adj0Button);
        button1 = (Button)findViewById(R.id.adj1Button);
        button2 = (Button)findViewById(R.id.adj2Button);
        button3 = (Button)findViewById(R.id.adj3Button);
        button4 = (Button)findViewById(R.id.adj4Button);
        button5 = (Button)findViewById(R.id.adj5Button);
        button6 = (Button)findViewById(R.id.adj6Button);
        button7 = (Button)findViewById(R.id.adj7Button);
        button8 = (Button)findViewById(R.id.adj8Button);
        button9 = (Button)findViewById(R.id.adj9Button);
        button10 = (Button)findViewById(R.id.adj10Button);
        button11 = (Button)findViewById(R.id.adj11Button);
        doneButton = (Button) findViewById(R.id.doneAdjsButton);
        adjNum = (TextView) findViewById(R.id.adjNumTextView);


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

        adjSelected[0] = false;
        adjSelected[1] = false;
        adjSelected[2] = false;
        adjSelected[3] = false;
        adjSelected[4] = false;
        adjSelected[5] = false;
        adjSelected[6] = false;
        adjSelected[7] = false;
        adjSelected[8] = false;
        adjSelected[9] = false;
        adjSelected[10] = false;
        adjSelected[11] = false;

        doneButton.setEnabled(false);
        Utils.setButtonText(buttons, adjs);
        Utils.updateWordTypeNum(adjNum, doneButton, BookContent.getNumAdjs(), BookContent.getAdjs().size());

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


    public void getAdjs(View view)
    {

        int index_pressed = Utils.getIndex(buttons, view);
        boolean needWords = BookContent.getAdjs().size() < BookContent.getNumAdjs();
        Utils.selectWord(needWords, adjSelected, buttons, index_pressed, BookContent.getAdjs(), adjs);
        Utils.updateWordTypeNum(adjNum, doneButton, BookContent.getNumAdjs(), BookContent.getAdjs().size());


    }

    public void adjsDone(View view)
    {

        if(BookContent.getAdjs().size() < BookContent.getNumAdjs()) {
            Log.d("TEST", "Size of BookContent.adj less than required number of adjs for this story!");

        }
        else {
            Intent intent = new Intent(this, BookActivity.class);
            startActivity(intent);
            finish();
        }
    }



}
