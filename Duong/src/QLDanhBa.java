import java.util.Scanner;

public class QLDanhBa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean checkWhile = true;
        String checkaddLH;
        System.out.print("Nhập mã danh bạ: ");
        DanhBa myDB = new DanhBa(sc.nextLine());
        System.out.print("Nhập n liên hệ (0 < n < 10)");
        while (checkWhile) {
            System.out.println("Tổng số liên hệ: " + myDB.getListLH().size());
            myDB.createLH();
            System.out.print("Bạn muốn tiếp tục thêm liên hệ (Y/N)?");
            checkaddLH = sc.next();
            switch (checkaddLH){
                case "Y":
                case "y":
                    break;
                case "N":
                case "n":
                    checkWhile = false; break;
                default:
                    checkWhile = false;
                    System.out.println("Bạn nhập sai.");
                    break;
            }
        }
        checkWhile = true;
        while (checkWhile){
            System.out.println("Nhập số tương tự việc bạn muốn làm:"
                    + "\n0. Thoát"
                    + "\n1. In ra danh bạ"
                    + "\n2. In ra danh bạ đã sắp xếp"
                    + "\n3. In ra số tk theo công ty FPT và phòng ban IT"
                    + "\n4. In danh bạ ra file và viết vào danh bạ mới"
                    + "\n");

            int count = sc.nextInt();
            switch (count) {
                case 1:
                    myDB.printDanhBa();
                    break;
                case 2:
                    myDB.sortLHtheoSodu();
                    myDB.printDanhBa();
                    break;
                case 3:
                    myDB.printSodutheoCongty("FPT", "IT");
                    break;
                case 4:
                    break;
                default:
                    checkWhile = false;
                    break;
            }
        }

    }
}
