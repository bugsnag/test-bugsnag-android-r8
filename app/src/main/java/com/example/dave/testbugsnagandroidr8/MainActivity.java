package com.example.dave.testbugsnagandroidr8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.bugsnag.android.Bugsnag;
import com.bugsnag.android.Client;
import com.bugsnag.android.Configuration;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Configuration configuration = new Configuration("24454421e514fb897121e4d9ad0279f0");
        configuration.setEndpoints("http://10.0.2.2:8000", "http://10.0.2.2:10000");
        Bugsnag.init(this, configuration);

        Button b = (Button) findViewById(R.id.button);
        b.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CrashyClass c = new CrashyClass();
                c.sendNotify(5);

                c.sendNotify("oh no!");
            }
        });
    }
}
