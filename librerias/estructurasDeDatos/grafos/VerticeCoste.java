package librerias.estructurasDeDatos.grafos;

public class VerticeCoste implements Comparable<VerticeCoste>{
    
    int vertice;
    double coste;
    
    public VerticeCoste(int vertice, double coste){
        this.vertice = vertice;
        this.coste = coste;
    }
    
    public int compareTo(VerticeCoste other){
        if(coste > other.coste) return 1;
        else if (coste == other.coste) return 0;
        else return -1;
    }
    
}
