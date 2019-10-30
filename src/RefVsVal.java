public class RefVsVal {
    public static void main(String[] args) {
        int a=5;int b=10;
        System.out.println("Before"+a);
        System.out.println("Before"+b);
        System.out.println(sum(5,10));
        System.out.println("After"+a);
        System.out.println("After"+b);

        int [] values ={5,10};
        System.out.println("Before"+values[0]);
        System.out.println("Before"+values[1]);
        System.out.println(sum(values));
        System.out.println("After"+values[0]);
        System.out.println("After"+values[1]);
    }
    public static int sum(int a, int b) {
        a++; b++;
        return a + b;
    }
    public static int sum(int[] values) {
        values[0]++; values[1]++;
        return values[0] + values[1];
    }
}
