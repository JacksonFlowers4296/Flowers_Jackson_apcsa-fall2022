//(c) A+ Computer Science


import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class SpeedUpBall extends Ball {

  //instance variables
  private int fasterXbruh;
  private int fasterYbruh;

  public SpeedUpBall() {
    super();
    fasterXbruh = 3;
    fasterYbruh = 1;
  }

  public SpeedUpBall(int x, int y) {
    super(x, y);
    fasterXbruh = 3;
    fasterYbruh = 1;
  }

  public SpeedUpBall(int x, int y, Color col) {
    super(x, y, col);
    fasterXbruh = 3;
    fasterYbruh = 1;
  }

  public SpeedUpBall(int x, int y, int xSpd, int ySpd) {
    super(x, y, xSpd, ySpd);
    fasterXbruh = 3;
    fasterYbruh = 1;
  }

  public SpeedUpBall(int x, int y, int wid, int ht, int xSpd, int ySpd) {
    super(x, y, wid, ht, xSpd, ySpd);
    fasterXbruh = 3;
    fasterYbruh = 1;
  }

  public SpeedUpBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd) {
    super(x, y, wid, ht, col, xSpd, ySpd);
    fasterXbruh = 3;
    fasterYbruh = 1;
  }

  public void setXSpeed(int xSpd) {
    if (xSpd < 0) {
      super.xSpeed(xSpd - fasterXbruh);
    } else if (xSpd > 0) {
      super.xSpeed(xSpd + fasterXbruh);
    } else {
      super.xSpeed(xSpd);
    }
  }

  public void setYSpeed(int ySpd) {
    if (ySpd < 0) {
      super.ySpeed(ySpd - fasterYbruh);
    } else if (ySpd > 0) {
      super.ySpeed(ySpd + fasterYbruh);
    } else {
      super.ySpeed(ySpd);
    }
  }
}