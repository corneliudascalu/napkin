package com.corneliudascalu.napkin.base;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author Corneliu Dascalu <corneliu.dascalu@gmail.com>
 */
@Module(library = true)
public class AndroidModule {

    private App app;

    public AndroidModule(App app) {
        this.app = app;
    }

    @Provides
    @Singleton
    public App provideApp() {
        return app;
    }
}
