
public class recurs {
    public static void main(String[] args) {
        int a=2;
        int b=10;
        for (int i = -2; i <=b ; i++) {
            System.out.println(a+"^"+i+"="+ power(a,i));
        }
    }
    public static double power(double a,double b){
        if (b==0) return 1;
        if(b<0) return 1/pow(a,(-1*b));
        return pow(a,b);
    }

    public static Double pow(double a,double b){
        return a * (b < 2 ? 1 : pow(a, --b));
    }
}
