import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz: ");
        int count = scan.nextInt();
        int[] list = new int[count];
        for (int i=0; i<count; i++){
            System.out.print((i+1)+". Sayı: ");
            list[i] = scan.nextInt();
        }
        int max =list[0];
        for (int i=0; i< list.length; i++){
            if (list[i]>max){
                max = list[i];
            }
        }
        Arrays.sort(list);

        for (int i: list){
            System.out.println(i);
        }


    }
}
