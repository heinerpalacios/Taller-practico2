
/**
 * se Crea el tipo de nave tripulada extendiendo de la clase principal nave espacial y se definen sus atributos
 * @author HEINER PALACIOS ASPRILLA
 */
public class mannedSpacecraft extends Spacecraft{
    private boolean spaceCraftState;
    public mannedSpacecraft (int peso){
    
    this.weight = 77000;
    this.push = push;
    this.power = power;
    this.speed = speed;
    this.propulsionSystem = propulsionSystem;
    this.typeFuel = typeFuel;
    }

    /**
     * Se crea el constructor
     */
    mannedSpacecraft() {
        
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
