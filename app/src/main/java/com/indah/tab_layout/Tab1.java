package com.indah.tab_layout;


import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;

public class Tab1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab1);


        // Mendapatkan akses ke string-array dari strings.xml
        Resources res = getResources();
        String[] dataDescriptions = res.getStringArray(R.array.data_description);

        // Mengambil TextView dari layout
        TextView descriptionTextView = findViewById(R.id.tv_item_description);

        // Menyusun konten dari string-array menjadi satu string untuk ditampilkan
        StringBuilder descriptionBuilder = new StringBuilder();
        for (String description : dataDescriptions) {
            descriptionBuilder.append(description).append("\n\n");
        }

        // Menampilkan konten string-array di TextView
        descriptionTextView.setText(descriptionBuilder.toString());
    }
}