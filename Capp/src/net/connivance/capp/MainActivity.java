package net.connivance.capp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView = new TextView(this);
	    textView.setTextSize(40);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user clicks the Send button */
    public void sendQ1_0(View view) {
        Intent intent = new Intent(this, Q1_0.class);
        startActivity(intent);
    }
    public void sendQ1_1(View view) {
        Intent intent = new Intent(this, Q1_1.class);
        startActivity(intent);
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
}
