package WeatherAppPackage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JLabel;

public class Menu {

    public static  void menu(final CurrentWeather currentWeather) throws IOException {
        //CREATED PANELS
    	MyPanel topPanel = new MyPanel(0,0,600,50);
        topPanel.setBorder(true);
        for(final MyButton button: MyButton.getButtonList()) {
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
					// Update location_ID based on the clicked button
                    if (button.getText().equals("Entroncamento")) {
                         System.out.println("entroncamento");
                    } else if (button.getText().equals("Lisboa")) {
                    	System.out.println("entroncamento");
                    } else if (button.getText().equals("Kyoto")) {
                    	System.out.println("entroncamento");
                    } else if (button.getText().equals("Tomar")) {
                    	System.out.println("entroncamento");
                    } else if (button.getText().equals("Algarve")) {
                    	System.out.println("entroncamento");
                    } else if (button.getText().equals("Toronto")) {
                    	System.out.println("entroncamento");
                    } else if (button.getText().equals("Rio De Janeiro")) {
                    	System.out.println("entroncamento");
                    } else if (button.getText().equals("Almada")) {
                    	System.out.println("entroncamento");
                    }
                    else {
                    	System.out.println("Someone fucked up");
                    }
                }
            });
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
        
        MyPanel resultPanel = null;
        if (currentWeather != null) {
            Double num = currentWeather.getTemperature().getMetric().getValue();
            String strTemp = num.toString();

            resultPanel = new MyPanel(300, 50, 300, 450);
            resultPanel.setBorder(true);
            MenuLabel[] resultlabels = {
                    new MenuLabel(strTemp),
                    new MenuLabel(currentWeather.getWeatherText()),
                    new MenuLabel(currentWeather.getLink()),
                    new MenuLabel(currentWeather.getLocalObservationDateTime()),
            };
            for (MenuLabel label : resultlabels) {
                resultPanel.add(label);
            }
        }else {
        	System.out.println("Failed to print API variables");
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
