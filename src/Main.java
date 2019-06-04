import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main (String [] ars){
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Cuántos puntos desea ingresar?");
        int cantPuntos = leer.nextInt();
        ArrayList<Punto> misPuntos = new ArrayList<>();
        for(int i = 1; i < cantPuntos+1;i++){
            System.out.println("Ingrese la X del punto "+i);
            int x = leer.nextInt();
            System.out.println("Ingrese la Y del punto "+i);
            int y = leer.nextInt();
            Punto punto = new Punto(x,y);
            misPuntos.add(punto);
        }
        Punto menorPuntoA = null;
        Punto menorPuntoB = null;
        double menorDistancia = 9999999;
        for(int i = 0; i < misPuntos.size();i++){
            for(int j = 0; j < misPuntos.size()-1;j++){
                if(i!=j){
                    double distanciaTemporal = misPuntos.get(i).menorPunto(misPuntos.get(j));
                    if (distanciaTemporal < menorDistancia) {
                        menorDistancia = distanciaTemporal;
                        menorPuntoA = misPuntos.get(i);
                        menorPuntoB = misPuntos.get(j);
                    }
                }
            }
        }
        System.out.println("La menor distancia fue " + menorDistancia);
        System.out.println("Entre los puntos: ");
        System.out.println("A "+menorPuntoA.toString());
        System.out.println("B "+menorPuntoB.toString());
    }
}