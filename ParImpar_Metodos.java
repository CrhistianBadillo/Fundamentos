import javax.swing.JOptionPane;
import java.util.Random;
public class ParImpar_Metodos{
    public static int tamañoMatriz(String n){
        int x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero de la "+n));
        return x;
    }
    public static void llenarMatriz(int matriz[][],int nfil,int ncol){
        Random r=new Random();
        int al;
        for(int x=0;x<nfil;x++){
            for(int z=0;z<ncol;z++){
                if((z%2)==0){
                    do{
                        al=r.nextInt(90)+10;
                        matriz[x][z]=al;
                    }while((al%2)!=0);
                }else {
                    do{
                        al=r.nextInt(90)+10;
                        matriz[x][z]=al;
                    }while((al%2)==0);
                }
            }
        }
    }
    public static void concatenar(int matriz[][],int nfil,int ncol){
        String todo="";
        for(int x=0;x<nfil;x++){
            for(int z=0;z<ncol;z++){
                todo+=matriz[x][z]+"     ";
            }
            todo+="\n";
        }
        JOptionPane.showMessageDialog(null, "Matriz:\nDatos pares en columnas pares \n Datos impares en columnas impares \n"+todo);
    }
    public static void main(String args[]){
        String n1="fila";
        String n2="columna";
        int fila=tamañoMatriz(n1);
        int columna=tamañoMatriz(n2);
        int matriz[][]=new int[fila][columna];
        llenarMatriz(matriz,fila,columna);
        concatenar(matriz,fila,columna);
    }
}


