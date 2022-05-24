import java.util.Scanner;

public class Conversion_Tiempo{
    public static void main(String args[]){
        Scanner s=new Scanner (System.in);
        
        
        double hora,min,seg;
        //Datos de entrada
        System.out.println("Ingresa las horas que quieres convertir a minutos y segundos");
        hora=s.nextDouble();
        
        //Operaciones
        min=hora*60;
        seg=hora*3600;
        
        //Dato de salida
        System.out.println("La hora ingresada es equivalente a "+min+" minutos y a "+seg+" segundos");
    }
}

