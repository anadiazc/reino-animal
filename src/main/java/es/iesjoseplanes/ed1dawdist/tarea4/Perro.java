package es.iesjoseplanes.ed1dawdist.tarea4;

/**
 * Representa un perro y sus comportamientos como mamífero.
 * Hereda de la clase Mamifero.
 */
public class Perro extends Mamifero {

    /**
     * Constructor para el nombre del perro, llama a la clase Mamifero.
     * 
     * @param nombre
     */
    public Perro(String nombre) {
        super(nombre); 
    }
    
    /**
    * Sobreescribe el método dormir de la clase Mamifero para especificar algo 
    * distinto.
    */
    @Override
    void dormir() {
        System.out.println("El perro debe dormir en funcion del ejericio que realiza");
    }

    /**
    * Método que simula el ladrido del perro e indica para qué sirve.
    */
    void ladrar() {
        System.out.println("Es una labor social de guarda");
    }

    /**
    * Método que simula un gruñido del perro e indica cómo es.
    */
    void gruñir() {
        System.out.println("Es un sonido ronco y sostenido");
    }

    /**
     * Sobreescribe el método relacionar de la clase Mamifero para relacionar
     * al perro con otro animal.
     * 
     * @param p
     */
    @Override
    void relacionar(Animal p) {
        System.out.println("Con el perro: " + p.getNombre());
    }
    
    /**
     * Sobreescribe el método comer de la clase Mamifero para especificar la comida
     * favorita del perro.
     */
    @Override
    void comer() {
        System.out.println("Su comida favorita son las latas de pollo.");
    }

    /**
     * Devuelve el toString del perro.
     * 
     * @return 
     */
    String ToString() {
        return this.getNombre();
    }

}
