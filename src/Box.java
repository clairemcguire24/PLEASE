import java.awt.*;

public class Box {
    private int x;
    private int y;
    private int width;
    private int height;
    private Color c;

    public Box(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        c = new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));

    }

    public void drawBox(Graphics olivia){
        olivia.setColor(c);
        olivia.fillRect(x,y,width,height);
    }


}
