//  Accept initial velocity (u), acceleration (a) and time (t). Print the final velocity 
// (v) and the distance (s) travelled. (Hint: v = u + at, s = u + at2) 

import java.util.Scanner;
public class VelocityAndDistance{
	public static void main(String[] args){

		float iv, a, t, fv, s;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Initial Velocity : ");
		iv = sc.nextFloat();

		System.out.println("Enter Acceleration : ");
		a = sc.nextFloat();

		System.out.println("Enter Time : ");
		t = sc.nextFloat();		

		fv = iv + a * t;
		s = iv + a * t * t;

		System.out.println("Final Velocity : "+fv);
		System.out.println("Distance : "+s);
	}
}