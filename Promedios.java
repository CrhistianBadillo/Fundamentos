import javax.swing.JOptionPane;
import java.util.Random;

public class Promedios{
    public static void main(String args[]){
    Random r=new Random();
    String Alum,nombres="",toAlumn="",promat="";
    int x,z,mat,totem=0,prom=0,cont=0;
    
    mat=r.nextInt(101);
        
        for(x=1;x<=3;x++){
            Alum=JOptionPane.showInputDialog("Introduce el nombre del Alumno");
            
            for(z=1;z<=4;z++){
                mat=r.nextInt(101);
                if (z==1){
                    JOptionPane.showMessageDialog(null, "La calificacion en Matematicas del alumno es:\n"+mat);
                }
                if (z==2){
                    JOptionPane.showMessageDialog(null, "La calificacion en Fisica del alumno es:\n"+mat);
                }
                if (z==3){
                    JOptionPane.showMessageDialog(null, "La calificacion en Biologia del alumno es:\n"+mat);
                }
                if (z==4){
                    JOptionPane.showMessageDialog(null, "La calificacion en Quimica del alumno es:\n"+mat);
                }
                
                totem+= mat;
            }
            
            totem/=4;
            prom+=totem;
            
            toAlumn+=Alum+", ";
            promat+=totem+", ";
            
            if (totem>=80){
                cont+=+1;
            }
            
           
        
    }
    prom/=3;
    JOptionPane.showMessageDialog(null, "Los nombres de los alumnos son "+toAlumn+"\n"+"El promedio de cada alumno es "+promat+"\n"+"El promedio grupal es de "+prom+"\n"+"El numero de alumnos que sacaron mas de 80: "+cont);
}
}

