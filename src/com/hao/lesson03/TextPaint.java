package com.hao.lesson03;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class TextPaint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyPaint().loadFrame();
	}

}

class MyPaint extends Frame{
	
	public void loadFrame() {
		setBounds(200,200,600,400);
		setVisible(true);
		
	}
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.red);
//		g.drawOval(100,100,100,100);
		g.fillOval(100,100,100,100);//实心
		
		//养成习惯，画笔用完，将它还原到最初的颜色
		
		
	}
}