package ar.edu.unsta.singleton;

public class GimnasioConfig {
    private static GimnasioConfig instancia;
    private String nombreGimnasio;
    private String horario;

    private GimnasioConfig() {
        this.nombreGimnasio = "FitGym Tucumán";
        this.horario = "07:00 a 23:00 hs";
    }

    public static synchronized GimnasioConfig getInstancia() {
        if (instancia == null) {
            instancia = new GimnasioConfig();
        }
        return instancia;
    }

    public String getNombreGimnasio() { return nombreGimnasio; }
    public String getHorario() { return horario; }
}