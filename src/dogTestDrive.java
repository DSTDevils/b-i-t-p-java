

public interface dogTestDrive {


    public static void main(String[] argss){
        Dog dog = new Dog();
        dog.age = 1;
        dog.name="bruno";
        dog.bark();
        System.out.println("age: "+dog.age);
        System.out.println("breed: "+ dog.breed);
        Dog dog2 = new Dog("indo","yellow", 2);
        Dog dog3 = new Dog("China","black", 3);
        System.out.println("");
    }
}
