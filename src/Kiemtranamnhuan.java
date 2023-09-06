import java.util.Scanner;

public class Kiemtranamnhuan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập năm: ");
        int year = input.nextInt();
        if(year%4==0 && year%100!=0){
            System.out.println("Năm bạn vừa nhập là năm nhuận");
        }else if(year%100==0 && year%400!=0){
            System.out.println("Năm bạn vừa nhập không phải là năm nhuận");
        }else if(year%100==0 && year%400==0){
            System.out.println("Năm bạn vừa nhập là năm nhuận");
        }else {
            System.out.println("Năm bạn vừa nhập không phải là năm nhuận");
        }
    }
}