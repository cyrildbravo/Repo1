import java.util.*;
import java.awt.*;
import javax.swing.*;

public class BMIUI{
	/* Initialize global variables */
	private static JFrame frame = new JFrame("BMI");
	private static JPanel panel = new JPanel();
	private static JButton button = new JButton();
	private static JLabel[] label = new JLabel[4];
	private static JTextArea[] textArea= new JTextArea[5];
	private static Toolkit kit = Toolkit.getDefaultToolkit();
	private static String[] labelHeader = {"Enter your name:", "Enter your age:", "Enter your weight (kg):", "Enter your height (cm):" };
	private static int height, width;
	public BMISolver solver = new BMISolver(this);
	private Font font = new Font("Arial", Font.BOLD, 12);
	private Font font2 = new Font("Comic Sans MS", Font.BOLD, 18);
	
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
			label[i].setBounds(30,j,130,50);
			panel.add(label[i]);
			
			textArea[i] = new JTextArea();
			textArea[i].setFont(font2);
			textArea[i].setBounds(180,j+10,150,30);
			panel.add(textArea[i]);
		}

		button = new JButton("Compute BMI");
		button.setFont(font);
		button.setBounds(130,270,120,30);
		panel.add(button);
		
		textArea[4] = new JTextArea();
		textArea[4].setFont(font2);
		textArea[4].setEnabled(false);
		textArea[4].setBounds(360,50,300,250);
		panel.add(textArea[4]);
	}
	
	/* setFrame: customizes JFrame*/
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