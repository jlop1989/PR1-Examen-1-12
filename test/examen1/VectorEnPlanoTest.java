package examen1;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class VectorEnPlanoTest {
    private VectorEnPlano v0;
    private VectorEnPlano v1;
    private VectorEnPlano v2;
    private VectorEnPlano v3;
    private Punto p0;
    private Punto p1;
    private Punto p2;
    private Punto p3;
    private VectorEnPlano[] array0;
    private VectorEnPlano[] array1;
    
    @Before
    public void initiallize(){
        p0=new Punto(0, 0);
        p1=new Punto(0, 1);
        p2=new Punto(1, 0);
        p3=new Punto(1, 1);
        v0 = new VectorEnPlano(p0, p1);
        v1 = new VectorEnPlano(p1,p2);
        v2 = new VectorEnPlano(p2,p3);
        v3 = new VectorEnPlano(p3,p0);
        array0=new VectorEnPlano[0];
        array1=new VectorEnPlano[0];
    }
    
    @Test
    public void testOrigen() {
        assertEquals("Error Origen\n", p0, v0.puntoOrigen());
        assertEquals("Error Origen\n", p1, v1.puntoOrigen());
        assertEquals("Error Origen\n", p2, v2.puntoOrigen());
        assertEquals("Error Origen\n", p3, v3.puntoOrigen());
    }

    @Test
    public void testDestino() {
        assertEquals("Error Destino\n", p1, v0.puntoDestino());
        assertEquals("Error Destino\n", p2, v1.puntoDestino());
        assertEquals("Error Destino\n", p3, v2.puntoDestino());
        assertEquals("Error Destino\n", p0, v3.puntoDestino());
    }
    
    @Test
    public void testSimetrico() {
        Punto pun0= new Punto(v0.puntoOrigen().abscisa(), -v0.puntoOrigen().ordenada());
        Punto pun1= new Punto(v0.puntoDestino().abscisa(), -v0.puntoDestino().ordenada());
        assertEquals("Error SimetricoEjeAbscisas\n", pun0, v0.simétricoEjeAbscisas().puntoOrigen());
        assertEquals("Error SimetricoEjeAbscisas\n", pun1, v0.simétricoEjeAbscisas().puntoDestino());
        pun0= new Punto(v1.puntoOrigen().abscisa(), -v1.puntoOrigen().ordenada());
        pun1= new Punto(v1.puntoDestino().abscisa(), -v1.puntoDestino().ordenada());
        assertEquals("Error SimetricoEjeAbscisas\n", pun0, v1.simétricoEjeAbscisas().puntoOrigen());
        assertEquals("Error SimetricoEjeAbscisas\n", pun1, v1.simétricoEjeAbscisas().puntoDestino());
        pun0= new Punto(v2.puntoOrigen().abscisa(), -v2.puntoOrigen().ordenada());
        pun1= new Punto(v2.puntoDestino().abscisa(), -v2.puntoDestino().ordenada());
        assertEquals("Error SimetricoEjeAbscisas\n", pun0, v2.simétricoEjeAbscisas().puntoOrigen());
        assertEquals("Error SimetricoEjeAbscisas\n", pun1, v2.simétricoEjeAbscisas().puntoDestino());
        pun0= new Punto(v3.puntoOrigen().abscisa(), -v3.puntoOrigen().ordenada());
        pun1= new Punto(v3.puntoDestino().abscisa(), -v3.puntoDestino().ordenada());
        assertEquals("Error SimetricoEjeAbscisas\n", pun0, v3.simétricoEjeAbscisas().puntoOrigen());
        assertEquals("Error SimetricoEjeAbscisas\n", pun1, v3.simétricoEjeAbscisas().puntoDestino());
    }
    
    @Test
    public void testAñadeArray0(){
        assertEquals("Error AñadeAlArray\n",0, array0.length);
        array0=v0.añadeAlArray(array0);
        assertEquals("Error AñadeAlArray\n",1, array0.length);
        assertTrue("Error AñadeAlArray\n", equals(v0, array0[array0.length-1]));
        array0=v1.añadeAlArray(array0);
        assertEquals("Error AñadeAlArray\n",2, array0.length);
        assertTrue("Error AñadeAlArray\n", equals(v1, array0[array0.length-1]));
        array0=v2.añadeAlArray(array0);
        assertEquals("Error AñadeAlArray\n",3, array0.length);
        assertTrue("Error AñadeAlArray\n", equals(v2, array0[array0.length-1]));
        array0=v3.añadeAlArray(array0);
        assertEquals("Error AñadeAlArray\n",4, array0.length);
        assertTrue("Error AñadeAlArray\n", equals(v3, array0[array0.length-1]));
        assertTrue("Error EsCaminoCerrado\n", VectorEnPlano.esCaminoCerrado(array0));
    }
    
    @Test
    public void testAñadeArray1(){
        assertEquals("Error AñadeAlArray\n",0, array1.length);
        array1=v0.añadeAlArray(array1);
        assertEquals("Error AñadeAlArray\n",1, array1.length);
        assertTrue("Error AñadeAlArray\n", equals(v0, array1[array1.length-1]));
        array1=v1.añadeAlArray(array1);
        assertEquals("Error AñadeAlArray\n",2, array1.length);
        assertTrue("Error AñadeAlArray\n", equals(v1, array1[array1.length-1]));
        array1=v3.añadeAlArray(array1);
        assertEquals("Error AñadeAlArray\n",3, array1.length);
        assertTrue("Error AñadeAlArray\n", equals(v3, array1[array1.length-1]));
        array1=v2.añadeAlArray(array1);
        assertEquals("Error AñadeAlArray\n",4, array1.length);
        assertTrue("Error AñadeAlArray\n", equals(v2, array1[array1.length-1]));
        assertFalse("Error EsCaminoCerrado\n", VectorEnPlano.esCaminoCerrado(array1));
    }
    
    private boolean equals(Object o1, Object o2){
        VectorEnPlano v1 = (VectorEnPlano)o1;
        VectorEnPlano v2 = (VectorEnPlano)o2;
        return v1.puntoOrigen().equals(v2.puntoOrigen()) && v1.puntoDestino().equals(v2.puntoDestino());
    }
}
