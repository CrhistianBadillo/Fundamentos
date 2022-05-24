import javax.swing.JOptionPane;

public class Palb_Palindromo{
    public static void main(String args[]){
        int longi;
        
        String cadena,cadenainv="";
        cadena=JOptionPane.showInputDialog("Introducir la palabra,la cual quiere saber si es un palindromo").toUpperCase();
        longi=cadena.length();
        
        for(int x=longi-1; x>=0; x--){
            cadenainv=cadenainv+cadena.charAt(x);
        }
        
        if(cadena.equals(cadenainv)){
            JOptionPane.showMessageDialog(null, "La palabra dada es un palindromo");
        }else{
            JOptionPane.showMessageDialog(null, "La palabra dada no es un palindromo");
        }
        
        
    }
}
