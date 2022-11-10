//(c) A+ Computer Science


import static java.lang.Character.*;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

public class Pong extends Canvas implements KeyListener, Runnable {

  private Ball ball;
  private Paddle leftPaddle;
  private Paddle rightPaddle;
  private boolean[] keys;
  private BufferedImage back;
  private Wall Righty;
  private Wall Lefty;
  private Wall Topped;
  private Wall Bruhtoon;
  private int oneScore;
  private int twoScore;


  public Pong() {
   
    this.ball = new Ball(200, 200, Color.orange);
    this.leftPaddle = new Paddle(10, 300, 10, 60, Color.blue, 5);
    this.rightPaddle = new Paddle(780, 300, 10, 60, Color.blue, 5);
    this.Righty = new Wall(800, 0, 10, 600);
    this.Lefty = new Wall(0, 0, 10, 600);
    this.Topped = new Wall(0, 0, 800, 10);
    this.Bruhtoon = new Wall(0, 580, 800, 10);
    this.oneScore = 0;
    this.twoScore = 0;
    keys = new boolean[4];

    setBackground(Color.WHITE);
    setVisible(true);

    new Thread(this).start();
    addKeyListener(this);
  }

  public void update(Graphics window) {
    paint(window);
  }

  public void paint(Graphics window) {
   
    Graphics2D twoDGraph = (Graphics2D) window;

   
    if (back == null) back = (BufferedImage) (createImage(getWidth(), getHeight()));

    Graphics graphToBack = back.createGraphics();

    ball.moveAndDraw(graphToBack);
    leftPaddle.draw(graphToBack);
    rightPaddle.draw(graphToBack);

   
    if (ball.didCollideLeft(this.Lefty) || ball.didCollideRight(this.Righty)) {
      if (ball.didCollideLeft(this.Lefty)) twoScore++; else oneScore++;
      ball.draw(graphToBack, Color.WHITE);
      ball.setPos(200, 200);
      ball.xSpeed(-ball.getXSpeed());
      leftPaddle.draw(graphToBack, Color.WHITE);
      rightPaddle.draw(graphToBack, Color.WHITE);
      leftPaddle.setPos(10, 300);
      rightPaddle.setPos(780, 300);
    }

   
    if (ball.didCollideTop(this.Topped) || ball.didCollideBottom(this.Bruhtoon)) {
      ball.ySpeed(-ball.getYSpeed());
    }

  
    if (ball.didCollideLeft(leftPaddle)) {
      ball.xSpeed(-ball.getXSpeed());
    }
   
    if (ball.didCollideRight(rightPaddle)) {
      ball.xSpeed(-ball.getXSpeed());
    }

   
    if (keys[0] == true) leftPaddle.moveUpAndDraw(graphToBack);
    if (keys[1] == true) leftPaddle.moveDownAndDraw(graphToBack);
    if (keys[2] == true) rightPaddle.moveUpAndDraw(graphToBack);
    if (keys[3] == true) rightPaddle.moveDownAndDraw(graphToBack);

    twoDGraph.drawImage(back, null, 0, 0);
    twoDGraph.drawString("player one: " + oneScore, 400, 430);
    twoDGraph.drawString("player two: " + twoScore, 400, 450);
  }

  public void keyPressed(KeyEvent e) {
    switch (toUpperCase(e.getKeyChar())) {
      case 'W':
      {  keys[0] = true;
        break;}
      case 'Z':
        {keys[1] = true;
        break;}
      case 'I':
      {   keys[2] = true;
        break;}
      case 'M':
      {  keys[3] = true;
        break;}
    }
  }

  public void keyReleased(KeyEvent e) {
    switch (toUpperCase(e.getKeyChar())) {
      case 'W':
      {  keys[0] = false;
        break;}
      case 'Z':
        {keys[1] = false;
        break;}
      case 'I':
      {  keys[2] = false;
        break;}
      case 'M':
      {      keys[3] = false;
        break;}
    }
  }

  public void keyTyped(KeyEvent e) {}

  public void run() {
    try {
      while (true) {
        Thread.currentThread().sleep(8);
        repaint();
      }
    } catch (Exception e) {}
  }
}