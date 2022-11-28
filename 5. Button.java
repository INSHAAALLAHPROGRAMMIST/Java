package com.example.widgets;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity; 


public class ButtonExample extends AppCompatActivity { 
  
 Button button; 
 
@Override 
protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState); 
  setContentView(R.layout.activity_button_example);
  
  // Buttoning layoutning ichidagi idsini olish 
  button=(Button)findViewById(R.id.b1); 
  // Buttoning bosilgandagi holati
  button.setOnClickListener(new View.OnClickListener() {
    
    
    @Override 
    public void onClick(View v) { 
      
      Toast.makeText(ButtonExample.this,"Button clicked by you",Toast.LENGTH_SHORT).show(); 
    
    } 
  }); 
  
} 
  
} 

