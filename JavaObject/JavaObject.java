
public class JavaObject {

    public static void main(String[] args) {
        int dataSize = 4;
        Student[] arr = new Student[dataSize];
        arr[0] = new Student("Sahil", 21);
        System.out.println("Name:" + arr[0].name + "\n" + "Age: " + arr[0].age);
    }
}

class Student {

    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
