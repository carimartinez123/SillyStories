package carimartinez123.sillystories;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class NewStoryActivity extends AppCompatActivity {
    private boolean spinnerSetup = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_story);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    /*    Spinner newStoryDropdown = (Spinner) findViewById(R.id.newStorySpinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.new_story_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        newStoryDropdown.setAdapter(adapter);

        newStoryDropdown.setOnItemSelectedListener(new SpinnerActivity());

*/



    }

    public void goToSelections(View view)
    {
        Intent intent;
        if(view.getId() == R.id.rideButton) {
            BookContent.setTitle("Ride to the Airport");
            intent = new Intent(this, CharacterSelectionActivity.class);
            startActivity(intent);
        }



    }

    //TODO: figure out spinners
   /* private class SpinnerActivity extends Activity implements AdapterView.OnItemSelectedListener {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view,
                                   int pos, long id) {


            BookContent.generateText((String)parent.getItemAtPosition(pos));
            Intent intent = new Intent(this, CharacterSelectionActivity.class);
            startActivity(intent);


        }
        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    }*/

}
