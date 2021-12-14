class JavaMascot1{
  void executeAction() {
    System.out.println("The Java Mascot is about to execute an action!");
  }
}
public class Duke1 extends JavaMascot1 {
  @Override
  void executeAction() {
    super.executeAction();
    System.out.println("Duke is going to punch!");
  }
  public static void main(String... superReservedWord) {
    new Duke1().executeAction();
  }
}