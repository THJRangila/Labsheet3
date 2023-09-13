public class AccessModifiersDemo {
    // Task 1: Create a Class
        private int privateVar;
        double defaultVar;
        protected boolean protectedVar;
        public String publicVar;

        // Task 2: Implement Methods
        public int getPrivateVar() {
            return privateVar;
        }

        int getDefaultVar() {
            return (int) defaultVar;
        }

        protected boolean getProtectedVar() {
            return protectedVar;
        }

        public String getPublicVar() {
            return publicVar;
        }
    }

    // Task 3: Create Subclass
    class SubclassDemo extends AccessModifiersDemo {
        // Task 5: Test Subclass Access
        void displayProtectedVar() {
            boolean protectedVarValue = getProtectedVar();
            System.out.println("Protected Variable in Subclass: " + protectedVarValue);
        }
    }

