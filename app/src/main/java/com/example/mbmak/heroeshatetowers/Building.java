package com.example.mbmak.heroeshatetowers;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;

abstract class Building implements Action, Drawable{
    float x,y;
    private int hp;
    Bitmap pic;

    Building(float x, float y, int hp,Bitmap pic){
        this.x = x;
        this.y = y;
        this.hp = hp;
        this.pic = pic;
    }


        public int getHp() {
            return hp;
        }

        public void setHp(int hp) {
            this.hp = hp;
        }
    }
class Tavern extends Building{
        Tavern(float x, float y, int hp,Bitmap pic){
            super(x,y,hp,pic);
        }
    public void draw(Canvas canvas){
        RectF to = new RectF(x, y, x + 100, y + 200);
        canvas.drawBitmap(pic, null, to, null);
    }
    public int action(Tower tower){
            return 0;
    }
}
class Tower extends Building{
    Tower(float x, float y, int hp,Bitmap pic){
        super(x,y,hp,pic);
    }
    public void draw(Canvas canvas){
        RectF to = new RectF(x, y, x + 100, y + 200);
        canvas.drawBitmap(pic, null, to, null);
    }
   public int action(Tower tower){
        return getHp();
   }

}