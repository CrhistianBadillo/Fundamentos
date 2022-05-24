import javax.swing.JOptionPane;
import java.util.Random;

public class Sucur_Metodos{
    public static void llenarVector(int a[],int b[],int c[],int tM[]){
        Random r=new Random();
        for(int x=0;x<12;x++){
            a[x]=r.nextInt(1001);
            b[x]=r.nextInt(1001);
            c[x]=r.nextInt(1001);
            tM[x]=a[x]+b[x]+c[x];
            
        }
    }
    public static int totalSuc(int a[]){
        int tS=0,t;
        for(int x=0;x<12;x++){
            tS+=a[x];
        }
        t=tS;
        return t;
    }
    public static void llenadoTotSuc(int tSc[], int a, int b, int c){
        for(int x=0;x<3;x++){
           if(x==0){
               tSc[x]=a;
           }else if(x==1){
               tSc[x]=b;
           }else if(x==2){
               tSc[x]=c;
           }
        }
    }
    public static String deterMejorPeorMes(int TotMes[],String Meses[]){
        String MejorPeor;
        int menormes=TotMes[0],mayormes=TotMes[0];
        String mayorm=Meses[0];
        String menorm=Meses[0];
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
        MejorPeor="El mejor mes fue: "+mayorm+" con $"+mayormes+"\nEl peor mes fue: "+menorm+" con $"+menormes;
        return MejorPeor;
    }
    public static String concenTotalSuc(int a,int b, int c){
        String conc="Total de la sucursal 1: $"+a+"\nTotal de la sucursal 2: $"+b+"\nTotal de la sucursal 3: $"+c;
        
        return conc;
    }
    public static String deterMejorPeorSucur(int TotSuc[],String Sucursal[]){
        int smay=TotSuc[0],smen=TotSuc[0];
        String sma=Sucursal[0],sme=Sucursal[0],MejorPeorSc;
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
        MejorPeorSc="La mejor sucursal fue: "+sma+" con $"+smay+"\nLa peor sucursal fue "+sme+" con $"+smen;
        return MejorPeorSc;
    }
    public static void imprimir(String m[],int a[],int b[],int c[],int tM[],String MP,String conc,String MPS){
        String tabla="Mes"+"        "+"Sucursal 1"+"      "+"Sucursal 2"+"      "+"Sucursal 3"+"   "+"Total Mes"+"\n"; 
        for(int x=0;x<12;x++){
            tabla+=m[x]+"              $"+a[x]+"                    $"+b[x]+"                 $"+c[x]+
            "             $"+tM[x]+"\n";
        }
        JOptionPane.showMessageDialog(null, tabla+"\n"+MP+"\n \n"+conc+"\n \n"+MPS);
    }
    public static void main(String args[]){
        String Meses[] = {"Ene","Feb","Mar","Abr","May","Jun","Jul","Ago","Sep","Oct","Nov","Dic"};
        String Sucursal[]={"Sucursal #1","Sucursal #2","Sucursal #3"};
        int Sc1[]=new int[12];
        int Sc2[]=new int[12];
        int Sc3[]=new int[12];
        int TotMes[]=new int[12];
        int TotSuc[]=new int[3];
        
        llenarVector(Sc1,Sc2,Sc3,TotMes);
        
        String MP=deterMejorPeorMes(TotMes,Meses);
        
        int totSc1=totalSuc(Sc1);
        int totSc2=totalSuc(Sc2);
        int totSc3=totalSuc(Sc3);
        
        String conc=concenTotalSuc(totSc1,totSc2,totSc3);
        llenadoTotSuc(TotSuc,totSc1,totSc2,totSc3);        
        String MejorPeorSc=deterMejorPeorSucur(TotSuc,Sucursal);        
        imprimir(Meses,Sc1,Sc2,Sc3,TotMes,MP,conc,MejorPeorSc);
    }
}
