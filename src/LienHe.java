import java.util.Scanner;

public class LienHe extends ThueBao{
    private String MaLH;
    private String email;
    private NgheNghiep ngheNghiep;

    public LienHe() {super();};
    public LienHe(String MaLH, String tentb, String sdt, String email, Double sodu, String chucdanh, String phongban, String congty ) {
        super(tentb, sdt, sodu);
        this.MaLH = MaLH;
        this.email = email;
        setNgheNghiep(chucdanh, phongban, congty);
    }

    public String getMaLH() {
        return MaLH;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMaLH(String maLH) {
        MaLH = maLH;
    }

    public void setThueBao(String tentb, String sdt, Double sodu) {
        super.setSdt(sdt);
        super.setTentb(tentb);
        super.setSodu(sodu);
    }

    public void setNgheNghiep(String chucdanh, String phongban, String congty) {
        this.ngheNghiep.setCongty(congty);
        this.ngheNghiep.setPhongban(phongban);
        this.ngheNghiep.setChucdanh(chucdanh);
    }

    public NgheNghiep getNgheNghiep() {
        return ngheNghiep;
    }

    public void inputLienHe() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mã liên hệ: ");
        this.MaLH = sc.next();
        super.inputThueBao();
        System.out.print("Email: ");
        this.email = sc.next();
        this.ngheNghiep = new NgheNghiep();
        this.ngheNghiep.inputNgheNghiep();
    }

    @Override
    public String toString() {
        return
                "\nMã liên hệ: " + MaLH + '\n' + "Email: " + email + '\n' +
                super.toString() +
                 ngheNghiep;
    }
}
