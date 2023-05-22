package FrameWeatherAPP;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class MenuLabel extends JLabel{
	
	public MenuLabel(String name){	
		this.setText(name);
		this.setFont(new Font("Arial", Font.BOLD, 16));
		this.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		this.setHorizontalAlignment(SwingConstants.CENTER);
		this.setVerticalAlignment(SwingConstants.CENTER);
		this.setPreferredSize(new Dimension(300, 100));
	}
	
	public MenuLabel(){
			this.setFont(new Font("Arial", Font.BOLD, 16));
			this.setAlignmentX(JLabel.CENTER_ALIGNMENT);
			this.setHorizontalAlignment(SwingConstants.CENTER);
			this.setVerticalAlignment(SwingConstants.CENTER);
			this.setPreferredSize(new Dimension(300, 100));
	}
}
