package ar.edu.unsta.decorator;

public class ConPileta extends DecoradorMembresia {
    public ConPileta(Membresia membresia) { super(membresia); }

    @Override
    public String getDescripcion() { return membresia.getDescripcion() + " + Acceso a Pileta"; }

    @Override
    public double getPrecio() { return membresia.getPrecio() + 5000.0; }
}