package com.corneliudascalu.napkin;

import com.corneliudascalu.napkin.base.AndroidModule;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * @author Corneliu Dascalu <corneliu.dascalu@gmail.com>
 */
@Module(addsTo = AndroidModule.class, injects = MainActivity.class)
public class TestModule {

    @Provides
    @Named("napkin")
    public String provideNapkin() {
        return "This is napkin";
    }
}
