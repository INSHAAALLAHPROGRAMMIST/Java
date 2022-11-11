package com.baxodirdavirov.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    TextView first, second, third;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first = findViewById(R.id.group301);
        second = findViewById(R.id.group302);
        third = findViewById(R.id.group303);

        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar = Snackbar.make(findViewById(android.R.id.content), "Hi Bro you are clickend on first Text", Snackbar.LENGTH_SHORT);
                snackbar.getView().setBackgroundColor(getResources().getColor(R.color.purple_700));
                snackbar.show();
            }
        });

        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar = Snackbar.make(findViewById(android.R.id.content), "Hi Bro you are clickend on second Text", Snackbar.LENGTH_SHORT);
                snackbar.getView().setBackgroundColor(getResources().getColor(R.color.teal_700));
                snackbar.show();
            }
        });

        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar = Snackbar.make(findViewById(android.R.id.content), "Hi Bro you are clickend on third Text", Snackbar.LENGTH_SHORT);
                snackbar.getView().setBackgroundColor(getResources().getColor(R.color.purple_200));
                snackbar.show();
            }
        });

    

    }


}