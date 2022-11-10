//(c) A+ Computer Science
//www.apluscompsci.com
//Name - 

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class BlinkyBall extends Ball {

  //constructors
  public BlinkyBall() {
    super();
  }

  public BlinkyBall(int x, int y) {
    super(x, y);
  }

  public BlinkyBall(int x, int y, Color col) {
    super(x, y, col);
  }

  public BlinkyBall(int x, int y, int wid, int ht) {
    super(x, y, wid, ht);
  }

  public BlinkyBall(int x, int y, int wid, int ht, int xSpd, int ySpd) {
    super(x, y, wid, ht, xSpd, ySpd);
  }

  public BlinkyBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd) {
    super(x, y, wid, ht, col, xSpd, ySpd);
  }

  public Color randomColor() {
    
	  
	  
	  
    int red = (int) (Math.random() * 256);
    int green = (int) (Math.random() * 256);
    int blue = (int) (Math.random() * 256);
   
    return new Color(red, green, blue);
  }

  public void moveAndDraw(Graphics window) {
    
    super.setColor(randomColor());
    super.moveAndDraw(window);
  }
}