package Main;

//import junit.framework.Test;
import org.junit.jupiter.api.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Locale;
import java.util.stream.StreamSupport;

/**
 * Unit test for simple App.
 */
public class MainTest
    extends TestCase
{
    final PrintStream standardOut = System.out; //--- Permet de faire ressortir l'output de mon test
    final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream(); // --- permet de capter l'output generer par printstream

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor)); // initialisation de stream captor
    }

    @Test
    public void exempleTest(){
        System.out.println("Jack ready to launch");
        assertEquals("Jack ready to launch", outputStreamCaptor.toString().trim());
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

//    /**
//     * Create the test case
//     *
//     * @param testName name of the test case
//     */
//    public MainTest(String testName )
//    {
//        super( testName );
//    }
//
//    /**
//     * @return the suite of tests being tested
//     */
//    public static Test suite()
//    {
//        return new TestSuite( MainTest.class );
//    }
//
//    /**
//     * Rigourous Test :-)
//     */
//    public void testApp()
//    {
//        assertTrue( true );
//    }
    @Test
    public void test01(){
        Animal isidore = new Animal ("Isidore",4, Animal.Type.MAMMAL);

        System.out.println(isidore.getName() + " has " + isidore.getLegs() + " legs and is a " + isidore.getType() +".");

        assertEquals("My name is Isidore and I am a mammal." + System.lineSeparator() + "Isidore has 4 legs and is a mammal.", outputStreamCaptor.toString().trim());
    }

    @Test
    public void test02(){
        Animal isidore = new Animal ("Isidore",4, Animal.Type.MAMMAL);
        Animal sushi = new Animal("Sushi", 4, Animal.Type.MAMMAL);
        Animal candy = new Animal("Candy", 4, Animal.Type.MAMMAL);
        Animal josh = new Animal("Josh", 0, Animal.Type.FISH);
        Animal roger = new Animal("Roger", 0, Animal.Type.FISH);
        Animal croquette = new Animal("Croquette", 2, Animal.Type.BIRD);

        croquette.getNumberOfAnimal();
        croquette.getNumberOfBirds();
        croquette.getNumberOfFish();
        croquette.getNumberOfMammals();

        assertEquals(
    "My name is Isidore and I am a mammal." + System.lineSeparator() +
            "My name is Sushi and I am a mammal."+ System.lineSeparator() +
            "My name is Candy and I am a mammal."+ System.lineSeparator() +
            "My name is Josh and I am a fish."+ System.lineSeparator() +
            "My name is Roger and I am a fish."+ System.lineSeparator() +
            "My name is Croquette and I am a bird."+ System.lineSeparator() +
            "There are currently 6 animals in our world." + System.lineSeparator() +
            "There is currently 1 bird in our world." +System.lineSeparator() +
            "There are currently 2 fish in our world." + System.lineSeparator() +
            "There are currently 3 mammals in our world.",
            outputStreamCaptor.toString().trim()
        );
    }

    @Test
    public void test03(){
        StringBuilder latest = new StringBuilder();

        Cat isidor = new Cat ("Isidor", "orange");

        System.out.println(isidor.getName()+ " has " + isidor.getLegs() + " legs and is a " + isidor.getType() + ".");
        assertEquals("My name is Isidor and I am a mammal." + System.lineSeparator() + "Isidor: MEEEOOWWWW." + System.lineSeparator() + "Isidor has 4 legs and is a mammal.", outputStreamCaptor.toString().trim());
        latest.append("My name is Isidor and I am a mammal.").append(System.lineSeparator()).append("Isidor: MEEEOOWWWW.").append(System.lineSeparator()).append("Isidor has 4 legs and is a mammal.").append(System.lineSeparator());

        isidor.meow();

        assertEquals(latest.toString() + "Isidor the orange kitty is meowing.", outputStreamCaptor.toString().trim());
    }

    @Test
    public void test04(){
        StringBuilder latest = new StringBuilder();

        Canary titi = new Canary("Titi");

        assertEquals("My name is Titi and I am a bird!"+ System.lineSeparator() +"Yellow and smart? Here I am!", outputStreamCaptor.toString().trim());
        latest.append("My name is Titi and I am a bird!").append(System.lineSeparator()).append("Yellow and smart? Here I am!").append(System.lineSeparator());

        Shark willy = new Shark("Willy"); // Yes Willy is a shark here !
        assertEquals(latest.toString() + "My name is Willy and I am a fish!" + System.lineSeparator() + "A KILLER IS BORN!", outputStreamCaptor.toString().trim());
        latest.append("My name is Willy and I am a fish!").append(System.lineSeparator()).append("A KILLER IS BORN!").append(System.lineSeparator());

        willy.status();
        assertEquals(latest.toString() + "Willy is swimming peacefully.", outputStreamCaptor.toString().trim());
        latest.append("Willy is swimming peacefully.").append(System.lineSeparator());

        willy.smellBlood( true ) ;
        willy.status();
        assertEquals(latest.toString() + "Willy is smelling blood and wants to kill.", outputStreamCaptor.toString().trim());
        latest.append("Willy is smelling blood and wants to kill.").append(System.lineSeparator());

        titi.layEgg();
        System.out.println(titi.getEggsCount());
        assertEquals(latest.toString() + "1", outputStreamCaptor.toString().trim());
    }

    @Test
    public void test05(){
        StringBuilder latest = new StringBuilder();

        Shark grande = new Shark("Grande");
        Shark petite = new Shark("Petite");

        Cat sushi = new Cat("Sushi");
        Canary titi = new Canary("Titi");

        latest.append("My name is Grande and I am a fish!").append(System.lineSeparator())
            .append("A KILLER IS BORN!").append(System.lineSeparator())
            .append("My name is Petite and I am a fish!").append(System.lineSeparator())
            .append("A KILLER IS BORN!").append(System.lineSeparator())
            .append("My name is Sushi and I am a mammal!").append(System.lineSeparator())
            .append("Sushi: MEEEOOWWWW.").append(System.lineSeparator())
            .append("My name is Titi and I am a bird!").append(System.lineSeparator())
            .append("Yellow and smart? Here I am!");
        assertEquals(latest.toString(), outputStreamCaptor.toString().trim());

        assertFalse(grande.canEat(grande));
        assertTrue(grande.canEat(petite));
        assertTrue(grande.canEat(sushi));
        assertTrue(grande.canEat(titi));

        grande.smellBlood(true);
        assertTrue(grande.getStatus());
        grande.smellBlood(false);
        assertFalse(grande.getStatus());

        grande.smellBlood(true);
        assertTrue(grande.getStatus());
        grande.eat(grande);
        latest.append(System.lineSeparator()).append("Grande: It's not worth my time.");
        assertEquals(latest.toString(), outputStreamCaptor.toString().trim());
        assertTrue(grande.getStatus());

        grande.smellBlood(true);
        assertTrue(grande.getStatus());
        grande.eat(petite);
        latest.append(System.lineSeparator()).append("Grande ate a fish named Petite.");
        assertEquals(latest.toString(), outputStreamCaptor.toString().trim());
        assertFalse(grande.getStatus());

        grande.smellBlood(true);
        assertTrue(grande.getStatus());
        grande.eat(sushi);
        latest.append(System.lineSeparator()).append("Grande ate a mammal named Sushi.");
        assertEquals(latest.toString(), outputStreamCaptor.toString().trim());
        assertFalse(grande.getStatus());

        grande.smellBlood(true);
        assertTrue(grande.getStatus());
        grande.eat(titi);
        latest.append(System.lineSeparator()).append("Grande ate a bird named Titi.");
        assertEquals(latest.toString(), outputStreamCaptor.toString().trim());
        assertFalse(grande.getStatus());
    }

    @Test
    public void test06(){
        StringBuilder latest = new StringBuilder();

        GreatWhite jordan = new GreatWhite("Jordan");
        latest.append("My name is Jordan and I am a fish!").append(System.lineSeparator()).append("A KILLER IS BORN!");
        assertEquals(latest.toString(), outputStreamCaptor.toString().trim());

        BlueShark jon = new BlueShark("Jon");
        latest.append(System.lineSeparator()).append("My name is Jon and I am a fish!").append(System.lineSeparator()).append("A KILLER IS BORN!");
        assertEquals(latest.toString(), outputStreamCaptor.toString().trim());

        Shark oli = new Shark("Oli");
        latest.append(System.lineSeparator()).append("My name is Oli and I am a fish!").append(System.lineSeparator()).append("A KILLER IS BORN!");
        assertEquals(latest.toString(), outputStreamCaptor.toString().trim());

        Canary titi = new Canary("Titi");
        latest.append(System.lineSeparator()).append("My name is Titi and I am a bird!").append(System.lineSeparator()).append("Yellow and smart? Here I am!");
        assertEquals(latest.toString(), outputStreamCaptor.toString().trim());

        Cat sushi = new Cat("Sushi");
        latest.append(System.lineSeparator()).append("My name is Sushi and I am a mammal!").append(System.lineSeparator()).append("Sushi: MEEEOOWWWW.");
        assertEquals(latest.toString(), outputStreamCaptor.toString().trim());

        assertFalse(jordan.canEat(jordan));
        assertTrue(jordan.canEat(jon));
        assertTrue(jordan.canEat(oli));
        assertFalse(jordan.canEat(titi));
        assertTrue(jordan.canEat(sushi));
        assertFalse(jon.canEat(jon));
        assertTrue(jon.canEat(oli));
        assertFalse(jon.canEat(titi));
        assertFalse(jon.canEat(sushi));

        jordan.smellBlood(true);
        jon.smellBlood(true);
        assertTrue(jordan.getStatus());
        assertTrue(jon.getStatus());

        jordan.eat(titi);
        assertFalse(jordan.canEat(titi));
        latest.append(System.lineSeparator()).append("Jordan: Next time you try to give me that to eat, I'll eat you instead.");
        assertEquals(latest.toString(), outputStreamCaptor.toString().trim());
        assertTrue(jordan.getStatus());

        jordan.eat(oli);
        assertTrue(jordan.canEat(oli));
        latest.append(System.lineSeparator()).append("Jordan ate a fish named Oli.").append(System.lineSeparator()).append("Jordan: The best meal one could wish for.");
        assertEquals(latest.toString(), outputStreamCaptor.toString().trim());
        assertFalse(jordan.getStatus());

        jordan.smellBlood(true);
        assertTrue(jordan.getStatus());

        jordan.eat(sushi);
        latest.append(System.lineSeparator()).append("Jordan ate a mammal named Sush.");
        assertEquals(latest.toString(), outputStreamCaptor.toString().trim());
    }
}


