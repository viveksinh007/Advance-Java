import java.applet.*;
import java.awt.*;
public class e1 extends Applet
{
	public void paint(Graphics g)
	{
//---------------------------------------------------------------

		//pattern 

		 /*
		   0 0 0  0  0
		   0 2 4  6  8
		   0 4 8  12 16
		   0 6 12 16 18
		 */



		/*   
		   
		 int x =100,y=100,value=2,v2,gap;
		 for (int i=0;i<4;i++) 
		 {
		 	gap = i*2;
		 	v2 = gap;
		 	for (int j=0;j<5;j++) 
		 	{
		 	 
		 		if(i==0)
		 		{
		 			g.drawString("0",x,y);  	
		 			x+=25;
		 		}
		 		else if(j==0)
		 		{
		 			g.drawString("0",x,y);  	
		 			x+=25;
		 			
		 		}
		 		else
		 		{
		 			
		 			g.drawString(""+v2,x,y);  	
		 			x = x + 25 ;
		 			v2+=gap;
		 		}
		 	}
		 	y+=20;
		 	x=100;
		 }  

		*/

	
//------------------------------------------------------------------

		// add two number


		/*
		int n1,n2,sum;
		n1=Integer.parseInt(getParameter("num1"));
		n2=Integer.parseInt(getParameter("num2"));
		sum=n1+n2;
		g.drawString("The Sum is : "+sum,50,100); 
		*/


//-------------------------------------------------------------------


		//squar of number


		/*
		int n1;
		n1=Integer.parseInt(getParameter("num1"));
		int sqr=n1*n1;
		g.drawString("The Squar is : "+sqr,50,100);
		*/


//-------------------------------------------------------------------------

		//result by grade 


		/*
		int m1,m2,m3,m4,m5,total,per;
		m1=Integer.parseInt(getParameter("c++"));
		m2=Integer.parseInt(getParameter("java"));
		m3=Integer.parseInt(getParameter("php"));
		m4=Integer.parseInt(getParameter("c"));
		m5=Integer.parseInt(getParameter("math"));
		total=m1+m2+m3+m4+m5;
        per=total*100/100;
        if(total>=90){
        		g.drawString("The Total Marks is : "+total,50,100);
        		g.drawString("Per is : "+per,50,130);
        		g.drawString("Grade : - > Ex",50,160);

        }    
        else if(total>=80&&total<=90){
        		g.drawString("The Total Marks is : "+total,50,100);
        		g.drawString("Per is : "+per,50,130);
        		g.drawString("Grade : - > A",50,160);

        }    
        else if(total>=70&&total<=80){
        		g.drawString("The Total Marks is : "+total,50,100);
        		g.drawString("Per is : "+per,50,130);
        		g.drawString("Grade : - > B",50,160);

        }
        else if(total>=60){
        		g.drawString("The Total Marks is : "+total,50,100);
        		g.drawString("Per is : "+per,50,130);
        		g.drawString("Grade : - > C",50,160);

        }
        else if(total<=60){
        		g.drawString("The Total Marks is : "+total,50,100);
        		g.drawString("Per is : "+per,50,130);
        		g.drawString("Grade : - > F",50,160);

        }
      	*/

	}
}
/*<applet code="e1.class" width="400" height="400">
<param name="num1" value="2">
<param name="num2" value="3">
<param name="c++" value="20">
<param name="java" value="15">
<param name="php" value="20">
<param name="c" value="20">
<param name="math" value="20">
</applet>
*/
