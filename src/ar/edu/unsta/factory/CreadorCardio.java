package ar.edu.unsta.factory;

public class CreadorCardio extends CreadorRutina {
    @Override
    public Rutina crearRutina() {
        return new RutinaCardio();
    }
}
