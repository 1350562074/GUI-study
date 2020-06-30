package com.hao.lesson01;

import java.awt.Color;
import java.awt.Frame;

public class TestFrame2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame myFrame0 = new MyFrame(100, 100, 200, 200, Color.blue);
		MyFrame myFrame1 = new MyFrame(300, 100, 200, 200, Color.yellow);
		MyFrame myFrame2 = new MyFrame(100, 300, 200, 200, Color.red);
		MyFrame myFrame3 = new MyFrame(300, 300, 200, 200, Color.MAGENTA);
	}

}
class MyFrame extends Frame{
	static int id = 0;
	
	public MyFrame(int x,int y,int w,int h, Color color) {
		super("Myframe"+(++id));
		setBackground(color);
		setBounds(x,y,w,h);
		setVisible(true);
	}
}
