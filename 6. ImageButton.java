package com.example.widgets;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle; 5 import android.view.View; 
import android.widget.ImageButton;
import android.widget.Toast;
public class ImageButtonExample extends AppCompatActivity { 
 
  ImageButton imageButton; 
  @Override 
  protected void onCreate(Bundle savedInstanceState) {  
    super.onCreate(savedInstanceState); 
    setContentView(R.layout.activity_image_button_example); 
    
    imageButton=(ImageButton)findViewById(R.id.image); 
    imageButton.setOnClickListener(new View.OnClickListener() { 
      
     @Override 
     public void onClick(View v) { 
        
       // ImageButton companantasi bosilganda xabar chiqarish
     Toast.makeText(ImageButtonExample.this,"ImageButton clicked by you.",Toast.LENGTH_SHORT).show(); 
   
       
      }  
    }); 
  }  
}
