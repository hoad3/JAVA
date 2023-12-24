public class CamCaoPhong extends Quacam {
    public String color = "vang nhat";

    public void CamCaoPhong() {
        Tenqua = "Cam cao Phong";
        Giaban = "25k";
        Ngaynhap = "28/03/20023";
        Soluong = "2 Tan";
    }

    public void xuatCamCaoPhong() {
        System.out.println("mau sac=" + color);
        System.out.println("hinh dang=" + Ngaynhap);
        System.out.println("tenn qua=" + Tenqua);
        System.out.println("ngon goc=" + nguongoc);
        System.out.println("gia ban=" + Giaban);
        System.out.println("so luong= "+ Soluong);

    }

    public CamCaoPhong(String Tenqua, String nguongoc, String Ngaynhap, String Giaban, String Soluong, String color) {
        super(Tenqua, nguongoc, Ngaynhap, Soluong, Giaban);
        this.color = color;

    }

    public String getColor() {
        return color;
    }

    public void setColor() {
        this.color = color;
    }
}