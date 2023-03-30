import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Demo chiếc máy tính bỏ túi");
        System.out.println("Mời bạn nhập số a:");
        double a=sc.nextDouble();
        System.out.println("Mời bạn nhập số b:");
        double b =Double.parseDouble(sc.nextLine());
        System.out.println("Mời bạn nhập phép toán:");
        String operation = sc.nextLine();
        switch(operation){
            case "+":
                System.out.println("a+b ="+(a+b));
                break;
            case "-":
                System.out.println("a-b ="+(a-b));
                break;
            case "*":
                System.out.println("a*b ="+(a*b));
                break;
            case ":":
                System.out.println("a:b ="+(a/b));
                break;
            case "%":
                System.out.println("a%b ="+(a%b));
                break;
            default:
                System.out.println("Kết thúc chương trình");
        }
    }
}
