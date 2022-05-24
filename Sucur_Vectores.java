import javax.swing.JOptionPane;
import java.util.Random;

public class Sucur_Vectores{
    public static void main(String args[]){
        Random r=new Random();
        String concen="Mes"+"        "+"Sucursal 1"+"      "+"Sucursal 2"+"      "+"Sucursal 3"+"   "+"Total Mes"+"\n"; 
        int totsuc1=0,totsuc2=0,totsuc3=0;
        
        String Meses[] = {"Ene","Feb","Mar","Abr","May","Jun","Jul","Ago","Sep","Oct","Nov","Dic"};
        String Sucursal[]={"Sucursal #1","Sucursal #2","Sucursal #3"};
        int Sucursal1[]=new int[12];
        int Sucursal2[]=new int[12];
        int Sucursal3[]=new int[12];
        int TotMes[]=new int[12];
        int TotSuc[]=new int[3];
        
        //Procesos
        for(int x=0;x<12;x++){
            Sucursal1[x]=r.nextInt(2001);
            Sucursal2[x]=r.nextInt(2001);
            Sucursal3[x]=r.nextInt(2001);
            TotMes[x]=Sucursal1[x]+Sucursal2[x]+Sucursal3[x];
            
            totsuc1+=Sucursal1[x];
            totsuc2+=Sucursal2[x];
            totsuc3+=Sucursal3[x];
            
            concen+=Meses[x]+"          $"+Sucursal1[x]+"                    $"+Sucursal2[x]+
            "                $"+Sucursal3[x]+"                $"+TotMes[x]+"\n";
        }
        
        //Mejor y peor mes
        int menormes=TotMes[0],mayormes=TotMes[0];
        String mayorm=Meses[0],menorm=Meses[0];
        for(int x=1;x<12;x++){
            if(TotMes[x]>mayormes){
                mayormes=TotMes[x];
                mayorm=Meses[x];
            }
            if(TotMes[x]<menormes){
                menormes=TotMes[x];
                menorm=Meses[x];
            }
        }    
        
        //Mejor y peor sucursal
        TotSuc[0]=totsuc1;
        TotSuc[1]=totsuc2;
        TotSuc[2]=totsuc3;
        int smay=TotSuc[0],smen=TotSuc[0];
        String sma=Sucursal[0],sme=Sucursal[0];
        for(int x=1;x<3;x++){
            if(TotSuc[x]>smay){
                smay=TotSuc[x];
                sma=Sucursal[x];
            }
            if(TotSuc[x]<smen){
                smen=TotSuc[x];
                sme=Sucursal[x];
            }
        }
        
        JOptionPane.showMessageDialog(null, concen+"\n"+"El mejor mes fue: "+mayorm+"  $"+mayormes+"\n"+
        "El peor mes fue: "+menorm+"  $"+menormes);
        JOptionPane.showMessageDialog(null, "Total Sucursal 1: $ "+totsuc1+
        "\n"+"Total Sucursal 2: $ "+totsuc2+"\n"+"Total Sucursal 3: $ "+
        totsuc3+"\n"+"\n"+"La mejor sucursal es la: "+sma+"     "+smay+"\n"+"La peor sucursal es la: "+sme+"     "+smen);
    }
}
