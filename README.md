# teoria5-24

Scrivere una classe Punto le cui istanze rappresentino punti sul piano cartesiano. La classe deve avere i seguenti metodi e costruttori pubblici:
Punto(double x, double y) : costruisce il punto di coordinate (x,y)
Punto(double x) : costruisce il punto di coordinate (x,x)
Punto() : costruisce il punto (0,0)
double getX() : restituisce l'ascissa del punto
double getY() : restituisce l'ordinata del punto
void setX(double x) : modifica l'ascissa del punto (rendendola uguale a x)
void setY(double y) : modifica l'ordinata del punto (rendendola uguale a y)
void setXY(double x, double y) : modifica le coordinate del punto, rendendolo uguale a (x,y)
double getRho() : restituisce il modulo (=distanza dall'origine) del punto
Punto puntoMedio(Punto p): restituisce il punto medio tra l'oggetto su cui è richiamato il metodo e il punto passato come parametro.
Scrivere inoltre una classe di Test che prova tutti i metodi della classe (classe che contiene il main)
