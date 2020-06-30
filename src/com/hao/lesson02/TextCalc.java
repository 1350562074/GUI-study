package com.hao.lesson02;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//���׼�����
public class TextCalc {
	public static void main(String[] args) {
		new Calculator();
	}
}

//��������
class Calculator extends Frame{
	public Calculator() {
		//3���ı���
		TextField num1 = new TextField(10);//�ַ���
		TextField num2 = new TextField(10);//�ַ���
		TextField num3 = new TextField(20);//�ַ���
		
		//1����ť
		Button button = new Button("=");
		MyCalculatorListener myCalculatorListener = new MyCalculatorListener(num1,num2,num3);
		button.addActionListener(myCalculatorListener);
		
		//1����ǩ
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
}

class MyCalculatorListener implements ActionListener{
	//��ȡ��������
	private TextField num1, num2,num3;
	public MyCalculatorListener(TextField num1,TextField num2,TextField num3) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//��ü����ͱ�����,string����
		int n1 = Integer.parseInt(num1.getText());
		int n2 = Integer.parseInt(num2.getText());
		//���мӷ����㣬�ŵ���������
		num3.setText(""+(n1+n2));
		//���ǰ������
		num1.setText("");
		num2.setText("");
	}
}