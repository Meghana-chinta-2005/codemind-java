import java.util.Scanner;
public class WaterTaps{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        int x = read.nextInt();
        int y = read.nextInt();
        int z = (x*y)/(x+y);
        System.out.printf("%d",z);
    }
}