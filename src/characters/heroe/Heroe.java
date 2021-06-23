package characters.heroe;
import java.util.*;


import characters.Personaje;

public class Heroe  extends Personaje{
    private Random rand = new Random();
    
    public Heroe(int life, String name, int armor) {
        super(life, name, armor, true);
    }

    @Override
    public void offensivePower(Personaje persona) {
        int ataque = rand.nextInt(101);
        if(ataque>persona.getArmor()){
            System.out.println("Danio inflingido: "+ ataque);
            persona.setLife(persona.getLife()-ataque);
        }else{
            System.out.println("No se puede realizar el ataque");
        }
        //ok-

    }
   
}
