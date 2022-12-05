package com.example.widgets;

import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class ProgressBarExample extends AppCompatActivity {

	TextView textView;
	ProgressBar progressBar;
	Button button;
	Handler handler;
	int progresscount=0;
	
  @Override
	protected void onCreate(Bundle savedInstanceState) {
	  super.onCreate(savedInstanceState); 
	  setContentView(R.layout.activity_progress_bar_example);
    
    textView=(TextView)findViewById(R.id.text);
	  progressBar=(ProgressBar)findViewById(R.id.progress);
	  button=(Button)findViewById(R.id.start);
	  
    button.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        handler=new Handler();
        handler.postDelayed(new Runnable() {
          
          @Override
          public void run() {
            if (progressBar.getProgress()<100){
              progressBar.setProgress(progresscount);
              progresscount++;
              handler.postDelayed(this,100);
              textView.setText("Plz wait...");
            }else{
              textView.setText("completed...");
            
            }
          }
        },100);
      }
    });
  }
}
