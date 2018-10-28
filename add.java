import java.awt.*;
import java.awt.event.*;

public class add extends java.applet.Applet implements ActionListener {
	TextField txtTotal1 = new TextField("");
	TextField txtTotal2 = new TextField("");
	TextField txtTotal3 = new TextField("");
    	Button button = new Button("Add");
	
	int num1,num2,num3;
	int counter;
	String strnum = "",strnumtemp = "" ;
	String op = "";
	

				   
	public void init() {

	 
	 	 
	 add(txtTotal1);
	 add(txtTotal2);
	 add(txtTotal3);

	 add(button);

	} 
	
	public void start() {

	button.addActionListener(this);

	}
	
	public void stop() {

		 button.addActionListener(null);
	 }

	
	public void actionPerformed(ActionEvent e) {
		
			   num1 = Integer.parseInt(txtTotal1.getText());
			   num2 = Integer.parseInt(txtTotal2.getText());
			   num3=num1+num2;
			   txtTotal3.setText(""+num3);
	       	}	
}
/*
<APPLET CODE ="add.class" HEIGHT = 500 WIDTH =500> </APPLET>
*/
