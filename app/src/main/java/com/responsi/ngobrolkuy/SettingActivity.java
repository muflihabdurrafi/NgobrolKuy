package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        Uri bitmap = Uri.parse(getIntent().getExtras().getString("key_image"));

        ImageView profile = findViewById(R.id.profile);
        ImageView back = findViewById(R.id.backBtn);
        TextView ubah = findViewById(R.id.ubahBtn);

        profile.setImageURI(bitmap);

        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SettingActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        ubah.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SettingActivity.this, ProfilePicActivity.class);
                startActivity(intent);
            }
        });
    }
}