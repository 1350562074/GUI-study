package com.hao.lesson06;

import java.awt.Container;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class TestComboboxDemo01 extends JFrame{
	
	public TestComboboxDemo01() {
		
		Container container = this.getContentPane();
		
		JComboBox status = new JComboBox();
		status.addItem(null);
		status.addItem("������ӳ");
		status.addItem("���¼�");
		status.addItem("������ӳ");
		
		
		
		container.add(status);
		this.setVisible(true);
		this.setSize(500,350);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestComboboxDemo01();
	}

}
