
import java.util.Scanner;

public class Exampel02_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			Scanner input = new Scanner( System.in );
			
			System.out.print( "Hej, vad heter du?:  ");
			String namn = input.nextLine();
			
			System.out.println("Hej " + namn);
			
			System.out.print( "Hur gammal �r du?:  " );
			int �lder = input.nextInt();
			
			System.out.println("Okej, s� du �r allts� " + �lder + " �r?");
			
			
			System.out.print("V�nligen skriv din l�ngd: ");
			double l�ngd = input.nextDouble();
			
			
			System.out.println( namn+ " �r " +�lder+ " �r gammal och "+l�ngd+ " cm l�ng. ");
			System.out.println( "St�mmer det?" );
			// int ja = input.nextInt();
			
			// System.out.println("Perfekt");
	}

}
