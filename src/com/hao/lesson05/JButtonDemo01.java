package com.hao.lesson05;

import java.awt.Container;

import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class JButtonDemo01 extends JFrame{

	public JButtonDemo01() {
		Container container = this.getContentPane();
		//将一个图片变为图标
		URL resource = JButtonDemo01.class.getResource("tx.jpg");
		Icon icon = new ImageIcon(resource);
		
		//把这个图标放在按钮上
		JButton button = new JButton();
		button.setIcon(icon);
		button.setToolTipText("图片按钮");
		
		//add
		container.add(button);
		this.setVisible(true);
		this.setSize(500,300);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		 
		
	}
	
	public static void main(String[] args) {
		new JButtonDemo01();
	}

}
