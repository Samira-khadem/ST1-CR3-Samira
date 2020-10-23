package Samira;

public class Main {
    /*Create this solution with the usage of a new Java method calculateRectArea, that
    returns a computed value.  Call this method with two different sets of
    arguments*/

    static double calculateRectArea( double height, double width) {
        return height * width;


}
//Demonstrate solutions from point 3 and 4 with several method calls (at least 3 for each) with different arguments.

    public static void main(String[] args) {
        System.out.println("The area of the rectangular is " + calculateRectArea(20, 30 )+ "square cm");
        System.out.println("The area of the rectangular is " + calculateRectArea(40,50 )+ "square cm");
        System.out.println("The area of the rectangular is " + calculateRectArea(15,20 )+ "square cm");
        System.out.println("The area of the rectangular is " + calculateRectArea( 40,70 )+ "square cm");
        System.out.println("The area of the rectangular is " + calculateRectArea( 35,45 )+ "square cm");

    }
}
