import java.util.LinkedList;

class MiddleLinkedList{
  public static void main(String[] args){

    // create a linked list using the LinkedList class
    LinkedList<String> animals = new LinkedList<>();

    // Add elements to LinkedList
    animals.add("Dog");
    animals.addFirst("Cat");
    animals.addLast("Horse");
    System.out.println("LinkedList: " + animals);

    // access middle element
    String middle = animals.get(animals.size()/2);
    System.out.println("Middle Element: " + middle);
    }
}