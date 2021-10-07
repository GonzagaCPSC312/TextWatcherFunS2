package com.sprint.gina.textwatcherfuns2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = findViewById(R.id.nameEditText);
        TextView textView = findViewById(R.id.helloTextView);
        Button button = findViewById(R.id.helloButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editText.getText().toString();
                if (name.length() > 0) {
                    textView.setText("Hello, " + name);
                }
                else {
                    // show a toast
                    // a toast is a message that is displayed for a short
                    // period of time
                    // the user cannot interact with it
                    Toast toast = Toast.makeText(MainActivity.this, "Enter your name first", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
    }
}