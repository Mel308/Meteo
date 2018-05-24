package com.example.piotm.meteo;

import android.content.res.Configuration;
import android.content.res.Resources;

import java.util.Locale;
/**
 * Created by piotm on 24/05/2018.
 */

public class LanguageSelection {
    public static void changeLanguage(Resources res, String langue){
        Configuration config;
        config=new Configuration(res.getConfiguration());

        switch (langue){
            case "fr-rFR":
                config.locale=Locale.FRENCH;
                break;
            default:
                config.locale=Locale.ENGLISH;
                break;
        }
        res.updateConfiguration(config, res.getDisplayMetrics());
    }
}
