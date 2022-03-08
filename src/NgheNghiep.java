import java.util.Scanner;

public class NgheNghiep {
    private String chucdanh;
    private String phongban;
    private String congty;

    public NgheNghiep() {};
    public NgheNghiep(String chucdanh, String phongban, String congty) {
        this.chucdanh = chucdanh;
        this.phongban = phongban;
        this.congty = congty;
    }
    public String getChucdanh() {
        return chucdanh;
    }

    public String getCongty() {
        return congty;
    }

    public String getPhongban() {
        return phongban;
    }

    public void setChucdanh(String chucdanh) {
        this.chucdanh = chucdanh;
    }

    public void setCongty(String congty) {
        this.congty = congty;
    }

    public void setPhongban(String phongban) {
        this.phongban = phongban;
    }

    public void inputNgheNghiep() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Công ty:");
        setCongty(sc.next());
        System.out.print("Phòng ban: ");
        setPhongban(sc.next());
        System.out.print("Chức danh: ");
        setChucdanh(sc.next());
    }

    @Override
    public String toString() {
        return "Công ty: " + congty + ", Phòng ban: " + phongban + ", Chức danh: " + chucdanh + "\n";
    }
}
