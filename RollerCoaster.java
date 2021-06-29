package l2;
import java.util.Scanner;
public class RollerCoaster {public static void start(){
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();    //Getting no. of members
        int[][] A=new int[n][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                A[i][j]=s.nextInt();    //Getting heights and shifts for members
            }
        }
        int n1=s.nextInt(); //Getting no. of customers
        int[][] B=new int[n1][2];
        for(int i=0;i<n1;i++){
            for(int j=0;j<2;j++){
                B[i][j]=s.nextInt();    //Getting heights and entering time
            }
        }
        for(int i=0;i<n1;i++){
            passCustomer(B[i][0],B[i][1],A,n);  //Passing info of each customer and member details
        }
        
    }

    private static void passCustomer(int x, int y, int[][] A,int n) {
        int count=0;
        for(int i=0;i<n;i++){
            if(y>=A[i][1]&&y<=A[i][2]){ //checking for the member available at that shift
                count++;
                if(x>=A[i][0]){ //checking heights of customer and member at this shift
                    System.out.println("Yes");
                    return;
                }
            }
        }
        if(count==0){   //if no one has shift at the entry time of the customer
            System.out.println("Yes");
            return;
        }
        else    //if customer height doesn't satisfy the rules
            System.out.println("No");
        return;
        
    }
}
