package carimartinez123.sillystories;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AdverbSelectionActivity extends AppCompatActivity {

    private boolean adv0Selected = false;
    private boolean adv1Selected = false;
    private boolean adv2Selected = false;
    private boolean adv3Selected = false;
    private boolean adv4Selected = false;
    private boolean adv5Selected = false;
    private boolean adv6Selected = false;
    private boolean adv7Selected = false;
    private boolean adv8Selected = false;


    private TextView advNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adverb_selection);
        advNum = (TextView) findViewById(R.id.advNumTextView);
        advNum.setText("Pick " + (BookContent.getNumAdvs() - BookContent.getAdvs().size()) + " adverbs:");
        Button doneButton = (Button) findViewById(R.id.doneAdverbsButton);
        doneButton.setEnabled(false);


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
    private void updateAdverbNum()
    {
        int advsLeft = BookContent.getNumAdvs() - BookContent.getAdvs().size();
        if(advsLeft > 1) {
            advNum.setText("Pick " + advsLeft + " Adverbs:");
        }
        else if (advsLeft == 1)
        {
            advNum.setText("Pick " + advsLeft + " Adverb:");
        }
        else
        {
            advNum.setText("Click done!");
            Button doneButton = (Button) findViewById(R.id.doneAdverbsButton);
            doneButton.setEnabled(true);
        }
    }

    public void getAdvs(View view)
    {

        if(view.getId() == R.id.adv0Button && !adv0Selected) {
            adv0Selected = true;
            BookContent.getAdvs().add(getString(R.string.adv0));
            updateAdverbNum();

        }
        else if(view.getId() == R.id.adv1Button && !adv1Selected) {
            adv1Selected = true;
            BookContent.getAdvs().add(getString(R.string.adv1));
            updateAdverbNum();


        }
        else if(view.getId() == R.id.adv2Button && !adv2Selected) {
            adv2Selected = true;
            BookContent.getAdvs().add(getString(R.string.adv2));
            updateAdverbNum();

        }
        else if(view.getId() == R.id.adv3Button && !adv3Selected) {
            adv3Selected = true;
            BookContent.getAdvs().add(getString(R.string.adv3));
            updateAdverbNum();

        }
        else if(view.getId() == R.id.adv4Button && !adv4Selected) {
            adv4Selected = true;
            BookContent.getAdvs().add(getString(R.string.adv4));
            updateAdverbNum();


        }
        else if(view.getId() == R.id.adv5Button && !adv5Selected) {
            adv5Selected = true;
            BookContent.getAdvs().add(getString(R.string.adv5));
            updateAdverbNum();

        }
        else if(view.getId() == R.id.adv6Button && !adv6Selected) {
            adv6Selected = true;
            BookContent.getAdvs().add(getString(R.string.adv6));
            updateAdverbNum();


        }

        else if(view.getId() == R.id.adv7Button && !adv7Selected) {
            adv7Selected = true;
            BookContent.getAdvs().add(getString(R.string.adv7));
            updateAdverbNum();


        }

        else if(view.getId() == R.id.adv8Button && !adv8Selected) {
            adv8Selected = true;
            BookContent.getAdvs().add(getString(R.string.adv8));
            updateAdverbNum();


        }
        else if(view.getId() == R.id.doneAdverbsButton)
        {

            if(BookContent.getAdvs().size() < BookContent.getNumAdvs()) {
                Log.d("TEST", "Size of BookContent.adv less than required number of advs for this story!");

            }
            else {
                Intent intent = new Intent(this, AdjectiveSelectionActivity.class);
                startActivity(intent);
            }
        }

    }

}
