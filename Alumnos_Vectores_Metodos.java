import javax.swing.JOptionPane;
import java.util.Random;
public class Alumnos_Vectores_Metodos{
    public static int nAlum(){
        int x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de alumnos"));
        return x;
    }
    public static void llenarVector(String Alumnos[],int a[],int b[],int c[],int d[],int e[]){
        Random r=new Random();
        for(int z=0;z<Alumnos.length;z++){
            Alumnos[z]=JOptionPane.showInputDialog("Ingrese nombre del alumno");
            a[z]=r.nextInt(101);
            b[z]=r.nextInt(101);
            c[z]=r.nextInt(101);
            d[z]=r.nextInt(101);
            e[z]=r.nextInt(101);
        }
    }
    public static String verificarRepeticion(int a[],String Alumnos[]){
        int r=0;
        String repn="",rep="";
        for(int x=0;x<a.length;x++){
            if(a[x]<70){
               r++; 
               repn+=Alumnos[x]+"\n";
            }
            
        }
        rep+=r+"\n"+repn;
        return rep;
    }
    public static void obtenerPromedio(double p[],int a[],int b[],int c[],int d[],int e[]){
        for(int x=0;x<a.length;x++){
            p[x]=(a[x]+b[x]+c[x]+d[x]+e[x])/5;
        }
    }
    public static void verificarBeca(String bc[], double p[]){
        for(int x=0;x<p.length;x++){
            if(p[x]>=80){
                bc[x]="Si";
            }else {
                bc[x]="NO";
            }
        }
        
    }
    public static String repes(String a,String b,String c,String d,String e){
        String repes="Alumnos a repetir Unidad I: "+a+"\nAlumnos a repetir Unidad II: "+b+"\nAlumnos a repetir Unidad III: "+c+
        "\nAlumnos a repetir Unidad IV: "+d+"\nAlumnos a repetir Unidad V: "+e;
        
        return repes;
    }
    public static String determinarMejor(double p[], String Alumnos[]){
        double mejor=p[0];
        String mejo=Alumnos[0], mejorAlumno;
        for(int x=0;x<p.length;x++){
            if(p[x]>mejor){
                mejor=p[x];
                mejo=Alumnos[x];
            }
        }
        mejorAlumno="El mejor alumno es: "+mejo+" con un promdedio de: "+mejor;
        
        return mejorAlumno;
    }
    public static String determinarPeor(double p[], String Alumnos[]){
        double peor=p[0];
        String peo=Alumnos[0], peorAlumno;
        for(int x=0;x<p.length;x++){
            if(p[x]<peor){
                peor=p[x];
                peo=Alumnos[x];
            }
        }
        peorAlumno="El peor alumno es: "+peo+" con un promdedio de: "+peor;
        
        return peorAlumno;
    }
    public static void imprimir(String A[],int a[],int b[],int c[],int d[],int e[],double p[],String bc[],String r,String mA,String pA){
        String todo="";
        for(int x=0;x<A.length;x++){
            todo+=A[x]+"       "+a[x]+"      "+b[x]+"      "+c[x]+"      "+d[x]+"      "+e[x]+"      "+p[x]+"      "+
            bc[x]+"\n";
        }
        JOptionPane.showMessageDialog(null, "Alumno    U1    U2    U3    U4    U5    Prom    Beca\n"+todo+"\n"+r+"\n"+mA+"\n"+pA);
    }
    public static void main(String args[]){
        int n=nAlum();
        String Alumnos[]=new String[n];
        int cal1[]=new int[n];
        int cal2[]=new int[n];
        int cal3[]=new int[n];
        int cal4[]=new int[n];
        int cal5[]=new int[n];
        double prom[]=new double[n];
        String beca[]=new String[n];
        
        llenarVector(Alumnos,cal1,cal2,cal3,cal4,cal5);
        String rep1=verificarRepeticion(cal1,Alumnos);
        String rep2=verificarRepeticion(cal2,Alumnos);
        String rep3=verificarRepeticion(cal3,Alumnos);
        String rep4=verificarRepeticion(cal4,Alumnos);
        String rep5=verificarRepeticion(cal5,Alumnos);
        obtenerPromedio(prom,cal1,cal2,cal3,cal4,cal5);
        verificarBeca(beca,prom);
        String repe=repes(rep1,rep2,rep3,rep4,rep5);
        String mejor=determinarMejor(prom,Alumnos);
        String peor=determinarPeor(prom,Alumnos);
        imprimir(Alumnos,cal1,cal2,cal3,cal4,cal5,prom,beca,repe,mejor,peor);
    }
    
}
