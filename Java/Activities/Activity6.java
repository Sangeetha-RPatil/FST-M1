import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Activity6 {
	
	private List<String> passengers;
	private int maxPassengers;
	private Date lastTimeTookOf;
	private Date lastTimeLanded;
	
	public Activity6(int maxPassengers) {
		this.maxPassengers = maxPassengers;
		this.passengers = new ArrayList<>();
	}
	
	public void onboard(String passenger) {
        this.passengers.add(passenger);
    }
	
	public Date takeOff() {
        this.lastTimeTookOf = new Date();
        return lastTimeTookOf;
    }
	
	public void land() {
        this.lastTimeLanded = new Date();
        this.passengers.clear();
    }

    public Date getLastTimeLanded() {
        return lastTimeLanded;
    }

    public List<String> getPassengers() {
        return passengers;
    }
	
    public static void main(String[] args) throws InterruptedException {
        //Assign max 10 passengers
        Activity6 plane = new Activity6(10);
        //Adding passengers
        plane.onboard("Sangeetha");
        plane.onboard("Anand");
        plane.onboard("Yash");
        plane.onboard("Kavya");
        
        System.out.println("Plane take off time: " + plane.takeOff());
        System.out.println("Number of Passengers on the plane: " + plane.getPassengers());
        
        Thread.sleep(5000);
        
        plane.land();
        
        System.out.println("Plane landed time: " + plane.getLastTimeLanded());
        System.out.println("Number of Passengers on the plane after landing: " + plane.getPassengers());
    }
}
