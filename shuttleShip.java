
/**
 * se Crea el tipo de nave Lanzadera extendiendo de la clase principal nave espacial y se definen sus atributos.
 * @author HEINER PALACIOS ASPRILLA
 */
public class shuttleShip extends Spacecraft {
 
    private boolean spaceCraftState;
    public shuttleShip( int peso){
    this.push = 3500;
    this.power = 3200*5;
    this.speed = speed;
    this.propulsionSystem = propulsionSystem;
    this.typeFuel = typeFuel;
    this.weight = weight;
    this.spaceCraftState = false;
    }
    
    /**
     * Se crea el constructor
     */
    shuttleShip() {
        
    }
    
    /**
     * Se Crean los metodos a ejecutar por la nave
     */
    public void inOrbit(){
    spaceCraftState = true;
    }
    
    public void speedUp() {
        this.speed = speed + 1;
    }
    
    @Override
     public void launch(){
                 System.out.println ("Lanzar!");
                 this.spaceCraftState = false;
    }
    
     public boolean isEstadoNave(){
     return spaceCraftState;
     
     }
     
}
