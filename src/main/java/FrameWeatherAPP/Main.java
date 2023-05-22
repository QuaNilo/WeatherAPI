package FrameWeatherAPP;

import javax.swing.JLabel;

public class Main {

    public static void main(String[] args) {


        //CREATED PANELS
        MyPanel topPanel = new MyPanel(0,0,600,50);
        topPanel.setBorder(true);
        for(MyButton button: MyButton.getButtonList()) {
        	topPanel.add(button);
        }
        
        MyPanel midPanel = new MyPanel(0,50,300,450);
        midPanel.setBorder(true);
        MenuLabel[] labels = {
        		new MenuLabel("Temperature"),
                new MenuLabel("Location"),
                new MenuLabel("Link"),
                new MenuLabel("Time"),
        };
        for (MenuLabel label : labels) {
            midPanel.add(label);
        }
        
        
        
        
        MyPanel resultPanel = new MyPanel(300,50,300,450);
        resultPanel.setBorder(true);
        MenuLabel[] resultlabels = {
        		new MenuLabel(null),
                new MenuLabel(null),
                new MenuLabel(null),
                new MenuLabel(null),
        };
        for (MenuLabel label : resultlabels) {
        	resultPanel.add(label);
        }
        
        
        
        MyPanel bottomPanel = new MyPanel(0,535,600,30);
        JLabel author = new JLabel("MADE BY JOÃO VELEZ");
        bottomPanel.add(author);
        
 
        
        //FRAME
        MyFrame frame = new MyFrame();
        frame.add(topPanel);
        frame.add(bottomPanel);
        frame.add(resultPanel);
        frame.add(midPanel);
        // Refresh the frame to update the changes
        frame.revalidate();
        frame.repaint();
    }
}
