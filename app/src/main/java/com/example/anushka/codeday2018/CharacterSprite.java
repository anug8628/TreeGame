package com.example.anushka.codeday2018;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by Anushka on 11/10/18.
 */

public class CharacterSprite {
    private Bitmap image;
    private int myX, myY;
    private int xVelocity = 10;
    private int yVelocity = 5;
    private int screenWidth = Resources.getSystem().getDisplayMetrics().widthPixels;
    private int screenHeight = Resources.getSystem().getDisplayMetrics().heightPixels;

    public CharacterSprite(Bitmap bmp, int x, int y) {
        image = bmp;

        //List<Customer> newList = new ArrayList<>( oldList );
        //Collections.shuffle( newList ) ;
        myX = x;
        myY = y;
    }

    public void draw(Canvas canvas) {
        canvas.drawBitmap(image, myX, myY, null);
    }

    public void update() {
  //      y++;
    //    if(y >= screenHeight*0.85)
      //      image.hide();

        //x += xVelocity;
        myY += yVelocity;
        /*if((x >screenWidth - image.getWidth()) || (x < 0)) {
            xVelocity = xVelocity - 1;
        }
        if((y >screenWidth - image.getHeight()) || (y < 0)) {
            yVelocity = yVelocity - 1;
        }
    */
    }
    }

