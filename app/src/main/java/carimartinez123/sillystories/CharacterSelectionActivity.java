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
    
    private TextView charNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_selection);
        charNum = (TextView) findViewById(R.id.charNumTextView);
        charNum.setText("Pick " + (BookContent.getNumChars() - BookContent.getChars().size()) + " characters:");
        Button doneButton = (Button) findViewById(R.id.doneCharsButton);
        doneButton.setEnabled(false);
        charFrame0 = (FrameLayout)findViewById(R.id.charFrame0);
        charFrame1 = (FrameLayout)findViewById(R.id.charFrame1);
        charFrame2 = (FrameLayout)findViewById(R.id.charFrame2);
        charFrame3 = (FrameLayout)findViewById(R.id.charFrame3);
        charFrame4 = (FrameLayout)findViewById(R.id.charFrame4);
        charFrame5 = (FrameLayout)findViewById(R.id.charFrame5);
        charFrame6 = (FrameLayout)findViewById(R.id.charFrame6);
        charFrame7 = (FrameLayout)findViewById(R.id.charFrame7);
        charFrame8 = (FrameLayout)findViewById(R.id.charFrame8);
        char0 = getString(R.string.char0);
        char1 = getString(R.string.char1);
        char2 = getString(R.string.char2);
        char3 = getString(R.string.char3);
        char4 = getString(R.string.char4);
        char5 = getString(R.string.char5);
        char6 = getString(R.string.char6);
        char7 = getString(R.string.char7);
        char8 = getString(R.string.char8);
    }
    @Override
    public void onResume()
    {
        super.onResume();
        for(String str: BookContent.getChars())
        {
            Button doneButton = (Button) findViewById(R.id.doneCharsButton);
            doneButton.setEnabled(false);
            BookContent.getChars().remove(str);
            updateCharNum();
        }

    }


    private void updateCharNum()
    {
        int charsLeft = BookContent.getNumChars() - BookContent.getChars().size();
        if(charsLeft > 1) {
            charNum.setText("Pick " + charsLeft + " characters:");
        }
        else if (charsLeft == 1)
        {
            charNum.setText("Pick " + charsLeft + " character:");
        }
        else
        {
            charNum.setText("Click done!");
            Button doneButton = (Button) findViewById(R.id.doneCharsButton);
            doneButton.setEnabled(true);
        }
    }

    public void getCharacters(View view)
    {

        Log.d("TEST", "numChars = " + BookContent.getNumChars());
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
                Log.d("TEST","Size of BookContent.char less than required number of chars for this story!");
            }
            else {
                Intent intent = new Intent(this, NounSelectionActivity.class);
                startActivity(intent);
            }
        }

    }

}
