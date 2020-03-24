import java.util.ArrayList;

public class Midpoint {
	int h,x,y,dU,dD;
	ArrayList<Integer> pointx = new ArrayList<Integer>();
	ArrayList<Integer> pointy = new ArrayList<Integer>();
	ArrayList<Integer> negX = new ArrayList<Integer>();
	ArrayList<Integer> negY = new ArrayList<Integer>();
	
	public void plotCircle (int r)
	{
		h = 1 - r;
		x = 0;
		y = r;
		plot(x,y);
		while(y > x)
		{
			if(h < 0)
			{
				x = x + 1;
				dU = 2*x + 3;
				h = h + dU;
			}else
			{
				x = x + 1;
				y = y - 1;
				dD = 2*(x - y) + 5;
				h = h + dD;
			}
			plot(x,y);
		}
	}
	
	public void plot (int x, int y)
	{
		pointx.add(x);
		pointy.add(y);
	}
	
	public void printCircle (ArrayList<Integer> x,ArrayList<Integer> y)
	{
		int i = 0;
		for(i = 0; i < pointx.size(); i++)
		{
			System.out.print("("+x.get(i)+","+y.get(i)+") ");
		}
		System.out.println();
	}
	
	public void negativeX ()
	{
		int i = 0,temp;
		for(i = 0; i < pointx.size(); i++)
		{
			temp = -pointx.get(i);
			negX.add(temp);
		}
	}
	
	public void negativeY ()
	{
		int i = 0,temp;
		for(i = 0; i < pointy.size(); i++)
		{
			temp = -pointy.get(i);
			negY.add(temp);
		}
	}
}
