package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ToggleButtonExample extends AppCompatActivity {
ToggleButton toggleButton;
@Override
protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_toggle_button_example); 

toggleButton=(ToggleButton) findViewById(R.id.toggle);
toggleButton.setOnClickListener(new View.OnClickListener() {
@Override 
	public void onClick(View v) { 
	if (toggleButton.isChecked()){ 
	
	Toast.makeText(getApplicationContext(),"ToggleButton is ON",Toast.LENGTH_SHORT).show();
	
	}else{ 
	
	Toast.makeText(getApplicationContext(),"ToggleButton is OFF",Toast.LENGTH_SHORT).show();
 				} 
 			} 
 		}); 
 	}
}
