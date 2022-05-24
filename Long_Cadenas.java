import java.util.Scanner;

public class Long_Cadenas{
    public static void main(String args[]){
        Scanner s=new Scanner (System.in);
        
        String cadena;
        int longitud;
        
        System.out.println("Introduzca la cadena para saber su longitud");
        cadena=s.nextLine();
        longitud=cadena.length();
        
        System.out.println("La longitud de la cadena es "+longitud);
    }
}