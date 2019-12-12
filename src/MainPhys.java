

import java.util.Scanner;




public class MainPhys {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stuff

		String questiontype = "empty";

		double mass;

		double force;

		double time;

		double work;

		double gravity = 9.8;

		double height;

		double velocity;

		double Ek;

		double power;

		double distance;

		Scanner in=new Scanner(System.in);
		System.out.println("Question Type?");

		questiontype=in.nextLine();

		

		//WORK IS FORCE TIMES DISTANCE.
		if (questiontype.equalsIgnoreCase("Find work")) {
			System.out.println("Total force (in N)?");

			force=in.nextDouble();

			System.out.println("Total distance (in m?)?");

			distance=in.nextDouble();
			in.nextLine();

			System.out.println((force*distance)+(" J"));
		}
		
		//Eg = MGH

		if (questiontype.equalsIgnoreCase("Find gravitational potential energy")) {
			System.out.println("Total mass (in kg)?");

			mass=in.nextDouble();

			System.out.println("Total height (in m)?");
			height=in.nextDouble();
			
			System.out.println((mass*gravity*height)+("J"));

		}
		
		//KINETIC ENERGY
		if (questiontype.equalsIgnoreCase("Find kinetic energy")) {
			System.out.println("Total mass (in kg)?");
			
			mass=in.nextDouble();
			
			System.out.println("Total velocity (in m/s)?");
			
			velocity=in.nextDouble();
			
			System.out.println(((0.50*mass*(velocity*velocity)))+("J"));
			
		}
		
		//find POWER
		if (questiontype.equalsIgnoreCase("Find power")) {
			System.out.println("Total work (in J)?");
			
			work=in.nextDouble();
			
			System.out.println("Total time taken (in seconds)?");
			time=in.nextDouble();
			
			power=(work/time);
			
			System.out.println((power)+(" Watts"));
			
			//if power=(>400) {
				//System.out.println();
				
			}
		}

	}


