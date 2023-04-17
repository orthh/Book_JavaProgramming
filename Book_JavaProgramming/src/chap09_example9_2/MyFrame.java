package chap09_example9_2;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	public MyFrame() {
		setTitle("ContentPane과 J프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 윈도우 닫으면 프로그램종료
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.orange);
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new MyButton("OK"));
		contentPane.add(new MyButton("Cancel"));
		contentPane.add(new MyButton("Ignore"));
		
		
		
		setSize(300,150);
		setVisible(true);
		
	}
}
