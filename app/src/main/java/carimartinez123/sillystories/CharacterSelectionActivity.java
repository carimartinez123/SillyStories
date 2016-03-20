package carimartinez123.sillystories;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CharacterSelectionActivity extends AppCompatActivity {

    private boolean beastBoySelected = false;
    private boolean starfireSelected = false;
    private boolean ravenSelected = false;
    private boolean cyborgSelected = false;
    private boolean robinSelected = false;
    
    private TextView charNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_selection);
        charNum = (TextView) findViewById(R.id.charNumTextView);
        charNum.setText("Pick " + (BookContent.getNumChars() - BookContent.getChars().size()) + " characters:");
        Button doneButton = (Button) findViewById(R.id.doneCharsButton);
        doneButton.setEnabled(false);


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

        if(view.getId() == R.id.beastboyButton && !beastBoySelected) {
            beastBoySelected = true;
            BookContent.getChars().add("Beast Boy");
            updateCharNum();

        }
        else if(view.getId() == R.id.starfireButton && !starfireSelected) {
            starfireSelected = true;
            BookContent.getChars().add("Starfire");
            updateCharNum();


        }
        else if(view.getId() == R.id.ravenButton && !ravenSelected) {
            ravenSelected = true;
            BookContent.getChars().add("Raven");
            updateCharNum();

        }
        else if(view.getId() == R.id.cyborgButton && !cyborgSelected) {
            cyborgSelected = true;
            BookContent.getChars().add("Cyborg");
            updateCharNum();

        }
        else if(view.getId() == R.id.robinButton && !robinSelected) {
            robinSelected = true;
            BookContent.getChars().add("Robin");
            updateCharNum();


        }

        else if(view.getId() == R.id.doneCharsButton)
        {
            int i = 0;
            if(BookContent.getChars().size() != BookContent.getNumChars()) {

            }
            else {
                Intent intent = new Intent(this, NounSelectionActivity.class);
                startActivity(intent);
            }
        }

    }

}
