public class Punto {
    double x;
    double y;
    static int cont = 0;

    public Punto(double x, double y){
        this.x = x;
        this.y = y;
        cont++;
    }

    public double menorPunto(Punto miPunto){
        double parte1 = miPunto.getX()-this.getX();
        double parte2 = miPunto.getY()-this.getY();
        double distancia = Math.sqrt(parte1*parte1 + parte2*parte2);
        return distancia;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public int getCont() {
        return cont;
    }

    @Override
    public String toString() {
        return "("+x+", "+y+")";
    }

}