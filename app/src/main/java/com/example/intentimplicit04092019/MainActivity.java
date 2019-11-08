package com.example.intentimplicit04092019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {


    ImageButton imgContact, imgWeb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgContact = findViewById(R.id.buttonContact);
        imgWeb = findViewById(R.id.buttonWeb);

        imgContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_PICK,  ContactsContract.Contacts.CONTENT_URI);
                startActivity(intent);
            }
        });
        imgWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://zingmp3.vn/"));
                startActivity(browserIntent);
            }
        });

    }
}
