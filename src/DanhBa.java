import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DanhBa {
    private String MaDB;
    private List<LienHe> listLH;

    public DanhBa() {};
    public DanhBa(String MaDB) {
        this.MaDB = MaDB;
        listLH = new ArrayList<>();
    }
    public DanhBa(String MaDB, List<LienHe> listLH) {
        this.listLH = List.copyOf(listLH);
    }
    public List<LienHe> getListLH() {
        return listLH;
    }

    public String getMaDB() {
        return MaDB;
    }

    public void setListLH(List<LienHe> listLH) {
        this.listLH = listLH;
    }

    public void setMaDB(String maDB) {
        MaDB = maDB;
    }

    public void createLH(LienHe lienhe) {
        listLH.add(lienhe);
    }

    public void createLH(String MaLH, String tentb, String sdt, String email, Double sodu, String chucdanh, String phongban, String congty) {
        listLH.add(new LienHe(MaLH, tentb, sdt, email, sodu, chucdanh, phongban
        , congty));
    }

    public void sortLHtheoSodu() {
        this.listLH.sort(ThueBao::compareTo);
    }

    public void printSodutheoCongty(String congty, String phongban) {
        int count = 0;
        double sum = 0;
        for (int i=0; i<listLH.size(); i++) {
            if (congty.compareTo(listLH.get(i).getNgheNghiep().getCongty()) == 0
            && phongban.compareTo(listLH.get(i).getNgheNghiep().getPhongban()) == 0) {
                count++;
                sum += listLH.get(i).getSodu();
            }
        }
        System.out.println("Tổng số tài khoản: " + count);
        System.out.println("Tổng số dư: " + sum);
    }
    public void createLH() {
        LienHe lh = new LienHe();
        lh.inputLienHe();
        listLH.add(lh);
    }

    public void printDanhBa() {
        System.out.println(this);
    }
    @Override
    public String toString() {
        return
                "Mã Danh Bạ: " + MaDB + '\n' +
                "Liên hệ: " + listLH;
    }
}
