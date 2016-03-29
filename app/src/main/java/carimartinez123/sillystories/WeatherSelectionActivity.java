package carimartinez123.sillystories;
    
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WeatherSelectionActivity extends AppCompatActivity {

    private final int SELECTABLE_WEATHERS = 12;

    private boolean [] weatherSelected = new boolean[SELECTABLE_WEATHERS];

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
    private TextView weatherNum;
    private Button[] buttons = new Button[SELECTABLE_WEATHERS];
    private String[] weathers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_selection);
        Resources res = getResources();
        weathers = res.getStringArray(R.array.weather_array);
        button0 = (Button)findViewById(R.id.weather0Button);
        button1 = (Button)findViewById(R.id.weather1Button);
        button2 = (Button)findViewById(R.id.weather2Button);
        button3 = (Button)findViewById(R.id.weather3Button);
        button4 = (Button)findViewById(R.id.weather4Button);
        button5 = (Button)findViewById(R.id.weather5Button);
        button6 = (Button)findViewById(R.id.weather6Button);
        button7 = (Button)findViewById(R.id.weather7Button);
        button8 = (Button)findViewById(R.id.weather8Button);
        button9 = (Button)findViewById(R.id.weather9Button);
        button10 = (Button)findViewById(R.id.weather10Button);
        button11 = (Button)findViewById(R.id.weather11Button);
        doneButton = (Button) findViewById(R.id.doneWeathersButton);
        weatherNum = (TextView) findViewById(R.id.weatherNumTextView);


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

        weatherSelected[0] = false;
        weatherSelected[1] = false;
        weatherSelected[2] = false;
        weatherSelected[3] = false;
        weatherSelected[4] = false;
        weatherSelected[5] = false;
        weatherSelected[6] = false;
        weatherSelected[7] = false;
        weatherSelected[8] = false;
        weatherSelected[9] = false;
        weatherSelected[10] = false;
        weatherSelected[11] = false;

        doneButton.setEnabled(false);
        Utils.setButtonText(buttons, weathers);
        Utils.updateWordTypeNum(weatherNum, doneButton, BookContent.getNumWeather(), BookContent.getWeathers().size());

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


    public void getWeathers(View view)
    {

        int index_pressed = Utils.getIndex(buttons, view);
        boolean needWords = BookContent.getWeathers().size() < BookContent.getNumWeather();
        Utils.selectWord(needWords, weatherSelected, buttons, index_pressed, BookContent.getWeathers(), weathers);
        Utils.updateWordTypeNum(weatherNum, doneButton, BookContent.getNumWeather(), BookContent.getWeathers().size());


    }

    public void weathersDone(View view) {

        if (BookContent.getWeathers().size() < BookContent.getNumWeather()) {
            Log.d("TEST", "Size of BookContent.weathers less than required number of weathers for this story!");

        } else {
            Intent intent = new Intent(this, BookActivity.class);
            Log.d("TEST", "Weathers list: " + BookContent.getWeathers().toString());
            intent.putExtra("savedStory", false);
            startActivity(intent);
            finish();

        }

    }

}
