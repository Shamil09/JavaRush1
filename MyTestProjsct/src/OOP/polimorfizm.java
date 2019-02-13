package OOP;

//Вот так наш класс Айболит может работать с разными типами, как будто это один и тот же тип.
public class polimorfizm {
    public static void main(String[] args) {
        Aibolit aibolit = new Aibolit();
        Lion lion = new Lion("Лев");
        Tiger tiger = new Tiger("Тигр");
        aibolit.healCat(lion);
        aibolit.healCat(tiger);
    }

    public static abstract class Cat {
        String name;
        Cat(String name){
            this.name=name;
        }
        String getName() {
            return name;
        }
    }

    public static class Lion extends Cat {
        Lion(String name) {
            super(name);
        }
    }

    public static class Tiger extends Cat {
        Tiger(String name) {
            super(name);
        }
    }

    public static class Aibolit {
        void healCat(Cat cat) {
            System.out.println("Пациент здоров!" + cat.getName());
        }
    }
}
