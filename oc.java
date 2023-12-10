import java.util.Scanner;

public class oc {
    public static void main(String[] args) {
        // ส่วนหัว
        System.out.println("โปรแกรมเเปรงอุณหภูมิฟาเรนไฮต์เป็นเซลเซียส");
        System.out.println("ดนัย แพรเขียว เลขประจำตัว: 66122250074");
        System.out.println("\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("กรุณาใส่อุณหภูมิฟาเรนไฮต์: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (5.0 / 9) * (fahrenheit - 32);

        System.out.printf("อุณหภูมิในหน่วยเซลเซียส: %.2f%n", celsius);

        scanner.close();
    }
}
