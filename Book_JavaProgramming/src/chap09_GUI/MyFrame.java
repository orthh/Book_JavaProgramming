package chap09_GUI;


import java.awt.Container;


import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	
	public MyFrame() {
		setTitle("첫번째 프레임");
		setSize(300,300);
		setVisible(true);
		// JFrame 객체가 생길때 컨테트팬은 자동으로 생성된다.
		// 현재 프레임에 붙어 있는 컨텐트팬을 알아내기 위해서
		Container contentPane = getContentPane();
		System.out.println(contentPane);
		JButton button = new JButton("Click");
		contentPane.add(button);
		contentPane.add(new MyPanel());

	}
	


}
