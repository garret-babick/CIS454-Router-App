package com.example.router;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            Bundle bundle = new Bundle();
            bundle.putInt("some_int1", 0);

            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .add(R.id.FrameLayout, FirstFragment.class, bundle)
                    .commit();
        }
        Button button1 = (Button) findViewById(R.id.button);//get id of button 1
        Button button2 = (Button) findViewById(R.id.button5);//get id of button 1
        Button button3 = (Button) findViewById(R.id.button3);//get id of button 1
        Button button4 = (Button) findViewById(R.id.button4);//get id of button 1

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putInt("some_int1", 0);
                getSupportFragmentManager().beginTransaction()
                        .setReorderingAllowed(true)
                        .replace(R.id.FrameLayout, FirstFragment.class, bundle)
                        .commit();
            }
            });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putInt("some_int2", 1);

                getSupportFragmentManager().beginTransaction()
                        .setReorderingAllowed(true)
                        .replace(R.id.FrameLayout, SecondFragment.class, bundle)
                        .commit();

            }

        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putInt("some_int3", 2);

                getSupportFragmentManager().beginTransaction()
                        .setReorderingAllowed(true)
                        .replace(R.id.FrameLayout, ThirdFragment.class, bundle)
                        .commit();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("some_int4", 3);

                getSupportFragmentManager().beginTransaction()
                        .setReorderingAllowed(true)
                        .replace(R.id.FrameLayout, FourthFragment.class, bundle)
                        .commit();
                }

        });
    }
}