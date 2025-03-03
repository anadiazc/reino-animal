package es.iesjoseplanes.ed1dawdist.tarea4;

/**
 * Representa un mamífero, un tipo de animal con características propias.
 * Hereda de la clase Animal.
 */
public class Mamifero extends Animal {

    /**
     * Constructor para el nombre del mamífero, llama al constructor de Animal 
     * para establecerlo.
     * 
     * @param nombre 
     */
    public Mamifero(String nombre) {
        super(nombre); 
    }
    
    /**
     * Sobreescribe el método reproducir de la clase Animal para especificar
     * la reproducción de los mamíferos.
     */
    @Override
    void reproducir() {
        System.out.println("La reproduccion es vivipara");
    }

    /**
     * Sobreescribe el método relacionar de la clase Animal para especificar
     * la relación del mamífero con otro mamífero (podría ser con otro animal
     * en general).
     * 
     * @param m 
     */
    @Override
    void relacionar(Animal m) {
        System.out.println("Con el mamifero: " + m.getNombre());
    }
}
