abstract class JavaMascot3 {
    public abstract void executeAction();
}
class Duke extends JavaMascot3 {
    @Override
    public void executeAction() {
        System.out.println("Punch!");
    }
}
class Juggy extends JavaMascot3 {
    @Override
    public void executeAction() {
        System.out.println("Fly!");
    }
}
public class JavaMascotTest {
    public static void main(String... args) {
        JavaMascot3 dukeMascot = new Duke();
        JavaMascot3 juggyMascot = new Juggy();
        dukeMascot.executeAction();
        juggyMascot.executeAction();
    }
}