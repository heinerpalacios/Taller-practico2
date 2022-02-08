
/**
 * se Crea el tipo de nave no tripulada extendiendo de la clase principal nave espacial y se definen sus atributos
 * @author HEINER PALACIOS ASPRILLA
 */
public class unmannedSpaceCraft extends Spacecraft {

    private boolean spaceCraftState;
    public unmannedSpaceCraft(int speed){
    this.push = push;
    this.power = power;
    this.speed = speed;
    this.propulsionSystem = propulsionSystem;
    this.typeFuel = typeFuel;
    this.weight = weight;
    
    }

    /**
     * Se crea el constructor
     */
    unmannedSpaceCraft() {
        
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
