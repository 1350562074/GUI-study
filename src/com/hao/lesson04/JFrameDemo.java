package com.hao.lesson04;

import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class JFrameDemo {

	public void init() {
		//��������
		JFrame jf = new JFrame("����һ��JFrame����");
		
		jf.setBounds(100,100,200,200);
		jf.setBackground(Color.yellow);
		JLabel label = new JLabel("welcome");
		
		jf.add(label);
		label.setHorizontalAlignment(SwingConstants.CENTER);
//		Container container = jf.getContentPane();
//		container.setBackground(Color.blue);
		jf.setVisible(true);
		
		//�ر��¼�
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ������
		new JFrameDemo().init();
	}

}
