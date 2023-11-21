public class swap {
    public static void main(String[] args) {
    int n1 = 20;
    int n2 = 10;
    // int vada=0;
    // vada = n1;
    // n1 = n2;
    // n2 = vada;

    n1 = n1 + n2;
    n2 = n1 - n2;
    n1 = n1 - n2;
    
    System.out.println(n1);
    System.out.println(n2);
    }

}
