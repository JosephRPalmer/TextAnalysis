import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


@SuppressWarnings({ "serial", "unused" })
public class TextAnalysis extends Applet implements ActionListener {
	boolean thereistext;
	Button a,b;
	TextField tf;
	String input;
	
	
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
		thereistext = false;
	}
	
	public void paint (Graphics g){
		if (thereistext){
			
			
			input = tf.getText();
			String [] parts = input.split(" ");
			int templen = 0;
			
			for (int i = 0; i <= parts.length-1; i++){
				
				if (templen < parts[i].length()){
					
					templen = parts[i].length();
				}
				
			}
			
			System.out.println(templen);
			
			int len[] = new int[templen+1];
				
			for (int i1 = 0; i1 <= parts.length-1;i1++){
				
				
				
				len[parts[i1].length()]++;
				
			}
			int printblank = 100;
			for (int i2 = 0; i2 != len.length;i2++){
				
				if (len[i2] != 0){
					g.drawString("There are " + len[i2] + " words that are " + i2 + " long", 100,printblank );
					printblank +=20;
				}
				
			}
			
			}
	}
	
	
	
	public void actionPerformed (ActionEvent e){
		
		if (e.getSource()==a){
			thereistext=true;
			repaint();
		}
		if (e.getSource()==b){
			start();
		}
		
	}
	
	

	

}
