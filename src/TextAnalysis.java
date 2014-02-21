import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


@SuppressWarnings({ "serial", "unused" })
public class TextAnalysis extends Applet implements ActionListener {
	
	Button a,b;
	TextField tf;
	String input;
	int [] len;
	
	//line 65
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
			Parting(null);
		}
		if (e.getSource()==b){
			start();
		}
		
	}
	
	public void Parting (Graphics g){
		input = tf.getText();
		String [] parts = input.split(" ");
			
		for (int i1 = 0; i1 != parts.length;i1++){
			
			int templen;
			templen = parts[i1].length();
			len[templen] +=1;
			
		}
		
		for (int i2 = 0; i2 != len.length;i2++){
			
			if (len[i2] != 0){
				g.drawString("There are " + len[i2] + " words that are " + i2 + " long", 100,100 );
			}
			
		}
		
		
	}
	

	

}
