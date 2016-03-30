package carimartinez123.sillystories;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NewStoryActivity extends AppCompatActivity {

    private Button storyButton1;
    private Button storyButton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_story);
        storyButton1 = (Button)findViewById(R.id.story1Button);
        storyButton1.setTextColor(Color.BLACK);
        storyButton2 = (Button)findViewById(R.id.story2Button);
        storyButton2.setTextColor(Color.BLACK);



    }

    @Override
    public void onResume()
    {
        super.onResume();
        storyButton1.setTextColor(Color.BLACK);
        storyButton2.setTextColor(Color.BLACK);
    }

    public void goToSelections(View view)
    {
        Intent intent;
        if(view.getId() == R.id.story1Button) {
            storyButton1.setTextColor(Color.WHITE);
            BookContent.setTitle("Ride to the Airport");
            BookContent.generateGrammarTypes("Ride to the Airport");
            intent = new Intent(this, CharacterSelectionActivity.class);
            startActivity(intent);
            finish();
        }
        if(view.getId() == R.id.story2Button) {
            storyButton2.setTextColor(Color.WHITE);
            BookContent.setTitle("Lunchtime");
            BookContent.generateGrammarTypes("Lunchtime");
            intent = new Intent(this, CharacterSelectionActivity.class);
            startActivity(intent);
            finish();
        }



    }

    public void unimplemented(View view) {
        final Button clickedButton = (Button) view;
        final String title = (String) clickedButton.getText();
        new CountDownTimer(300, 300) {

            public void onTick(long millisUntilFinished) {
                clickedButton.setText("Not yet implemented!");

            }

            public void onFinish() {
                clickedButton.setText(title);

            }
        }.start();
    }
}
