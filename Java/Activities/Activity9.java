import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) {
		
		//declaring Arraylist
        ArrayList<String> fruitsList = new ArrayList<String>();
        
        fruitsList.add("Apple");
        fruitsList.add("JackFruit");
        fruitsList.add("Orange");
        fruitsList.add(3, "Lemon");
        fruitsList.add(4, "Grapes");
        
        System.out.println("Print All the fruits:\n");
        
        for(String s:fruitsList){
            System.out.println(s);
        }
        
        System.out.println("3rd element in the fruits list is: " + fruitsList.get(2));
        System.out.println("Is Papaya is in list: " + fruitsList.contains("Papaya"));
        System.out.println("Is Lemon is in list: " + fruitsList.contains("Lemon"));
        System.out.println("Size of List: " + fruitsList.size());
        
        fruitsList.remove("Lemon");
        
        System.out.println("Alter Size of List: " + fruitsList.size());
    }
}

	
		 
