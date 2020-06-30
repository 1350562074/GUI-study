package com.hao.lesson05;

import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class JPanelDemo extends JFrame{

	public JPanelDemo() {
		Container container = this.getContentPane();
		container.setLayout(new GridLayout(2,1,10,10));
		JPanel panel1 = new JPanel(new GridLayout(1,3));
		JPanel panel2 = new JPanel(new GridLayout(1,2));
		JPanel panel3 = new JPanel(new GridLayout(3,2));
		
		panel1.add(new JButton("1"));
		panel1.add(new JButton("1"));
		panel1.add(new JButton("1"));
		panel2.add(new JButton("2"));
		panel2.add(new JButton("2"));
		panel3.add(new JButton("3"));
//		panel3.add(new JButton("3"));
		panel3.add(new JButton("3"));
		panel3.add(new JButton("3"));
//		panel3.add(new JButton("3"));
		panel3.add(new JButton("3"));
		
		container.add(panel1); 
		container.add(panel2);
		container.add(panel3);
		
		this.setVisible(true);
		this.setSize(500,500);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new JPanelDemo();
	}

}
