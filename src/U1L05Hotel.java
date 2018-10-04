import javax.swing.JOptionPane;

public class U1L05Hotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int LeMeridien = 173;
		int LeonardoHotel = 69;
		int AZIMUTHotel = 79;
		int nights = 0;
		String input;
		
		System.out.println("Welcome to Vienna!");
		
		do {
			input = JOptionPane.showInputDialog(null, "How many nights would you like to stay?");
			nights = Integer.parseInt(input);	
		} while (nights < 1);
		
		System.out.println("For " + nights + " nights, the cost is " + (nights * 173) + " to stay"
				+ "at Le Meridien, " + (nights * 69) + " to stay at Leonardo Hotel Vienna, and"
						+ " " + (nights * 79) + " to stay at AZIMUT Hotel Vienna.");
		//ask user how many nights they want to stay
		//include input validation loop to make sure they entered > 0
		//print total cost for that many nights at each hotel
		//bar graph in which each * represents 50
		
		

	}

}
