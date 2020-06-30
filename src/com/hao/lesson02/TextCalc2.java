package com.hao.lesson02;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//���׼�����
public class TextCalc2 {
	public static void main(String[] args) {
		new Calculator2();
	}
}

//��������
class Calculator2 extends Frame{
	
	TextField num1,num2,num3;
	
	public void loadFrame() {
		//3���ı���
		num1 = new TextField(10);//�ַ���
		num2 = new TextField(10);//�ַ���
		num3 = new TextField(20);//�ַ���
		
		Button button = new Button("=");
		button.addActionListener(new MyCalculatorListener2(this));
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

class MyCalculatorListener2 implements ActionListener{
	//��ȡ�������������
	Calculator2 calculator = null;
	public MyCalculatorListener2(Calculator2 calculator) {
		this.calculator = calculator;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//��ü����ͱ�����,string����
		//���мӷ����㣬�ŵ���������
		//���ǰ������
		int n1 = Integer.parseInt(calculator.num1.getText());
		int n2 = Integer.parseInt(calculator.num2.getText());
		
		calculator.num3.setText(""+(n1+n2));
		calculator.num1.setText("");
		calculator.num2.setText("");
		
	}
}