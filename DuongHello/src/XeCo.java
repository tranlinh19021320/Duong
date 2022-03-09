
import java.util.Scanner;

public class XeCo {
    private String tenXe;
    private Double giaXe;
    private String kieuXe;

    public XeCo() {};
    public XeCo(String tenXe, Double giaXe, String kieuXe) {
        this.giaXe = giaXe;
        this.tenXe = tenXe;
        this.kieuXe = kieuXe;
    }

    public Double getGiaXe() {
        return giaXe;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public String getTenXe() {
        return tenXe;
    }

    public void setGiaXe(Double giaXe) {
        this.giaXe = giaXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    public void setTenXe(String tenXe) {
        this.tenXe = tenXe;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten xe:");
        setTenXe(sc.next());
        System.out.println("Nhap kieu xe:");
        setKieuXe(sc.next());
        System.out.println("Nhap gia xe:");
        setGiaXe(sc.nextDouble());
    }
    public void display() {
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return "XeCo{" +
                "tenXe='" + tenXe + '\'' +
                ", giaXe=" + giaXe +
                ", kieuXe='" + kieuXe + '\'' +
                '}';
    }
}
