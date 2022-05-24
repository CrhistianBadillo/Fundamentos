import javax.swing.JOptionPane;

public class Tablas_Multiplicacion{
    public static void main(String args[]){
        String num,tabla="";
        int x,mult;
        num=JOptionPane.showInputDialog("Introduce el numero del cual quieras saber su tabla de multiplicar:");
        int n=Integer.parseInt(num);
        
        for ( x=1; x<=10; x++){
            mult=n*x;
          
            tabla=tabla+"\n"+n+"x"+x+"="+mult;
        }
        JOptionPane.showMessageDialog(null,tabla);
    }
}