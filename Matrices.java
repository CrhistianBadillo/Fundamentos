import javax.swing.JOptionPane;
import java.util.Random;

public class Matrices{
    public static void maid(String args[]){
        Random r= new Random();
        int num,tam,col,fila;
        
        do{
        col=Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas columnas tendra tu columna?"));
        fila=Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas filas tendra tu columna?"));
        
        if(col!=fila){
            JOptionPane.showMessageDialog(null,"Los numeros dados para la matriz son incorrectos, introduzca nuevos numeros");
        }
        
    }while(col!=fila);
    
    JOptionPane.showMessageDialog(null,"Los numeros dados para la matriz son correctos");
    
    //fila va primero
    int numeros [][]= new int [fila][col];
    int resta=(col-1);
    
    //Llenado de matriz
    for (int x=0;x<fila;x++){
          for (int z=0;z<col;z++){
          numeros[x][z]=r.nextInt(101);
          
        }
    }
    
    //impresion de matriz
    String todo="", diag="", diagS="";
    int diagos=0,diagSs=0;
      for (int x=0;x<fila;x++){
          for (int z=0;z<col;z++){
          todo+=numeros [x][z];
          todo+="   ";
          
          if(x==z){
              diag+=numeros [x][z];
              diagos+=numeros [x][z];
              diag+=", ";
            }
           
          if(z==resta){
               diagS+=numeros[x][z];
               diagS+=", ";
               diagSs+=numeros[x][z];
               resta--;
                                       }
        }
          todo+="\n";
    }
    
    JOptionPane.showMessageDialog(null, todo+"\n"+"Los numeros que estan en la diagonal principal es: "+diag+"\nLa suma de estos numero es: "+diagos+
    "\nLos numero que estan en la diagonal inversa es: "+diagS+"\nLa suma de estos numeros es: "+diagSs);
    
    
    }
}
