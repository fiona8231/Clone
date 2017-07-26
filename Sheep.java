
public class Sheep implements Animal{

    //constructor
    public Sheep(){
        System.out.println("Sheep is Made");
    }

    @Override
    public Animal makeCopy() throws CloneNotSupportedException {
        System.out.println("Sheep is being Made");
        new Sheep();
        Sheep sheepobj = (Sheep) super.clone();

        return sheepobj;
    }


    public String toString(){

        return "Dolly is my hero! Baaaa!";

    }

}
