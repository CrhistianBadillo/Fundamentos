import java.util.Scanner;

public class Convertidor_Masa{
    public static void main(String args[]){
        Scanner s=new Scanner (System.in);
        
       
        double lb,kgs,gr,kg;
        
        System.out.println("Introducir la cantidad de gramos que se desea convertir a kilogramos");
        gr=s.nextDouble();
        kg=gr/1000;
        System.out.println("La cantidad dada es igual a "+kg+" kg");
        System.out.println("Introducir la cantidad de kilogramos que desea convertir a gramos");
        kg=s.nextDouble();
        gr=kg*1000;
        System.out.println("La cantidad dada es igual a "+gr+" gr");
        System.out.println("Introducir la cantidad de kilogramos que desea convertir a libras");
        kg=s.nextDouble();
        lb=kg*2.20462;
        System.out.println("La cantidad dada es igual a "+lb+" kg");
        System.out.println("Introducir la cantidad de libras que desea convertir a kilogramos");
        lb=s.nextDouble();
        kgs=lb*.453592;
        System.out.println("La cantidad dada es igual a "+kgs+" kg");
        
    }
}