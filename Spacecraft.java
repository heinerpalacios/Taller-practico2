
/**
 * Se crea la Clase Abstracta Nave espacial y se definen sus Atributos 
 * @author HEINER PALACIOS ASPRILLA
 */
public abstract class Spacecraft {
    
    public int power;
    public int speed;
    int weight;
    public int push;
    public String propulsionSystem;
    public String typeFuel;
    private String orbitalModule;
    
    
    public Spacecraft(){

    this.power = 0;
    this.speed = 0;
    this.weight = weight;
    this.push = 0;
    this.propulsionSystem = propulsionSystem;
    this.typeFuel = typeFuel;
    this.orbitalModule = orbitalModule;
    
    }
    
    /**
     * Se crean los metodos a ejecutar por la nave
     */
    
    public abstract void speedUp();
  
    
    
     public void launch(){
                 System.out.println ("lanzar!");
    }

    public String getorbitalModule() {
        return this.orbitalModule;
    }

    public void setorbitalModule(String moduloOrbital) {
        this.orbitalModule = moduloOrbital;
    }
  
}
