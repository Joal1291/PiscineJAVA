import planet.Mars;

public class Main {

//    public static void main (String[] args) {
//        Mars rocks = new Mars();
//        Mars lite = new Mars();
//        Mars snack = new Mars();
//
//        System.out.println(rocks.getId());
//        System.out.println(lite.getId());
//        System.out.println(snack.getId());
//    }
//    public static void main(String[] args){
//        Astronaut nut = new Astronaut("Hibito");
//    }


//    public static void main ( String [] args ) {
//        chocolate.Mars snack = new chocolate.Mars();
//        planet.Mars rock = new planet.Mars("Viking 1");
//
//        System.out.println(snack.getId());
//        System.out.println(rock.getLandingSite());
//    }

//    public static void main(String[] args){
//        Astronaut jo = new Astronaut("jo");
//        Astronaut al = new Astronaut("al");
//        Astronaut jey = new Astronaut("jey");
//
//        planet.Mars jupiter = new Mars("Pluton");
//        chocolate.Mars snickers = new chocolate.Mars();
//        chocolate.Mars kitkat = new chocolate.Mars();
//
//
//        jo.doAction();
//        jey.doAction(snickers);
//        jo.doAction(jupiter);
//        jo.doAction(kitkat);
//        jo.doAction();
//    }
//    public static void main ( String [] args ) {
//        planet.Mars titi = new planet.Mars("Here and there");
//        planet.Mars toto = new planet.Mars("Up");
//        planet.moon.Phobos phobos1 = new planet.moon.Phobos(titi, "Alpha 3");
//        planet.moon.Phobos phobos2 = new planet.moon.Phobos(toto, "Beta 1");
//        System.out.println(phobos1.getLandingSite());
//    }
//    public static void main( String[] args){
//        Astronaut mutta = new Astronaut("Mutta");
//        Astronaut hibito = new Astronaut("Hibito");
//        Astronaut serika = new Astronaut("Serika");
//
//        Team spaceBro = new Team("SpaceBrothers");
//
//        spaceBro.add(mutta);
//        spaceBro.add(hibito);
//        spaceBro.add(serika);
//
//        planet.Mars titi = new planet.Mars("Hill");
//        mutta.doAction(titi);
//
//        spaceBro.showMembers();
//    }
    public static void main(String[] args){
        Astronaut mutta = new Astronaut("Mutta");
        Astronaut hibito = new Astronaut("Hibito");
        Astronaut serika = new Astronaut("Serika");

        planet.Mars jupiter = new planet.Mars("Hill");
        chocolate.Mars snickers = new chocolate.Mars();

        Team spaceBro = new Team("SpaceBrothers");

        spaceBro.add(mutta);
        spaceBro.add(hibito);
        spaceBro.add(serika);

//        spaceBro.doActions();
        spaceBro.doActions(snickers);
    }
}