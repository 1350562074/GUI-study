package com.hao.lesson02;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//���׼�����
public class TextCalc3 {
	public static void main(String[] args) {
		new Calculator3();
	}
}

//��������
class Calculator3 extends Frame{
	TextField num1,num2,num3;
	public void loadFrame() {
		//3���ı���
		num1 = new TextField(10);//�ַ���
		num2 = new TextField(10);//�ַ���
		num3 = new TextField(20);//�ַ���
		
		Button button = new Button("=");
		button.addActionListener(new MyCalculatorListener3());
		Label label = new Label("+");
		
		//����
		setLayout(new FlowLayout());
		add(num1);
		add(label);
		add(num2);
		add(button);
		add(num3);
		pack();
		setVisible(true);
	}
	
	//��������
	//�ڲ������ĺô������ǿ��Գ�ͨ����ķ����ⲿ������Ժͷ�����
	class MyCalculatorListener3 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			//��ü����ͱ�����,string����
			//���мӷ����㣬�ŵ���������
			//���ǰ������
			int n1 = Integer.parseInt(num1.getText());
			int n2 = Integer.parseInt(num2.getText());
			num3.setText(""+(n1+n2));
			num1.setText("");
			num2.setText("");
			
		}
	}
}

