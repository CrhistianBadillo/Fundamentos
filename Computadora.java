import java.util.Scanner;

public class Computadora{
    public static void main(String args[]){
        Scanner s=new Scanner (System.in);
        
        double preciocomp,descuento,preciocompD,totalpago;
        
        //Ingreso de datos
        System.out.println("Ingresar el precio de la computadora");
        preciocomp=s.nextDouble();
        
        //Operaciones
        descuento=preciocomp*.25;
        preciocompD=preciocomp-descuento;
        totalpago=preciocompD*1.16;
        
        //Salida
        System.out.println("El descuento sera de $"+descuento);
        System.out.println("El precio de la computadora con descuento sera de $"+preciocompD);
        System.out.println("El valor total a pagar sera de $"+totalpago);
        
        
    }
}