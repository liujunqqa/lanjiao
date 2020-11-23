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
		g.setColor(100,50,100);
		g.fillRect(0,0,getWidth(),getHeight());
		
		g.drawImage(currentImg,x,y,0);//120：X坐标、100：Y坐标
	}
	public void keyPressed(int keyCode){
		int action=getGameAction(keyCode);
		if(action==LEFT){
			changePiAndMore(0);
			x=x-5;
		}
		if(action==RIGHT){
			changePiAndMore(1);
			x=x+5;
		}
		if(action==UP){
			changePiAndMore(2);
			y=y-5;
		}
		if(action==DOWN){
			changePiAndMore(3);
			y=y+5;
		}
		/*
		action的值：UP、DOWN、LEFT、RIGHT
		*/
	}
	public void changePiAndMore(int drection){
		if(n==0){
				currentImg=img[drection][1];				
				n=1;
			}
			else if(n==1){
			currentImg=img[drection][2];				
			n=2;			
			}
			else if(n==2){
			currentImg=img[drection][0];			
			n=0;
			}
			repaint();
	}
}
