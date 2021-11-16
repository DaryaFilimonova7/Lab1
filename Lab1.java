import java.util.Scanner;
public class Lab1
{
	public static void main (String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.print("Input four numbers: ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int n4 = in.nextInt();
        int min = 0;
        if (n1 <= n2 && n1 <= n3 && n1 <= n4 )
            min = n1;
        else if (n2 < n1 && n2 <= n3 && n2 <= n4)
            min = n2;
        else if (n3 < n1 && n3 < n2 && n3 <= n4)
            min = n3;
        else if (n4 < n1 && n4 < n2 && n4 < n3)
            min = n4;
        System.out.println("The smallest number is " + min);



    in.close();


	}
}