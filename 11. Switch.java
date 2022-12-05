package com.example.widgets;

import android.graphics.Color;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.Toast;

public class SwitchExample extends AppCompatActivity {
	LinearLayout linearLayout;
	Switch aSwitch;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_switch_example);

		linearLayout=(LinearLayout)findViewById(R.id.linearLayout);
		aSwitch=(Switch)findViewById(R.id.switchbutton);
		aSwitch.setOnClickListener(new View.OnClickListener() {

		@Override 
		public void onClick(View v) {

		if (aSwitch.isChecked()){
			linearLayout.setBackgroundColor(Color.CYAN);
			Toast.makeText(getApplicationContext(),"Switch is clicked & background is cyan",Toast.LENGTH_SHORT).show();

		}else{
			linearLayout.setBackgroundColor(Color.RED);
			Toast.makeText(getApplicationContext(),"Switch is clicked & background is red",Toast.LENGTH_SHORT).show();
						}
					}
				});
			}
		}
