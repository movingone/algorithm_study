public class Main {

    public static void main(String[] args) {
        int n = 1260;
        int cnt = 0;
        int[] coinTypes = {500, 100, 50, 10};
		
        for (int i = 0; i < 4; i++) {
            int coin = coinTypes[i];
            cnt += n / coin;
            n %= coin;
        }

        System.out.println(cnt);
    }

}
================================================================================
/*
import java.util.Scanner;
public class Greedy{

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = 0;

        result += n/500;
        n %= 500;
        result += n/100;
        n %= 100;
        result += n/50;
        n %= 50;
        result += n/10;

        System.out.println(result);
    }
}
*/
