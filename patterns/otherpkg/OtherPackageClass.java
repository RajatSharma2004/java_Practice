package patterns.otherpkg;

import patterns.mainpkg.AccessExample;

public class OtherPackageClass extends AccessExample {
    public void showAccess() {
        AccessExample obj = new AccessExample();
        System.out.println("Different package subclass:");
        // System.out.println("Private: " + obj.privateVar);    // Error
        // System.out.println("Default: " + obj.defaultVar);    // Error
        // System.out.println("Protected: " + obj.protectedVar); // Error (not through object)
        System.out.println("Public: " + obj.publicVar);        // Accessible

        // Accessing protected using inheritance
        System.out.println("Protected (via inheritance): " + protectedVar); // ✅ Accessible
    }
}