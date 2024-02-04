class Animal{
    String name;

    //konstruktor
    public Animal(String name){
        this.name = name;
    }

    //method
    public void eat(){
        System.out.println(name + " is eating");
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }    
}

class Dog extends Animal{
    
    public Dog(String name){
        super(name);
    }
    
    //method
    void guk(){
        System.out.println(name + " says guk guk");
    }
    
}
public class primary {
    public static void main(String[] args) {
        Animal asu = new Dog("Heli");
        System.out.println(asu.name);
        asu.eat();
        asu.sleep();
        // asu.();
    }
    
}