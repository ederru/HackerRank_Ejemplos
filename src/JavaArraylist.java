import java.util.ArrayList;
import java.util.Scanner;

public class JavaArraylist {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d,q,x,y;
        //cremos el arraylist
        ArrayList[] numbers = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            d = sc.nextInt();
            numbers[i] = new ArrayList();
            for (int j = 0; j < d; j++) {
                numbers[i].add(sc.nextInt());
            }
        }

        q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            try{
                System.out.println(numbers[x-1].get(y-1));
            } catch(Exception e){
                System.out.println("ERROR!");
            }
        }

    }
}
