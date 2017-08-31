package com.example.iis5.loginscreen;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
//Instrumented unit tests are unit tests that run on Android devices
       // and emulators instead of running on the Java virtual machine.
    //Instrumentation test cases are put under app/src/androidTest/java folder.
    //AndroidJUnitRunner is For running JUnit 4 style test classes.
    //Espresso– For running functional UI test cases.
    //UI Automator– For running cross app functional UI test cases across system and installed apps.
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.iis5.loginscreen", appContext.getPackageName());
    }
}
