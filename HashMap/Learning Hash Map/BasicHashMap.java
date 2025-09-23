
import java.util.HashMap;

public class BasicHashMap {

    public static void main(String[] args) {

        //Create a HashMap
        // HashMap<K,V> 
        // K → key
        // V → value
        HashMap<String, Integer> hashMap = new HashMap<>();

        //Add element to the HashMap
        hashMap.put("Sahil", 25);
        hashMap.put("Vaibhav", 26);
        hashMap.put("Akhilesh", 27);
        hashMap.put("Aruna", 28);

        //Access element in the HashMap
        System.out.println(hashMap.get("Sahil"));

        //Remove the element from the HashMap
        hashMap.remove("Akhilesh");

        //Check if the element is present in the hashMap
        System.out.println(hashMap.containsKey("Abhisekh"));
        //output: false

        // Get the size of the HashMap
        System.out.println(hashMap.size());

    }
}
