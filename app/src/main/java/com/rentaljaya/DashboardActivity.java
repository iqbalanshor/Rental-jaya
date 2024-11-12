package com.rentaljaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public void Tombol_info(View view) {
        Intent intent =new Intent(DashboardActivity.this, DaftarMobilActivity.class);
        startActivity(intent);
    }

    public void tombol_sewa(View view) {
        Intent intent =new Intent(DashboardActivity.this, SewaMobilActivity.class);
        startActivity(intent);
    }

    public void tombol_contact(View view) {
        Intent intent =new Intent(DashboardActivity.this, ContactActivity.class);
        startActivity(intent);
    }
}