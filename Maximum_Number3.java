import java.util.*;
public class Maximum_Number3 {
    public static void main(String[]args)
    {

    
    int N1 = 0, N2 = 0, N3 = 0;
        Scanner S = new Scanner(System.in);
        
        System.out.print("Enter first number :");
        N1 = S.nextInt();
        System.out.print("Enter second number :");
        N2 = S.nextInt();
        System.out.print("Enter third number :");
        N3 = S.nextInt();


        if((N1 > N2) && (N1 > N3))
        {
            System.out.println(N1 + "Maximum");
        }
        else if((N2 > N1) && (N3 > N2))
        {
            System.out.println(N2 + "Maximum");
        }
        else
        {
            System.out.println(N3 + "Maximum" );
        }

}
}