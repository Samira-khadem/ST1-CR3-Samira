package Samira;

public class Main4 {


    static void calculateAreaPer(double side) {
        /*Create a solution for the following problem: given a width of a square (image
        below, right side), calculate the squareArea (on image below 16
                cm²)  and the squarePerimeter*/
        double area = side * side;
        double perimeter = 4 * side;
        System.out.println("The area of the square is " + area +"square cm" );
        System.out.println("The perimeter of the square is " + perimeter + " cm");

    }
    //Demonstrate solutions from point 3 and 4 with several method calls (at least 3 for each) with different arguments.

    public static void main(String[] args) {
        calculateAreaPer(4 );
        calculateAreaPer(10 );
        calculateAreaPer(6 );
        calculateAreaPer(15 );

    }
}
