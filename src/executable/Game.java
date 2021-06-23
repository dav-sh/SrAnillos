package executable;

import characters.beast.*;
import characters.heroe.*;
import characters.*;
import java.util.*;


public class Game {
    final int numPlayers = 5;
    private Heroe []heroes;
    private Beast []beasts;
    private Random rand=new Random();
    private Scanner scanner= new Scanner(System.in);


    public Game() {
        this.heroes = new Heroe[numPlayers];
        this.beasts = new Beast[numPlayers];
        menu();
    }

    public void menu(){
        int salir;;
        do{
            System.out.println("1. Generar Personajes");
            System.out.println("2. Ver Personajes");
            System.out.println("3. Jugar");
            System.out.println("0. Salir");
            System.out.println("Ingrese la opcion");
            salir = scanner.nextInt();
            scanner.nextLine();
            switch (salir) {
                case 1: 
                    createPlayers();
                    break;

                
                case 2: 
                    seePlayers(heroes);
                    seePlayers(beasts);
                    break;

                
                case 3: 
                    start();
                    break;


                
                case 0:
                    System.out.println("Saliste");
                    break;


                

            }
        }while (salir !=0) ;
    }

    public void createPlayers(){
        //Heroe
        for(int i = 0; i < numPlayers;i++){
            int j = rand.nextInt(3);
            if(j==0){
                heroes[i] = new Elfo("Elfo " +i);
            }else if(j==1){
                heroes[i] = new Hobbit("Hobbit "+i);
            }else if(j==2){
                heroes[i] = new Human("Human " + i);
            }
        }
        //Beast
        for(int i = 0; i < numPlayers;i++){
            int j = rand.nextInt(2);
            if(j==0){
                beasts[i] = new Orco("Orco " +i);
            }else if(j==1){
                beasts[i] = new Trasgo("Trasgo "+i);
            }
        }

    }

    public void seePlayers(Personaje tipoEjercito[]){
        if(tipoEjercito.length>0){
            if(tipoEjercito[0] instanceof Beast){
                System.out.println("Ejecito de Bestias");
            }else{
                System.out.println("Ejercito de Heroes");
            }
        }for(int i=0;i<tipoEjercito.length;i++){
            System.out.println(tipoEjercito[i].toString());
        }
    }

    public void start(){
        System.out.println(beasts[0].toString());
        System.out.println(heroes[0].toString());

        beasts[0].offensivePower(heroes[0]);
        System.out.println(beasts[0].toString());
        System.out.println(heroes[0].toString());
    }
}
