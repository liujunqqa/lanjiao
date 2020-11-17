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
	Image img,imglfet,currentImg,imgup,imgright,img1,img2;
	int x=120;
	int y=100;
	int i=1;
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
			if(n==1){
			currentImg=imglfet;
			System.out.println("向左转");
			x--;
			n=2;
			repaint();
			}
			if(n==2){
			currentImg=img1;
			System.out.println("向左转");
			x--;
			n=1;
			repaint();
			}


			
		}
		if(action==RIGHT){
         currentImg =imgright;
		 System.out.println("向右转");
		  x++;
		 repaint();
		
		
		}
		if(action==UP){
        currentImg =imgup;
		System.out.println("向上转");
		y--;
		repaint();
		}
	  if(action==DOWN){
		  currentImg =img;
		  System.out.println("向下转");
		  y++;
		  repaint();
	  }
	  
	 
	}

}