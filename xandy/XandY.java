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
        EngineeringPoint pointA = new EngineeringPoint(3, 4);
        EngineeringPoint pointB = new EngineeringPoint(9, 12);
        EngineeringPoint pointC = new EngineeringPoint(3, 15);

        analyzePoints("Point A", pointA, "Point B", pointB);

        analyzePoints("Point A", pointA, "Point C", pointC);

        pointC.setX(6);
        pointC.setY(2);
        analyzePoints("Point B", pointB, "Point C (Updated)", pointC);
    }

    public static void analyzePoints(String name1, EngineeringPoint p1, String name2, EngineeringPoint p2) {
        System.out.println("===== ENGINEERING DISTANCE AND SLOPE ANALYZER =====");
        System.out.printf("%s: (%.2f, %.2f)%n", name1, p1.getX(), p1.getY());
        System.out.printf("%s: (%.2f, %.2f)%n", name2, p2.getX(), p2.getY());

        double distance = p1.calculateDistance(p2);
        System.out.printf("Distance: %.2f units%n", distance);

        try {
            double slope = p1.calculateSlope(p2);
            System.out.printf("Slope: %.2f%n", slope);
        } catch (ArithmeticException e) {
            System.out.println("Slope: " + e.getMessage());
        }
        System.out.println();
    }
}
