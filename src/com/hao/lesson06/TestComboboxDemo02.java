package com.hao.lesson06;

import java.awt.Container;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.WindowConstants;

public class TestComboboxDemo02 extends JFrame{
	
	public TestComboboxDemo02() {
		
		Container container = this.getContentPane();
		
		//生成列表内容
//		String[] contents = {"1","2","3"};
		
		Vector contents = new Vector();
		JList jList = new JList(contents);
		contents.add("zhangsan");
		contents.add("lisi");
		contents.add("wangwu");
		
		container.add(jList);
		
		this.setVisible(true);
		this.setSize(500,350);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestComboboxDemo02();
	}

}
