package com.hao.lesson01;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

//表格布局
public class TestGridLayout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame frame = new Frame("TestGridLayout");
		
		Button bnt1 =  new Button("bnt1");
		Button bnt2 =  new Button("bnt2");
		Button bnt3 =  new Button("bnt3");
		Button bnt4 =  new Button("bnt4");
		Button bnt5 =  new Button("bnt5");
		Button bnt6 =  new Button("bnt6");
		
		frame.setLayout(new GridLayout(3,2));
		frame.add(bnt1);
		frame.add(bnt2);
		frame.add(bnt3);
		frame.add(bnt4);
		frame.add(bnt5);
		frame.add(bnt6);
		
		frame.pack();//java函数
		frame.setVisible(true);
	}

}
