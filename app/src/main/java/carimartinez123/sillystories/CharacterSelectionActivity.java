package carimartinez123.sillystories;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
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
    
    private String char0 = "Starfire";
    private String char1 = "Beast Boy";
    private String char2 = "Raven";
    private String char3 = "Cyborg";
    private String char4 = "Robin";
    private String char5 = "Squid Boy";
    private String char6 = "Splat Girl";
    private String char7 = "Link";
    private String char8 = "Zelda";
    
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

        if(view.getId() == R.id.charButton0 && !char0Selected) {
            char0Selected = true;
            BookContent.getChars().add(char0);
            updateCharNum();

        }
        else if(view.getId() == R.id.charButton1 && !char1Selected) {
            char1Selected = true;
            BookContent.getChars().add(char1);
            updateCharNum();


        }
        else if(view.getId() == R.id.charButton2 && !char2Selected) {
            char2Selected = true;
            BookContent.getChars().add(char2);
            updateCharNum();

        }
        else if(view.getId() == R.id.charButton3 && !char3Selected) {
            char3Selected = true;
            BookContent.getChars().add(char3);
            updateCharNum();

        }
        else if(view.getId() == R.id.charButton4 && !char6Selected) {
            char6Selected = true;
            BookContent.getChars().add(char4);
            updateCharNum();


        }
        else if(view.getId() == R.id.charButton5 && !char5Selected) {
            char5Selected = true;
            BookContent.getChars().add(char5);
            updateCharNum();
            
        }
        else if(view.getId() == R.id.charButton6 && !char6Selected) {
            char6Selected = true;
            BookContent.getChars().add(char6);
            updateCharNum();


        }

        else if(view.getId() == R.id.charButton7 && !char7Selected) {
            char7Selected = true;
            BookContent.getChars().add(char7);
            updateCharNum();


        }

        else if(view.getId() == R.id.charButton8 && !char8Selected) {
            char8Selected = true;
            BookContent.getChars().add(char8);
            updateCharNum();


        }
        else if(view.getId() == R.id.doneCharsButton)
        {

            if(BookContent.getChars().size() != BookContent.getNumChars()) {

            }
            else {
                Intent intent = new Intent(this, NounSelectionActivity.class);
                startActivity(intent);
            }
        }

    }

}
