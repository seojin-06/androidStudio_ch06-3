package com.cookandroid.project6_3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost();

        TabSpec TabSpecPuppy = tabHost.newTabSpec("PUPPY").setIndicator("강아지");
        TabSpecPuppy.setContent(R.id.tabPuppy);
        tabHost.addTab(TabSpecPuppy);

        TabSpec TabSpecCat = tabHost.newTabSpec("CAT").setIndicator("고양이");
        TabSpecCat.setContent(R.id.tabCat);
        tabHost.addTab(TabSpecCat);

        TabSpec TabSpecRabbit = tabHost.newTabSpec("RABBIT").setIndicator("토끼");
        TabSpecRabbit.setContent(R.id.tabRabbit);
        tabHost.addTab(TabSpecRabbit);

        TabSpec TabSpecHorse = tabHost.newTabSpec("HORSE").setIndicator("말");
        TabSpecHorse.setContent(R.id.tabHorse);
        tabHost.addTab(TabSpecHorse);

        tabHost.setCurrentTab(0);
    }
}