package com.texto.maraqi;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.texto.hellopopup.PopupManager;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Replace with the name of your XML layout file
        Button btnShowPopup = findViewById(R.id.btnShowPopup);
        btnShowPopup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupManager.showPopup(MainActivity.this);
                Log.d("Button", "Button clicked. Showing popup...");
                // Call a method to show your popup here
            }
        });
    }
}
