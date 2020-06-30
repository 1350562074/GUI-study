package com.hao.lesson06;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class TestTextDemo03 extends JFrame{
	
	public TestTextDemo03() {
		
		Container container = this.getContentPane();
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setEchoChar('*');
		
		container.add(passwordField);
		
		this.setVisible(true);
		this.setSize(500,350);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestTextDemo03();
	}

}