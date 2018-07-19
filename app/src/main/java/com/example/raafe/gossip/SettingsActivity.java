package com.example.raafe.gossip;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }

    public void changeUsername(View view){
        Intent intent = new Intent(SettingsActivity.this, ChangeUsernameActivity.class);
        startActivity(intent);
    }

    public void changePassword(View view){
        Intent intent = new Intent(SettingsActivity.this, ChangePasswordActivity.class);
        startActivity(intent);
    }
}
