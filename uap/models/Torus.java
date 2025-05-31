package uap.models;

import uap.bases.BangunRuang;

public class Torus extends BangunRuang {
    private double majorRadius; // R
    private double minorRadius; // r
    
    public Torus(double majorRadius, double minorRadius) {
        super();
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
        setName("Torus");
    }
    
    @Override
    public double getVolume() {
        return 2 * PI * PI * majorRadius * minorRadius * THICKNESS;
    }
    
    @Override
    public double getSurfaceArea() {
        return 4 * PI * PI * majorRadius * minorRadius;
    }
    
    @Override
    public void printInfo() {
        System.out.println("==========================================");
        System.out.println("Donat dengan lubang");
        System.out.println("==========================================");
        System.out.println("Volume          : " + String.format("%.2f", getVolume()) + " cm³");
        System.out.println("Luas permukaan  : " + String.format("%.2f", getSurfaceArea()) + " cm²");
        System.out.println("Massa           : " + String.format("%.2f", getMass()) + " g");
        System.out.println("Massa dalam kg  : " + String.format("%.2f", gramToKilogram()) + " kg");
        System.out.println("Biaya kirim     : Rp " + String.format("%,.2f", calculateCost()));
        System.out.println("==========================================\n");
    }
} 