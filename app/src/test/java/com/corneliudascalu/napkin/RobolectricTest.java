package com.corneliudascalu.napkin;

import com.corneliudascalu.napkin.common.CustomRobolectricRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Corneliu Dascalu <corneliu.dascalu@gmail.com>
 */
@RunWith(CustomRobolectricRunner.class)
public class RobolectricTest {

    @Test
    public void testRobolectric() {
        assertThat(Robolectric.application).isNotNull();
    }

    @Test
    public void testActivity() {
        MainActivity mainActivity = Robolectric.setupActivity(MainActivity.class);
        assertThat(mainActivity).isNotNull();
    }
}
