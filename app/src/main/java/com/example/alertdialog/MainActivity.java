package com.example.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButton = findViewById(R.id.alertBtn);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

                builder.setIcon(R.drawable.ic_action_check);

                builder.setTitle("Simple AlertDialog");

                builder.setMessage("Activity 4");

                builder.setPositiveButton("Ok", null);

                AlertDialog dialog = builder.create();

                dialog.show();
            }
        });
    }
}