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
	Image img,imglfet,currentImg,imgup,imgright,img1,img2;
	int x=120;
	int y=100;
	int i=1;
	public MainCanvas(){
		try
		{
			/*
			��������ֵ
			�﷨����������=value;
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
			if(n==1){
			currentImg=imglfet;
			System.out.println("����ת");
			x--;
			n=2;
			repaint();
			}
			if(n==2){
			currentImg=img1;
			System.out.println("����ת");
			x--;
			n=1;
			repaint();
			}


			
		}
		if(action==RIGHT){
         currentImg =imgright;
		 System.out.println("����ת");
		  x++;
		 repaint();
		
		
		}
		if(action==UP){
        currentImg =imgup;
		System.out.println("����ת");
		y--;
		repaint();
		}
	  if(action==DOWN){
		  currentImg =img;
		  System.out.println("����ת");
		  y++;
		  repaint();
	  }
	  
	 
	}

}