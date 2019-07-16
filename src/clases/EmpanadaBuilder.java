package clases;

// ABSTRACT BUILDER.
public abstract class EmpanadaBuilder {
    protected Empanada empanada;
 
    public Empanada getEmpanada() { 
        return empanada; 
    }
    
    public void crearNuevaEmpanada() { 
        empanada = new Empanada(); 
    }
 
    public abstract void buildMasa();
    public abstract void buildRelleno();
}
