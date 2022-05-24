import javax.swing.JOptionPane;
import java.util.Random;

public class Examen4_Metodos{
    public static void llenarVectores(int h9[],int h12[],int h15[],int h18[]){
        Random r=new Random();
        for(int x=0;x<5;x++){
            h9[x] = r.nextInt(46);
            h12[x] = r.nextInt(46);
            h15[x] = r.nextInt(46);
            h18[x] = r.nextInt(46);
        }
    }
    public static void calcularPromedio(int pm[],int h9[],int h12[],int h15[],int h18[]){
        for(int x=0;x<5;x++){
            pm[x]=(h9[x]+h12[x]+h15[x]+h18[x])/4;
        }
    }
    public static String temperaturaAlta(int h9[],int h12[],int h15[],int h18[],String mun[]){
        int tempa=0;
        String tempam="",tA="";
        for(int i=0;i<5;i++){
            if (h9[i]>tempa){
                tempa=h9[i];
                tempam=mun[i];
            }
            if (h12[i]>tempa){
                tempa=h12[i];
                tempam=mun[i];
            }
            if (h15[i]>tempa){
                tempa=h15[i];
                tempam=mun[i];
            }
            if (h18[i]>tempa){
                tempa=h18[i];
                tempam=mun[i];
            }
        }
        tA="La temperaturas mas alta fue: "+tempa+" °C en el municipio de "+tempam;
        return tA;
    }
    public static void temperaturaDgo(int ph[],int h9[],int h12[],int h15[],int h18[]){
        for (int x = 0;x<5;x++) {
            if(x==2){
                ph[0]=h9[2];
                ph[1]=h12[2];
                ph[2]=h15[2];
                ph[3]=h18[2];
            }
        }
    }
    public static String temperaturaBaja(int ph[],String hrs[]){
        int menor=ph[0];
        String men=hrs[0],tB="";
        for(int x=1;x<4;x++){
            if(ph[x]<menor){
                menor=ph[x];
                men=hrs[x];
            }
        }
        tB="La temperatura mas baja en Durango: "+menor+" a las "+men;
        return tB;
    }
    public static String obtenerPromH(int promt[],int h9[],int h12[],int h15[],int h18[]){
        String enc="";
        for (int i=0; i<4;i++){
            promt[0]=(h9[0]+h9[1]+h9[2]+h9[3]+h9[4])/5;
            promt[1]=(h12[0]+h12[1]+h12[2]+h12[3]+h12[4])/5;
            promt[2]=(h15[0]+h15[1]+h15[2]+h15[3]+h15[4])/5;
            promt[3]=(h18[0]+h18[1]+h18[2]+h18[3]+h18[4])/5;
        }
        enc+="Prom por hr"+"       "+promt[0]+"°"+"             "+promt[1]+"°"+"              "
        +promt[2]+"°"+"                 "+promt[3]+"°";
        return enc;
    }
    public static void concatenar(String mun[],int h9[],int h12[],int h15[],int h18[],int pm[], String tA,String tB,String enc){
        String todo = " TEMPERATURAS \n Municipio     9:00    12:00    15:00    18:00    Promedio Mcp \n";
        
        for(int x=0;x<5;x++){
            todo+=mun[x] + "           " + h9[x] + "         " + h12[x] + "         " + h15[x] + "       " +
            h18[x] +"              "+pm[x]+ "\n";
        }
        JOptionPane.showMessageDialog(null, todo+"\n"+enc+"\n \n"+tA+"\n"+tB);
    }
    public static void main(String args[]){
        String[] mun = {"VicentG", "Guadalupe Victoria", "Durango", "Santiago", "Gómez Palacios"};
        String [] hrs = {"9:00","12:00","15:00","18:00"};
        int[] h9 =  new  int[5];
        int[] h12 =  new  int[5];
        int[] h15 =  new  int[5];
        int[] h18 =  new  int[5];
        int[] pm = new int[5];
        int[] ph = new int [4];
        int[] promt = new int [4];
        
        llenarVectores(h9,h12,h15,h18);
        calcularPromedio(pm,h9,h12,h15,h18);
        String tA=temperaturaAlta(h9,h12,h15,h18,mun);
        temperaturaDgo(ph,h9,h12,h15,h18);
        String tB=temperaturaBaja(ph,hrs);
        String enc=obtenerPromH(promt,h9,h12,h15,h18);
        concatenar(mun,h9,h12,h15,h18,pm,tA,tB,enc);
    }
}
