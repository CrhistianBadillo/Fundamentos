import java.util.Scanner;

public class Atleta{
    public static void main(String args[]){
        Scanner s=new Scanner (System.in);
        
        double km,tiempo;
        //Datos de entrada
        System.out.println("Introduzca los kilometros que recorrera el atleta");
        km=s.nextDouble();
        
        //Operaciones
        tiempo=km*8;
        
        //Datos de salida
        System.out.println("El tiempo que el atleta tardara en recorrer "+km+"km es de "+tiempo+" minutos");
        
    }
}