import java.util.Scanner;

public class Main {
    static void number (int a, int d, boolean ft){
        if (a<= 0)
            ft= true;
        System.out.println(a+ "");
        if (ft==false )
            number(a-5,d+1,ft);
        else {
            if (d==0)
                return;
            else
                number(a+5,d-1,ft);

        }
    }
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("bir sayı giriniz :");
        int inpunt = num.nextInt();
        number (inpunt,0,false);

    }
}