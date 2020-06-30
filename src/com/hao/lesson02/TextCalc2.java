package com.hao.lesson02;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//简易计算器
public class TextCalc2 {
	public static void main(String[] args) {
		new Calculator2();
	}
}

//计算器类
class Calculator2 extends Frame{
	
	TextField num1,num2,num3;
	
	public void loadFrame() {
		//3个文本框
		num1 = new TextField(10);//字符数
		num2 = new TextField(10);//字符数
		num3 = new TextField(20);//字符数
		
		Button button = new Button("=");
		button.addActionListener(new MyCalculatorListener2(this));
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

class MyCalculatorListener2 implements ActionListener{
	//获取计算器这个对象
	Calculator2 calculator = null;
	public MyCalculatorListener2(Calculator2 calculator) {
		this.calculator = calculator;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//获得加数和被加数,string类型
		//进行加法运算，放到第三个框
		//清除前两个框
		int n1 = Integer.parseInt(calculator.num1.getText());
		int n2 = Integer.parseInt(calculator.num2.getText());
		
		calculator.num3.setText(""+(n1+n2));
		calculator.num1.setText("");
		calculator.num2.setText("");
		
	}
}