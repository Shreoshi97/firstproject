package App;

import java.util.Scanner;

public class Shreoshi {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		if(str.equals("Triangle"))
		{
			float height=sc.nextFloat();
			float side=sc.nextFloat();
			float area=(float)0.5*height*side;
			System.out.println(String.format("%.2f", area));
			
		}
		else if(str.equals("Square"))
		{
			float side=sc.nextFloat();
			float area=side*side;
			System.out.println(String.format("%.2f", area));
		}
		else if(str.equals("Rectangle"))
		{
			float length=sc.nextFloat();
			float width=sc.nextFloat();
			float area=2*(length+width);
			System.out.println(String.format("%.2f", area));
		}
		else if(str.equals("Circle"))
		{
			float radius=sc.nextFloat();
			float area=(float)3.14*radius*radius;
			System.out.println(String.format("%.2f", area));
		}

	}

}
