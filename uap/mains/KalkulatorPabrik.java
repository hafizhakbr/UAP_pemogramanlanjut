package uap.mains;

import java.util.Scanner;
import uap.models.Torus;
import uap.models.Sphere;

public class KalkulatorPabrik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("==========================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("NAMA LENGKAP : Hafiz Waliyuddin Akbar");
        System.out.println("NIM         : 245150707111010");
        System.out.println("==========================================");
        
        try {
            System.out.println("\nDonat dengan lubang");
            System.out.println("==========================================");
            System.out.print("Isikan Radius : ");
            double majorRadius = Double.parseDouble(scanner.nextLine().trim());
            System.out.print("Isikan radius : ");
            double minorRadius = Double.parseDouble(scanner.nextLine().trim());
            
            Torus donutDenganLubang = new Torus(majorRadius, minorRadius);
            donutDenganLubang.printInfo();
            
            System.out.println("\nDonat tanpa lubang");
            System.out.println("==========================================");
            System.out.print("Isikan radius : ");
            double radius = Double.parseDouble(scanner.nextLine().trim());
            
            Sphere donutTanpaLubang = new Sphere(radius);
            donutTanpaLubang.printInfo();
            
        } catch (NumberFormatException e) {
            System.out.println("Error: Mohon masukkan angka yang valid");
        } finally {
            scanner.close();
        }
    }
} 
