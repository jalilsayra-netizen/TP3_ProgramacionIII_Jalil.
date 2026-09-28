package ar.edu.unsta.decorator;

public abstract class DecoradorMembresia implements Membresia {
    protected Membresia membresia;

    public DecoradorMembresia(Membresia membresia) {
        this.membresia = membresia;
    }
}