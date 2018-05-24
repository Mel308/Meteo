package com.example.piotm.meteo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    /*Ajout de l'ActionBar à l'activity*/
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    /*Ajout des actions à effectuer pour chaque item de l'ActionBar*/
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_save:
                Toast toast = Toast.makeText(this, "Save...", Toast.LENGTH_SHORT);
                toast.show();
                return true;
            case R.id.action_fr:
                LanguageSelection fr = new LanguageSelection();
                fr.changeLanguage(getResources(), "fr-rFR");
                this.recreate();
                Toast toast_fr = Toast.makeText(this, "Langue : Français", Toast.LENGTH_SHORT);
                toast_fr.show();
                return true;
            case R.id.action_en:
                LanguageSelection en = new LanguageSelection();
                en.changeLanguage(getResources(), "en-rUS");
                this.recreate();
                Toast toast_en = Toast.makeText(this, "Language : English", Toast.LENGTH_SHORT);
                toast_en.show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
