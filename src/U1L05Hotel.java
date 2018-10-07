import javax.swing.JOptionPane;

public class U1L05Hotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int LeMeridien = 200;
		int LeonardoHotel = 50;
		int AZIMUTHotel = 100;
		int nights = 0;
		int LMstaying = (LeMeridien * nights);
		int LHstaying = (LeonardoHotel * nights);
		int AHstaying = (AZIMUTHotel * nights);
		int o = 1;
		String input;
		
		System.out.println("Welcome to Vienna!");
		
		do {
			input = JOptionPane.showInputDialog(null, "How many nights would you like to stay?");
			nights = Integer.parseInt(input);	
		} while (nights < 1);
		
		System.out.println("For " + nights + " nights, the cost is: \n$" + (nights * 200) + " to stay "
				+ "at Le Meridien, \n$" + (nights * 50) + " to stay at Leonardo Hotel Vienna, and"
						+ " \n$" + (nights * 100) + " to stay at AZIMUT Hotel Vienna.");
		System.out.println(o * (LHstaying / 50));
		
		
		//bar graph in which each * represents 50
		
		

	}

}
