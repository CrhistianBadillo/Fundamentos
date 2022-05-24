import java.util.Scanner;

public class A_Mayor_B_y_C{
    public static void main(String args[]){
        Scanner s=new Scanner (System.in);
        
        int a,b,c;
        
        //Datos de entrada
        System.out.println("Dar el valor de a");
        a=s.nextInt();
        System.out.println("Dar el valor de b");
        b=s.nextInt();
        System.out.println("Dar el valor de c");
        c=s.nextInt();
        
        if (a>b && a>c){
        System.out.println("El numero dado es correcto");
    }else{
        System.out.println("El numero dado es incorrecto");
    }
        
      
    }
}