package com.hao.lesson03;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.xml.transform.Source;

public class TestWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new WindowFrame();
	}

}

class WindowFrame extends Frame{
	public WindowFrame() {
		setBackground(Color.blue);
		setBounds(100,100,200,200);
		setVisible(true);
//		addWindowListener(new MyWindowListener());
		
		this.addWindowListener(
			//匿名内部类
			new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e) {
					System.out.println("dianji");
				}
				public void windowActivated(WindowEvent e) {
					WindowFrame source = (WindowFrame)e.getSource();
					source.setTitle("被激活了");
					System.out.println("windowActivated");
				}
			}
		);
	}
	
}