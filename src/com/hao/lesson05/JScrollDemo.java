package com.hao.lesson05;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class JScrollDemo extends JFrame{
	 public JScrollDemo() {
		 Container container = this.getContentPane();
		 //ÎÄ±¾Óò
		 JTextArea textArea = new JTextArea(20,50);
		 textArea.setText("»¶Ó­Ñ§Ï°java");
		 
		 JScrollPane scrollPane = new JScrollPane(textArea);
		 container.add(scrollPane);
		 
		 this.setVisible(true);
		 this.setBounds(100,100,300,350);
		 this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	 }
	 
	 public static void main(String[] args) {
		 new JScrollDemo();
	 }
}
