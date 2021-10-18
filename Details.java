package com.storieslist.storiesapp;


import android.app.Activity;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class Details extends Activity {
    TextView storyContent;
    ImageView storyImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        storyContent = findViewById(R.id.contentOfStory);
        storyImage = findViewById(R.id.story_img);

        Intent i = getIntent();
        String title = i.getStringExtra("titleOfStory");
        String content = i.getStringExtra("contentOfStory");
        int image = i.getIntExtra("picture",0);
        System.out.println("pictureis"+image);

       // storyImage.setImageResource(image);

        // set the appbar title as Story title
        //getSupportActionBar().setTitle(title);

        // set content of the story to textview
        storyContent.setText(content);
        storyContent.setMovementMethod(new ScrollingMovementMethod());

        // enable back button to main activity or recyclerview
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);



    }
}