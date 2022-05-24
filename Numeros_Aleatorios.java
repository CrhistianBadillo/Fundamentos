import java.util.Random; 
import java.util.Scanner;

public class Numeros_Aleatorios{
    public static void main(String args[]){
        Random r=new Random();
        Scanner s=new Scanner (System.in);
        int nran;
        
        nran=r.nextInt(1001);
        
        System.out.println("El numero generado es"+nran);
        
        
    }
}