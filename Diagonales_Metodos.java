
import javax.swing.JOptionPane;
import java.util.Random;

public class Diagonales_Metodos{
    public static int tamMatriz(String n){
        int x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la "+n));
        return x;
    }
    public static int verificarTam(int fila, int columna){
        int x;
        String n1="fila";
        String n2="columna";
        
        if(fila==columna){
                x=1;
        }else{
                JOptionPane.showMessageDialog(null, "Para que el programa pueda continuar \n "+
                "las filas y las columnas tienen que ser iguales(que sea cuadrada)");
                x=0;
        }
        
        return x;
    }
    public static void llenarMatriz(int mat[][], int fila, int columna){
        Random r=new Random();
        for(int x=0;x<fila;x++){
            for(int y=0;y<columna;y++){
                mat[x][y]=r.nextInt(90)+10;
            }
        }
    }
    public static int diagonalPrin(int matriz[][],int fila, int columna){
        int diag=0;
        for(int x=0;x<fila;x++){
            for(int y=0;y<columna;y++){
                if(x==y){
                    diag+=matriz[x][y];
                }
            }
        }
        return diag;
    }
    public static int diagonalInv(int matriz[][],int fila, int columna){
        int diagI=0;
        int rest=(columna-1);
        for(int x=0;x<fila;x++){
            for(int y=0;y<columna;y++){
                if(y==rest){
                    diagI+=matriz[x][y];
                    rest--;
                }
            }
        }
        return diagI;
    }
    public static void concatenar(int mat[][],int fila, int columna,int dp,int di){
        String tabla="",diagprin="",diagInv="";
        int rest=(columna-1);
        for(int x=0;x<fila;x++){
            for(int y=0;y<columna;y++){
                tabla+=mat[x][y]+"     ";
                
                if(x==y){
                    diagprin+=mat[x][y]+",";
                }
                if(y==rest){
                    diagInv+=mat[x][y]+",";
                    rest--;
                }
            }
            tabla+="\n";
        }
        JOptionPane.showMessageDialog(null,tabla+"\nLa diagonal principal es: "+diagprin+"\nLa suma de esta diagonal es: "+dp+
        "\n \n"+"La diagonal inversa es: "+diagInv+"\nLa suma de esta diagonal es: "+di);
    }
    public static void main (String args[]){
        int x=0;
        int fila,columna;
        
        do{
            String n1="fila",n2="columna";
            fila=tamMatriz(n1);
            columna=tamMatriz(n2);
        
            x=verificarTam(fila,columna);
        }while(x==0);
        
        int matriz[][] = new int [fila][columna];
        llenarMatriz(matriz,fila,columna);
        int dp=diagonalPrin(matriz,fila,columna);
        int di=diagonalInv(matriz,fila,columna);
        concatenar(matriz,fila,columna,dp,di);
    }
}