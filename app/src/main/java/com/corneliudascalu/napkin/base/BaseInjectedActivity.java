package com.corneliudascalu.napkin.base;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

/**
 * @author Corneliu Dascalu <corneliu.dascalu@gmail.com>
 */
public abstract class BaseInjectedActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Injector.getGraph().plus(getModules()).inject(this);
    }

    protected abstract Object[] getModules();
}
