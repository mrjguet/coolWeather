package com.coolweather.android;

import android.content.Context;
import android.util.Log;

import com.coolweather.android.gson.Weather;
import com.coolweather.android.util.Utility;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    public static final String JSON="{\n" +
            "    \"status\": \"ok\",\n" +
            "    \"basic\": {},\n" +
            "    \"aqi\": {},\n" +
            "    \"now\": {},\n" +
            "    \"suggestion\": {},\n" +
            "    \"daily_forecast\": []\n" +
            "}\n";
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();

        assertEquals("com.coolweather.android", appContext.getPackageName());
    }
    @Test
    public void testGson(){
        Weather weather = Utility.handleWeatherResponse(JSON);
    }
}
