package com.hao.lesson01;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

//东西南北中布局
public class TestBorderLayout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame frame = new Frame();
		
		Button east =  new Button("East");
		Button west =  new Button("West");
		Button south =  new Button("South");
		Button north =  new Button("North");
		Button center =  new Button("Center");
		
		frame.add(east,BorderLayout.EAST);
		frame.add(west,BorderLayout.WEST);
		frame.add(south,BorderLayout.SOUTH);
		frame.add(north,BorderLayout.NORTH);
		frame.add(center,BorderLayout.CENTER);
		
		frame.setSize(200,200);
		frame.setVisible(true);
	}

}
