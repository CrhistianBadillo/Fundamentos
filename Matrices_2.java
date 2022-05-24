import javax.swing.JOptionPane;
import java.util.Random;

public class Matrices_2{
    public static void main(String args[]){
        Random r=new Random();
        int col,fila,num;
        
        col=Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas columnas tendra tu columna?"));
        fila=Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas filas tendra tu columna?"));
        
        int numeros[][] = new int [fila][col];
        String todo="";
        
        for(int x=0;x<fila;x++){
            for(int z=0;z<col;z++){
                if((z%2)==0){
                    do{
                        num=r.nextInt(101);
                        numeros[x][z]=num;
                    }while((num%2)!=0);
                }else {
                    do{
                        num=r.nextInt(101);
                        numeros[x][z]=num;
                    }while((num%2)==0);
                }
                
                todo+=numeros[x][z]+"    ";
                
            }
            todo+="\n";
        }
        
        JOptionPane.showMessageDialog(null,todo+"\n La matriz toma la columna 0 como par, esta matriz acomoda los numeros pares en columnas pares"+
        " y los numeros impares en columnas impares");
    }
}