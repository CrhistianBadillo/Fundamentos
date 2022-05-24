import javax.swing.JOptionPane;
import java.util.Random;

public class Alumnos_Metodos{
    public static int numAlum(){
        int x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de alumnos"));
        return x;
    }public static String pedirNom(){
        String a=JOptionPane.showInputDialog("Nombre del alumno:");
        return a;
    }
    public static int generarCalif(){
        Random r=new Random();
        int x=r.nextInt(101);
        return x;
    }
    public static int calcularProm(int a,int b,int c,int d,int e){
        int p=(a+b+c+d+e)/5;
        return p;
    }
    public static String deterBeca(int p){
        String beca="";
        if(p>=80){
            beca="SI";
        }else {
            beca="NO";
        }
        return beca;
    }
    public static String concatenar(String n,int a,int b,int c,int d,int e,int p,String beca){
        String todo="";
        
        todo+=n+"    "+a+"    "+b+"    "+c+"    "+d+"    "+e+"    "+p+"    "+beca+"\n";
        return todo;
    }
    public static void imprimir(String todo){
        JOptionPane.showMessageDialog(null, todo);
    }
    public static void main(String args[]){
        int n=numAlum();
        String nom;
        int calif1,calif2,calif3,calif4,calif5;
        int prom;
        String beca;
        String todo="Alumno  Unidad1  U2  U3  U4  U5   Prom   Beca\n";
        for(int x=1;x<=n;x++){
            nom=pedirNom();
            calif1=generarCalif();
            calif2=generarCalif();
            calif3=generarCalif();
            calif4=generarCalif();
            calif5=generarCalif();
            prom=calcularProm(calif1,calif2,calif3,calif4,calif5);
            beca=deterBeca(prom);
            todo+=concatenar(nom,calif1,calif2,calif3,calif4,calif5,prom,beca);
        }
        imprimir(todo);
    }
}