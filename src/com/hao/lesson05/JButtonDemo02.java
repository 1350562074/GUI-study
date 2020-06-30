package com.hao.lesson05;

import java.awt.BorderLayout;
import java.awt.Container;

import java.net.URL;

import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.WindowConstants;

public class JButtonDemo02 extends JFrame{

	public JButtonDemo02() {
		Container container = this.getContentPane();
		//将一个图片变为图标
		URL resource = JButtonDemo02.class.getResource("tx.jpg");
		Icon icon = new ImageIcon(resource);
		
		//单选框
		JRadioButton radioButton1 = new JRadioButton("JRadioButton01");
		JRadioButton radioButton2 = new JRadioButton("JRadioButton02");
		JRadioButton radioButton3 = new JRadioButton("JRadioButton03");
		
		//由于单选框只能选择一个，分组，一个组中只能选择一个
		ButtonGroup group = new ButtonGroup();
		group.add(radioButton1);
		group.add(radioButton2);
		group.add(radioButton3);
		
		//add
		container.add(radioButton1,BorderLayout.CENTER);
		container.add(radioButton2,BorderLayout.NORTH);
		container.add(radioButton3,BorderLayout.SOUTH);
			
		this.setVisible(true);
		this.setSize(500,300);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		 
		
	}
	
	public static void main(String[] args) {
		new JButtonDemo02();
	}

}
