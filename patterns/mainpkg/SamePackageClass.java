package patterns.mainpkg;

public class SamePackageClass {
    public void showAccess() {
        AccessExample obj = new AccessExample();
        System.out.println("Same package non-subclass:");
        // System.out.println("Private: " + obj.privateVar); // ❌ Error
        System.out.println("Default: " + obj.defaultVar);   // ✅ Accessible
        System.out.println("Protected: " + obj.protectedVar); // ✅ Accessible
        System.out.println("Public: " + obj.publicVar);     // ✅ Accessible
    }
}