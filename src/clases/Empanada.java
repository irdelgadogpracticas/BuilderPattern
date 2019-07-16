package clases;

// CLASE PRODUCTO.
public class Empanada {
    private String masa = "";
    private String relleno = "";
 
    public void setMasa(String masa) { 
        this.masa = masa; 
    }
    
    public void setRelleno(String relleno) { 
        this.relleno = relleno; 
    }

    public void getMasa() { 
        System.out.println(this.masa);
    }
    
    public void getRelleno() { 
        System.out.println(this.relleno);
    }
    
}
