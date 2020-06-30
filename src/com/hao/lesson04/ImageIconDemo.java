package com.hao.lesson04;

import java.net.URLEncoder;

import javax.sound.sampled.LineUnavailableException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import java.awt.Container;
import java.net.URL;

public class ImageIconDemo extends JFrame {
	
	public ImageIconDemo(){
		JLabel label = new JLabel("ImageIcon");
		URL url = ImageIconDemo.class.getResource("tx.jpg");
		
		ImageIcon imageIcon = new ImageIcon(url);
		label.setIcon(imageIcon);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		
		Container container = getContentPane();
		container.add(label);
		
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(100,100,200,200);
		
	}
	
	public static void main(String[] args) {
		new ImageIconDemo();
	}
}
