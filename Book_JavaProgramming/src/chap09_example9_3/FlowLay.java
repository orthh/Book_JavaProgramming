package chap09_example9_3;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;

public class FlowLay extends JFrame{
	public FlowLay() {
		setTitle("FlowLayoutSample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		
		c.add(new Button("add"));
		c.add(new Button("sub"));
		c.add(new Button("mul"));
		c.add(new Button("div"));
		c.add(new Button("Calculate"));
		
		
		setSize(300,200);
		setVisible(true);
		
	}
}
