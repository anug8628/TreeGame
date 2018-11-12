package com.example.anushka.codeday2018;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.content.Context;
//import android.support.annotation.MainThread;
//import android.support.annotation.MainThread;
//import android.graphics.Canvas;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.Log;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.SurfaceHolder;
import java.util.Timer;
import java.util.TimerTask;

import android.view.View;
import android.view.View.OnTouchListener;


/**
 * Created by Anushka on 11/10/18.
 */


public class GameView extends SurfaceView implements SurfaceHolder.Callback {
    private MainThread thread;
    private CharacterSprite c1;
    private CharacterSprite c2;
    private CharacterSprite c3;
    private CharacterSprite c4;
    public int Xx;



    private GameView.OnTouchListener handleTouch = new ImageView.OnTouchListener() {

        @Override
        public boolean onTouch(View v, MotionEvent event) {

            int x = (int) event.getX();
            int y = (int) event.getY();

            Xx = x;

            switch (event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    Xx = x;
                    break;
                case MotionEvent.ACTION_MOVE:
                    Xx = x;
                case MotionEvent.ACTION_UP:
                    Xx = x;
            }

            return true;
        }
    };


    //TimerTask tasknew;
    private BasketSprite basketSprite;
    private TreeSprite treeSprite;

    public GameView(Context context){
        super(context);

        /*tasknew = new TimerScheduleDelay();
        Timer timer = new Timer();*/
        getHolder().addCallback(this);
        thread = new MainThread(getHolder(), this);
        setFocusable(true);
    }

    public int myXx()
    {
        return Xx;
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }


    @Override
    public void surfaceCreated(SurfaceHolder holder) {

        c1 = new CharacterSprite(BitmapFactory.decodeResource(getResources(),R.drawable.newapple), 300, 400);
        c2 = new CharacterSprite(BitmapFactory.decodeResource(getResources(),R.drawable.newapple), 400, 600);
        c3 = new CharacterSprite(BitmapFactory.decodeResource(getResources(),R.drawable.newapple), 500, 800);
        c4 = new CharacterSprite(BitmapFactory.decodeResource(getResources(),R.drawable.newapple), 400, 700);

        basketSprite = new BasketSprite(BitmapFactory.decodeResource(getResources(),R.drawable.newbasket));
        treeSprite = new TreeSprite(BitmapFactory.decodeResource(getResources(),R.drawable.new2tree));

        thread.setRunning(true);
        thread.start();

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        boolean retry = true;
        while (retry) {
            try {
                thread.setRunning(false);
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            retry = false;
        }
    }

    public void update() {
    basketSprite.getXx(Xx);


    treeSprite.update();
    c1.update();
/*    try{
        Thread.sleep(5000);
        c2.update();
    }
    catch(InterruptedException e){
        System.err.println(e.getmessage());
    }*/
    c2.update();
    c3.update();
    c4.update();
    basketSprite.update();

    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (canvas != null) {
            treeSprite.draw(canvas);
            c1.draw(canvas);
            c2.draw(canvas);
            c3.draw(canvas);
            c4.draw(canvas);
            basketSprite.draw(canvas);
        }
    }
}
