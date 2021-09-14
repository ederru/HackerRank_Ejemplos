import java.util.Scanner;

public class JavaSubArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[]{1, -2, 4, -5, 1};



        //llena el arreglo


        //código para sumar el subarreglo
        int cuenta = 0;
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                sum += a[j];
                if(sum < 0) {
                    cuenta ++;
                }
            }
            sum = 0;
        }

        System.out.println(cuenta);


    }

}
