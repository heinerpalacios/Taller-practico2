
/**
 * Se crea la clase principal donde, se hace la creacion de las naves y se les asignan diferentes acciones a ejecutar.
 * @author HEINER PALACIOS ASPRILLA
 */
public class Main {

    public static void main(String[] args) {
      
       Spacecraft saturnoV = new shuttleShip();
       Spacecraft explorer = new unmannedSpaceCraft();
       Spacecraft soho = new unmannedSpaceCraft();
       Spacecraft apolo = new mannedSpacecraft();
       
       
       saturnoV.speedUp();
       explorer.speedUp();
       soho.speedUp();
       apolo.speedUp();
       
       saturnoV.launch();
       explorer.launch();
       soho.launch();
       apolo.launch();
       
       
    }
    
}
