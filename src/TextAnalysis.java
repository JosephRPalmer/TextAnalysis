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
	
	
	public void init (){
		
		setSize(1500, 800);
		
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
		int jx[] = {1350,1400,1400,1385,1385,1350,1350,1370,1370,1350};
		int jp[] = {710,710,720,720,770,770,760,760,720,720};
		g.fillPolygon(jx, jp, jx.length);
		int rx[] = {730,730,740,740,770,770};
		int ry[] = {1405,1435,1435,1415,1415,1405};
		g.fillPolygon(ry, rx, ry.length);
		int px[] = {1445,1440,1440,1470,1470,1445,1445,1447,1447,1455,1455,1445};
		int py[] = {770,770,710,710,740,740,720,720,735,735,720,720};
		g.fillPolygon(px, py, px.length);
		if (thereistext){
			input = tf.getText();
			input = input.replace(".", " ").replace("?", " ").replace("!", " ").replace("," , " ");
			String [] parts = input.split(" ");
			int templen = 0;
			
			for (int i = 0; i <= parts.length-1; i++){
				
				if (templen < parts[i].length()){
					
					templen = parts[i].length();
				}
				
			}
			
			//System.out.println(templen);
			
			int len[] = new int[templen+1];
			int mean =0;
			int actual;
			int sumformean =0;
			for (int i1 = 0; i1 <= parts.length-1;i1++){
					len[parts[i1].length()]++;
			}
			int printblank = 100;
			for (int i3 =0; i3 <= len.length-1; i3++){
				if (len[i3] > 0){
					sumformean = sumformean + (len[i3] * i3);
					mean = mean + len[i3];
				}
			}
			actual = sumformean / mean;
			
			g.drawString("The mean word length is " + actual,100, 50);
			for (int i2 = 0; i2 != len.length;i2++){
				
				if (len[i2] != 0){
					g.drawString(len[i2] + " words of length " + i2 , 100,printblank );
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
			repaint();
		}
		
	}
		

}
