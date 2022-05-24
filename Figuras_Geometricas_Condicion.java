import java.util.Scanner;

public class Figuras_Geometricas_Condicion{
    public static void main(String args[]){
        Scanner s=new Scanner (System.in);
         
        double altura,area,base,lado1,lado2,lado3,perimetro,radio,radioch;
        
        System.out.println("¿De cual figura quiere saber su area y perimetro?");
        System.out.println("Seleccione una opcion");
        System.out.println("1.-Cuadrado");
        System.out.println("2.-Triangulo");
        System.out.println("3.-Circulo");
        System.out.println("4.-Rectangulo");
        
        System.out.println("Introduzca su opcion");
        int opc=s.nextInt();
        
        if (opc==1){
            //Dato de entrada
        System.out.println("La figura seleccionada fue un cuadrado");
        System.out.println("Introducir el valor de la base del cuadrado");
        base=s.nextDouble();
        System.out.println("Introducir el valor de la altura del cuadrado");
        altura=s.nextDouble();
        //Operaciones
        area=base*altura;
        perimetro=base*4;
        //Datos de salida
        System.out.println("El area del cuadrado es "+area+" cm cuadrados y el perimetro del cuadrado es "+perimetro+" cm");
       }if (opc==2){
           //Datos de entrada
        System.out.println("La figura seleccionada fue un triangulo");
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
       }if (opc==3){
         //Datos de entrada
        System.out.println("La figura seleccionada fue un circulo");
        System.out.println("Introducir el valor del radio del circulo");
        radio=s.nextDouble();
        //Operaciones
        radioch=radio*radio;
        area=3.1416*radioch;
        perimetro=2*radio*3.1416;
        //Datos de salida
        System.out.println("El area del circulo es "+area+" cm cuadrados y el perimetro del circulo es "+perimetro+" cm");
       }if (opc==4){
           //Datos de entrada
        System.out.println("La figura seleccionada fue un rectangulo");
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
}