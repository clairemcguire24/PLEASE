import javax.swing.*;

import com.sun.jdi.request.ThreadStartRequest;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.*;
import java.util.*;
import java.awt.MouseInfo.*;

public class Screen extends JPanel {
    private int x = 80;
    // private int xSpeed = 3;
    private int y = 20;
    //private int ySpeed = 3;
    private ArrayList<Box> grid;


    Ball ball = new Ball(x, y, 5);
    Ball oval = new Ball(250,400,100,8);

    public Screen() {

        setBackground(Color.BLACK);

        setFocusable(true);

        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyCode());
                int x = e.getKeyCode();
                if(x==39){
                    oval.moveRight();
                }
                if(x==37){
                    oval.moveLeft();
                }


            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });



    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        ball.drawBall(g);
        ball.moveBall(this);
        oval.drawOval(g);
//check if x of ball is greater than x of oval and less than x of oval+width
      /*if()
      {
        ball.setXSpeed((ball.getXSpeed())*-1);
      }
      */

        //g.fillOval(30,100,150,8);

      if(((ball.getX()>oval.getX())&&(ball.getX()<oval.getX()+oval.getLength()))&&
              ((ball.getY()+ball.getSize()>oval.getY())&&(ball.getY()+ball.getSize()<oval.getY()+oval.getHeight())))
      {
          ball.setYSpeed(ball.getYSpeed() * -1);
          System.out.println("hit");
      }
        try {
            Thread.sleep(10);
        }
        catch(Exception e){
            System.out.println(e);
        }

        repaint();

    }

}
