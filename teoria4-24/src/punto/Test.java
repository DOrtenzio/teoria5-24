package punto;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Punto p=new Punto();
        Punto p1=new Punto(3);
        Punto p2=new Punto(3,5);

        System.out.println("Il punto 3 si trova a: "+p2.getX()+" "+p2.getY());
        System.out.println("Inserire nuova y per punto 1");
        p.setY(Double.parseDouble(in.next()));
        System.out.println("Inserire nuova x per punto 1");
        p.setX(Double.parseDouble(in.next()));
        System.out.println("Inserire nuova x ed y per punto 3");
        p2.setXY(Double.parseDouble(in.next()),Double.parseDouble(in.next()));

        System.out.println("Il punto 1 si trova a: "+p.getX()+" "+p.getY());
        System.out.println("Il punto 2 si trova a: "+p1.getX()+" "+p1.getY());
        System.out.println("Il punto 3 si trova a: "+p2.getX()+" "+p2.getY());

        Punto medioPeP1=p.puntoMedio(p1);
        System.out.println("Il punto medio tra punto 1 e punto 2 è "+medioPeP1.getX()+";"+medioPeP1.getY());

        System.out.println("Invece la distanza dal centro di punto 3 è: "+p2.getRho());
    }
}