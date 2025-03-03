package es.iesjoseplanes.ed1dawdist.tarea4;

/**
 * Representa un animal con un nombre y métodos básicos para acciones comunes.
 */

public class Animal {

    private String nombre;
    
     /**
     * Constructor para el nombre del animal.
     * 
     * @param nombre
     */
    public Animal(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Devuelve el nombre del animal.
     * 
     * @return
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Para darle un nuevo nombre al animal.
     * 
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Simula la acción de comer del animal.
     */
    void comer() {
        System.out.println("Necesita comer diarimente para sobrevivir");
    }
    
    /**
     * Simula la acción de dormir del animal.
     */
    void dormir() {
        System.out.println("Dormir es indispensable para descansar");
    }
    
    /**
     * Simula la acción de reproducirse del animal.
     */
    void reproducir() {
        System.out.println("Originar nuevos seres vivos");
    }
    
    /**
     * Simula la acción de relacionarse del animal con otro.
     */
    void relacionar(Animal a) {
        System.out.println("Con el animal: " + a.nombre);
    }
    
    /**
     * Devuelve el toString del animal.
     * 
     * @return 
     */
    @Override
    public String toString() {
        return this.nombre; 
    }   
}
