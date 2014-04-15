import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class BMISolver implements ActionListener{
	private BMIUI ui;
	private String name;
	private int age;
	private double weight, height, bmi = 0.0;

	public BMISolver(BMIUI ui){
		this.ui = ui;
		ui.getButton().addActionListener(this);
	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource() == ui.getButton()){
			System.out.println("BUTTON");
			try{
				name = ui.getText(0).trim();
				age = Integer.parseInt(ui.getText(1).trim());
				weight = Double.parseDouble(ui.getText(2).trim());
				height = Double.parseDouble(ui.getText(3).trim());
				bmi = weight+height;//weight / (height * height);
				ui.setText("BMI: \n" + bmi);
			}
			catch(Exception ex){
				JOptionPane.showMessageDialog(null, "Invalid input.");
			}
		}
	}

}