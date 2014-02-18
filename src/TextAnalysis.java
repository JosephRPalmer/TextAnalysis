import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class TextAnalysis extends Applet implements ActionListener {
	
	Button a,b;
	TextField tf;
	
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
	
	public void actionPerformed (ActionEvent e){
		
	}
	

	

}
