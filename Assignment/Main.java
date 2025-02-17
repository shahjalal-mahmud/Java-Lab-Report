// Main class to initialize objects and test methods
public class Main {
    public static void main(String[] args) {
        // Initialize objects
        Quadrilateral shape1 = new Quadrilateral();
        Object shape2 = new Kite();
        Quadrilateral shape3 = new Trapezium();
        Object shape4 = new Parallelogram();
        Parallelogram shape5 = new Rhombus();
        Quadrilateral shape6 = new Rectangle();
        Parallelogram shape7 = new Square();
        Rectangle shape8 = new Square();

        // Print object names
        // System.out.println(shape1.name); // Quadrilateral
        // System.out.println(shape2.name); //  CT: Compile-time error
        // System.out.println(shape3.name); // Quadrilateral
        // System.out.println(shape4.name); //  CT: Compile-time error
        // System.out.println(shape5.name); // Parallelogram
        // System.out.println(shape6.name); // Quadrilateral
        // System.out.println(shape7.name); // Parallelogram

        // // Call methods on shape1
        // System.out.println("\nCalling methods on shape1:");
        // shape1.method1(); // Quadrilateral 1
        // shape1.method2(); // Quadrilateral 2
        // shape1.method3(); // Quadrilateral 3
        // shape1.method4(); // Quadrilateral 4

        // // Call methods on shape2 (requires casting)
        // System.out.println("\nCalling methods on shape2:");
        // shape2.method1(); //  CT: Compile-time error
        // shape2.method2(); //  CT: Compile-time error
        // shape2.method3(); //  CT: Compile-time error
        // shape2.method4(); //  CT: Compile-time error

        // // Call methods on shape3
        // System.out.println("\nCalling methods on shape3:");
        // shape3.method1(); // Trapezium 1
        // shape3.method2(); // Quadrilateral 2
        // shape3.method3(); // Quadrilateral 3
        // shape3.method4(); // Quadrilateral 4

        // // Call methods on shape4 (requires casting)
        // System.out.println("\nCalling methods on shape4:");
        // shape4.method1(); //  CT: Compile-time error
        // shape4.method2(); //  CT: Compile-time error
        // shape4.method3(); //  CT: Compile-time error
        // shape4.method4(); //  CT: Compile-time error

        // // Call methods on shape5
        // System.out.println("\nCalling methods on shape5:");
        // shape5.method1(); //Quadrilateral 4 \n This is Quadrilateral Class \n Rhombus 1
        // shape5.method2(); // Quadrilateral 2
        // shape5.method3(); // Quadrilateral 2 \n Rhombus 3
        // shape5.method4(); // Quadrilateral 4

        // // Call methods on shape6
        // System.out.println("\nCalling methods on shape6:");
        // shape6.method1(); // Quadrilateral 1
        // shape6.method2(); // Quadrilateral 4 \n Rectangle 2 \n Quadrilateral 4 \n This is Quadrilateral Class
        // shape6.method3(); // Parallelogram 3 \n Quadrilateral 2 \n Quadrilateral 4
        // shape6.method4(); // Quadrilateral 4

        // // Call methods on shape7
        // System.out.println("\nCalling methods on shape7:");
        // shape7.method1(); // Parallelogram 3 \n Quadrilateral 2 \n Quadrilateral 4 \n Square 1  
        // shape7.method2(); // Quadrilateral 4 \n Rectangle 2 \n Quadrilateral 4 \n This is Quadrilateral Class \n Square 2 \n Parallelogram 3 \n Quadrilateral 2 \n Quadrilateral 4
        // shape7.method3(); // Parallelogram 3 \n Quadrilateral 2 \n Quadrilateral 4
        // shape7.method4(); // Quadrilateral 4

        // // Call compareTo method on shape8
        // System.out.println("\nCalling compareTo on shape8:");
        // System.out.println(shape8.compareTo(shape8)); // 1

        // // Casting and calling methods
        // System.out.println("\nCasting and calling methods:");
        // ((Quadrilateral) shape1).method1(); // Quadrilateral 1
        // ((Quadrilateral) shape2).method1(); // Kite 1
        // ((Quadrilateral) shape3).method1(); // Trapezium 1
        // ((Quadrilateral) shape4).method1(); // Quadrilateral 1
        // ((Quadrilateral) shape5).method1(); // Quadrilateral 4 \n This is Quadrilateral Class \n Rhombus 1
        // ((Quadrilateral) shape6).method1(); // Quadrilateral 1
        // ((Quadrilateral) shape7).method1(); // Parallelogram 3 \n Quadrilateral 2 \n Quadrilateral 4 \n Square 1  

        // // Casting and calling methods 2
        // System.err.println("\nCasting and calling methods 2: \n");
        // ((Quadrilateral) shape1).method2(); // Quadrilateral 2
        // ((Quadrilateral) shape2).method2(); // Quadrilateral 2
        // ((Quadrilateral) shape3).method2(); // Quadrilateral 2
        // ((Quadrilateral) shape4).method2(); // Quadrilateral 2
        // ((Quadrilateral) shape5).method2(); // Quadrilateral 2
        // ((Quadrilateral) shape6).method2(); // Quadrilateral 4 \n Rectangle 2 \n Quadrilateral 4 \n This is Quadrilateral Class
        // ((Quadrilateral) shape7).method2(); // Quadrilateral 4 \n Rectangle 2 \n Quadrilateral 4 \n This is Quadrilateral Class \n Square 2 \n Parallelogram 3 \n Quadrilateral 2 \n Quadrilateral 4

        // // Casting and calling methods 3
        // System.err.println("\nCasting and calling methods 3: \n");
        // ((Quadrilateral) shape1).method3(); // Quadrilateral 3
        // ((Quadrilateral) shape2).method3(); // Kite 3
        // ((Quadrilateral) shape3).method3(); // Quadrilateral 3
        // ((Quadrilateral) shape4).method3(); // Parallelogram 3 \n Quadrilateral 2 \n Quadrilateral 4
        // ((Quadrilateral) shape5).method3(); // Quadrilateral 2 \n Rhombus 3
        // ((Quadrilateral) shape6).method3(); // Parallelogram 3 \n Quadrilateral 2 \n Quadrilateral 4
        // ((Quadrilateral) shape7).method3(); // Parallelogram 3 \n Quadrilateral 2 \n Quadrilateral 4

        // // Object all shape method 1
        // System.err.println("\nObject all shapes method 1: \n");
        // ((Object) shape1).method1(); //  CT: Compile-time error
        // ((Object) shape2).method1(); //  CT: Compile-time error
        // ((Object) shape3).method1(); //  CT: Compile-time error
        // ((Object) shape4).method1(); //  CT: Compile-time error
        // ((Object) shape5).method1(); //  CT: Compile-time error
        // ((Object) shape6).method1(); //  CT: Compile-time error
        // ((Object) shape7).method1(); //  CT: Compile-time error


        // // Object all shape method 2
        // System.err.println("\nObject all shapes method 2: \n");
        // ((Object) shape2).method2(); //  CT: Compile-time error
        // ((Object) shape1).method2(); //  CT: Compile-time error
        // ((Object) shape3).method2(); //  CT: Compile-time error
        // ((Object) shape4).method2(); //  CT: Compile-time error
        // ((Object) shape5).method2(); //  CT: Compile-time error
        // ((Object) shape6).method2(); //  CT: Compile-time error
        // ((Object) shape7).method2(); //  CT: Compile-time error

        // // Object all shape method 3
        // System.err.println("\nObject all shapes method 3: \n");
        // ((Object) shape1).method3(); //  CT: Compile-time error
        // ((Object) shape2).method3(); //  CT: Compile-time error
        // ((Object) shape3).method3(); //  CT: Compile-time error
        // ((Object) shape4).method3(); //  CT: Compile-time error
        // ((Object) shape5).method3(); //  CT: Compile-time error
        // ((Object) shape6).method3(); //  CT: Compile-time error
        // ((Object) shape7).method3(); //  CT: Compile-time error

        // // Kite all shape method 1
        // System.err.println("\nKite all shapes method 1: \n");
        // ((Kite) shape1).method1(); //  RE: Run-time error
        // ((Kite) shape2).method1(); //  RE: Run-time error
        // ((Kite) shape3).method1(); //  RE: Run-time error
        // ((Kite) shape4).method1(); //  RE: Run-time error
        // ((Kite) shape5).method1(); //  CT: Compile-time error
        // ((Kite) shape6).method1(); //  RE: Run-time error
        // ((Kite) shape7).method1(); //  CT: Compile-time error

        // // Kite all shape method 2
        // System.err.println("\nKite all shapes method 2: \n");
        // ((Kite) shape1).method2(); //  RE: Run-time error
        // ((Kite) shape2).method2(); //  RE: Run-time error
        // ((Kite) shape3).method2(); //  RE: Run-time error
        // ((Kite) shape4).method2(); //  RE: Run-time error
        // ((Kite) shape5).method2(); //  CT: Compile-time error
        // ((Kite) shape6).method2(); //  RE: Run-time error
        // ((Kite) shape7).method2(); //  CT: Compile-time error

        // // Kite all shape method 3
        // System.err.println("\nKite all shapes method 3: \n");
        // ((Kite) shape1).method2(); //  RE: Run-time error
        // ((Kite) shape2).method2(); //  RE: Run-time error
        // ((Kite) shape3).method2(); //  RE: Run-time error
        // ((Kite) shape4).method2(); //  RE: Run-time error
        // ((Kite) shape5).method2(); //  CT: Compile-time error
        // ((Kite) shape6).method2(); //  RE: Run-time error
        // ((Kite) shape7).method2(); //  CT: Compile-time error

        // // Paralleforam all shape method 1
        // System.err.println("\nParallelogram all shapes method 1");
        // ((Parallelogram) shape1).method1(); //  RE: Run-time error
        // ((Parallelogram) shape2).method1(); //  RE: Run-time error
        // ((Parallelogram) shape3).method1(); //  RE: Run-time error
        // ((Parallelogram) shape4).method1(); // Quadrilateral 1
        // ((Parallelogram) shape5).method1(); // Quadrilateral 4 \n This is Quadrilateral Class \n Rhombus 1
        // ((Parallelogram) shape6).method1(); // Quadrilateral 1
        // ((Parallelogram) shape7).method1(); // Parallelogram 3 \n Quadrilateral 2 \n Quadrilateral 4 \n Square 1  

        // // Paralleforam all shape method 2
        // System.err.println("\nParallelogram all shapes method 2");
        // ((Parallelogram) shape1).method2(); //  RE: Run-time error
        // ((Parallelogram) shape2).method2(); //  RE: Run-time error
        // ((Parallelogram) shape3).method2(); //  RE: Run-time error
        // ((Parallelogram) shape4).method2(); // Quadrilateral 2
        // ((Parallelogram) shape5).method2(); // Quadrilateral 2
        // ((Parallelogram) shape6).method2(); // Quadrilateral 4 \n Rectangle 2 \n Quadrilateral 4 \n This is Quadrilateral Class
        // ((Parallelogram) shape7).method2(); // Quadrilateral 4 \n Rectangle 2 \n Quadrilateral 4 \n This is Quadrilateral Class \n Square 2 \n Parallelogram 3 \n Quadrilateral 2 \n Quadrilateral 4

        // // Paralleforam all shape method 3
        // System.err.println("\nParallelogram all shapes method 3");
        // ((Parallelogram) shape1).method3(); //  RE: Run-time error
        // ((Parallelogram) shape2).method3(); //  RE: Run-time error
        // ((Parallelogram) shape3).method3(); //  RE: Run-time error
        // ((Parallelogram) shape4).method3(); // Parallelogram 3 \n Quadrilateral 2 \n Quadrilateral 4
        // ((Parallelogram) shape5).method3(); // Quadrilateral 2 \n Rhombus 3
        // ((Parallelogram) shape6).method3(); // Parallelogram 3 \n Quadrilateral 2 \n Quadrilateral 4
        // ((Parallelogram) shape7).method3(); // Parallelogram 3 \n Quadrilateral 2 \n Quadrilateral 4

        // // Trapezium all shapes method 1
        // System.err.println("\nTrapezium all shapes method 1: \n");
        // ((Trapezium) shape1).method1(); // RE: Run-time error
        // ((Trapezium) shape2).method1(); // RE: Run-time error
        // ((Trapezium) shape3).method1(); // Trapezium 1
        // ((Trapezium) shape4).method1(); // RE: Run-time error
        // ((Trapezium) shape5).method1(); // CT: Compile-time error
        // ((Trapezium) shape6).method1(); // RE: Run-time error
        // ((Trapezium) shape7).method1(); // CT: Compile-time error

        // // Trapezium all shapes method 2
        // System.err.println("\nTrapezium all shapes method 2: \n");
        // ((Trapezium) shape1).method2(); // RE: Run-time error
        // ((Trapezium) shape2).method2(); // RE: Run-time error
        // ((Trapezium) shape3).method2(); // Quadrilateral 2
        // ((Trapezium) shape4).method2(); // RE: Run-time error
        // ((Trapezium) shape5).method2(); // CT: Compile-time error
        // ((Trapezium) shape6).method2(); // RE: Run-time error
        // ((Trapezium) shape7).method2(); // CT: Compile-time error

        // // Trapezium all shapes method 3
        // System.err.println("\nTrapezium all shapes method 3: \n");
        // ((Trapezium) shape1).method3(); // RE: Run-time error
        // ((Trapezium) shape2).method3(); // RE: Run-time error
        // ((Trapezium) shape3).method3(); // Quadrilateral 3
        // ((Trapezium) shape4).method3(); // RE: Run-time error
        // ((Trapezium) shape5).method3(); // CT: Compile-time error
        // ((Trapezium) shape6).method3(); // RE: Run-time error
        // ((Trapezium) shape7).method3(); // CT: Compile-time error

        // // Rhombus all shapes method 1
        // System.err.println("\nRhombus shapes method 1: \n");
        // ((Rhombus) shape1).method1(); // RE: Run-time error
        // ((Rhombus) shape2).method1(); // RE: Run-time error
        // ((Rhombus) shape3).method1(); // RE: Run-time error
        // ((Rhombus) shape4).method1(); // RE: Run-time error
        // ((Rhombus) shape5).method1(); // Quadrilateral 4 \n This is Quadrilateral Class \n Rhombus 1
        // ((Rhombus) shape6).method1(); // RE: Run-time error
        // ((Rhombus) shape7).method1(); // RE: Run-time error

        // // Rhombus all shapes method 2
        // System.err.println("\nRhombus shapes method 2: \n");
        // ((Rhombus) shape1).method2(); // RE: Run-time error
        // ((Rhombus) shape2).method2(); // RE: Run-time error
        // ((Rhombus) shape3).method2(); // RE: Run-time error
        // ((Rhombus) shape4).method2(); // RE: Run-time error
        // ((Rhombus) shape5).method2(); // Quadrilateral 2
        // ((Rhombus) shape6).method2(); // RE: Run-time error
        // ((Rhombus) shape7).method2(); // RE: Run-time error

        // // Rhombus all shapes method 3
        // System.err.println("\nRhombus shapes method 3: \n");
        // ((Rhombus) shape1).method3(); // RE: Run-time error
        // ((Rhombus) shape2).method3(); // RE: Run-time error
        // ((Rhombus) shape3).method3(); // RE: Run-time error
        // ((Rhombus) shape4).method3(); // RE: Run-time error
        // ((Rhombus) shape5).method3(); // Quadrilateral 2 \n Rhombus 3
        // ((Rhombus) shape6).method3(); // RE: Run-time error
        // ((Rhombus) shape7).method3(); // RE: Run-time error

        // // Rectangle all shapes method 1
        // System.err.println("\nRectangle all shapes method 1:");
        // ((Rectangle) shape1).method1(); // RE: Run-time error
        // ((Rectangle) shape2).method1(); // RE: Run-time error
        // ((Rectangle) shape3).method1(); // RE: Run-time error
        // ((Rectangle) shape4).method1(); // RE: Run-time error
        // ((Rectangle) shape5).method1(); // RE: Run-time error
        // ((Rectangle) shape6).method1(); // Quadrilateral 1
        // ((Rectangle) shape7).method1(); // Parallelogram 3 \n Quadrilateral 2 \n Quadrilateral 4 \n Square 1 

        // // Rectangle all shapes method 2
        // System.err.println("\nRectangle all shapes method 2:");
        // ((Rectangle) shape1).method2(); // RE: Run-time error
        // ((Rectangle) shape2).method2(); // RE: Run-time error
        // ((Rectangle) shape3).method2(); // RE: Run-time error
        // ((Rectangle) shape4).method2(); // RE: Run-time error
        // ((Rectangle) shape5).method2(); // RE: Run-time error
        // ((Rectangle) shape6).method2(); // Quadrilateral 4 \n Rectangle 2 \n Quadrilateral 4 \n This is Quadrilateral Class
        // ((Rectangle) shape7).method2(); // Quadrilateral 4 \n Rectangle 2 \n Quadrilateral 4 \n This is Quadrilateral Class \n Square 2 \n Parallelogram 3 \n Quadrilateral 2 \n Quadrilateral 4

        // // Rectangle all shapes method 3
        // System.err.println("\nRectangle all shapes method 3:");
        // ((Rectangle) shape1).method3(); // RE: Run-time error
        // ((Rectangle) shape2).method3(); // RE: Run-time error
        // ((Rectangle) shape3).method3(); // RE: Run-time error
        // ((Rectangle) shape4).method3(); // RE: Run-time error
        // ((Rectangle) shape5).method3(); // RE: Run-time error
        // ((Rectangle) shape6).method3(); // Parallelogram 3 \n Quadrilateral 2 \n Quadrilateral 4
        // ((Rectangle) shape7).method3(); // Parallelogram 3 \n Quadrilateral 2 \n Quadrilateral 4

        // // Square all shapes method 1
        // System.err.println("\nSquare all shapes method 1: ");
        // ((Square) shape1).method1(); // RE: Run-time error
        // ((Square) shape2).method1(); // RE: Run-time error
        // ((Square) shape3).method1(); // RE: Run-time error
        // ((Square) shape4).method1(); // RE: Run-time error
        // ((Square) shape5).method1(); // RE: Run-time error
        // ((Square) shape6).method1(); // RE: Run-time error
        // ((Square) shape7).method1(); // Parallelogram 3 \n Quadrilateral 2 \n Quadrilateral 4 \n Square 1   

        // // Square all shapes method 2
        // System.err.println("\nSquare all shapes method 2: ");
        // ((Square) shape1).method2(); // RE: Run-time error
        // ((Square) shape2).method2(); // RE: Run-time error
        // ((Square) shape3).method2(); // RE: Run-time error
        // ((Square) shape4).method2(); // RE: Run-time error
        // ((Square) shape5).method2(); // RE: Run-time error
        // ((Square) shape6).method2(); // RE: Run-time error
        // ((Square) shape7).method2(); // Quadrilateral 4 \n Rectangle 2 \n Quadrilateral 4 \n This is Quadrilateral Class \n Square 2 \n Parallelogram 3 \n Quadrilateral 2 \n Quadrilateral 4

        // // Square all shapes method 3
        // System.err.println("\nSquare all shapes method 3: ");
        // ((Square) shape1).method3(); // RE: Run-time error
        // ((Square) shape2).method3(); // RE: Run-time error
        // ((Square) shape3).method3(); // RE: Run-time error
        // ((Square) shape4).method3(); // RE: Run-time error
        // ((Square) shape5).method3(); // RE: Run-time error
        // ((Square) shape6).method3(); // RE: Run-time error
        // ((Square) shape7).method3(); // Parallelogram 3 \n Quadrilateral 2 \n Quadrilateral 4
    }
} 