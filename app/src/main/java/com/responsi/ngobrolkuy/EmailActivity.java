package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class EmailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);

        ImageView back = findViewById(R.id.backBtn);
        TextView kembali = findViewById(R.id.kembaliBtn);

        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EmailActivity.this, ForgotActivity.class);
                startActivity(intent);
            }
        });

        kembali.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EmailActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}