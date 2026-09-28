package ar.edu.unsta.facade;

public class RecepcionFacade {
    private SistemaCupos cupos = new SistemaCupos();
    private SistemaCobros cobros = new SistemaCobros();

    public void registrarNuevoSocio(String nombre) {
        System.out.println("--- Proceso de Alta de Socio ---");
        if (cupos.hayCupo()) {
            cobros.cobrarMatricula(nombre);
            System.out.println("¡Socio " + nombre + " registrado exitosamente!");
        }
    }
}
