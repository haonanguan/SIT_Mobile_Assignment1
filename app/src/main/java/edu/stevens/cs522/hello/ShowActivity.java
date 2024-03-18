package edu.stevens.cs522.hello;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowActivity extends Activity {
    public final static String MESSAGE_KEY = "message";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        String text = getIntent().getStringExtra(MESSAGE_KEY);
        String message = getResources().getString(R.string.show_name, text);
        TextView textview = (TextView) findViewById(R.id.message);
        textview.setText(message);
    }
}