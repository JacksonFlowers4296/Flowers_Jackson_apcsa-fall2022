//(c) A+ Computer Science
//www.apluscompsci.com
//Name - 

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable {

  private int xplace;
  private int yplace;
  private int width;
  private int height;

  private Color color;

  public Block() {
   
	this(100, 150, 10, 10, Color.BLACK);
  }

  
  public Block(int x, int y) {
    
	this(x, y, 10, 10, Color.BLACK);
  }

  public Block(int x, int y, int width, int height) {
   
	this.setPos(x, y);
    this.setDimensions(width, height);
    this.setColor(Color.BLACK);
  }

  public Block(int x, int y, int width, int height, Color color) {
   
	this(x, y, width, height);
    this.setColor(color);
  }

 
  public void setPos(int x, int y) {
    this.setX(x);
    this.setY(y);
  }

  public void setX(int x) {
    this.xplace = x;
  }

  public void setY(int y) {
    this.yplace = y;
  }

  public void setDimensions(int width, int height) {
    this.setWidth(width);
    this.setHeight(height);
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public void setColor(Color col) {
    this.color = col;
  }

  public void draw(Graphics window) {
    
    window.setColor(color);
    window.fillRect(getX(), getY(), Widthy(), Heighty());
  }

  public void draw(Graphics window, Color col) {
    window.setColor(col);
    window.fillRect(getX(), getY(), Widthy(), Heighty());
  }

  public boolean equals(Object obj) {
    if (!(obj instanceof Block)) return false;
    Block other = (Block) obj;
    return (
      other.getX() == this.getX() &&
      other.getY() == this.getY() &&
      other.Widthy() == this.Widthy() &&
      other.Heighty() == this.Heighty() &&
      other.Colory().equals(this.Colory())
    );
  }

  //add the other get methods
  public int getX() {
    return this.xplace;
  }

  public int getY() {
    return this.yplace;
  }

  public int Widthy() {
    return this.width;
  }

  public int Heighty() {
    return this.height;
  }

  public Color Colory() {
    return this.color;
  }

  
  public String toString() {
    return (this.xplace + " " + this.yplace + " " + this.width + " " + this.height + " " + this.color);
  }

}