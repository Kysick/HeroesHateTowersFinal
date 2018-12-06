package com.example.mbmak.heroeshatetowers;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;

abstract class Hero implements Action, Drawable{
  float x,y;
  private float vx;
  private int dmg;
   Bitmap pic;



   Hero(float x, float y, float vx, int dmg,Bitmap pic){
      this.x = x;
      this.y = y;
      this.vx = vx;
      this.dmg = dmg;
      this.pic = pic;
  }

      public int getDmg() {
          return dmg;
      }
  }
class Warrior extends Hero{
    Warrior(float x, float y, float vx, int dmg,Bitmap pic){
        super(x,y,vx,dmg,pic);
    }
    public void draw(Canvas canvas){
        RectF to = new RectF(x, y, x + 100, y + 200);
        canvas.drawBitmap(pic, null, to, null);
    }

    public int action(Tower tower){
        int result = tower.getHp() - getDmg();
        tower.setHp(result);
        return result;
    }
}
class Mage extends Hero{

    Mage(float x, float y, float vx, int dmg,Bitmap pic){
        super(x,y,vx,dmg,pic);
    }
    public void draw(Canvas canvas){
        RectF to = new RectF(x, y, x + 100, y + 200);
        canvas.drawBitmap(pic, null, to, null);
    }
    public int action(Tower tower){
        int result = tower.getHp() - getDmg();
        tower.setHp(result);
        return result;
    }



}