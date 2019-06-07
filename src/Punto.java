public class Punto {
    double x;
    double y;
    int cont;

    public Punto(double x, double y,int cont){
        this.x = x;
        this.y = y;
        this.cont = cont;
    }

    public double menorPunto(Punto miPunto){
        double parte1 = miPunto.getX()-this.getX();
        double parte2 = miPunto.getY()-this.getY();
        return Math.sqrt(parte1*parte1 + parte2*parte2);
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