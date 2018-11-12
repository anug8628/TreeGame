package com.example.anushka.codeday2018;

/**
 * Created by Anushka on 11/11/18.
 */

public class dimension {
    private int myWidth;
    private int myHeight;
    public dimension(int width, int height)
    {
        myWidth = width;
        myHeight = height;
    }

    public int getWidth()
    {
        return myWidth;
    }

    public int getHeight()
    {
        return myHeight;
    }

    public void setMyWidth(int a)
    {
        myWidth = a;
    }

    public void setMyHeight(int b)
    {
        myHeight = b;
    }
}
