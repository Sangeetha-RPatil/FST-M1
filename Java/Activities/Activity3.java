
public class Activity3 {

	public static void main(String[] args) {
		
		//initialize variables
		double seconds = 1000000000;
		double EarthSeconds = 31557600;
		double MercurySeconds = 0.2408467;
		double VenusSeconds = 0.61519726;
		double MarsSeconds = 1.8808158;
		double JupiterSeconds = 11.862615;
		double SaturnSeconds = 29.447498;
		double UranusSeconds = 84.016846;
		double NeptuneSeconds = 164.79132;	
		
		
		//Calculating the age on all the planets and display
		System.out.println("Age on Earth: " + finalvalue(seconds / EarthSeconds));
		System.out.println("Age on Mercury: " +finalvalue(seconds / EarthSeconds / MercurySeconds));
		System.out.println("Age on Venus: " +finalvalue(seconds / EarthSeconds / VenusSeconds));
		System.out.println("Age on Mars: " +finalvalue(seconds / EarthSeconds / MarsSeconds));
		System.out.println("Age on Jupiter: "+finalvalue(seconds / EarthSeconds / JupiterSeconds));
		System.out.println("Age on Saturn: " +finalvalue(seconds / EarthSeconds / SaturnSeconds));
		System.out.println("Age on Uranus: " +finalvalue(seconds / EarthSeconds / UranusSeconds));
		System.out.println("Age on Neptune: " +finalvalue(seconds / EarthSeconds / NeptuneSeconds));
	}

	public static double finalvalue(double a) {
	double roundValue = Math.round(a * 100.0 ) / 100.0;
	return roundValue;
	}
}
