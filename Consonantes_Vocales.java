import javax.swing.JOptionPane;
import java.util.Scanner;

public class Consonantes_Vocales{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int x=1,y=0,voc=0,cons,lon,a=0,e=0,i=0,o=0,u=0,vocx=0,voca;
        String cade,scade,palabra="";
        
        cade=JOptionPane.showInputDialog("Inserte cualquier palabra o texto(cadena)").toUpperCase();
        lon=cade.length();
        
        while (x<=lon){
            scade=cade.substring(y,y+1);
            palabra=palabra+scade+"\n";
            
            if ((cade.charAt(y)=='A')||(cade.charAt(y)=='E')||(cade.charAt(y)=='I')||(cade.charAt(y)=='O')||(cade.charAt(y)=='U')){
                voc+=1;
            }
            if ((cade.charAt(y)=='Á')||(cade.charAt(y)=='É')||(cade.charAt(y)=='Í')||(cade.charAt(y)=='Ó')||(cade.charAt(y)=='Ú')){
                vocx+=1;
            }
            if ((cade.charAt(y)=='A')||(cade.charAt(y)=='Á')){
                a+=1;
            }
            if ((cade.charAt(y)=='E')||(cade.charAt(y)=='É')){
                e+=1;
            }
            if ((cade.charAt(y)=='I')||(cade.charAt(y)=='Í')){
                i+=1;
            }
            if ((cade.charAt(y)=='O')||(cade.charAt(y)=='Ó')){
                o+=1;
            }
            if ((cade.charAt(y)=='U')||(cade.charAt(y)=='Ú')){
                u+=1;
            }
            y=y+1;
            x=x+1;
        }
        voca=voc+vocx;
        cons=lon-voca;
        JOptionPane.showMessageDialog( null, "Usted introdujo la palabra o el texto(cadena): "+cade+" la cual tiene una longitud de "+lon+"\n"+
        "La palabra o el texto que introdujo tiene: "+voca+" vocales"+"\n"+"La palabra o el texto que introdujo tiene: "+cons+" consonantes");
        
        
	
    }
    
    
	
}