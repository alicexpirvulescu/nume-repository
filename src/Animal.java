public class Animal {
    public static final Animal animal = new Animal();

    private Animal(){

    };

    public static Animal getInstance(){
        return animal;
    }

    public void f(){
        System.out.println("Functia este valida!");
    }
}
