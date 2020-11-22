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
	/*Image img,imglfet,currentImg,imgup,imgright,img1,img2,img3,img4,img5,img6,img7,img8;*/
	Image currentImg;
	Image img[][]=new Image [4][3];
	/*Image leftimg[]=new Image[3];
	Image rightimg[]=new Image[3];
	Image upimg[]=new Image[3];
	Image downimg[]=new Image[3];
	*/
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
			for(int i=0;i<img.length;i++){
				for(int j=0;j<img[i].length;j++){
					img[i][j]=Image.createImage("/sayo"+i+j+".png");

			}
			}
			/*for(int i=0;i<3;i++){
				img[0][i]=Image.createImage("/sayo"+i+"2.png");
			}
			for(int i=0;i<3;i++){
				img[1][i]=Image.createImage("/sayo"+i+"6.png");
			}
			for(int i=0;i<3;i++){
				img[2][i]=Image.createImage("/sayo"+i+"4.png");
			}
			for(int i=0;i<3;i++){
				img[3][i]=Image.createImage("/sayo"+i+"0.png");
			}
			/*for(int i=0;i<3;i++){
				leftimg[i]=Image.createImage("/sayo"+i+"2.png");
			}
			for(int i=0;i<3;i++){
				rightimg[i]=Image.createImage("/sayo"+i+"6.png");
			}
			for(int i=0;i<3;i++){
				upimg[i]=Image.createImage("/sayo"+i+"4.png");
			}
			for(int i=0;i<3;i++){
				downimg[i]=Image.createImage("/sayo"+i+"0.png");
			}
			
			/*img=Image.createImage("/sayo10.png");
			imglfet=Image.createImage("/sayo12.png");
			imgup =Image.createImage("/sayo14.png");
            imgright =Image.createImage("/sayo16.png");
			img1=Image.createImage("/sayo02.png");
			img2=Image.createImage("/sayo22.png");
			img3=Image.createImage("/sayo20.png");
			img4=Image.createImage("/sayo24.png");
			img5=Image.createImage("/sayo26.png");
			img6=Image.createImage("/sayo06.png");
			img7=Image.createImage("/sayo04.png");
			img8=Image.createImage("/sayo00.png");
			*/

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
			/*
			实现转向代码
			*/
			/*
			给变量重新赋值即可
			*/
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
		if(action==RIGHT){
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
		   else if(n==2){
		   currentImg =img[1][2];
		   System.out.println("向右转");
		   x=x+5;
		   repaint();
		   n=0;
		   }
		
		}
		if(action==UP){
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
	  if(action==DOWN){
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

}