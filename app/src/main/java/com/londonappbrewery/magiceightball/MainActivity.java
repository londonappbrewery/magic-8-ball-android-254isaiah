package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //link views in the layout xml file to the java code
        final ImageView ballDisplay = findViewById(R.id.image_eightBall);

        //store the images in an array
        final int [] ballArray = new int[] {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        //Link the askButton in the layout to the Java code
        Button myButton = findViewById(R.id.askButton);

        //tell the button to listen to clicks
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create a new Random object
                Random randomGenerator = new Random();
                //Use the random object’s nextInt() method to generate a random number and store it in a new variable called number
                int number = randomGenerator.nextInt(5);
                int imageResourceId = ballArray[number];
                //make one of the balls appear on the screen(ImageView) responsible for displaying things in our layout
                ballDisplay.setImageResource(imageResourceId);
                //another way
                //ballDisplay.setImageResource(ballArray[number]);
            }
        });
    }
}
