public class WorkWithAnimals {
  public static void main(String[] args) {
    Dog fido = new Dog();
    fido.setName("Fido");
    System.out.println(fido.getName());
    fido.digHole();
    fido.setWeight(-1);

    int randNum = 10;
    fido.changeVar(randNum);

    System.out.println("randNum after method call: " + randNum);
    changeObjectName(fido);
    System.out.println("Dog name after method call: " + fido.getName());

    Animal doggy = new Dog();
    Animal kitty = new Cat();

    System.out.println("Doggy says: " + doggy.getSound());
    System.out.println("Kitty says: " + kitty.getSound());

  }

  public static void changeObjectName(Dog fido) {
    fido.setName("Marcus");
  }
}