package uap.models;

import uap.bases.BangunRuang;

public class Sphere extends BangunRuang {
    private double radius;
    
    public Sphere(double radius) {
        super();
        this.radius = radius;
        setName("Sphere");
    }
    
    @Override
    public double getVolume() {
        return (4.0/3.0) * PI * Math.pow(radius, 3) * THICKNESS;
    }
    
    @Override
    public double getSurfaceArea() {
        return 4 * PI * Math.pow(radius, 2);
    }
    
    @Override
    public void printInfo() {
        System.out.println("==========================================");
        System.out.println("Donat tanpa lubang");
        System.out.println("==========================================");
        System.out.println("Volume          : " + String.format("%.2f", getVolume()) + " cm³");
        System.out.println("Luas permukaan  : " + String.format("%.2f", getSurfaceArea()) + " cm²");
        System.out.println("Massa           : " + String.format("%.2f", getMass()) + " g");
        System.out.println("Massa dalam kg  : " + String.format("%.2f", gramToKilogram()) + " kg");
        System.out.println("Biaya kirim     : Rp " + String.format("%,.2f", calculateCost()));
        System.out.println("==========================================");
    }
} 