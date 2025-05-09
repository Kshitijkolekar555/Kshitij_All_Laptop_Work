// Define an interface named 'sample' with two abstract methods
interface sample {
    void meth1();  // Abstract method 1
    void meth2();  // Abstract method 2
}

// 'childinterface' extends 'sample', so it inherits meth1() and meth2()
// This follows the DRY (Don't Repeat Yourself) principle by reusing method declarations
interface childinterface extends sample {
    void meth3();  // New method specific to childinterface
    void meth4();  // Another method specific to childinterface
}

// A class that implements 'childinterface'
// Since 'childinterface' extends 'sample', 'sampleclass' must implement all 4 methods
class sampleclass implements childinterface {

    // Implementation of meth1() from 'sample'
    public void meth1() {
        System.out.println("meth1");
    }

    // Implementation of meth3() from 'childinterface'
    public void meth3() {
        System.out.println("meth3");
    }

    // Implementation of meth4() from 'childinterface'
    public void meth4() {
        System.out.println("meth4");
    }

    // Implementation of meth2() from 'sample'
    public void meth2() {
        System.out.println("meth2");
    }
}

// Main class containing the main method
public class _58 {
    public static void main(String[] args) {
        // Create an instance of sampleclass
        sampleclass s = new sampleclass();

        // Call meth1() and meth4() on the instance
        s.meth1();  // Output: meth1
        s.meth4();  // Output: meth4
    }
}
