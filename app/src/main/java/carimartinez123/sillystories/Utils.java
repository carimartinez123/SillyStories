package carimartinez123.sillystories;

import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by cari_martinez123 on 3/27/2016.
 */
public class Utils {
    protected static void setButtonText(Button[] buttons, String[] strs)
    {
        for(int i = 0; i < buttons.length; i++)
        {
            buttons[i].setText(strs[i]);
        }
    }

    protected static void updateWordTypeNum(TextView wordNum, Button doneButton, int wordsNeeded, int wordsSelected)
    {
        int wordsLeft = wordsNeeded - wordsSelected;
        if(wordsLeft > 1) {
            wordNum.setText("Pick " + wordsLeft + " nouns:");
        }
        else if (wordsLeft == 1)
        {
            wordNum.setText("Pick " + wordsLeft + " noun:");
        }
        else
        {
            wordNum.setText("Click done!");
            doneButton.setEnabled(true);
        }
    }

    protected static void selectWord(boolean needWords, boolean [] selected, Button[] buttons, int index, ArrayList<String> bookWords, String[] words)
    {

            if(!selected[index] && needWords) {
                selected[index]= true;
                buttons[index].setTextColor(Color.BLACK);
                bookWords.add(words[index]);
            }
            else
            {
                if(selected[index]) {
                    selected[index] = false;
                    buttons[index].setTextColor(Color.WHITE);
                    bookWords.remove(words[index]);
                }
            }

    }


}
