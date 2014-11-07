package com.example.muchmoremoods;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.Spinner;


public class MainActivity extends Activity {
	RatingBar rtbarMood;
	Button ViewSummary;
	Spinner spinBehavior;
	RadioGroup rgThoughts;
	String valueRating;
	String valueSpin;
	String valueRadio;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Intent intent = new Intent(this, Summary.class);
        
        rtbarMood = (RatingBar)findViewById(R.id.rtbrMood);
        spinBehavior = (Spinner)findViewById(R.id.spnBehavior);
        rgThoughts = (RadioGroup)findViewById(R.id.rgThoughts);
        ViewSummary = (Button)findViewById(R.id.btnSummary);
        
        
        rtbarMood.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
			
			//@Override
			public void onRatingChanged(RatingBar ratingBar, float rating,
					boolean fromUser) {
				// TODO Auto-generated method stub
				
				valueRating = String.valueOf(rating);
				//Toast.makeText(getApplicationContext(),"Your Selected Ratings  : " + String.valueOf(rating),Toast.LENGTH_LONG).show();
		           	
			}
		});
        
        ArrayAdapter<CharSequence> adapterBehave = ArrayAdapter.createFromResource(this, R.array.arrayBehavior, R.layout.support_simple_spinner_dropdown_item);
        adapterBehave.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
         spinBehavior.setAdapter(adapterBehave);
         
                
    }

    
    public void onItemSelected(AdapterView<?> parent, View view, 
            int pos, long id) {
    	
    	valueSpin = String.valueOf(parent.getItemAtPosition(pos));
    	
        // An item was selected. You can retrieve the selected item using
        // parent.getItemAtPosition(pos)
    }
    
    public String onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        
        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio0:
                if (checked)
                    valueRadio = String.valueOf(R.id.radio0);
                break;
            case R.id.radio1:
                if (checked)
                	valueRadio = String.valueOf(R.id.radio1);
                break;
            case R.id.radio2:
                if (checked)
                	valueRadio = String.valueOf(R.id.radio2);
                break;
        }
        return valueRadio;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
