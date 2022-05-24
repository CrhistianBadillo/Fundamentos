import java.util.Scanner;

public class Longitudes{
    public static void main(String args[]){
        Scanner s=new Scanner (System.in);
        
        double cm,km,mt,mm,miles,pie,pul,yar;
        //Valor de entrada
        System.out.println("El valor de centimentros que quiere convertir es ");
        cm=s.nextDouble();
        
        //Operaciones
        mm=cm*10;
        pul=cm*.393701;
        pie=cm*.0328084;
        yar=cm*.0109361;
        mt=cm*.01;
        km=cm*.00001;
        miles=cm*.00000621371;
        
        //Salida
        System.out.println("El valor de la conversion a milimetros es "+mm);
        System.out.println("El valor de la conversion a pulgadas es "+pul);
        System.out.println("El valor de la conversion a pies es "+pie);
        System.out.println("El valor de la conversion a yardas es "+yar);
        System.out.println("El valor de la conversion a metros es "+mt);
        System.out.println("El valor de la conversion a kilometros es "+km);
        System.out.println("El valor de la conversion a millas es "+miles);
      
        
    }
}