package com.eyalkarpel.www.eyalsfirstportal;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    // The action occurs when the spotify button is clicked.
    public void spotifyStreamer_OnClick(View view) {
        displayMessageOnScreen("Soon! my spotify app!");
    }

    // The action occurs when the football scores button is clicked.
    public void footballScores_OnClick(View view) {
        displayMessageOnScreen("What is football? soon here.");
    }

    // The action occurs when the library button is clicked.
    public void libraryApp_OnClick(View view) {
        displayMessageOnScreen("For those who know what \"Library\" is...");
    }

    // The action occurs when the Bib button is clicked.
    public void buildItBigger_OnClick(View view) {
        displayMessageOnScreen("In the future, will launch the BiB app!");
    }

    // The action occurs when the readet button is clicked.
    public void xyzReader_OnClick(View view) {
        displayMessageOnScreen("When available, will launch the reader app!");
    }

    // The action occurs when the my app button is clicked.
    public void ohMyBaby_OnClick(View view) {
        displayMessageOnScreen("This button will launch my own app!");
    }


    private void displayMessageOnScreen(String message) {
        Context context = getApplicationContext();
        CharSequence text = message;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
