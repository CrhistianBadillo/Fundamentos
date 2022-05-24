import java.util.Scanner;

public class Convertidor_Moneda{
    public static void main(String args[]){
    Scanner s=new Scanner (System.in);
    
    double pesos,dolares,libraesterlina;
    
    System.out.println("Introducir el valor de pesos que quiera convertir a dolares");
    pesos=s.nextDouble();
    dolares=pesos*.051;
    System.out.println("El valor introducido es igual a "+dolares+" dolares");
    System.out.println("Introducir el valor de dolares que quiera convertir a pesos");
    dolares=s.nextDouble();
    pesos=dolares*19.41;
    System.out.println("El valor introducido es igual a "+pesos+" pesos");
    System.out.println("Introducir el valor de dolares que quiera convertir a libra esterlina");
    dolares=s.nextDouble();
    libraesterlina=dolares*1.29;
    System.out.println("El valor introducido es igual a "+libraesterlina+" libras esterlinas");
    System.out.println("Introducir el valor de libras esterlinas que quiera convertir a dolares");
    libraesterlina=s.nextDouble();
    dolares=libraesterlina*.78;
    System.out.println("El valor introducido es igual a "+dolares+" dolares");
    System.out.println("Los valores pueden cambiar cada dia ya que el valor de las monedas no es estable");
    
    }
}
