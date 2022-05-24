import java.util.Scanner;

public class Figuras_Geometricas{
    public static void main(String args[]){
        Scanner s=new Scanner (System.in);
        
        double base,altura,area,lado1,lado2,lado3,perimetro,radio,radioch;
        
        //Dato de entrada
        System.out.println("Introducir el valor de la base del cuadrado");
        base=s.nextDouble();
        System.out.println("Introducir el valor de la altura del cuadrado");
        altura=s.nextDouble();
        //Operaciones
        area=base*altura;
        perimetro=base*4;
        //Datos de salida
        System.out.println("El area del cuadrado es "+area+" cm cuadrados y el perimetro del cuadrado es "+perimetro+" cm");
        
        //Datos de entrada
        System.out.println("Introducir el valor de la base del triangulo");
        base=s.nextDouble();
        System.out.println("Introducir el valor de la altura del triangulo");
        altura=s.nextDouble();
        System.out.println("Introducir el valor del lado1 del trinagulo");
        lado1=s.nextDouble();
        System.out.println("Introducir el valor del lado2 del trinagulo");
        lado2=s.nextDouble();
        System.out.println("Introducir el valor del lado3 del trinagulo");
        lado3=s.nextDouble();
        //Operaciones
        area=base*altura/2;
        perimetro=lado1+lado2+lado3;
        //Datos de salida
        System.out.println("El area del triangulo es "+area+" cm cuadrados y el perimetro del trinagulo es "+perimetro+" cm");
        
        //Datos de entrada
        System.out.println("Introducir el valor del radio del circulo");
        radio=s.nextDouble();
        //Operaciones
        radioch=radio*radio;
        area=3.1416*radioch;
        perimetro=2*radio*3.1416;
        //Datos de salida
        System.out.println("El area del circulo es "+area+" cm cuadrados y el perimetro del circulo es "+perimetro+" cm");
        
        //Datos de entrada
        System.out.println("Introducir el valor de la base del rectangulo");
        base=s.nextDouble();
        System.out.println("Introducir el valor de la altura del rectangulo");
        altura=s.nextDouble();
        //Operaciones
        area=base*altura;
        perimetro=2*altura+2*base;
        //Datos de salida
        System.out.println("El area del rectangulo es "+area+" cm cuadrados y el perimetro del rectangulo es "+perimetro+" cm");
        
    }
}
