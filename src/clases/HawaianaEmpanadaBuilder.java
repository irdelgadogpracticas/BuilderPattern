package clases;

// CONCRETE BUILDER.
public class HawaianaEmpanadaBuilder extends EmpanadaBuilder {
    @Override
    public void buildMasa() { 
        empanada.setMasa("asada"); 
        empanada.getMasa();
    }
    
    @Override
    public void buildRelleno() { 
        empanada.setRelleno("piña,mortadela,queso"); 
        empanada.getRelleno();
    }
}
