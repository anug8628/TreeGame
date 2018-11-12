package com.example.anushka.codeday2018;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/**
 * Created by Anushka on 11/10/18.
 */

public class BasketSprite {
    private Bitmap image;
    private int x, y;
    private int xVelocity = 10;
    private int yVelocity = 5;
    private int screenWidth = Resources.getSystem().getDisplayMetrics().widthPixels;
    private int screenHeight = Resources.getSystem().getDisplayMetrics().heightPixels;
    private View.OnTouchListener handleTouch;
    private int myXx;

    public BasketSprite(Bitmap bmn) {
        image = bmn;
        x = 100;
        y = 1600;

    }

    public void getXx(int a){
        System.out.println(a);
        myXx = a;
    }
/*
    public boolean onTouchEvent(MotionEvent motionEvent) {

        switch (motionEvent.getAction() & MotionEvent.ACTION_MASK) {

            // Player has touched the screen
            case MotionEvent.ACTION_DOWN:

                break;

            // Player has removed finger from screen
            case MotionEvent.ACTION_UP:

                break;
        }
        return true;
    }
*/
    public int GetBasketX(){
        return x;
    }

    public void draw(Canvas canvas) {
        canvas.drawBitmap(image, x, y, null);
    }

    public void update() {
        //x += xVelocity

        x = myXx;
        // y += yVelocity;
        //  if((x >screenWidth - image.getWidth()) || (x < 0)) {
        //    xVelocity = xVelocity - 1;
        //  }
        //  if((y >screenWidth - image.getHeight()) || (y < 0)) {
        //    yVelocity = yVelocity - 1;*/
        //}
    }
}

