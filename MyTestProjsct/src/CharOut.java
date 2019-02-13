public class CharOut {
    public static void main(String[] args) {
//        for (int i = 961; i <=1860 ; i++) {
//            char x= (char) i;
//            System.out.print(i+"-"+x+"|");
//            if (i%30==0) System.out.println();
//        }
        int x = 7;
        incrementNumber(x);
        System.out.println(x);
        String s1 = "Я изучаю Java";
        String s2 = new String("Я изучаю Java");

        System.out.println(s1.equals(s2));
        //Cat cat = new Cat(7);
        //catLevelUp(cat);
        //System.out.println(cat.getAge());

    }

//    public static void catLevelUp(Cat cat) {
//
//        //cat.setAge(cat.getAge()+1);
//    }

    public static void incrementNumber(int x) {
        x++;
        System.out.println(x);
    }
}
