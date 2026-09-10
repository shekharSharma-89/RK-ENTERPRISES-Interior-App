package com.rkenterprises.interior;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView text = new TextView(this);
        text.setText("RK ENTERPRISES\nInterior Designer");
        text.setTextSize(28);
        text.setTextColor(Color.WHITE);
        text.setGravity(17);
        text.setBackgroundColor(Color.BLACK);

        setContentView(text);
    }
}
