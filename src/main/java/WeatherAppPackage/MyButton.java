package WeatherAppPackage;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;

public class MyButton extends JButton{
	
	static MyButton[] buttons = {
			new MyButton("Entroncamento"),
	        new MyButton("Lisboa"),
	        new MyButton("Tomar"),
	        new MyButton("Algarve"),
	        new MyButton("Toronto"),
	        new MyButton("Rio De Janeiro"),
	        new MyButton("Almada"),
	        new MyButton("Kyoto"),
	        new MyButton("QUIT")
	};
	
	public static MyButton[] getButtonList() {
		return buttons;
	}

	MyButton(String location){
        this.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        this.setText(location);
	}
}
