package com.teamkhan.muchmoremoods;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MBTEDescription extends Activity {
			Button btnMain;
			TextView textMood, textBehav, textEnvi, textThought;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mbtedescription);
	
		textMood = (TextView) findViewById(R.id.textMood);
		textBehav = (TextView) findViewById(R.id.textBehaviour);
		textEnvi = (TextView) findViewById(R.id.textEnvironment);
		textThought = (TextView) findViewById(R.id.textThought);
		//Intent to display description
		textMood.setText(getIntent().getExtras().getString("Data1"));
		textBehav.setText(getIntent().getExtras().getString("Data2"));
		textEnvi.setText(getIntent().getExtras().getString("Data3"));
		textThought.setText(getIntent().getExtras().getString("Data4"));

		btnMain = (Button) findViewById(R.id.btnMain);
		//button back to main action listener
		btnMain.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MBTEDescription.this,
						MainActivity.class);
				startActivity(intent);
				
			}
		});
	}

}
