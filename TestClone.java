
public class TestClone {

    public static void main(String[] args) throws CloneNotSupportedException {
          CloneFactory animalMaker = new CloneFactory();
          Sheep sally = new Sheep();

          Sheep cloneSheep = (Sheep)animalMaker.getClone(sally);

          System.out.println(sally);
          System.out.println(cloneSheep);

          System.out.println("Sally Hashcode: " +  System.identityHashCode(sally));
          System.out.println("cloneSheep Hashcode: " + System.identityHashCode(cloneSheep));
    }
}
