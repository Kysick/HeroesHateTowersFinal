package com.example.mbmak.heroeshatetowers;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;

    class DrawView extends View{
    Tower tower;
    Warrior warrior;
    Mage mage;
    Tavern tavern;
        public DrawView(Context context) {
            super(context);
            setBackgroundColor(Color.GREEN);
            Bitmap Warrior = BitmapFactory
                    .decodeResource(getResources(),
                            R.drawable.warrior256x512);
            Bitmap Mage = BitmapFactory
                    .decodeResource(getResources(),
                            R.drawable.mage128x512);
            Bitmap Tavern = BitmapFactory
                    .decodeResource(getResources(),
                            R.drawable.tavern_256x256);
            Bitmap Tower= BitmapFactory
                    .decodeResource(getResources(),
                            R.drawable.tower_256x512);
            Tavern tavern = new Tavern(50,50,1,Tavern);
            Warrior warrior = new Warrior(150 , 150 , 2 , 4, Warrior);

            }
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            warrior.draw(canvas);
            invalidate();
        }
}
