package com.example.rotatingcars;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    ImageView car1, car2, car3, car4;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        car1 = findViewById(R.id.car1);
        car2 = findViewById(R.id.car2);
        car3 = findViewById(R.id.car3);

        Timer t = new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Drawable temp1 = car1.getDrawable();
                        Drawable temp2 = car2.getDrawable();
                        Drawable temp3 = car3.getDrawable();

                        car1.setImageDrawable(temp3);
                        car2.setImageDrawable(temp1);
                        car3.setImageDrawable(temp2);
                    }
                });
            }
        }, 0, 1000);






    }


}






