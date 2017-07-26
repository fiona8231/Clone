
public class CloneFactory {

    public Animal getClone(Animal animalSample) throws CloneNotSupportedException {
        return animalSample.makeCopy();
    }
}
