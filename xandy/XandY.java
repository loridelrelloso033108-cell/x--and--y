/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xandy;

/**
 *
 * @author RELLOSO_CPE113
 */
public class XandY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
         // Creating at least three EngineeringPoint objects
        EngineeringPoint pointA = new EngineeringPoint(3, 4);
        EngineeringPoint pointB = new EngineeringPoint(9, 12);
        EngineeringPoint pointC = new EngineeringPoint(3, 15); 

       // Pair 1: Sample Test Case
        analyzePoints("Point A", pointA, "Point B", pointB);

       // Pair 2: Undefined Slope Test Case
        analyzePoints("Point A", pointA, "Point C", pointC);

       // Pair 3: Demonstrating setters and a third pair 
        pointC.setX(6);
        pointC.setY(2);
        analyzePoints("Point B", pointB, "Point C (Updated)", pointC);
    }

    
    public static void analyzePoints(String name1, EngineeringPoint p1, String name2, EngineeringPoint p2) {
        System.out.println("===== ENGINEERING DISTANCE AND SLOPE ANALYZER =====");
        System.out.println(name1 + ": (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println(name2 + ": (" + p2.getX() + ", " + p2.getY() + ")");
        
        double distance = p1.calculateDistance(p2);
        System.out.println("Distance: " + distance + " units");

        try {
            double slope = p1.calculateSlope(p2);
            System.out.println("Slope: " + slope);
        } catch (ArithmeticException e) {
            System.out.println("Slope: " + e.getMessage());
        }
        System.out.println();
    }
}
