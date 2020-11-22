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
	 Image currentImg;
	 Image img[][]=new Image [4][3];
	 int x;
	 int y;
	 int n;
	 MainCanvas(){
		try
		{
			/*
			给变量赋值
			语法：变量名称=value;
			*/
			for(int i=0;i<img.length;i++){
				for(int j=0;j<img[i].length;j++){
					img[i][j]=Image.createImage("/sayo"+i+j+".png");

			}
			}

			x=120;
			y=100;
			n=0;
			currentImg=img[3][1];
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
			left();		
		}
		if(action==RIGHT){
			right();
			
		}
		if(action==UP){
			up();
		}
	
	  if(action==DOWN){
		  down();
	  }
	 
	}
	public void left(){
			if(n==0){
				currentImg=img[0][1];
				repaint();
				n=1;
			}
			else if(n==2){
			currentImg=img[0][2];
			System.out.println("向左转");
			x=x-5;
			repaint();
			n=0;
			
			}
			else if(n==1){
			currentImg=img[0][0];
			System.out.println("向左转");
			x=x-5;	
			repaint();
			n=2;

			}

	}
	public void right(){
		if(n==0){
			currentImg=img[1][1];
			repaint();
			n=1;
			}

		   else if(n==1){
           currentImg =img[1][0];
		   System.out.println("向右转");
		   x=x+5;
		   repaint();
		   n=2;
		   }
		   else if (n==2){
		   currentImg =img[1][2];
		   System.out.println("向右转");
		   x=x+5;
		   repaint();
		   n=0;
		   }


	}
	public void up(){
		if(n==0){
			currentImg=img[2][1];
			repaint();
			n=1;
			}
			else if(n==1){
            currentImg =img[2][0];
		    System.out.println("向上转");
		    y=y-5;
		    repaint();
			n=2;
			}
			else if(n==2){
			currentImg =img[2][2];
		    System.out.println("向上转");
		    y=y-5;
		    repaint();
			n=0;

			}

	}
	public void down(){
		 if(n==0){
			currentImg=img[3][1];
			repaint();
			n=1;
			}
		  else if(n==1){
		  currentImg =img[3][0];
		  System.out.println("向下转");
		  y=y+5;
		  repaint();
		  n=2;
		  }
		  else if(n==2){
		  currentImg =img[3][2];
		  System.out.println("向下转");
		  y=y+5;
		  repaint();
		  n=0;
		  }

	  }
	
	


}
