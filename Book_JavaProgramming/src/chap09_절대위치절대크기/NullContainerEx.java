package chap09_절대위치절대크기;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NullContainerEx extends JFrame{
	
	public NullContainerEx() {
		setTitle("Null Container Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		JLabel jl = new JLabel("Hello, Press Button!");
		jl.setBounds(130, 50, 200, 20);
		c.add(jl);
		
		for(int i=1; i<=9; i++) {
			JButton jb = new JButton(Integer.toString(i));
			jb.setBounds(i*15, i*15, 50, 20);
			c.add(jb);
		}
		
		
		
		setLayout(null);
		setSize(300,200);
		setVisible(true);
	}
	
	
	

	public static void main(String[] args){
		NullContainerEx frame = new NullContainerEx();
	

	}

}
