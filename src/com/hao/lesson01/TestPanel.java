package com.hao.lesson01;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//Panel���Կ�����һ���ռ䣬���ǲ��ܵ�������
public class TestPanel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame frame = new Frame();
		Panel panel =new Panel();
		
		
		//���ò���
		frame.setLayout(null);
		frame.setBounds(300,300,500,500);
		frame.setBackground(new Color(40,161,35));
		
		panel.setBounds(50,50,400,400);
		panel.setBackground(new Color(193,15,60));
		
		frame.add(panel);
		frame.setVisible(true);
		
		//�������ڹر��¼�
		//������ģʽ
		frame.addWindowListener(new WindowAdapter() {
			//���ڵ���ر�ʱ��Ҫ��������
			@Override
			public void windowClosing(WindowEvent e) {
				//��������
				System.exit(0);
			}
		});
	}

}
