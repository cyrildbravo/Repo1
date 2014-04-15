import java.util.*;
import java.awt.*;
import javax.swing.*;

public class BMIUI{
	/* Initialize global variables */
	public static BMISolver solver = new BMISolver(this);
	public static JFrame frame = new JFrame("BMI");
	public static JPanel panel = new JPanel();
	public static JButton button = new JButton();
	public static JLabel[] label = new JLabel[4];
	public static JTextArea[] textArea= new JTextArea[5];
	public static Toolkit kit = Toolkit.getDefaultToolkit();
	public static String[] labelHeader = {"Enter your name:", "Enter your age:", "Enter your weight (kg):", "Enter your height (cm):" };
	public static int height, width;
	Font font = new Font("Verdana", Font.BOLD, 12);
	Font font2 = new Font("Comic Sans MS", Font.BOLD, 18);
	
	/* Constructor for BMIUI */
	public BMIUI(){
		height = kit.getScreenSize().height;
		width = kit.getScreenSize().width;
		setComponents();
		setFrame();
	}
	
	/* setComponents: sets buttons, labels, textarea into JLabel */
	public void setComponents(){
		panel.setLayout(null);
		
		for(int i=0, j=50; i<4; i++, j+=50){
			label[i] = new JLabel(labelHeader[i]);
			label[i].setFont(font);
			label[i].setBounds(50,j,120,50);
			panel.add(label[i]);
			
			textArea[i] = new JTextArea();
			textArea[i].setFont(font2);
			textArea[i].setBounds(170,j+10,150,30);
			panel.add(textArea[i]);
		}

		button = new JButton("Compute BMI");
		button.setFont(font);
		button.setBounds(130,260,120,30);
		panel.add(button);
	}
	
	public void setFrame(){
		frame.add(panel);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(new Dimension(700,400));
		frame.setResizable(false);
		frame.setLocation(width/3, height/5);
	}
	
	public JButton getButton(){
		return button;
	}
	
	public String getText(int i){
		return textArea[i].getText();
	}
	
	public void setText(int i, String text){
		textArea[i].setText(text);
	}
	
	public void printResults(String text){
		textArea[4].setText(text);
	}
}