import javax.microedition.lcdui.*;
import javax.microedition.midlet.*;
import java.io.*;

public class AI extends MIDlet
{
	Display display;
	MainCanvas mc;
	public AI(){
		display=Display.getDisplay(this);
		mc=new MainCanvas();
		display.setCurrent(mc);
	}
	public void startApp(){
	}
	public void destroyApp(boolean unc){
	}
	public void pauseApp(){
	}
}
class MainCanvas extends Canvas
{

	/*
	变量的声明
	语法：数据类型 变量名称（标识符）;
	*/
	Image img,imglfet,currentImg,imgup,imgright,img1,img2,img3,img4,img5;
	int x;
	int y;
	int n;
	public MainCanvas(){
		try
		{
			/*
			给变量赋值
			语法：变量名称=value;
			*/
			img=Image.createImage("/sayo00.png");
			imglfet=Image.createImage("/sayo02.png");
			imgup =Image.createImage("/sayo04.png");
            imgright =Image.createImage("/sayo06.png");
			img1=Image.createImage("/sayo02.png");
			img2=Image.createImage("/sayo22.png");
			img3=Image.createImage("/sayo20.png");
			img4=Image.createImage("/sayo24.png");
			img5=Image.createImage("/sayo26.png");
			x=120;
			y=100;
			n=1;
			currentImg=img;
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	public void paint(Graphics g){
		g.setColor(0,0,0);
		g.fillRect(0,0,getWidth(),getHeight());
		
		g.drawImage(currentImg,x,y,0);//120：X坐标、100：Y坐标
	}
	public void keyPressed(int keyCode){
		int action=getGameAction(keyCode);
		/*
		action的值：UP、DOWN、LEFT、RIGHT
		*/
		
		if(action==LEFT){
			/*
			实现转向代码
			*/
			/*
			给变量重新赋值即可
			*/
			if(n==2){
			currentImg=img2;
			System.out.println("向左转");
			x--;
			
			repaint();
			n=1;
			}
			else if(n==1){
			currentImg=imglfet;
			System.out.println("向左转");
			x--;
			
			repaint();
			n=2;
			}


			
		}
		if(action==RIGHT){
		   if(n==1){
           currentImg =imgright;
		   System.out.println("向右转");
		   x++;
		   repaint();
		   n=2;
		   }
		   else if(n==2){
		   currentImg =img5;
		   System.out.println("向右转");
		   x++;
		   repaint();
		   n=1;
		   }
		
		}
		if(action==UP){
			if(n==1){
            currentImg =imgup;
		    System.out.println("向上转");
		    y--;
		    repaint();
			n=2;
			}
			else if(n==2){
			currentImg =img4;
		    System.out.println("向上转");
		    y--;
		    repaint();
			n=1;

			}
		}
	  if(action==DOWN){
		  if(n==1){
		  currentImg =img;
		  System.out.println("向下转");
		  y++;
		  repaint();
		  n=2;
		  }
		  else if(n==2){
		  currentImg =img3;
		  System.out.println("向下转");
		  y++;
		  repaint();
		  n=1;
		  }

	  }
	  
	 
	}

}