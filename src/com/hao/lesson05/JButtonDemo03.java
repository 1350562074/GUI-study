package com.hao.lesson05;

import java.awt.BorderLayout;
import java.awt.Container;

import java.net.URL;

import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.WindowConstants;

public class JButtonDemo03 extends JFrame{

	public JButtonDemo03() {
		Container container = this.getContentPane();
		//将一个图片变为图标
		URL resource = JButtonDemo02.class.getResource("tx.jpg");
		Icon icon = new ImageIcon(resource);
		
		//多选框
		JCheckBox checkBox01 = new JCheckBox();
		JCheckBox checkBox02 = new JCheckBox();
		
		
		//add
		container.add(checkBox01,BorderLayout.SOUTH);
		container.add(checkBox02,BorderLayout.NORTH);
			
		this.setVisible(true);
		this.setSize(500,300);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		 
		
	}
	
	public static void main(String[] args) {
		new JButtonDemo03();
	}

}
