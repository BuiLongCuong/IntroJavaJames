import java.util.Scanner;

public class Tinhsongaytrongthang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập tháng: ");
        int month =input.nextInt();
        if (month >12){
            System.out.println("Vui lòng nhập lại!");
        }
        switch (month){
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 9 :
            case 11 :
                System.out.println("Tháng "+ month +" có 31 ngày");
                break;
            case 4 :
            case 6 :
            case 8 :
            case 10 :
            case 12:
                System.out.println("Tháng "+ month +" có 30 ngày");
                break;
            case 2:
                System.out.println("Tháng "+ month +" có 29 ngày hoặc 28 ngày");
                break;
        }
    }
}
