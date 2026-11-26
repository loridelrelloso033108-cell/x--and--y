/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xandy;

/**
 *
 * @author RELLOSO_CPE113
 */
public class EngineeringPoint {

    private double x;
    private double y;

    public EngineeringPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double calculateDistance(EngineeringPoint point) {
        double deltaX = point.getX() - this.x;
        double deltaY = point.getY() - this.y;
        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }

    public double calculateSlope(EngineeringPoint point) {
        double deltaX = point.getX() - this.x;
        if (deltaX == 0) {
            throw new ArithmeticException("Undefined (vertical line: x-coordinates are equal)");
        }
        double deltaY = point.getY() - this.y;
        return deltaY / deltaX;
    }
}
