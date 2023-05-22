package FrameWeatherAPP;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

public class Main {

    public static void main(String[] args) {


        //CREATED PANELS
        MyPanel topPanel = new MyPanel(0,0,600,50);
        for(MyButton button: MyButton.getButtonList()) {
        	topPanel.add(button);
        }
 
        MyFrame frame = new MyFrame();
        frame.add(topPanel);
        frame.setLayout(null);
        // Refresh the frame to update the changes
        frame.revalidate();
        frame.repaint();
    }
}
