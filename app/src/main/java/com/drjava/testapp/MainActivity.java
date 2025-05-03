package com.drjava.testapp;
 
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import dr.java.compat.time.LocalDate;
import dr.java.compat.time.Duration;

public class MainActivity extends Activity {

    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        output = findViewById(R.id.output);
    }

    public void testLocalDate(View view) {
        try {
            LocalDate date = LocalDate.of(2025, 5, 2);
            output.setText("LocalDate: " + date.toString());
        } catch (Exception e) {
            output.setText("Error: " + e.toString());
        }
    }

    public void testDuration(View view) {
        Duration d = Duration.ofMinutes(90);
        output.setText("Duration: " + d.toString() + " = " + d.toHours() + " hours");
    }
}
