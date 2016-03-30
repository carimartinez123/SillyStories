package carimartinez123.sillystories;

import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class CharacterSelectionActivity extends AppCompatActivity {

    private final int SELECTABLE_CHARS = 9;
    
    private String[] chars;


    private FrameLayout charFrame0;
    private FrameLayout charFrame1;
    private FrameLayout charFrame2;
    private FrameLayout charFrame3;
    private FrameLayout charFrame4;
    private FrameLayout charFrame5;
    private FrameLayout charFrame6;
    private FrameLayout charFrame7;
    private FrameLayout charFrame8;

    private ImageButton button0;
    private ImageButton button1;
    private ImageButton button2;
    private ImageButton button3;
    private ImageButton button4;
    private ImageButton button5;
    private ImageButton button6;
    private ImageButton button7;
    private ImageButton button8;
    private ImageButton[] buttons = new ImageButton[SELECTABLE_CHARS];
    private FrameLayout[] charFrames = new FrameLayout[SELECTABLE_CHARS];
    private boolean [] charSelected = new boolean[SELECTABLE_CHARS];
    private TypedArray imgs;
    private Button doneButton;
    private ArrayList<String> charOptions;
    
    private TextView charNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_character_selection);
        Resources res = getResources();
        //chars = res.getStringArray(R.array.char_array);
        imgs = res.obtainTypedArray(R.array.char_imgs);

        button0 = (ImageButton)findViewById(R.id.charButton0);
        button1 = (ImageButton)findViewById(R.id.charButton1);
        button2 = (ImageButton)findViewById(R.id.charButton2);
        button3 = (ImageButton)findViewById(R.id.charButton3);
        button4 = (ImageButton)findViewById(R.id.charButton4);
        button5 = (ImageButton)findViewById(R.id.charButton5);
        button6 = (ImageButton)findViewById(R.id.charButton6);
        button7 = (ImageButton)findViewById(R.id.charButton7);
        button8 = (ImageButton)findViewById(R.id.charButton8);
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

        charSelected[0] = false;
        charSelected[1] = false;
        charSelected[2] = false;
        charSelected[3] = false;
        charSelected[4] = false;
        charSelected[5] = false;
        charSelected[6] = false;
        charSelected[7] = false;
        charSelected[8] = false;

        buttons[0] = button0;
        buttons[1] = button1;
        buttons[2] = button2;
        buttons[3] = button3;
        buttons[4] = button4;
        buttons[5] = button5;
        buttons[6] = button6;
        buttons[7] = button7;
        buttons[8] = button8;

        charFrames[0] = charFrame0;
        charFrames[1] = charFrame1;
        charFrames[2] = charFrame2;
        charFrames[3] = charFrame3;
        charFrames[4] = charFrame4;
        charFrames[5] = charFrame5;
        charFrames[6] = charFrame6;
        charFrames[7] = charFrame7;
        charFrames[8] = charFrame8;

        charOptions = new ArrayList<>(Arrays.asList(res.getStringArray(R.array.char_array)));
        chars = new String[SELECTABLE_CHARS];

        randomizeChars(charOptions, chars);

        updateCharNum();
    }
    @Override
    public void onResume()
    {
        super.onResume();

    }
    @Override
    public void onBackPressed() {

        //disable back button
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

    private int getIndex(ImageButton[] buttons, View view)
    {
        int index_pressed = -1;
        for(int i = 0; i < buttons.length; i++)
        {
            if (view == buttons[i])
            {

                index_pressed = i;
            }

        }
        return index_pressed;
    }


    public void getCharacters(View view) {
        int index_pressed = getIndex(buttons, view);
        boolean needWords = BookContent.getChars().size() < BookContent.getNumChars();

        if (!charSelected[index_pressed] && needWords) {
            charSelected[index_pressed] = true;
            charFrames[index_pressed].setBackgroundColor(Color.YELLOW);
            BookContent.getChars().add(chars[index_pressed]);
        } else {
            if (charSelected[index_pressed]) {
                charSelected[index_pressed] = false;
                charFrames[index_pressed].setBackgroundColor(Color.WHITE);
                BookContent.getChars().remove(chars[index_pressed]);
            }
        }


        Utils.updateWordTypeNum(charNum, doneButton, BookContent.getNumChars(), BookContent.getChars().size(), "character");
    }

      public void charsDone(View view){
       

            if(BookContent.getChars().size() < BookContent.getNumChars()) {

            }
            else {
                Intent intent = new Intent(this, NounSelectionActivity.class);
                startActivity(intent);
                finish();
            }
        }

    private void randomizeChars(ArrayList<String> options, String[] words)
    {
        Random rnd = new Random();
        int idx;
        int randIdx;
        ArrayList<Integer> indices = new ArrayList();
        for(int i = 0; i < options.size(); i++)
        {
            indices.add(i);
        }
        for(int i = 0; i < words.length; i++)
        {
            randIdx = rnd.nextInt(indices.size());
            idx = indices.get(randIdx);
            words[i] = options.get(idx);
            buttons[i].setBackground(imgs.getDrawable(idx));
            indices.remove((Integer)idx);

        }
    }


    

}
