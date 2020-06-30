package com.hao.lesson03;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.event.MenuDragMouseListener;

//�������¼�
public class TextMouseListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame myFrame = new MyFrame("��ͼ");
	}

}


class MyFrame extends Frame{
	//������Ҫ���ʣ���Ҫ������굱ǰ��λ�ã���Ҫ�������洢�����
	
	ArrayList points;
	
	public MyFrame(String title) {
		super(title);
		setBounds(200,200,400,300);
		
		points = new ArrayList<>();
		setVisible(true);
		this.addMouseListener(new MyMouseListener());
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		Iterator iterator = points.iterator();
		while(iterator.hasNext()) {
			Point point = (Point)iterator.next();
			g.setColor(Color.BLUE);
			g.fillOval(point.x, point.y, 10, 10);
		}
	}
	
	public void addPaint(Point point) {
		points.add(point);
	}
	
	private class MyMouseListener extends MouseAdapter{
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			MyFrame frame = (MyFrame)e.getSource(); 
			frame.addPaint(new Point(e.getX(),e.getY()));
			
			frame.repaint();
		}
		
	}
}