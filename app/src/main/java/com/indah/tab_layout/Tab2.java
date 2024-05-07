package com.indah.tab_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;

public class Tab2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab2);

        // Mengambil sumber daya (Resources)
        Resources res = getResources();

        // Mengambil string-array data_fakultas
        String[] dataFakultas = res.getStringArray(R.array.data_fakultas);

        // Menampilkan data fakultas pertama ke dalam TextView
        TextView textView = findViewById(R.id.textView);
        textView.setText(dataFakultas[0]); // Tampilkan data fakultas pertama
    }
}
