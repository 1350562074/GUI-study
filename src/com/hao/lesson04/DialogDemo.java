package com.hao.lesson04;

import java.awt.Container;
import java.awt.Dialog;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

//������
public class DialogDemo  extends JFrame{
	
	public DialogDemo() {
		this.setVisible(true);
		this.setSize(700,500);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		//JFrame �Ŷ���������
		Container container = this.getContentPane();
		//���Բ���
		container.setLayout(null);
		//��ť
		JButton button = new JButton("�������һ���Ի���");
		button.setBounds(30,30,200,50);
		
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//����
				MyDialogDemo myDialogDemo = new MyDialogDemo();
			}
		});
		//��������ť��ʱ�򣬵���һ������
		container.add(button);
	}
	public static void main(String[] args) {
		new DialogDemo();
	}
}

//�����Ĵ���
class MyDialogDemo extends JDialog{
	public MyDialogDemo() {
		this.setVisible(true);
		this.setBounds(100,100,500,500);
//		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		Container container = this.getContentPane();
		container.setLayout(null);
		container.add(new Label("ѧJAVA"));
	}
}