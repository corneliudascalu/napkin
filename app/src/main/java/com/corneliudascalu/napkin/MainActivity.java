package com.corneliudascalu.napkin;

import com.corneliudascalu.napkin.base.App;
import com.corneliudascalu.napkin.base.BaseInjectedActivity;
import com.corneliudascalu.napkin.base.SampleSingleton;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import javax.inject.Inject;
import javax.inject.Named;

import butterknife.ButterKnife;
import butterknife.InjectView;


public class MainActivity extends BaseInjectedActivity {

    @InjectView(R.id.drawer)
    DrawerLayout drawerLayout;

    @InjectView(R.id.primaryToolbar)
    Toolbar primaryToolbar;

    @Inject
    App app;

    @Inject
    @Named("napkin")
    String napkin;

    @Inject
    SampleSingleton singleton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this, this);
        setSupportActionBar(primaryToolbar);
        primaryToolbar.setNavigationIcon(R.drawable.ic_ab_drawer);
        drawerLayout.setStatusBarBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));

        Toast.makeText(this, "App injected " + (app != null), Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Napkin injected " + napkin, Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Singleton injected " + (singleton != null), Toast.LENGTH_SHORT).show();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case android.R.id.home:
                drawerLayout.openDrawer(Gravity.START);
                return true;
            case R.id.action_settings:
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected Object[] getModules() {
        return new Object[]{new TestModule()};
    }
}
