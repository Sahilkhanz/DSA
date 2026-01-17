
import java.util.HashMap;
import java.util.Map;

public class HashMapConstructor {

    public static void main(String[] args) {
        System.out.println("Default Constructor");
        hashMapConstructorOne();
        System.out.println();
        System.out.println("IntializeCapacity Constructor");
        hashMapConstructorTwo();
        System.out.println();
        System.out.println("IntializeCapacity & LoadFactor Constructor");
        hashMapConstructorThree();
        System.out.println();
        hashMapConstructorFour();
        System.out.println();
        putRemoveTraverseHashMap();
    }

    public static void hashMapConstructorOne() {
        //default
        // No need to mention the Generic type twice
        HashMap<Integer, String> hm1 = new HashMap<>();

        // Initialization of a HashMap using Generics
        HashMap<Integer, String> hm2 = new HashMap<Integer, String>();

        // Adding elements using the put method custom input elements
        hm1.put(1, "one");
        hm1.put(2, "two");
        hm1.put(3, "three");

        hm2.put(4, "four");
        hm2.put(5, "five");
        hm2.put(6, "six");

        // Print and display mapping of HashMap 1
        System.out.println("Mapping of HashMap hm1 are :" + hm1);
        // Print and display mapping of HashMap 2
        System.out.println("Mapping of HashMap hm1 are :" + hm2);

    }

    // HashMap(int initialCapacity)
    public static void hashMapConstructorTwo() {

        //No need to  mention the generic typr twice
        HashMap<Integer, String> hm1 = new HashMap<>(10);

        //Initialization of a HashMap using Generics
        HashMap<Integer, String> hm2 = new HashMap<Integer, String>(2);

        //Adding element to the objects of hashMap using put method
        hm1.put(1, "one");
        hm1.put(2, "two");
        hm1.put(3, "three");

        hm2.put(4, "four");
        hm2.put(5, "five");
        hm2.put(6, "six");
        hm2.put(7, "seven");

        // Printing element of HashMap 1
        System.out.println("Mapping of HahMap hm1 are : " + hm1);
        // Printing element of HashMap 2 
        System.out.println("Mapping of HahMap hm2 are : " + hm2);

    }

    // HashMap(int initialCapacity,int loadFactor)
    public static void hashMapConstructorThree() {

        //No need to  mention the generic typr twice
        HashMap<Integer, String> hm1 = new HashMap<>(5, 0.75f);

        //Initialization of a HashMap using Generics
        HashMap<Integer, String> hm2 = new HashMap<Integer, String>(3, 0.5f);

        //Adding element to the objects of hashMap using put method
        hm1.put(1, "one");
        hm1.put(2, "two");
        hm1.put(3, "three");

        hm2.put(4, "four");
        hm2.put(5, "five");
        hm2.put(6, "six");

        // Printing element of HashMap 1
        System.out.println("Mapping of HahMap hm1 are : " + hm1);
        // Printing element of HashMap 2 
        System.out.println("Mapping of HahMap hm2 are : " + hm2);

    }

    // HashMap(Map map)
    public static void hashMapConstructorFour() {

        //No need to  mention the generic typr twice
        HashMap<Integer, String> hm1 = new HashMap<>(5, 0.75f);

        //Adding element to the objects of hashMap using put method
        hm1.put(1, "one");
        hm1.put(2, "two");
        hm1.put(3, "three");

        //Initialization of a HashMap using Generics
        HashMap<Integer, String> hm2 = new HashMap<Integer, String>(hm1);

        hm2.put(4, "four");
        hm2.put(5, "five");
        hm2.put(6, "six");

        // Printing element of HashMap 1
        System.out.println("Mapping of HahMap hm1 are : " + hm1);
        // Printing element of HashMap 2 
        System.out.println("Mapping of HahMap hm2 are : " + hm2);

    }

    public static void putRemoveTraverseHashMap() {
        HashMap<Integer, String> hm1 = new HashMap<Integer, String>();

        // Adding elements using the put method custom input elements
        hm1.put(1, "one");
        hm1.put(2, "two");
        hm1.put(3, "three");
        hm1.put(4, "four");
        hm1.put(5, "five");
        hm1.put(6, "six");

        // remove
        hm1.remove(6);
        // update 
        hm1.put(2, "twelve");

        //Iterate the map using for-each loop
        for (Map.Entry<Integer, String> element : hm1.entrySet()) 
            System.out.println("Key: " + element.getKey() + " Value: " + element.getValue());

    }

    //
}
