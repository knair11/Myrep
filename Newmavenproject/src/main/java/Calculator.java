class Calculator {

    // Part 1: Average of three numbers (int)
    double average(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    // Part 1: Average of three numbers (float)
    double average(float a, float b, float c) {
        return (a + b + c) / 3.0;
    }

    // Part 2: Area of a circle
    double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Part 2: Area of a rectangle
    double area(double length, double breadth) {
        return length * breadth;
    }

    // Part 2: Area of a square
    double area(int side) {
        return side * side;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Averages
        System.out.println("Average of integers: " + calc.average(10, 20, 30));
        System.out.println("Average of floats: " + calc.average(10.5f, 20.3f, 30.2f));

        // Areas
        System.out.println("Area of circle (r=5): " + calc.area(5.0));
        System.out.println("Area of rectangle (5x4): " + calc.area(5.0, 4.0));
        System.out.println("Area of square (side=6): " + calc.area(6));
    }
}
