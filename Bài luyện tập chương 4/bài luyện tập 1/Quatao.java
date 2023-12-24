public class Quatao extends Hoaqua {
public String Soluong;
    public void Tao() {
        Tenqua = "Tao";
        Giaban = "20kk";
        Ngaynhap = "25/06/20023";
        Soluong = "2 Tan";
    }

    public void xuatTao() {
        System.out.println("ten qua="+ Tenqua);
        System.out.println("ngay nhap=" + Ngaynhap);
        System.out.println("ngon goc=" + nguongoc);
        System.out.println("gia ban=" + Giaban);
        System.out.println("so luong="+ Soluong);

    }
    public Quatao(String Tenqua, String nguongoc, String Ngaynhap, String Giaban, String Soluong) {
        super(Tenqua, nguongoc, Ngaynhap, Giaban);

        this.Soluong = Soluong;
    }
    public String getSoluong()
    {
        return Soluong;
    }
    public void setSoluong()
    {
        this.Soluong = Soluong;
    }

}
