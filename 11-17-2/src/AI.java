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
	����������
	�﷨���������� �������ƣ���ʶ����;
	*/
	Image img,imglfet,currentImg,imgup,imgright,img1,img2,img3,img4,img5,img6,img7,img8;
	int x;
	int y;
	int n;
	public MainCanvas(){
		try
		{
			/*
			��������ֵ
			�﷨����������=value;
			*/
			img=Image.createImage("/sayo10.png");
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

			x=120;
			y=100;
			n=0;
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
		
		g.drawImage(currentImg,x,y,0);//120��X���ꡢ100��Y����
	}
	public void keyPressed(int keyCode){
		int action=getGameAction(keyCode);
		/*
		action��ֵ��UP��DOWN��LEFT��RIGHT
		*/
		
		if(action==LEFT){
			/*
			ʵ��ת�����
			*/
			/*
			���������¸�ֵ����
			*/
			if(n==0){
				currentImg=imglfet;
				repaint();
				n=1;
			}
			else if(n==2){
			currentImg=img2;
			System.out.println("����ת");
			x--;
			repaint();
			n=0;
			
			}
			else if(n==1){
			currentImg=img1;
			System.out.println("����ת");
			x--;	
			repaint();
			n=2;
			

			}


			
		}
		if(action==RIGHT){
			if(n==0){
			currentImg=imgright;
			repaint();
			n=1;
			}

		   else if(n==1){
           currentImg =img6;
		   System.out.println("����ת");
		   x++;
		   repaint();
		   n=2;
		   }
		   else if(n==2){
		   currentImg =img5;
		   System.out.println("����ת");
		   x++;
		   repaint();
		   n=0;
		   }
		
		}
		if(action==UP){
			if(n==0){
			currentImg=imgup;
			repaint();
			n=1;
			}
			else if(n==1){
            currentImg =img7;
		    System.out.println("����ת");
		    y--;
		    repaint();
			n=2;
			}
			else if(n==2){
			currentImg =img4;
		    System.out.println("����ת");
		    y--;
		    repaint();
			n=0;

			}
		}
	  if(action==DOWN){
		  if(n==0){
			currentImg=img;
			repaint();
			n=1;
			}
		  else if(n==1){
		  currentImg =img8;
		  System.out.println("����ת");
		  y++;
		  repaint();
		  n=2;
		  }
		  else if(n==2){
		  currentImg =img3;
		  System.out.println("����ת");
		  y++;
		  repaint();
		  n=0;
		  }

	  }
	  
	 
	}

}