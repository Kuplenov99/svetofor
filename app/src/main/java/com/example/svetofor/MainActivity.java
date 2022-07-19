package com.example.svetofor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout mConstraintLayout;
    private TextView mInfoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mInfoTextView = findViewById(R.id.TextView);
        mConstraintLayout = findViewById(R.id.root_layout);

        Button yellowButton = findViewById(R.id.Button_yellow);
        yellowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mInfoTextView.setText(R.string.Yellow);
                mConstraintLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.yellowColor));
            }
        });

    }

    public void Onclick(View view) {
        mInfoTextView.setText(R.string.red);
        mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.redColor));
    }

    public void GreenOnclick(View view) {
        mInfoTextView.setText(R.string.Green);
        mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.greenColor));
    }
}