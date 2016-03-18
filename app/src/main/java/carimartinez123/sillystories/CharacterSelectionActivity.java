package carimartinez123.sillystories;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class CharacterSelectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_selection);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    public void getCharacters(View view)
    {

        if(view.getId() == R.id.beastboyButton) {

            BookContent.getChars().add("Beast Boy");

        }
        else if(view.getId() == R.id.starfireButton) {

            BookContent.getChars().add("Starfire");

        }
        else if(view.getId() == R.id.doneCharsButton)
        {
            int i = 0;
            while(i < BookContent.getChars().size()) {
                System.out.println(BookContent.getChars().get(i));
                i++;
            }
            Intent intent = new Intent(this, NounSelectionActivity.class);
            startActivity(intent);
        }

    }

}
