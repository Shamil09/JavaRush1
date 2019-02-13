public class Test {
    public static void main(String[] args) {
        Animal animal=new Pet();
        animal.introduce();
        //animal.strPet(); //ошибка
        ((Pet) animal).strPet();
    }
}

class Animal {
    public void introduce() {
        System.out.println("i'm Animal");
    }
}

class WildAnimal extends Animal {
    public void introduce() {
        System.out.println("i'm WildAnimal");
    }
}

class Pet extends Animal {
    public void introduce() {
        System.out.println("i'm Pet");
    }
    public void strPet(){
        System.out.println("Pet");
    }
}

class Dog extends Pet {
    public void introduce() {
        System.out.println("i'm Dog");
    }
}

class Coyote extends WildAnimal {
    public void introduce() {
        System.out.println("i'm Coyote");
    }
}