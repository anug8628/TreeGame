package com.example.anushka.codeday2018;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;

/**
 * Created by Anushka on 11/10/18.
 */

public class CharacterSprite {
    private Bitmap image;
    private int x, y;
    private int xVelocity = 10;
    private int yVelocity = 5;
    private int screenWidth = Resources.getSystem().getDisplayMetrics().widthPixels;
    private int screenHeight = Resources.getSystem().getDisplayMetrics().heightPixels;

    public CharacterSprite(Bitmap bmp) {
        image = bmp;
        x = 100;
        y = 100;
    }

    public void draw(Canvas canvas) {
        canvas.drawBitmap(image, 100, 100, null);
    }

    public void update() {
        y++;
     //   if(y >= screenHeight*0.85)

     /*   x += xVelocity;
        y += yVelocity;
        if ((x & gt = screenWidth - image.getWidth()) || (x & lt; 0)) {
            xVelocity = xVelocity * -1;
        }
        if ((y & gt; screenHeight - image.getHeight()) || (y & lt; 0)) {
            yVelocity = yVelocity * -1;
        }
    }*/
    }

}