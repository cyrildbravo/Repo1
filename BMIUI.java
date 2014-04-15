import java.util.*;
import java.awt.*;
import javax.swing.*;

public class BMIUI{
	private static JFrame frame = new JFrame("BMI");
	private static JPanel panel = new JPanel();
	private static JButton button;
	private static JLabel[] label = new JLabel[4];
	private static JTextArea[] textArea= new JTextArea[5];
	private static Toolkit kit = Toolkit.getDefaultToolkit();
	private static String[] labelHeader = {"Enter your name:", "Enter your age:", "Enter your weight (kg):", "Enter your height (cm):" };
	private static int height, width;
	private static BMISolver solver;
	
	// Constructor for BMIUI
	public BMIUI(){
		height = kit.getScreenSize().height;
		width = kit.getScreenSize().width;
		setComponents();
		setFrame();
		solver = new BMISolver(this);
	}
	
	// Sets buttons, labels, text areas in JFrame
	public void setComponents(){
		panel.setLayout(null);
		
		for(int i=0, j=50; i<4; i++, j+=50){
			label[i] = new JLabel(labelHeader[i]);
			label[i].setBounds(50,j,120,50);
			textArea[i] = new JTextArea();
			textArea[i].setBounds(170,j+15,150,20);
			panel.add(label[i]);
			panel.add(textArea[i]);
		}

		button = new JButton("Compute BMI");
		button.setBounds(130,270,120,30);
		panel.add(button);
		
		textArea[4] = new JTextArea();
		textArea[4].setBounds(340,50,400,150);
		panel.add(textArea[4]);
	}
	
	public void setFrame(){
		frame.add(panel);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(new Dimension(700,400));
		frame.setResizable(false);
		frame.setLocation(width/4, height/5);
	}
	
	public JButton getButton(){
		return button;
	}
	
	public String getText(int i){
		return textArea[i].getText();
	}
	
	public void setText(String text){
		textArea[4].setText(text);
	}
	
}