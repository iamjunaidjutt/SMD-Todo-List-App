package com.iamjunaidjutt.assignment2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("CustomSplashScreen")
public class SplashScreen extends AppCompatActivity {
    ImageView imgAnim;
    @Override
    protected void onCreate(Bundle savedBundleInstances) {
        super.onCreate(savedBundleInstances);
        Log.d("Lifecycle", "onCreate called");
        setContentView(R.layout.splash_screen);
        setTitle("Splash Screen");

        imgAnim = findViewById(R.id.ivSplashScreen);

        Animation splashAnimation = AnimationUtils.loadAnimation(this, R.anim.splash_anim);
        imgAnim.setAnimation(splashAnimation);
        Intent iHome = new Intent(SplashScreen.this, MainActivity.class);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(iHome);
                finish();
            }
        }, 4000);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Lifecycle", "onStart called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Lifecycle", "onResume called");
    }
}
