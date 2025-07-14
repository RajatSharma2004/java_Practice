class Person {
    String name;
}

public class PassByValueDemo {

    // Case 1: Pass-by-value with primitive
    public static void modifyPrimitive(int x) {
        x = 100;
    }

    // Case 2: Modify internal state of object (affects original)
    public static void modifyObject(Person p) {
        p.name = "Alice";
    }

    // Case 3: Reassign object inside method (does not affect original)
    public static void reassignObject(Person p) {
        p = new Person();      // New object
        p.name = "Charlie";    // Set new name (not reflected outside)
    }

    public static void main(String[] args) {
        // Case 1
        int a = 50;
        modifyPrimitive(a);
        System.out.println("After modifyPrimitive: " + a);  // Output: 50

        // Case 2
        Person person1 = new Person();
        person1.name = "Bob";
        modifyObject(person1);
        System.out.println("After modifyObject: " + person1.name);  // Output: Alice

        // Case 3
        Person person2 = new Person();
        person2.name = "David";
        reassignObject(person2);
        System.out.println("After reassignObject: " + person2.name);  // Output: David
    }
}
