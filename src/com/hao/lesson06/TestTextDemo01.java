package com.hao.lesson06;

import java.awt.BorderLayout;
import java.awt.Container;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class TestTextDemo01 extends JFrame{
	
	public TestTextDemo01() {
		
		Container container = this.getContentPane();
		
		JTextField textField1 = new JTextField("hello");
		JTextField textField2 = new JTextField("world",20);
		
		container.add(textField1,BorderLayout.NORTH);
		container.add(textField2,BorderLayout.SOUTH);
		
		this.setVisible(true);
		this.setSize(500,350);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestTextDemo01();
	}

}
