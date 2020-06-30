package com.hao.lesson04;

import java.awt.Component;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class IconDemo extends JFrame implements Icon{
	
	private int width;
	private int height;
	
	public IconDemo() {	}
	
	public IconDemo(int width,int height) {
		this.height = height;
		this.width = width;
	}
	
	public void init() {
		//图标可以放在标签上，也可以放在按钮上
		IconDemo iconDemo = new IconDemo(15,15);
		JLabel label = new JLabel("icontest",iconDemo,SwingConstants.CENTER);
		Container container = getContentPane();
		container.add(label);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new IconDemo().init();
	}

	@Override
	public int getIconHeight() {
		return this.height;
	}

	@Override
	public int getIconWidth() {
		return this.width;
	}

	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		g.fillOval(x, y, width, height);
	}
}
