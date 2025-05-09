interface bicylce {
    public int a = 45; // public static final by default in interface
    void applyBrake(int decrement);
    void speedup(int increment);
}

interface hornbicylce {
    int a = 400;         // also public static final (conflicts with bicylce.a)
    int c = 45;
    public int b = 0;    // also public static final
    void run();
    void stop();
}

class kesto implements hornbicylce, bicylce { // need to define all methods of both interfaces
    public int c = 78; // instance variable, not static or final

    void blowhorn() {
        System.out.println("pee ppeeee");

        // Accessing constants from specific interfaces due to ambiguity
        System.out.println("from bicycel :" + bicylce.a);
        // System.out.println(a); ❌ Error: ambiguous, as both interfaces have 'a'
        System.out.println("from  hornbicycle :" + hornbicylce.a);
    }

    public void applyBrake(int decrement) {
        System.out.println("Applying brakes");
    }

    public void speedup(int i) { // must be public when implementing interface method
        System.out.println("increasing the speed of the vehicle");
    }

    public void run() {
        System.out.println("Running");
    }

    public void stop() {
        System.out.println("stopping");
    }
}

class new_kesto extends kesto implements bicylce { // already inherited via kesto, but re-implements is allowed
    void newfeature() {
        System.out.println("i am E-cycle");
    }
}

public class _54_abstract_interface_class {
    public static void main(String[] args) {
        new_kesto o = new new_kesto();

        // o.a = 46; ❌ Can't modify interface constants (they are final)

        o.applyBrake(4);
        o.speedup(4);
        o.blowhorn();
        o.newfeature();
        o.run();
        o.stop();

        // Accessing static final variable from interface directly
        System.out.println(hornbicylce.b);

        // System.out.println(o.a); ❌ Error: ambiguous — both interfaces have 'a'

        System.out.println(o.b);     // Accessing hornbicylce.b via object reference (legal)
        System.out.println(o.c);     // Accessing instance variable c from class
        System.out.println(hornbicylce.c); // Accessing constant c from interface
    }
}
