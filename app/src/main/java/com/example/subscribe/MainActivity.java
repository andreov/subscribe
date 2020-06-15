package com.example.subscribe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView outText = (TextView) findViewById(R.id.textOut);
        final TextView nameText = (TextView) findViewById(R.id.nameInput);
        final TextView emailText = (TextView) findViewById(R.id.emailInput);
        Button okBtn = (Button) findViewById(R.id.Okbutton);
        okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outText.setText("Подписка на рассылку успешно оформлена для пользователя " + nameText.getText()
                + " на электронный адрес " + emailText.getText());
            }

        });
        Button clearBtn = (Button) findViewById(R.id.ClearButton);
        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outText.setText("");
                nameText.setText("");
                emailText.setText("");
            }

        });

    }
}