package punto;

public class Punto {
    private double x;
    private double y;

    public Punto(double x,double y){
        this.x=x;
        this.y=y;
    }

    public Punto (double x){
        this(x,x);
    }

    public Punto (){
        this(0,0);
    }

    public double getX() { return x; }
    public double getY() { return y; }
    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }
    public void setXY(double x, double y){
        this.x=x;
        this.y=y;
    }
    public double getRho(){ return Math.sqrt(Math.pow(this.x,2)+Math.pow(this.y,2));}
    public Punto puntoMedio(Punto p){
        Punto p1=new Punto((this.x+p.x)/2,(this.y+p.y)/2);
        return p1;
    }

}
