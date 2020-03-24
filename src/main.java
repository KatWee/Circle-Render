import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String temp = new String();
		int r,x,y,tx,ty;
		Midpoint circle = new Midpoint();
		
		do {
			//*********************************************
			System.out.println("\nInput r");
			System.out.print("r : ");
			r = Integer.parseInt(in.nextLine());
			
			System.out.println("\nInpur Center Point");
			System.out.print("x : ");
			x = Integer.parseInt(in.nextLine());
			System.out.print("y : ");
			y = Integer.parseInt(in.nextLine());
			//*********************************************
			//translate (x,y) to origin
			tx = -x;
			x = x + tx;
			ty = -y;
			y = y + ty;
			//*********************************************
			//plot
			circle.plotCircle(r);
			circle.negativeX();
			circle.negativeY();
			//*********************************************
			//translate origin to (x,y) 
			int i = 0;
			while(i < circle.pointx.size())
			{
				circle.pointy.set(i, circle.pointy.get(i) - ty);
				circle.pointx.set(i, circle.pointx.get(i) - tx);
				circle.negX.set(i, circle.negX.get(i) - tx);
				circle.negY.set(i, circle.negY.get(i) - ty);
				i++;
			}
			//*********************************************
			//*********************************************
			System.out.print("Octacnt 1 :");
			circle.printCircle(circle.pointy,circle.pointx);
			System.out.print("Octacnt 2 :");
			circle.printCircle(circle.pointx,circle.pointy);
			System.out.print("Octacnt 3 :");
			circle.printCircle(circle.negX,circle.pointy);
			System.out.print("Octacnt 4 :");
			circle.printCircle(circle.negY,circle.pointx);
			System.out.print("Octacnt 5 :");
			circle.printCircle(circle.negY,circle.negX);
			System.out.print("Octacnt 6 :");
			circle.printCircle(circle.negX,circle.negY);
			System.out.print("Octacnt 7 :");
			circle.printCircle(circle.pointx,circle.negY);
			System.out.print("Octacnt 8 :");
			circle.printCircle(circle.pointy,circle.negX);
			//*********************************************
			//clear all list
			circle.pointx.removeAll(circle.pointx);
			circle.pointy.removeAll(circle.pointy);
			circle.negX.removeAll(circle.negX);
			circle.negY.removeAll(circle.negY);
			
			//ask to continue
			System.out.print("Continue? (y/n) ");
			temp = in.nextLine();
		}while(!(temp.equalsIgnoreCase("n")));
		
		System.out.print("End Program");

	}

}
