package com.example.usingglide;


import android.os.Bundle;
import android.widget.ImageView;

//import android.support.v7.app.AppCompatActivity;



import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;



public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.imageView);

        String url ="https://cn.bing.com/sa/simg/hpb/LaDigue_EN-CA1115245085_1920x1080.jpg";
        Glide.with(this).load(url).into(imageView);


    }
}
