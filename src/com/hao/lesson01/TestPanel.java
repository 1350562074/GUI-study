package com.hao.lesson01;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//Panel可以看成是一个空间，但是不能单独存在
public class TestPanel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame frame = new Frame();
		Panel panel =new Panel();
		
		
		//设置布局
		frame.setLayout(null);
		frame.setBounds(300,300,500,500);
		frame.setBackground(new Color(40,161,35));
		
		panel.setBounds(50,50,400,400);
		panel.setBackground(new Color(193,15,60));
		
		frame.add(panel);
		frame.setVisible(true);
		
		//监听窗口关闭事件
		//适配器模式
		frame.addWindowListener(new WindowAdapter() {
			//窗口点击关闭时需要做的事情
			@Override
			public void windowClosing(WindowEvent e) {
				//结束程序
				System.exit(0);
			}
		});
	}

}
