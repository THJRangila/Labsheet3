public class Mains {

    public static void main(String[] args) {
        // Task 4: Inside the main method, create an instance of the AccessModifiersDemo class.
        AccessModifiersDemo demo = new AccessModifiersDemo();

        // Access and print the values of all variables using their respective getter methods.
        System.out.println("Private Variable: " + demo.getPrivateVar());
        System.out.println("Default Variable: " + demo.getDefaultVar());
        System.out.println("Protected Variable: " + demo.getProtectedVar());
        System.out.println("Public Variable: " + demo.getPublicVar());

        // Task 5: Test Subclass Access
        SubclassDemo subDemo = new SubclassDemo();
        subDemo.displayProtectedVar(); // Calls the displayProtectedVar() method in the subclass
    }
}


