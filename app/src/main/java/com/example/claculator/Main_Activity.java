package com.example.claculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main_Activity extends AppCompatActivity {

    TextView github_link, version_TV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*<------------Hooks--------->*/

        github_link = findViewById(R.id.github_link);
        version_TV = findViewById(R.id.version_TV);

        /*<------------Handle_Github_link_On_click_Listener--------->*/

        github_link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/joymridha2004"));
                startActivity(intent);
            }
        });

        /*<------------Handle_Calculator_Project_Link_On_click_Listener--------->*/

        version_TV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/joymridha2004/Calculator_Java_Application"));
                startActivity(intent);
            }
        });

    }
}
