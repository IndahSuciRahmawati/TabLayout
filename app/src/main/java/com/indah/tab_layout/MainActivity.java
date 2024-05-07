package com.indah.tab_layout;


import android.app. TabActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

import android.widget.TabHost. TabSpec;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost();

        this.setNewTab(this, tabHost, "tab1", "Universitas Kuningan", R.drawable.ic_launcher_background, new Intent(this, Tab1.class));

        this.setNewTab(this, tabHost, "tab2", "Fakultas", R.drawable.ic_launcher_background, new Intent(this, Tab2.class));

        this.setNewTab(this, tabHost, "tab3", "Program Studi", R.drawable.ic_launcher_background, new Intent(this, Tab3.class));

    }

    private void setNewTab(Context context, TabHost tabHost, String tag, String title, int icon, Intent intentid) {

        TabHost.TabSpec tabSpec = tabHost.newTabSpec(tag);

        tabSpec.setIndicator(title, context.getResources().getDrawable(icon));

        tabSpec.setContent(intentid); tabHost.addTab(tabSpec);

    }

}