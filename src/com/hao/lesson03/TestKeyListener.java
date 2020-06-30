package com.hao.lesson03;

import java.awt.Frame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TestKeyListener {
	public static void main(String[] args) {
		new KeyFrame();
	}
}

class KeyFrame extends Frame{
	public KeyFrame() {
		setBounds(1,2,300,400);
		setVisible(true);
		
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				System.out.println(keyCode);
				if(keyCode == KeyEvent.VK_UP) {
					System.out.println("你按下了上建");
				}
				
			}
		});
	}
}
