package examen1;

public class VectorEnPlano{
    private Punto origen,extremo;

    public VectorEnPlano(Punto origen, Punto extremo) {
        this.origen = new Punto(origen.abscisa(), origen.ordenada());
        this.extremo = new Punto(extremo.abscisa(), extremo.ordenada());
    }

    public Punto puntoOrigen() {
        return origen;
    }

    public Punto puntoDestino() {
        return extremo;
    }
    
    public VectorEnPlano simétricoEjeAbscisas(){
        return new VectorEnPlano(new Punto(origen.abscisa(), -origen.ordenada()), new Punto(extremo.abscisa(), -extremo.ordenada()));
    }
    
    public VectorEnPlano[] añadeAlArray(VectorEnPlano []v){
        VectorEnPlano []aux= new VectorEnPlano[v.length+1];
        System.arraycopy(v, 0, aux, 0, v.length);
        aux[v.length]=new VectorEnPlano(origen, extremo);
        return aux;
    }
    
    public static boolean esCaminoCerrado(VectorEnPlano []v){
        for(int i=0;i<v.length-1;i++){
            if(!v[i].extremo.equals(v[i+1].origen)) return false;
        }
        return v[v.length-1].extremo.equals(v[0].origen);
    }
}