import java.awt.*;
import javax.swing.*;

class Main {
    public static void main(String[] args) {

        JFrame myFrame = new JFrame();
        myFrame.setSize(500,500);
        Screen myScreen = new Screen();
      JLabel L = new JLabel("Game over");
      
        myFrame.add(myScreen);
     // myFrame.add(L);
     // L.setVisible(false);
        myFrame.setVisible(true);
      
      

    }
}