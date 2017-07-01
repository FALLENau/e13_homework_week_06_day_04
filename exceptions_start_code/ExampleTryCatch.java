public class ExampleTryCatch{
  PetShop shop;

  public void run(){
    setup();

    try {
    Pet found = shop.findPetByName("null");
    System.out.println("Found pet: " + found.getName());
  } catch(NullStringException ex) {
    System.out.println(ex.getMessage());
  }
}

  public void setup(){
    shop = new PetShop();
    shop.addPet(new Dog("Rover"));
    shop.addPet(new Cat("MEOWingtons"));
    shop.addPet(new Fish("FINlay"));
  }
}
