import java.util.Scanner;

public class Masa_corporal{
    public static void main(String args[]){
        Scanner s=new Scanner (System.in);
        
        double metros,kilogramos,IMC,metros2;
        
        System.out.println("Para medir la masa corporal se necesita la estatura y peso");
        System.out.println("Introducir la estatura en metros");
        metros=s.nextDouble();
        System.out.println("Introducir el peso en kilogramos");
        kilogramos=s.nextDouble();
        
        metros2=metros*metros;
        IMC=kilogramos/metros2;
        
        System.out.println("Su IMC es de "+IMC);
        
        System.out.println("Bajo peso     <18.5");
        System.out.println("Normal      18.55-24.99");
        System.out.println("Sobrepeso    25.0-29.9");
        System.out.println("Obesidad        >=30");
    }
}
