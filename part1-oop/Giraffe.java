public class Giraffe extends Creature {
  private String name;
  private double weight;

  @Override
  public void setName(String newName) {
    name = newName;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void setWeight(double newWeight) {
    // weight = newWeight;
  }

  @Override
  public double getWeight() {
    // return null;
    return weight;
  }
}