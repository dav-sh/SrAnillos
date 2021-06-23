package characters;
public class Personaje {
    private int life, armor, attack;
    private String name;
    private boolean isHeroe;


    public Personaje(int life, String name, int armor, boolean isHeroe) {
        this.life = life;
        this.attack = 0;
        this.name = name;
        this.armor = armor;
        this.isHeroe = isHeroe;
    }

    public void offensivePower(Personaje persona) {

        //ok-

    }
    
    public void damageInflicted(){
        //ok-
    }
    public int getAttack(){
        return attack;
    }
    public void setAttack(int attack){
        this.attack = attack;
    }
    public int getLife(){
        return life;
    }
    public void setLife(int life){
        this.life = life;
    }

    public boolean isHeroe(){
        return isHeroe;
    }
    public int getArmor(){
        return armor;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "life= " + life + " attack= " + attack +  " name= " + name + " armor= " + armor;
    }

}
