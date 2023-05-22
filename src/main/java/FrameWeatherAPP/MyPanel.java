package FrameWeatherAPP;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class MyPanel extends JPanel{
	
	public MyPanel(Integer PositionX, Integer PositionY, Integer DimensionX, Integer DimensionY){
		this.setBounds(PositionX,PositionY,DimensionX,DimensionY);
	}
	
	public void setBorder(boolean border) {
		if(border) {
			this.setBorder(BorderFactory.createLineBorder(Color.black, 2)); // Add a black line border with thickness 2		
		}
	}
	
	
}
