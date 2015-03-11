package com.corneliudascalu.napkin.base;

import android.app.Application;

import dagger.ObjectGraph;

/**
 * @author Corneliu Dascalu <corneliu.dascalu@gmail.com>
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Injector.setGraph(ObjectGraph.create(new AndroidModule(this)));
    }

}
