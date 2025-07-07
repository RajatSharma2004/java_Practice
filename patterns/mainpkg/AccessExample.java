package patterns.mainpkg;


public class AccessExample {
    private int privateVar = 1;
    int defaultVar = 2; // package-private
    protected int protectedVar = 3;
    public int publicVar = 4;

    public void showAccess() {
        System.out.println("Within same class:");
        System.out.println("Private: " + privateVar);
        System.out.println("Default: " + defaultVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Public: " + publicVar);
    }
}
