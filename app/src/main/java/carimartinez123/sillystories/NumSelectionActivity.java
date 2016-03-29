package carimartinez123.sillystories;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.content.res.Resources;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
public class NumSelectionActivity extends AppCompatActivity {
    private final int SELECTABLE_NUMS = 12;

    private boolean [] numSelected = new boolean[SELECTABLE_NUMS];

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
    private TextView numNum;
    private Button[] buttons = new Button[SELECTABLE_NUMS];
    private String[] nums;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_num);
        Resources res = getResources();
        nums = res.getStringArray(R.array.num_array);
        button0 = (Button)findViewById(R.id.num0Button);
        button1 = (Button)findViewById(R.id.num1Button);
        button2 = (Button)findViewById(R.id.num2Button);
        button3 = (Button)findViewById(R.id.num3Button);
        button4 = (Button)findViewById(R.id.num4Button);
        button5 = (Button)findViewById(R.id.num5Button);
        button6 = (Button)findViewById(R.id.num6Button);
        button7 = (Button)findViewById(R.id.num7Button);
        button8 = (Button)findViewById(R.id.num8Button);
        button9 = (Button)findViewById(R.id.num9Button);
        button10 = (Button)findViewById(R.id.num10Button);
        button11 = (Button)findViewById(R.id.num11Button);
        doneButton = (Button) findViewById(R.id.doneNumsButton);
        numNum = (TextView) findViewById(R.id.numNumTextView);


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

        numSelected[0] = false;
        numSelected[1] = false;
        numSelected[2] = false;
        numSelected[3] = false;
        numSelected[4] = false;
        numSelected[5] = false;
        numSelected[6] = false;
        numSelected[7] = false;
        numSelected[8] = false;
        numSelected[9] = false;
        numSelected[10] = false;
        numSelected[11] = false;

        doneButton.setEnabled(false);
        Utils.setButtonText(buttons, nums);
        Utils.updateWordTypeNum(numNum, doneButton, BookContent.getNumNums(), BookContent.getNums().size());

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


    public void getNums(View view)
    {

        int index_pressed = Utils.getIndex(buttons, view);
        boolean needWords = BookContent.getNums().size() < BookContent.getNumNums();
        Utils.selectWord(needWords, numSelected, buttons, index_pressed, BookContent.getNums(), nums);
        Utils.updateWordTypeNum(numNum, doneButton, BookContent.getNumNums(), BookContent.getNums().size());


    }

    public void numsDone(View view)
    {

        if(BookContent.getNums().size() < BookContent.getNumNums()) {
            Log.d("TEST", "Size of BookContent.nums less than required number of nums for this story!");

        }
        else {
            Intent intent = new Intent(this, BookActivity.class);
            Log.d("TEST", "Nums list: " + BookContent.getNums().toString());
            if(BookContent.getNumPlaces() > 0) {
                intent = new Intent(this, PlaceSelectionActivity.class);
            }
            else if(BookContent.getNumWeather() > 0)
            {
                intent = new Intent(this, WeatherSelectionActivity.class);
            }
            intent.putExtra("savedStory", false);
            startActivity(intent);
            finish();
        }
    }



}