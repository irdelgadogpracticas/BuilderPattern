package principal;

// CLASE PRINCIPAL.

import clases.*;

public class Principal {
    public static void main(String[] args) {
        Cocina cocina = new Cocina(); // Director.
        EmpanadaBuilder hawaianaEmpanadaBuilder = new HawaianaEmpanadaBuilder();
        EmpanadaBuilder mexicanaEmpanadaBuilder = new MexicanaEmpanadaBuilder();

        cocina.setEmpanadaBuilder( hawaianaEmpanadaBuilder );
        cocina.construirEmpanada();
 
        Empanada empanada = cocina.getEmpanada();
    }
}
