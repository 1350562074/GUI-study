package com.hao.lesson04;

import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class JFrameDemo {

	public void init() {
		//顶级窗口
		JFrame jf = new JFrame("这是一个JFrame窗口");
		
		jf.setBounds(100,100,200,200);
		jf.setBackground(Color.yellow);
		JLabel label = new JLabel("welcome");
		
		jf.add(label);
		label.setHorizontalAlignment(SwingConstants.CENTER);
//		Container container = jf.getContentPane();
//		container.setBackground(Color.blue);
		jf.setVisible(true);
		
		//关闭事件
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//建立一个窗口
		new JFrameDemo().init();
	}

}
