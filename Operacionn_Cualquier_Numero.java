import java.util.Scanner;

public class Operacionn_Cualquier_Numero{
    public static void main(String args[]){
        Scanner s=new Scanner (System.in);
                       
        System.out.println("Introducir dos numeros que desea sumar, restar, multiplicar y dividir");
        double num1=s.nextDouble();
        double num2=s.nextDouble();
        
   
        double suma=num1+num2;
        double resta=num1-num2;
        double multiplicacion=num1*num2;
        double division=num1/num2;
        
        System.out.println("El resultado de la suma es "+suma);
        System.out.println("El resultado de la resta es "+resta);
        System.out.println("El resultado de la multiplicación es "+multiplicacion);
        System.out.println("El resultado de la división es "+division);
    }
}
    