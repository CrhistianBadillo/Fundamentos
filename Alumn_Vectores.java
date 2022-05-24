import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Arrays;

public class Alumn_Vectores{
    public static void main(String args[]){
        Random r=new Random();
        int a,num,r1=0,r2=0,r3=0,mayor=0,menor=100;
        String nom,rep="",rep1="",rep2="",alum="",alumen="",todo="Nombre"+  "  U1"+"  U2"+"  U3"+"  Prom\n";
        a=Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos alumnos hay?"));
        
        String Nombre[]=new String[a];
        int calif1[]=new int [a];
        int calif2[]=new int [a];
        int calif3[]=new int [a];
        int prom[]=new int[a];
        
        for (int x=0;x<a;x++){
            nom=JOptionPane.showInputDialog("Nombre del alumno:");
            Nombre[x]=nom;
            
            calif1[x]=r.nextInt(101);
            calif2[x]=r.nextInt(101);
            calif3[x]=r.nextInt(101);
            
            prom[x]=(calif1[x]+calif2[x]+calif3[x])/3;
            
            if(calif1[x]<70){
               r1++; 
               rep+=Nombre[x]+"\n";
            }
            if(calif2[x]<70){
               r2++; 
               rep1+=Nombre[x]+"\n";
            }
            if(calif3[x]<70){
               r3++; 
               rep2+=Nombre[x]+"\n";
            }
            
            if(prom[x]>mayor){
                mayor=prom[x];
                alum=Nombre[x];
            }
            if(prom[x]<menor){
                menor=prom[x];
                alumen=Nombre[x];
            }
            todo+=Nombre[x]+"      "+calif1[x]+"    "+calif2[x]+"    "+calif3[x]+"    "+prom[x]+"\n";
        }

        
        JOptionPane.showMessageDialog(null,todo+"\n"+"El mejor alumno es: "+alum+"  "+mayor+"\n"+"El peor alumno es: "+alumen+"  "+
        menor+"\n"+"\n"+"Alumnos a presentar Unidad I: "+r1+"\n"+rep+"\n"+
        "Alumnos a presentar Unidad II: "+r2+"\n"+rep1+"\n"+"Alumnos a presentar Unidad III: "+r3+"\n"+rep2);
    
        
        
    }
}