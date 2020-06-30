package com.hao.lesson02;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//简易计算器
public class TextCalc {
	public static void main(String[] args) {
		new Calculator();
	}
}

//计算器类
class Calculator extends Frame{
	public Calculator() {
		//3个文本框
		TextField num1 = new TextField(10);//字符数
		TextField num2 = new TextField(10);//字符数
		TextField num3 = new TextField(20);//字符数
		
		//1个按钮
		Button button = new Button("=");
		MyCalculatorListener myCalculatorListener = new MyCalculatorListener(num1,num2,num3);
		button.addActionListener(myCalculatorListener);
		
		//1个标签
		Label label = new Label("+");
		
		//布局
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
	//获取三个变量
	private TextField num1, num2,num3;
	public MyCalculatorListener(TextField num1,TextField num2,TextField num3) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//获得加数和被加数,string类型
		int n1 = Integer.parseInt(num1.getText());
		int n2 = Integer.parseInt(num2.getText());
		//进行加法运算，放到第三个框
		num3.setText(""+(n1+n2));
		//清除前两个框
		num1.setText("");
		num2.setText("");
	}
}