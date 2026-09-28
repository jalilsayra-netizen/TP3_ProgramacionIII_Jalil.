package ar.edu.unsta.abstractfactory;

public class KitPrincipianteFactory implements KitFactory {
    @Override
    public Mancuerna crearMancuerna() { return new MancuernaLiviana(); }

    @Override
    public Colchoneta crearColchoneta() { return new ColchonetaSimple(); }
}