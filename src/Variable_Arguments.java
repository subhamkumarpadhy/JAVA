public class Variable_Arguments {
//    static int sum(int a , int b)
//    {
//        return a+b;
//    }
//    static int sum(int a , int b , int c)
//    {
//        return a+b+c;
//    }
//    static int sum(int a , int b ,  int c , int d)
//    {
//        return a+b+c+d;
//    }
    static int sum(int x , int ...arr)
    {
        //Available as int [] arr
        int result = x;
        for (int a: arr)
        {
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to tutorial!!");
//        System.out.println("The sum of nothing is " + sum());
        System.out.println("The sum is " + sum(4,7));
        System.out.println("The sum is " + sum(4,7,3));
        System.out.println("The sum is " + sum(4,7,8,3));
    }
}
