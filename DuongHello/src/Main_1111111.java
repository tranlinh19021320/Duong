import java.util.ArrayList;
import java.util.Scanner;

public class Main_1111111 {
    public static void main(String[] args) {
        ArrayList<DoanhNghiep> danhsachDN = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n la so doanh nghiep:");
        int n = sc.nextInt();
        System.out.println("Nhap n doanh nghiep:");
        for (int i=0; i<n; i++) {
            DoanhNghiep dn = new DoanhNghiep();
            dn.input();
            danhsachDN.add(dn);
        }
        //a, in ra danh sach doanh nghiep xe Sh mode va so luong xe mua la so chinh phuong
        for (DoanhNghiep value : danhsachDN) {
            if (value.getKieuXe() == "Sh mode") {
                double slm = value.getSLmuaXe();
                if ((int) Math.sqrt(slm) * (int) Math.sqrt(slm) == slm)
                    value.display();
            }
        }

        //b, tinh tong tien chi tra de mua xe
        for (DoanhNghiep nghiep : danhsachDN) {
            System.out.print(nghiep.getTenDN() + ": ");
            System.out.println(nghiep.getGiaXe() * nghiep.getSLmuaXe());
        }

        //c, sap xep theo tong tien
        danhsachDN.sort(DoanhNghiep::compareTo);
        for (DoanhNghiep doanhNghiep : danhsachDN) doanhNghiep.display();

        //d, Nhap nguoi mua
        System.out.println("Nhap M la so nguoi mua:");
        int m = sc.nextInt();
        ArrayList<NguoiMua> nguoiMua = new ArrayList<>();
        for (int i=0; i<m; i++) {
            NguoiMua nguoiMua1 = new NguoiMua();
            nguoiMua1.input();
            nguoiMua.add(nguoiMua1);
        }

        for (int i=0; i<m; i++) nguoiMua.get(i).display();

        //e, tim nguoi mua gia xe dat nhat
        double maxGiaXe = 0;
        int j =-1;
        for (int i=0; i<nguoiMua.size(); i++)
            if (nguoiMua.get(i).getGiaXe() >= maxGiaXe) {
                j=i;
                maxGiaXe = nguoiMua.get(i).getGiaXe();
            }

        if (j == -1) System.out.println("Khong co nguoi mua xe");
        else nguoiMua.get(j).display();

        //f, tim nguoi mua xe Lead va giam gia
        for (NguoiMua mua : nguoiMua)
            if (mua.getKieuXe() == "Lead")
                mua.setGiaXe(mua.getGiaXe() * 0.9);
        for (NguoiMua mua : nguoiMua) mua.display();
    }
}
