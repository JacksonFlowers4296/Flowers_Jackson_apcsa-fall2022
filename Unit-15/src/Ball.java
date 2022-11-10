//(c) A+ Computer Science
//www.apluscompsci.com
//Name - 

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block implements Collidable {

  private int fastX;
  private int fastY;

  public Ball() {
    super(200, 200);
    this.speederSetter(3, 1);
  }

  //add the other Ball constructors
  public Ball(int x, int y) {
    super(x, y);
    this.speederSetter(3, 1);
  }

  public Ball(int x, int y, Color color) {
    super(x, y);
    this.speederSetter(3, 1);
    this.setColor(color);
  }

  public Ball(int x, int y, int width, int height) {
    super(x, y, width, height);
    this.speederSetter(3, 1);
  }

  public Ball(int x, int y, int width, int height, int xSpeed, int ySpeed) {
    super(x, y, width, height);
    this.speederSetter(xSpeed, ySpeed);
  }

  public Ball(int x, int y, int width, int height, Color color) {
    super(x, y, width, height, color);
    this.speederSetter(3, 1);
  }

  public Ball(int x, int y, int width, int height, Color color, int xSpeed, int ySpeed) {
    super(x, y, width, height, color);
    this.speederSetter(xSpeed, ySpeed);
  }

  //add the set methods
  public void speederSetter(int x, int y) {
    this.xSpeed(x);
    this.ySpeed(y);
  }

  public void xSpeed(int x) {
    this.fastX = x;
  }

  public void ySpeed(int y) {
    this.fastY = y;
  }

  public void moveAndDraw(Graphics window) {
    //draw a white ball at old ball location
    this.draw(window, Color.WHITE);

    setX(getX() + fastX);
    //setY
    setY(getY() + fastY);

    //draw the ball at its new location
    this.draw(window);
  }

  public boolean equals(Object obj) {
    if (!(obj instanceof Ball)) return false;
    Ball other = (Ball) obj;
    return (
      other.getX() == this.getX() &&
      other.getY() == this.getY() &&
      other.Widthy() == this.Widthy() &&
      other.Heighty() == this.Heighty() &&
      other.Colory().equals(this.Colory()) &&
      other.getXSpeed() == this.getXSpeed() &&
      other.getYSpeed() == this.getYSpeed()
    );
  }

  //add the get methods
  public int getXSpeed() {
    return this.fastX;
  }

  public int getYSpeed() {
    return this.fastY;
  }

  public boolean didCollideLeft(Object obj) {
    if (!(obj instanceof Block)) return false;
    Block other = (Block) obj;
    if (!(this.getX() <= other.getX() + other.Widthy())) return false;
    if (
      !(this.getY() + this.Heighty() >= other.getY() && this.getY() <= other.getY() + other.Heighty())
    ) return false;
    return true;
  }

  public boolean didCollideRight(Object obj) {
    if ((obj instanceof Block) == false) return false;
    Block other = (Block) obj;
    if ((this.getX() + this.Widthy() >= other.getX()) == false) return false;
    if (
      (this.getY() + this.Heighty() >= other.getY() && this.getY() <= other.getY() + other.Heighty())
    == false) return false;
    return true;
  }

  public boolean didCollideTop(Object obj) {
    if ((obj instanceof Block)== false) return false;
    Block other = (Block) obj;
    if ((this.getY() <= other.getY() + other.Heighty()) == false) return false;
    if (
      (this.getX() >= other.getX() && this.getX() + this.Widthy() <= other.getX() + other.Widthy())
   == false ) return false;
    return true;
  }

  public boolean didCollideBottom(Object obj) {
    if ((obj instanceof Block)== false) return false;
    Block other = (Block) obj;
    if ((this.getY() + this.Heighty() >= other.getY())== false) return false;
    if (
      (this.getX() <= other.getX() + other.Widthy() && this.getX() + this.Widthy() >= other.getX())
  == false  ) return false;
    return true;
  }

  
  public String toString() {
    return super.toString() + " " + this.fastX + " " + this.fastY;
  }
}