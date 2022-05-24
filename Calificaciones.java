import java.util.Scanner;

public class Calificaciones {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String alumn,maes,grup;
        //Datos de entrada 
        System.out.println("Alumno:");
        alumn=s.nextLine();
        System.out.println("Maestra:");
        maes=s.nextLine();
        System.out.println("Grupo:");
        grup=s.nextLine();
        System.out.println("Materia: Fundamentos de Programación");
        System.out.println("Horario: 7:00-8:00 hrs");
        
        int mapm,examt,examp,ejerc,expo;
        //Dato de entrada de las calificaciones
        System.out.println("Introducir la calificacion obtenida en el mapa mental");
        System.out.println("La calificacion tiene un valor maximo de 100");
        mapm=s.nextInt();
        System.out.println("Introducir la calificacion obtenida en los ejercicios");
        System.out.println("La calificacion tiene un valor maximo de 100");
        ejerc=s.nextInt();
        System.out.println("Introducir la calificacion obtenida en el examen teorico");
        System.out.println("La calificacion tiene un valor maximo de 40");
        examt=s.nextInt();
        System.out.println("Introducir la calificacion obtenida en el examen practico");
        System.out.println("La calificacion tiene un valor maximo de 60");
        examp=s.nextInt();
        System.out.println("Introducir la calificacion obtenida en la exposición");
        System.out.println("La calificacion tiene un valor maximo de 100");
        expo=s.nextInt();
        
        //Operaciones para dar resultado
        double porcmapm,porcejer,porcexamp,porcexamt,exp,califin;
        porcmapm=mapm*10/100;
        porcejer=ejerc*30/100;
        porcexamp=examp*24/60;
        porcexamt=examt*16/40;
        exp=expo*20/100;
        califin=porcmapm+porcejer+porcexamp+porcexamt+exp;
        System.out.println("El porcentaje obtenido en el mapa es "+ porcmapm + "%");
        System.out.println("La calificacion final es de"+ califin);
        
       
        
    }
}
