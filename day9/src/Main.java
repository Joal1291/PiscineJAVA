import javax.xml.namespace.QName;

public class Main {

    @Test(name = "test01")
    public static void main(String[] args) {
        Inspector<String> inspector = new Inspector<>(String.class);
        inspector.displayInformations();
    }
}