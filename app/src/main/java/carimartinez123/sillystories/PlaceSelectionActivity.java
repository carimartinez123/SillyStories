package carimartinez123.sillystories;


import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class PlaceSelectionActivity extends AppCompatActivity {

    private final int SELECTABLE_PLACES = 12;

    private boolean [] placeSelected = new boolean[SELECTABLE_PLACES];

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
    private TextView placeNum;
    private Button[] buttons = new Button[SELECTABLE_PLACES];
    private String[] places;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_selection);
        Resources res = getResources();
        places = res.getStringArray(R.array.place_array);
        button0 = (Button)findViewById(R.id.place0Button);
        button1 = (Button)findViewById(R.id.place1Button);
        button2 = (Button)findViewById(R.id.place2Button);
        button3 = (Button)findViewById(R.id.place3Button);
        button4 = (Button)findViewById(R.id.place4Button);
        button5 = (Button)findViewById(R.id.place5Button);
        button6 = (Button)findViewById(R.id.place6Button);
        button7 = (Button)findViewById(R.id.place7Button);
        button8 = (Button)findViewById(R.id.place8Button);
        button9 = (Button)findViewById(R.id.place9Button);
        button10 = (Button)findViewById(R.id.place10Button);
        button11 = (Button)findViewById(R.id.place11Button);
        doneButton = (Button) findViewById(R.id.donePlacesButton);
        placeNum = (TextView) findViewById(R.id.placeNumTextView);


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

        placeSelected[0] = false;
        placeSelected[1] = false;
        placeSelected[2] = false;
        placeSelected[3] = false;
        placeSelected[4] = false;
        placeSelected[5] = false;
        placeSelected[6] = false;
        placeSelected[7] = false;
        placeSelected[8] = false;
        placeSelected[9] = false;
        placeSelected[10] = false;
        placeSelected[11] = false;

        doneButton.setEnabled(false);
        Utils.setButtonText(buttons, places);
        Utils.updateWordTypeNum(placeNum, doneButton, BookContent.getNumPlaces(), BookContent.getPlaces().size());

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


    public void getPlaces(View view)
    {

        int index_pressed = Utils.getIndex(buttons, view);
        boolean needWords = BookContent.getPlaces().size() < BookContent.getNumPlaces();
        Utils.selectWord(needWords, placeSelected, buttons, index_pressed, BookContent.getPlaces(), places);
        Utils.updateWordTypeNum(placeNum, doneButton, BookContent.getNumPlaces(), BookContent.getPlaces().size());


    }

    public void placesDone(View view) {

        if (BookContent.getNums().size() < BookContent.getNumNums()) {
            Log.d("TEST", "Size of BookContent.nums less than required number of nums for this story!");

        } else {
            Intent intent = new Intent(this, BookActivity.class);

            if (BookContent.getNumWeather() > 0) {
                intent = new Intent(this, WeatherSelectionActivity.class);
            }
            intent.putExtra("savedStory", false);
            startActivity(intent);
            finish();

        }

    }

}
