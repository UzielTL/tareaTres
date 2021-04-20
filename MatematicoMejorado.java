
/**
 * Tarea 3
 * 
 * @author Uziel Ticona Ledezma
 * @version 20-04-2021
 */
public class MatematicoMejorado{
    String EcuacionSegGrado(double a, double b,double c){
        double res1;
        double res2;
        res1=(-b+Math.sqrt((Math.pow(b,2))-(4*a*c)))/(2*a);
        res2=(-b-Math.sqrt((Math.pow(b,2))-(4*a*c)))/(2*a);
        return "( X1 = "+res1+")    ( X2 = "+res2+" )";
    }
    
    String EcuacionRecta(int x1, int y1, int x2, int y2){
        int pendiente;
        pendiente= (y2-y1)/(x2-x1);
        int aux1;
        int  aux2;
        int res;
        aux1= (x1*(-1))*pendiente;
        aux2= y1*(-1);
        res = aux1-aux2;
        return "[ y = "+pendiente+"X"+"+("+res+") ]";
    }
    
    String CatetoFaltante(int hipotenusa, int catetoA ){
        double res;
        res= Math.sqrt((Math.pow(hipotenusa,2))-(Math.pow(catetoA,2)));
        return "cateto faltante es  "+res; 
    }
}
