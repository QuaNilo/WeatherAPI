package FrameWeatherAPP;

import javax.swing.JLabel;

public class WeatherLabels {
	String weatherText;
	String temperature;
	String time;
	String link;
	
	WeatherLabels(String weatherText,String temperature,String time,String link){
		this.weatherText = weatherText;
		this.temperature = temperature;
		this.time = time;
		this.link = link;
	}
	
	private JLabel createJLabel() {
		return new JLabel();
	}
	
	public JLabel getWeatherLabel() {
		JLabel item = createJLabel();
		item.setText(weatherText);
		return item;
	}
	
	public JLabel getTempLabel() {
		JLabel item = createJLabel();
		item.setText(temperature);
		return item;
	}
	
	public JLabel getTimeLabel() {
		JLabel item = createJLabel();
		item.setText(time);
		return item;
	}
	
	public JLabel getLinkLabel() {
		JLabel item = createJLabel();
		item.setText(link);
		return item;
	}

}
