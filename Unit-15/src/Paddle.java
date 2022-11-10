//(c) A+ Computer Science


import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block {

  //instance variables
  private int speed;

  public Paddle() {
    super(10, 10);
    this.setspeedy(5);
  }

  //add the other Paddle constructors
  public Paddle(int x, int y) {
    super(x, y);
    this.setspeedy(5);
  }

  public Paddle(int x, int y, int speed) {
    super(x, y);
    this.setspeedy(speed);
  }

  public Paddle(int x, int y, int width, int height) {
    super(x, y, width, height);
    this.setspeedy(5);
  }

  public Paddle(int x, int y, int width, int height, int speed) {
    super(x, y, width, height);
    this.setspeedy(speed);
  }

  public Paddle(int x, int y, int width, int height, Color color) {
    super(x, y, width, height, color);
    this.setspeedy(5);
  }

  public Paddle(int x, int y, int width, int height, Color color, int speed) {
    super(x, y, width, height, color);
    this.setspeedy(speed);
  }

  public void moveUpAndDraw(Graphics window) {
    this.draw(window, Color.white);
    this.setY(this.getY() - this.speed);
    this.draw(window);
  }

  public void moveDownAndDraw(Graphics window) {
    this.draw(window, Color.white);
    this.setY(this.getY() + this.speed);
    this.draw(window);
  }

  public void setspeedy(int speedyy) {
    this.speed = speedyy;
  }

  
  public int getspeedy() {
    return this.speed;
  }

 
  public String toString() {
    return super.toString() + " " + this.speed;
  }
}