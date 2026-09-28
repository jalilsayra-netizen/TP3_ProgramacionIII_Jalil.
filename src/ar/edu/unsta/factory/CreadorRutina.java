package ar.edu.unsta.factory;

public abstract class CreadorRutina {
    public abstract Rutina crearRutina();

    public void asignarRutina() {
        Rutina rutina = crearRutina();
        rutina.mostrarEjercicios();
    }
}