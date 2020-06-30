package com.hao.lesson01;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

//流式布局
public class TestFlowLayout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame frame = new Frame();
		Button button1 = new Button("button1");
		Button button2 = new Button("button2");
		Button button3 = new Button("button3");
		
//		frame.setLayout(new FlowLayout());
		frame.setLayout(new FlowLayout(FlowLayout.LEFT));
		frame.setSize(200,200);
		
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		
		frame.setVisible(true);
	}

}
