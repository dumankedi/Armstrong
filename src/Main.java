import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayi;
        System.out.print("Bir sayı giriniz: ");
        sayi=input.nextInt();
        int basNumber=0,tempNumber=sayi,basValue,result=0,basPow=1;
        while (tempNumber!=0){
            tempNumber/=10;
            basNumber++;
        }
        tempNumber=sayi;
        while (tempNumber!=0){
            basValue=tempNumber%10;
            for (int i = 1; i <basNumber ; i++) {
                basPow*=basValue;
            }
            result+=basPow;
            tempNumber/=10;
        }
        System.out.println(result);
    }
}