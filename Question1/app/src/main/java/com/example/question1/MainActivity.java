package com.example.question1;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {

    private ImageView boxImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boxImageView = findViewById(R.id.boxImageView);

        ImageView upImageView = findViewById(R.id.upImageView);
        ImageView downImageView = findViewById(R.id.downImageView);
        ImageView leftImageView = findViewById(R.id.leftImageView);
        ImageView rightImageView = findViewById(R.id.rightImageView);

        upImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                applyAnimation("up");
            }
        });

        downImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                applyAnimation("down");
            }
        });

        leftImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                applyAnimation("left");
            }
        });

        rightImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                applyAnimation("right");
            }
        });
    }

    private void applyAnimation(String direction) {
        int animationResource = 0;

        switch (direction) {
            case "up":
                animationResource = R.anim.flip_up;
                break;
            case "down":
                animationResource = R.anim.flip_down;
                break;
            case "left":
                animationResource = R.anim.flip_left;
                break;
            case "right":
                animationResource = R.anim.flip_right;
                break;
        }

        if (animationResource != 0) {
            Animation animation = AnimationUtils.loadAnimation(this, animationResource);
            boxImageView.startAnimation(animation);
        }
    }
}