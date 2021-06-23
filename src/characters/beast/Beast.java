package characters.beast;
import java.util.*;

import characters.Personaje;

public class Beast  extends Personaje{
    private Random rand = new Random();
    public Beast(int life, String name, int armor){
        super(life, name, armor, false);
    }
    @Override
    public void offensivePower(Personaje persona) {
        int ataque = rand.nextInt(91);
        if(ataque>persona.getArmor()){
            System.out.println("Danio inflingido: "+ ataque);
            persona.setLife(persona.getLife()-ataque);
        }else{
            System.out.println("No se puede realizar el ataque");
        }
        //ok-

    }

}
