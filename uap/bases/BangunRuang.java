package uap.bases;

import uap.interfaces.*;

public abstract class BangunRuang extends Shape 
    implements ThreeDimensional, PiRequired, MassCalculable, ShippingCostCalculator, MassConverter {
    
    public BangunRuang() {
        super();
    }
    
    @Override
    public double getMass() {
        return DENSITY * getVolume() * THICKNESS;
    }
    
    @Override
    public double gramToKilogram() {
        return getMass() / DENOMINATOR;
    }
    
    @Override
    public double calculateCost() {
        double massInKg = gramToKilogram();
        return Math.ceil(massInKg) * PRICE_PER_KG;
    }
    
    @Override
    public double getSurfaceArea() {
        return 0.0;
    }
    
    @Override
    public double getVolume() {
        return 0.0;
    }
} 