
import java.util.Scanner;

public class Exampel02_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			Scanner input = new Scanner( System.in );
			
			System.out.print( "Hej, vad heter du?:  ");
			String namn = input.nextLine();
			
			System.out.println("Hej " + namn);
			
			System.out.print( "Hur gammal är du?:  " );
			int ålder = input.nextInt();
			
			System.out.println("Okej, så du är alltså " + ålder + " år?");
			
			
			System.out.print("Vänligen skriv din längd: ");
			double längd = input.nextDouble();
			
			
			System.out.println( namn+ " är " +ålder+ " år gammal och "+längd+ " cm lång. ");
			System.out.println( "Stämmer det?" );
			// int ja = input.nextInt();
			
			// System.out.println("Perfekt");
	}

}
