package chap09_example_gridLayout;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Grid extends JFrame{
	public Grid() {
		setTitle("Grid Layout Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		GridLayout grid = new GridLayout(4,2);
		grid.setVgap(5);
		c.setLayout(grid);
		
		c.add(new JLabel("이름"));
		c.add(new TextField(""));
		c.add(new JLabel("학번"));
		c.add(new TextField(""));
		c.add(new JLabel("학과"));
		c.add(new TextField(""));
		c.add(new JLabel("과목"));
		c.add(new TextField(""));
		
		setSize(300,200);
		setVisible(true);
		
	}
}
