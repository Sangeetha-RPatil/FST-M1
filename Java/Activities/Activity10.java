import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating new HashSet
		HashSet<String> hs = new HashSet<String>();
        
        hs.add("sangeetha");
        hs.add("kamal");
        hs.add("harry");
        hs.add("pushpa");
        hs.add("ko");
        hs.add("radha");
        
        System.out.println("Objects in HashSet: " +hs);        
        System.out.println("Size of HashSet: " + hs.size());
        
        System.out.println("Removing Kiran from HashSet: " + hs.remove("Kiran"));
        
        if(hs.remove("Muki")) {
        	System.out.println("Muki removed from the Set");
        } else {
        	System.out.println("Muki is not present in the Set");
        }
        
        //Search for element
        System.out.println("Checking if Kiran is present: " + hs.contains("Kiran"));
        
        System.out.println("Updated HashSet: " + hs);
    }	


}
