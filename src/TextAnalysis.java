import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class TextAnalysis extends Applet implements ActionListener {
	
	Button a,b;
	TextField tf;
	String input;
	int [] len;
	
	
	public void init (){
		
		setSize(500, 500);
		
		tf = new TextField(35);
		add(tf);
		tf.addActionListener(this);
		
		a = new Button("Analyze");
		add(a);
		a.addActionListener(this);
		
		b = new Button("Reset");
		add(b);
		b.addActionListener(this);
		
		
	}
	
	public void start() {
		tf.setText("Enter Text Here...");
		
	}
	
	public void paint (Graphics g){
		
	}
	
	
	
	public void actionPerformed (ActionEvent e){
		
		if (e.getSource()==a){
			//parting();
		}
		if (e.getSource()==b){
			start();
		}
		
	}
	
	public void Parting (){
		input = tf.getText();
		String [] parts = input.split(" ");
			
		for (int i1 = 1; i1 != parts.length;i1++){
			
		}
		
		
	}
	

	

}
