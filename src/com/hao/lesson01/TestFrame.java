package com.hao.lesson01;

import java.awt.Color;
import java.awt.Frame;

public class TestFrame {
	public static void main(String[] args) {
		Frame frame = new Frame("�ҵĵ�һ��Javaͼ����洰��");
		frame.setVisible(true);
		frame.setSize(400,400);
		frame.setBackground(new Color(85,158,68));
		frame.setLocation(200,200);	
		frame.setResizable(false);
	}
}
