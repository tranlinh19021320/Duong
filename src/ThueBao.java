import java.util.Scanner;

public class ThueBao implements Comparable<ThueBao> {
    private String tentb;
    private String sdt;
    private Double sodu;

    public ThueBao() {};
    public ThueBao (String tentb, String sdt, Double sodu) {
        this.sdt = sdt;
        this.sodu = sodu;
        this.tentb = tentb;
    }
    public String getSdt() {
        return sdt;
    }

    public String getTentb() {
        return tentb;
    }

    public Double getSodu() {
        return sodu;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void setSodu(Double sodu) {
        this.sodu = sodu;
    }

    public void setTentb(String tentb) {
        this.tentb = tentb;
    }

    public void inputThueBao() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tên thuê bao: ");
        setTentb(sc.next());
        System.out.print("Số điện thoại: ");
        setSdt(sc.next());
        System.out.print("Số dư: ");
        setSodu(sc.nextDouble());
    }

    public void printThueBao() {
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return "Tên thuê bao: " + tentb + '\n' +
                "Số điện thoại: " + sdt + '\n' +
                "Số dư: " + sodu + '\n';
    }

    @Override
    public int compareTo(ThueBao o) {
        return Double.compare(this.sodu, o.sodu);
    }
}
