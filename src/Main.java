import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhập vào cạnh thứ nhất : ");
            int a = scanner.nextInt();
            System.out.print("Nhập vào cạnh thứ hai : ");
            int b = scanner.nextInt();
            System.out.print("NHập vào cạnh thứ ba : ");
            int c = scanner.nextInt();
            checkTriangle(a,b,c);
        }catch (TriangleException e ){
            e.printStackTrace();
        }
    }
    public static void checkTriangle(int a,int b, int c) throws TriangleException {
        if (a<=0||b<=0||c<=0 || a + b <=c || a + c <= b || b+c <= a){
            throw new TriangleException("Tam giác không hợp lệ !!!");
        }
    }
}
