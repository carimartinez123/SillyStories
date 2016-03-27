package carimartinez123.sillystories;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

public class CharacterSelectionActivity extends AppCompatActivity {

    private boolean char0Selected = false;
    private boolean char1Selected = false;
    private boolean char2Selected = false;
    private boolean char3Selected = false;
    private boolean char4Selected = false;
    private boolean char5Selected = false;
    private boolean char6Selected = false;
    private boolean char7Selected = false;
    private boolean char8Selected = false;
    
    private String char0;
    private String char1;
    private String char2;
    private String char3;
    private String char4;
    private String char5;
    private String char6;
    private String char7;
    private String char8;

    private FrameLayout charFrame0;
    private FrameLayout charFrame1;
    private FrameLayout charFrame2;
    private FrameLayout charFrame3;
    private FrameLayout charFrame4;
    private FrameLayout charFrame5;
    private FrameLayout charFrame6;
    private FrameLayout charFrame7;
    private FrameLayout charFrame8;

    private Button doneButton;
    
    private TextView charNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_character_selection);
        charNum = (TextView) findViewById(R.id.charNumTextView);
        charFrame0 = (FrameLayout)findViewById(R.id.charFrame0);
        charFrame1 = (FrameLayout)findViewById(R.id.charFrame1);
        charFrame2 = (FrameLayout)findViewById(R.id.charFrame2);
        charFrame3 = (FrameLayout)findViewById(R.id.charFrame3);
        charFrame4 = (FrameLayout)findViewById(R.id.charFrame4);
        charFrame5 = (FrameLayout)findViewById(R.id.charFrame5);
        charFrame6 = (FrameLayout)findViewById(R.id.charFrame6);
        charFrame7 = (FrameLayout)findViewById(R.id.charFrame7);
        charFrame8 = (FrameLayout)findViewById(R.id.charFrame8);
        doneButton = (Button) findViewById(R.id.doneCharsButton);
        doneButton.setEnabled(false);
        char0 = getString(R.string.char0);
        char1 = getString(R.string.char1);
        char2 = getString(R.string.char2);
        char3 = getString(R.string.char3);
        char4 = getString(R.string.char4);
        char5 = getString(R.string.char5);
        char6 = getString(R.string.char6);
        char7 = getString(R.string.char7);
        char8 = getString(R.string.char8);

        updateSelectedChars();
        updateCharNum();
    }
    @Override
    public void onResume()
    {
        super.onResume();
       // loadPrefs();
        updateSelectedChars();
        updateCharNum();

    }
    @Override
    public void onBackPressed() {

        //disable back button
    }


    private void savePrefs(){
        SharedPreferences sharedPreferences = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putBoolean("char0Selected", char0Selected);
        editor.putBoolean("char1Selected", char1Selected);
        editor.putBoolean("char2Selected", char2Selected);
        editor.putBoolean("char3Selected", char3Selected);
        editor.putBoolean("char4Selected", char4Selected);
        editor.putBoolean("char5Selected", char5Selected);
        editor.putBoolean("char6Selected", char6Selected);
        editor.putBoolean("char7Selected", char7Selected);
        editor.putBoolean("char8Selected", char8Selected);
        editor.putBoolean("doneEnabled", doneButton.isEnabled());
        editor.commit();
    }

    private void loadPrefs(){

        SharedPreferences sharedPreferences = getPreferences(MODE_PRIVATE);
        char0Selected = sharedPreferences.getBoolean("char0Selected", false);
        char1Selected = sharedPreferences.getBoolean("char1Selected", false);
        char2Selected = sharedPreferences.getBoolean("char2Selected", false);
        char3Selected = sharedPreferences.getBoolean("char3Selected", false);
        char4Selected = sharedPreferences.getBoolean("char4Selected", false);
        char5Selected = sharedPreferences.getBoolean("char5Selected", false);
        char6Selected = sharedPreferences.getBoolean("char6Selected", false);
        char7Selected = sharedPreferences.getBoolean("char7Selected", false);
        char8Selected = sharedPreferences.getBoolean("char8Selected", false);
        doneButton.setEnabled(sharedPreferences.getBoolean("doneEnabled",false));
    }
    private void updateCharNum()
    {
        int charsLeft = BookContent.getNumChars() - BookContent.getChars().size();
        if(charsLeft > 1) {
            charNum.setText("Pick " + charsLeft + " characters:");
            doneButton.setEnabled(false);
        }
        else if (charsLeft == 1)
        {
            charNum.setText("Pick " + charsLeft + " character:");
            doneButton.setEnabled(false);
        }
        else
        {
            charNum.setText("Click done!");

            doneButton.setEnabled(true);
        }
    }

    private void updateSelectedChars()
    {
        if(char0Selected) {
            charFrame0.setBackgroundColor(Color.YELLOW);
        }
        else
        {
            charFrame0.setBackgroundColor(Color.WHITE);
        }
        if(char1Selected) {
            charFrame1.setBackgroundColor(Color.YELLOW);
        }
        else
        {
            charFrame1.setBackgroundColor(Color.WHITE);
        }
        if(char2Selected) {
            charFrame2.setBackgroundColor(Color.YELLOW);
        }
        else
        {
            charFrame2.setBackgroundColor(Color.WHITE);
        }
        if(char3Selected) {
            charFrame3.setBackgroundColor(Color.YELLOW);
        }
        else
        {
            charFrame3.setBackgroundColor(Color.WHITE);
        }
        if(char4Selected) {
            charFrame4.setBackgroundColor(Color.YELLOW);
        }
        else
        {
            charFrame4.setBackgroundColor(Color.WHITE);
        }
        if(char5Selected) {
            charFrame5.setBackgroundColor(Color.YELLOW);
        }
        else
        {
            charFrame5.setBackgroundColor(Color.WHITE);
        }
        if(char6Selected) {
            charFrame6.setBackgroundColor(Color.YELLOW);
        }
        else
        {
            charFrame6.setBackgroundColor(Color.WHITE);
        }
        if(char7Selected) {
            charFrame7.setBackgroundColor(Color.YELLOW);
        }
        else
        {
            charFrame7.setBackgroundColor(Color.WHITE);
        }
        if(char8Selected) {
            charFrame8.setBackgroundColor(Color.YELLOW);
        }
        else
        {
            charFrame8.setBackgroundColor(Color.WHITE);
        }
    }
    public void getCharacters(View view)
    {


        if(view.getId() == R.id.charButton0) {
            if(!char0Selected && (BookContent.getChars().size() < BookContent.getNumChars()))
            {
                char0Selected = true;
                charFrame0.setBackgroundColor(Color.YELLOW);
                BookContent.getChars().add(char0);
            }
            else
            {
                if(char0Selected) 
                {
                    char0Selected = false;
                    charFrame0.setBackgroundColor(Color.WHITE);
                    BookContent.getChars().remove(char0);
                }
            }
            updateCharNum();

        }

        else if(view.getId() == R.id.charButton1) {
            if(!char1Selected && (BookContent.getChars().size() < BookContent.getNumChars()))
            {
                char1Selected = true;
                charFrame1.setBackgroundColor(Color.YELLOW);
                BookContent.getChars().add(char1);
            }
            else
            {
                if(char1Selected)
                {
                    char1Selected = false;
                    charFrame1.setBackgroundColor(Color.WHITE);
                    BookContent.getChars().remove(char1);

                }
            }
            updateCharNum();

        }
        else if(view.getId() == R.id.charButton2) {
            if(!char2Selected && (BookContent.getChars().size() < BookContent.getNumChars()))
            {
                char2Selected = true;
                charFrame2.setBackgroundColor(Color.YELLOW);
                BookContent.getChars().add(char2);
            }
            else
            {
                if(char2Selected) {
                    char2Selected = false;
                    charFrame2.setBackgroundColor(Color.WHITE);
                    BookContent.getChars().remove(char2);
                }
            }
            updateCharNum();

        }

        else if(view.getId() == R.id.charButton3) {
            if(!char3Selected && (BookContent.getChars().size() < BookContent.getNumChars()))
            {
                char3Selected = true;
                charFrame3.setBackgroundColor(Color.YELLOW);
                BookContent.getChars().add(char3);
            }
            else
            {
                if(char3Selected) {
                    char3Selected = false;
                    charFrame3.setBackgroundColor(Color.WHITE);
                    BookContent.getChars().remove(char3);
                }
            }
            updateCharNum();

        }

        else if(view.getId() == R.id.charButton4) {
            if(!char4Selected && (BookContent.getChars().size() < BookContent.getNumChars()))
            {
                char4Selected = true;
                charFrame4.setBackgroundColor(Color.YELLOW);
                BookContent.getChars().add(char4);
            }
            else
            {
                if(char4Selected) {
                    char4Selected = false;
                    charFrame4.setBackgroundColor(Color.WHITE);
                    BookContent.getChars().remove(char4);
                }
            }
            updateCharNum();

        }

        else if(view.getId() == R.id.charButton5) {
            if(!char5Selected && (BookContent.getChars().size() < BookContent.getNumChars()))
            {
                char5Selected = true;
                charFrame5.setBackgroundColor(Color.YELLOW);
                BookContent.getChars().add(char5);
            }
            else
            {
                if(char5Selected) {
                    char5Selected = false;
                    charFrame5.setBackgroundColor(Color.WHITE);
                    BookContent.getChars().remove(char5);
                }
            }
            updateCharNum();

        }

        else if(view.getId() == R.id.charButton6) {
            if(!char6Selected && (BookContent.getChars().size() < BookContent.getNumChars()))
            {
                char6Selected = true;
                charFrame6.setBackgroundColor(Color.YELLOW);
                BookContent.getChars().add(char6);
            }
            else
            {
                if(char6Selected) {
                    char6Selected = false;
                    charFrame6.setBackgroundColor(Color.WHITE);
                    BookContent.getChars().remove(char6);
                }
            }
            updateCharNum();

        }

        else if(view.getId() == R.id.charButton7) {
            if(!char7Selected && (BookContent.getChars().size() < BookContent.getNumChars()))
            {
                char7Selected = true;
                charFrame7.setBackgroundColor(Color.YELLOW);
                BookContent.getChars().add(char7);
            }
            else
            {
                if(char7Selected) {
                    char7Selected = false;
                    charFrame7.setBackgroundColor(Color.WHITE);
                    BookContent.getChars().remove(char7);
                }
            }
            updateCharNum();

        }

        else if(view.getId() == R.id.charButton8) {
            if(!char8Selected && (BookContent.getChars().size() < BookContent.getNumChars()))
            {
                char8Selected = true;
                charFrame8.setBackgroundColor(Color.YELLOW);
                BookContent.getChars().add(char8);
            }
            else
            {
                if(char8Selected) {
                    char8Selected = false;
                    charFrame8.setBackgroundColor(Color.WHITE);
                    BookContent.getChars().remove(char8);
                }
            }
            updateCharNum();

        }


        else if(view.getId() == R.id.doneCharsButton)
        {

            if(BookContent.getChars().size() < BookContent.getNumChars()) {

            }
            else {
                Intent intent = new Intent(this, NounSelectionActivity.class);
                startActivity(intent);
            }
        }

    }

}
