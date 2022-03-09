import java.util.Scanner;

public class DoanhNghiep extends XeCo implements Comparable<DoanhNghiep>{
    private String tenDN;
    private int SLmuaXe;
    private String tinh;

    public DoanhNghiep() {super();};
    public DoanhNghiep(String tenDN, int SLmuaXe, String tinh) {
        super();
        this.tenDN = tenDN;
        this.tinh = tinh;
        this.SLmuaXe = SLmuaXe;
    }

    public int getSLmuaXe() {
        return SLmuaXe;
    }

    public String getTenDN() {
        return tenDN;
    }

    public String getTinh() {
        return tinh;
    }

    public void setSLmuaXe(int SLmuaXe) {
        this.SLmuaXe = SLmuaXe;
    }

    public void setTenDN(String tenDN) {
        this.tenDN = tenDN;
    }

    public void setTinh(String tinh) {
        this.tinh = tinh;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten doanh nghiep:");
        setTenDN(sc.next());
        System.out.println("Nhap tinh:");
        setTinh(sc.next());
        super.input();
        System.out.println("Nhap so luong mua:");
        setSLmuaXe(sc.nextInt());
    }

    @Override
    public void display() {
        System.out.println(toString());
        super.display();
    }

    @Override
    public String toString() {
        return "DoanhNghiep{" +
                "tenDN='" + tenDN + '\'' +
                ", SLmuaXe=" + SLmuaXe +
                ", tinh='" + tinh + '\'' +
                '}';
    }

    @Override
    public int compareTo(DoanhNghiep o) {
        return Double.compare(this.SLmuaXe * super.getGiaXe(), o.getSLmuaXe() * o.getGiaXe());
    }
}
