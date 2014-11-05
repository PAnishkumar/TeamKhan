package com.teamkhan.muchmoremoods;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	Button btnTransfer;
	public Spinner spinnerMood, spinnerBehaviour;
	public EditText editTextThought,  editTextEnvironment;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		btnTransfer = (Button) findViewById(R.id.btnTransfer);
		spinnerMood = (Spinner)findViewById(R.id.spinnerMood);
		spinnerBehaviour = (Spinner)findViewById(R.id.spinnerBehaviour);
		editTextEnvironment = (EditText)findViewById(R.id.editTextEnvironment);
		editTextThought= (EditText) findViewById(R.id.editTextThought);
				
		btnTransfer.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String mood = spinnerMood.getSelectedItem().toString();
				String behav = spinnerBehaviour.getSelectedItem().toString();
				String envi = editTextEnvironment.getText().toString();
				String thought = editTextThought.getText().toString();
				
				
					Intent im = new Intent(MainActivity.this ,MBTEDescription.class);
					im.putExtra("Data1", mood);
					im.putExtra("Data2", behav);
					im.putExtra("Data3", envi);
					im.putExtra("Data4", thought);
					startActivity(im);
				
				
				}
		});
	}

	
}
