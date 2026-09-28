package ar.edu.unsta.decorator;

public class MembresiaBasica implements Membresia {
    @Override
    public String getDescripcion() { return "Pase Musculación"; }

    @Override
    public double getPrecio() { return 15000.0; }
}
