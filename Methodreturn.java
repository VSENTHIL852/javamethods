import java.util.Scanner;
public class Methodreturn{
    public static void main(String[] args){
        int d=sum();
        System.out.println(d);
    }
    public static int sum(){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter no 1:");
        int a=sc.nextInt();
        System.out.print("Enter no 2:");
        int b=sc.nextInt();
        int sum=a+b;
        return sum;
    }
}
