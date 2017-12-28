 package com.example.dev30.cinemaninga;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = (TextView) findViewById(R.id.textName);
        EditText editText = (EditText) findViewById(R.id.editName);
        Button button = (Button) findViewById(R.id.buttonName);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                textView.setText();
            }
        });
    }
}
