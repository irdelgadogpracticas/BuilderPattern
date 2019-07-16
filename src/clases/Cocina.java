package clases;

// CLASE DIRECTOR.
public class Cocina {
    private EmpanadaBuilder empanadaBuilder;
 
    public void setEmpanadaBuilder(EmpanadaBuilder empanadaSeleccionada) { 
        empanadaBuilder = empanadaSeleccionada; 
    }
    
    public Empanada getEmpanada() { 
        return empanadaBuilder.getEmpanada(); 
    }
 
    public void construirEmpanada() {
       empanadaBuilder.crearNuevaEmpanada();
       empanadaBuilder.buildMasa();
       empanadaBuilder.buildRelleno();
    }
}
