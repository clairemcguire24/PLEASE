import java.awt.*;
import javax.swing.*;
import java.awt.Color;

public class Ball{

    private int x,y, size, xSpeed, ySpeed;
    private Color c;
    private int height, length;



    public Ball (int x, int y, int size){
        this.x = x;
        this.y = y;
        this.size = size;
        xSpeed = 1; //(int)(Math.random()*10);
        ySpeed = 1; //(int)(Math.random()*10);
        c = new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));

    }
    public Ball(int x, int y, int length, int height){
        this.x = x;
        this.y = y;
        this.height = height;
        this.length = length;

        xSpeed = 10;
        ySpeed = 10;
        c = Color.WHITE;
    }
public int getLength(){
  return length;
}

public int getHeight(){
  return height;
}

    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
  public void setXSpeed(int xSpeed){
    this.xSpeed = xSpeed;
  }
public int getXSpeed(){
  return xSpeed;
}
    public int getX (){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getSize(){
        return size;
    }

    public void drawBall(Graphics corey){
        corey.setColor(c);
        corey.fillOval(x,y,size,size);

    }
    public void drawOval(Graphics maddie){
        maddie.setColor(c);
        maddie.fillOval(x,y,length,height);
    }

    public void moveBall(JPanel bPanel){
        x+=xSpeed;
        if (x>=bPanel.getWidth()-size || x<=0){
            xSpeed*=-1;
        }

        y+=ySpeed;
        if (y>=bPanel.getHeight()-size || y<=0){
            xSpeed = 0;
            ySpeed = 0;
        }

    }

    public void moveRight(){
        x+=xSpeed;
    }
    public void moveLeft(){
        x-=xSpeed;
    }
    public void moveUp(){
        y-=ySpeed;
    }
    public void moveDown(){
        y+=ySpeed;
    }

}
