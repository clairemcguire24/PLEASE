import java.awt.*;
import javax.swing.*;

class Main {
    public static void main(String[] args) {

        JFrame myFrame = new JFrame();
        myFrame.setSize(500,500);
        Screen myScreen = new Screen();
        myFrame.add(myScreen);
        myFrame.setVisible(true);

    }
}