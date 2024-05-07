package com.indah.tab_layout;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;

public class Tab3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab3);


        // Mengambil sumber daya (Resources)
        Resources res = getResources();

        // Mengambil string-array data_prodi
        String[] dataFakultas = res.getStringArray(R.array.data_prodi);

        // Menampilkan data prodi pertama ke dalam TextView
        TextView textView = findViewById(R.id.textViewProdi);
        textView.setText(dataFakultas[0]);
    }
}