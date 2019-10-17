public class RefVsVal {
    public static void main(String[] args) {
        int a=5;int b=10;
        System.out.println(a);
        System.out.println(b);
        System.out.println(sum(5,10));
        System.out.println(a);
        System.out.println(b);

        int [] values ={5,10};
        System.out.println(values[0]);
        System.out.println(values[1]);
        System.out.println(sum(values));
        System.out.println(values[0]);
        System.out.println(values[1]);
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
