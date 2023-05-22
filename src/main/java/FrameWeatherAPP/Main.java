package FrameWeatherAPP;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

public class Main {

    public static void main(String[] args) {
    	
    	JButton entButton = new JButton();
        ImageIcon entIcon = new ImageIcon("entroncamento.png");
        entButton.setIcon(entIcon);
        MyFrame frame = new MyFrame();
        MyPanel entPanel = new MyPanel(200, 200);
        entPanel.add(entButton);

        // Set the layout of the panel

        // Add the panel to the frame
        //frame.getContentPane().add(entPanel);
        frame.getContentPane().add(entPanel);

        // Refresh the frame to update the changes
        frame.revalidate();
        frame.repaint();
    }
}
