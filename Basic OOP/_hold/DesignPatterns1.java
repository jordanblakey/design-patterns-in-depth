// public class DesignPatterns1 {
//   public static void main(String[] args) {
//     System.out.println("Hello, World!");
//   }
// }

class Animal {
  private String name;
  private double height;
  private int weight;

  public void setName(String newName) {
    name = newName;
  }
}

class Dog extends Animal {
  public void digHole() {
    System.out.println("Hole Dug");
  }

  public double getGrams() {
    return 0.00;
  }

}

// public static void main(String[] args) {
// Dog grover = new Dog();
// // grover.name = "Grover"; Can't do this, need getters and setters
// }