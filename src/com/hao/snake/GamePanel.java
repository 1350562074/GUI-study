package com.hao.snake;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.naming.InitialContext;
import javax.swing.JPanel;
import javax.swing.Timer;

//��Ϸ�����
public class GamePanel extends JPanel implements KeyListener,ActionListener{
	
	//�����ߵ����ݽṹ
	int length; //�ߵĳ���
	int[] snakeX = new int[600];//�ߵ�x����
	int[] snakeY = new int[500];//�ߵ�y����
	String fx;//��ʼ��������
	
	//ʳ�������
	int foodx;
	int foody;
	Random random = new Random();
	
	
	//��Ϸ��ǰ��״̬����ʼ��ֹͣ
	boolean isStart = false;
	boolean isFail = false; //��Ϸʧ��״̬
	
	int score;
	
	//��ʱ��,�Ժ���Ϊ��λ
	Timer timer = new Timer(100,this); //100����ִ��һ��
	
	public GamePanel() {
		init();
		//��ý���ͼ����¼�
		this.setFocusable(true);
		this.addKeyListener(this);
		timer.start();
	}
	
	public void init() {
		length = 3;
		snakeX[0] = 100;snakeY[0] = 100;
		snakeX[1] = 75;snakeY[1] = 100;
		snakeX[2] = 50;snakeY[2] = 100;
		fx = "R";
		
		foodx = 25 + 25*random.nextInt(34);
		foody = 75 + 25*random.nextInt(24);
		
		score = 0;
	}
	
	
	//�������,��Ϸ�е����ж�������ʹ����ֻ����
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g); //����
		//���ƾ�̬�����
		this.setBackground(Color.white);
		Data.header.paintIcon(this, g, 25, 11); //ͷ�������
		g.fillRect(25, 75, 850,600); //Ĭ�ϵ���Ϸ����	
		
		
		//������
		g.setColor(Color.white);
		g.setFont(new Font("΢���ź�",Font.BOLD,18)); 
		g.drawString("����:"+length,750,30);
		g.drawString("����:"+score,750,50);
		
		//��ʳ��
		Data.food.paintIcon(this, g, foodx, foody);
		
		//��С�߻���ȥ����ͷ���ݷ������ж�
		if(fx.equals("R")) {
			Data.right.paintIcon(this, g, snakeX[0], snakeY[0]);//��ͷ��ʼ������
		}else if(fx.equals("L")) {
			Data.left.paintIcon(this, g, snakeX[0], snakeY[0]);
		}else if(fx.equals("U")) {
			Data.up.paintIcon(this, g, snakeX[0], snakeY[0]);
		}else if(fx.equals("D")) {
			Data.down.paintIcon(this, g, snakeX[0], snakeY[0]);
		}
				
		
		for(int i=1;i<length;i++) {
			Data.body.paintIcon(this, g, snakeX[i], snakeY[i]);//������
		}
		
		
		
		//��Ϸ״̬
		if(isStart==false) {
			g.setColor(Color.white);
			g.setFont(new Font("΢���ź�",Font.BOLD,40)); 
			g.drawString("���¿ո�ʼ��Ϸ",300,300);
		}
//		Data.body.paintIcon(this, g, snakeX[1], snakeY[1]);//������
//		Data.body.paintIcon(this, g, snakeX[2], snakeY[2]);
		
		if(isFail) {
			g.setColor(Color.red);
			g.setFont(new Font("΢���ź�",Font.BOLD,40));
			g.drawString("ʧ�ܣ����¿ո����¿�ʼ��Ϸ",300,300);
		}
		
		
	}
	
	
	//���̼����¼�
	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		
		
		
		if(keyCode == KeyEvent.VK_SPACE) {
			if(isFail) {
				isFail = false;
				init(); 
			}else {
				isStart = !isStart; //ȡ��
			}
			
			repaint();
		}
		//С���ƶ�
		if(keyCode == KeyEvent.VK_UP) {
			fx = "U";
		}else if(keyCode == KeyEvent.VK_DOWN) {
			fx = "D";
		}else if(keyCode == KeyEvent.VK_LEFT) {
			fx = "L";
		}else if(keyCode == KeyEvent.VK_RIGHT) {
			fx = "R";
		}
	}
		
	//�¼�����
	@Override
	public void actionPerformed(ActionEvent e) {
		if(isStart && !isFail) {
			
			//��ʳ��
			if(snakeX[0] == foodx && snakeY[0] == foody) {
				length++;
				score = score +10; 
				//�ٴ�����ʳ��
				foodx = 25 + 25*random.nextInt(34);
				foody = 75 + 25*random.nextInt(24);
			}
			
			//�ƶ�
			for(int i=length-1;i>0;i--) {
				snakeX[i]=snakeX[i-1];
				snakeY[i]=snakeY[i-1];
			}
			
			//����
			if(fx.equals("R")) {
				snakeX[0] = snakeX[0]+25;
				if(snakeX[0]>850) {
					snakeX[0]=25;
				}
			}else if(fx.equals("L")) {
				snakeX[0] = snakeX[0]-25;
				if(snakeX[0]<25) {
					snakeX[0]=850;
				}
			}else if(fx.equals("U")) {
				snakeY[0] = snakeY[0]-25;
				if(snakeX[0]<75) {
					snakeX[0]=650;
				}
			}else if(fx.equals("D")) {
				snakeY[0] = snakeY[0]+25;
				if(snakeX[0]>650) {
					snakeX[0]=75;
				}
			}
			
			//ʧ���жϣ�ײ���Լ�����ʧ��
			for(int i=1;i<length;i++) {
				if(snakeX[0]==snakeX[i] && snakeY[0]==snakeY[i]) {
					isFail = true;
				}
			}
			
			
			repaint();
		}
		timer.restart();
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
	}
	
	
}


