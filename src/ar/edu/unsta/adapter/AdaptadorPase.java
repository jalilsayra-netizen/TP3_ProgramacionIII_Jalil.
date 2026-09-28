package ar.edu.unsta.adapter;

public class AdaptadorPase implements Accesible {
    private PaseUniversalExterno paseExterno;

    public AdaptadorPase(PaseUniversalExterno paseExterno) {
        this.paseExterno = paseExterno;
    }

    @Override
    public boolean permitirAcceso() {
        return paseExterno.validarToken();
    }
}
