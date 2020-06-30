package com.hao.lesson02;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestActionTwo {
	public static void main(String[] args) {
		Frame frame = new Frame("��ʼ-ֹͣ");
		Button button1 = new Button("start");
		Button button2 = new Button("stop");
		
		//�������ʾ���壬�����Ĭ��ֵ��Ĭ��ֵ�����������ж����
		//���Զ����ť��лһ��������
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
		//e.getActionCommand()��ȡ��ť�ϵĲ���
		System.out.println("��ť������ˣ�msg=>"+e.getActionCommand());
	}
}
