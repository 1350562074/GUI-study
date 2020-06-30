package com.hao.lesson02;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//简易计算器
public class TextCalc3 {
	public static void main(String[] args) {
		new Calculator3();
	}
}

//计算器类
class Calculator3 extends Frame{
	TextField num1,num2,num3;
	public void loadFrame() {
		//3个文本框
		num1 = new TextField(10);//字符数
		num2 = new TextField(10);//字符数
		num3 = new TextField(20);//字符数
		
		Button button = new Button("=");
		button.addActionListener(new MyCalculatorListener3());
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
	
	//监听器类
	//内部类最大的好处，就是可以畅通无阻的访问外部类的属性和方法！
	class MyCalculatorListener3 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			//获得加数和被加数,string类型
			//进行加法运算，放到第三个框
			//清除前两个框
			int n1 = Integer.parseInt(num1.getText());
			int n2 = Integer.parseInt(num2.getText());
			num3.setText(""+(n1+n2));
			num1.setText("");
			num2.setText("");
			
		}
	}
}

