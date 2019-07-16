package clases;

// CONCRETE BUILDER.
public class PicantePizzaBuilder extends PizzaBuilder {
    @Override
    public void buildMasa() { 
        empanada.setMasa("frita"); 
        empanada.getMasa();
    }
    
    @Override
    public void buildRelleno() { 
        empanada.setRelleno("aji,carne,ajo,cilantro"); 
        empanada.getRelleno();
    }
}
