package com.hao.lesson02;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestActionTwo {
	public static void main(String[] args) {
		Frame frame = new Frame("开始-停止");
		Button button1 = new Button("start");
		Button button2 = new Button("stop");
		
		//如果不显示定义，则会走默认值！默认值就是上面两行定义的
		//可以多个按钮致谢一个监听类
		button2.setActionCommand("button2-stop");
		MyMonitor myMonitor = new MyMonitor();
		
		button1.addActionListener(myMonitor);
		button2.addActionListener(myMonitor);
		
		frame.add(button1,BorderLayout.NORTH);
		frame.add(button2,BorderLayout.SOUTH);
	}
}

class MyMonitor implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		//e.getActionCommand()获取按钮上的操作
		System.out.println("按钮被点击了：msg=>"+e.getActionCommand());
	}
}
