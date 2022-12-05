package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckBoxExample extends AppCompatActivity {
CheckBox c1,c2,c3;

Button b1;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_check_box_example);

c1=(CheckBox)findViewById(R.id.check1);
c2=(CheckBox)findViewById(R.id.check2);
c3=(CheckBox)findViewById(R.id.check3);
b1=(Button)findViewById(R.id.submit);

b1.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) { 
if (c1.isChecked()&&c2.isChecked()&&c3.isChecked())
{
	Toast.makeText(getApplicationContext(),""+c1.getText()+" , "+c2.getText()+" , "+c3.getText(),Toast.LENGTH_SHORT).show(); 

	}else if (c1.isChecked()&&c2.isChecked()){

	Toast.makeText(getApplicationContext(),""+c1.getText()+" , "+c2.getText(),Toast.LENGTH_SHORT).show();

	}else if (c1.isChecked()&&c3.isChecked()){

	Toast.makeText(getApplicationContext(),""+c1.getText()+" , "+c3.getText(),Toast.LENGTH_SHORT).show();

	}else if (c2.isChecked()&&c3.isChecked()){

	Toast.makeText(getApplicationContext(),""+c2.getText()+" , "+c3.getText(),Toast.LENGTH_SHORT).show();

	}else if (c1.isChecked()){

	Toast.makeText(getApplicationContext(),""+c1.getText(),Toast.LENGTH_SHORT).show();
	}else if (c2.isChecked()){ 

	Toast.makeText(getApplicationContext(),""+c2.getText(),Toast.LENGTH_SHORT).show();

	}else if (c3.isChecked()){

	Toast.makeText(getApplicationContext(),""+c3.getText(),Toast.LENGTH_SHORT).show();

				}
			}
		});
	}
}
