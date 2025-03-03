package es.iesjoseplanes.ed1dawdist.tarea4;

/**
 * Representa un gato y sus comportamientos como mamífero.
 * Hereda de la clase Mamifero.
 */
public class Gato extends Mamifero {

    private int pelos;
    
    /**
     * Constructor para el nombre del gato, llama a la clase Mamifero.
     * 
     * @param nombre
     */
    public Gato(String nombre) {
        super(nombre);
    }
    
    /**
     * Devuelve el número de pelos que tiene el gato.
     * 
     * @return 
     */
    public int getPelos() {
        return pelos;
    }
    
    /**
     * Establece el número de pelos del gato.
     * 
     * @param pelos 
     */
    public void setPelos(int pelos) {
        this.pelos = pelos;
    }

    /**
    * Sobreescribe el método dormir de la clase Mamifero para especificar algo 
    * distinto.
    */
    @Override
    void dormir() {
        System.out.println("El gato se pasa todo el día durmiendo");
    }

    /**
     * Método que simula el maullido del gato. Indica que eso es lo que hacen
     * los gatos.
     */
    void maullar() {
        System.out.println("Es lo que hacen los gatos");
    }

    /**
     * Sobreescribe el método relacionar de la clase Mamifero para relacionar
     * al gato con otro animal.
     * 
     * @param p
     */
    @Override
    void relacionar(Animal p) {
        System.out.println("Con el gato: " + p.getNombre());
    }

}
