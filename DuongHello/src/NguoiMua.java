import java.util.Scanner;

public class NguoiMua extends XeCo {
    private String soCM;
    private String hoTen;
    private int day;
    private int month;
    private int year;
    private String gioitinh;

    public NguoiMua() {super(); }
    public NguoiMua(String soCM, String hoTen, int day, int month, int year, String gioitinh) {
        super();
        this.soCM = soCM;
        this.hoTen = hoTen;
        this.day = day;
        this.month = month;
        this.year = year;
        this.gioitinh = gioitinh;
    }

    public String getSoCM() {
        return soCM;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setSoCM(String soCM) {
        this.soCM = soCM;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so chung minh:");
        setSoCM(sc.next());
        System.out.println("Nhap ho va ten:");
        setHoTen(sc.next());
        System.out.println("Nhap ngay sinh:");
        setDay(sc.nextInt());
        System.out.println("Nhap thang sinh:");
        setMonth(sc.nextInt());
        System.out.println("Nhap nam sinh:");
        setYear(sc.nextInt());
        System.out.println("Nhap gioi tinh (nam/nu):");
        setGioitinh(sc.next());
        super.input();
    }

    @Override
    public void display() {
        System.out.println(this);
        super.display();
    }

    @Override
    public String toString() {
        return "NguoiMua{" +
                "so chung minh='" + soCM + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ",ngaysinh: "+ day +"/" + month + "/" + year +
                ", gioitinh='" + gioitinh + '\'' +
                '}';
    }
}
