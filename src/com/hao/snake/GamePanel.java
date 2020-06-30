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

//游戏的面板
public class GamePanel extends JPanel implements KeyListener,ActionListener{
	
	//定义蛇的数据结构
	int length; //蛇的长度
	int[] snakeX = new int[600];//蛇的x坐标
	int[] snakeY = new int[500];//蛇的y坐标
	String fx;//初始方向向右
	
	//食物的坐标
	int foodx;
	int foody;
	Random random = new Random();
	
	
	//游戏当前的状态：开始，停止
	boolean isStart = false;
	boolean isFail = false; //游戏失败状态
	
	int score;
	
	//定时器,以毫秒为单位
	Timer timer = new Timer(100,this); //100毫秒执行一次
	
	public GamePanel() {
		init();
		//获得焦点和键盘事件
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
	
	
	//绘制面板,游戏中的所有东西，都使用这只画笔
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g); //清屏
		//绘制静态的面板
		this.setBackground(Color.white);
		Data.header.paintIcon(this, g, 25, 11); //头部广告栏
		g.fillRect(25, 75, 850,600); //默认的游戏界面	
		
		
		//画积分
		g.setColor(Color.white);
		g.setFont(new Font("微软雅黑",Font.BOLD,18)); 
		g.drawString("长度:"+length,750,30);
		g.drawString("长度:"+score,750,50);
		
		//画食物
		Data.food.paintIcon(this, g, foodx, foody);
		
		//把小蛇画上去，蛇头根据方向来判断
		if(fx.equals("R")) {
			Data.right.paintIcon(this, g, snakeX[0], snakeY[0]);//蛇头初始化向右
		}else if(fx.equals("L")) {
			Data.left.paintIcon(this, g, snakeX[0], snakeY[0]);
		}else if(fx.equals("U")) {
			Data.up.paintIcon(this, g, snakeX[0], snakeY[0]);
		}else if(fx.equals("D")) {
			Data.down.paintIcon(this, g, snakeX[0], snakeY[0]);
		}
				
		
		for(int i=1;i<length;i++) {
			Data.body.paintIcon(this, g, snakeX[i], snakeY[i]);//蛇身体
		}
		
		
		
		//游戏状态
		if(isStart==false) {
			g.setColor(Color.white);
			g.setFont(new Font("微软雅黑",Font.BOLD,40)); 
			g.drawString("按下空格开始游戏",300,300);
		}
//		Data.body.paintIcon(this, g, snakeX[1], snakeY[1]);//蛇身体
//		Data.body.paintIcon(this, g, snakeX[2], snakeY[2]);
		
		if(isFail) {
			g.setColor(Color.red);
			g.setFont(new Font("微软雅黑",Font.BOLD,40));
			g.drawString("失败，按下空格重新开始游戏",300,300);
		}
		
		
	}
	
	
	//键盘监听事件
	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		
		
		
		if(keyCode == KeyEvent.VK_SPACE) {
			if(isFail) {
				isFail = false;
				init(); 
			}else {
				isStart = !isStart; //取反
			}
			
			repaint();
		}
		//小蛇移动
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
		
	//事件监听
	@Override
	public void actionPerformed(ActionEvent e) {
		if(isStart && !isFail) {
			
			//吃食物
			if(snakeX[0] == foodx && snakeY[0] == foody) {
				length++;
				score = score +10; 
				//再次生成食物
				foodx = 25 + 25*random.nextInt(34);
				foody = 75 + 25*random.nextInt(24);
			}
			
			//移动
			for(int i=length-1;i>0;i--) {
				snakeX[i]=snakeX[i-1];
				snakeY[i]=snakeY[i-1];
			}
			
			//走向
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
			
			//失败判断，撞到自己就算失败
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


