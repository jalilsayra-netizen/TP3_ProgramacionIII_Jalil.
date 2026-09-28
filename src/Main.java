package ar.edu.unsta;

import ar.edu.unsta.singleton.GimnasioConfig;
import ar.edu.unsta.factory.*;
import ar.edu.unsta.abstractfactory.*;
import ar.edu.unsta.adapter.*;
import ar.edu.unsta.decorator.*;
import ar.edu.unsta.facade.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("  DEMOSTRACIÓN PATRONES DE DISEÑO - UNSTA     ");
        System.out.println("==============================================\n");

        // 1. Singleton
        System.out.println("1. SINGLETON:");
        GimnasioConfig config = GimnasioConfig.getInstancia();
        System.out.println("Gimnasio: " + config.getNombreGimnasio() + " (" + config.getHorario() + ")\n");

        // 2. Factory Method
        System.out.println("2. FACTORY METHOD:");
        CreadorRutina creador = new CreadorCardio();
        creador.asignarRutina();
        System.out.println();

        // 3. Abstract Factory
        System.out.println("3. ABSTRACT FACTORY:");
        KitFactory kitFactory = new KitPrincipianteFactory();
        Mancuerna mancuerna = kitFactory.crearMancuerna();
        Colchoneta colchoneta = kitFactory.crearColchoneta();
        mancuerna.mostrarInfo();
        colchoneta.mostrarInfo();
        System.out.println();

        // 4. Adapter
        System.out.println("4. ADAPTER:");
        PaseUniversalExterno paseApp = new PaseUniversalExterno();
        Accesible acceso = new AdaptadorPase(paseApp);
        acceso.permitirAcceso();
        System.out.println();

        //. Decorator
        System.out.println("5. DECORATOR:");
        Membresia miMembresia = new MembresiaBasica();
        miMembresia = new ConPileta(miMembresia);
        System.out.println("Plan: " + miMembresia.getDescripcion());
        System.out.println("Total: $" + miMembresia.getPrecio() + "\n");

        // 6. Facade
        System.out.println("6. FACADE:");
        RecepcionFacade recepcion = new RecepcionFacade();
        recepcion.registrarNuevoSocio("Sayra");
    }
}