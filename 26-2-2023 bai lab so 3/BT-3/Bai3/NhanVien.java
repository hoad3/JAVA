package Bai3;
import java.util.Scanner;
public class NhanVien
{
    private String TenNhanVien;
    private double LuongCoBan;
    private double heSoLuong;
    private double LUONG_MAX;

        public NhanVien()
        {
            this.TenNhanVien = null;
            this.LuongCoBan = 0;
            this.heSoLuong = 0;
            this.LUONG_MAX = 0;

        }
        public String getTenNhanVien()
        {
            return TenNhanVien;
        }
        public void setTenNhanVien(String tenNhanVien)
        {
            this.TenNhanVien = tenNhanVien;
        }

    public double getLuongCoBan()
    {
        return LuongCoBan;
    }

    public void setLuongCoBan(double luongCoBan)
    {
        this.LuongCoBan = luongCoBan;
    }

    public double getHeSoLuong()
    {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong)
    {
        this.heSoLuong = heSoLuong;
    }

    public double getLUONG_MAX()
    {
        return LUONG_MAX;
    }

    public void setLUONG_MAX(double LUONG_MAX)
    {
        this.LUONG_MAX = LUONG_MAX;
    }
    public  double TinhLuong(double Luong)
    {
        Luong = LuongCoBan * heSoLuong;
        return Luong;
    }
    public Boolean TangLuong(double A)
    {
        setHeSoLuong(A);
        if(((heSoLuong + A) * LuongCoBan )>LUONG_MAX)
        {
            System.out.println("\nluong khong hop le");
            return false;
        }
        else {
            return true;
        }
    }
    public void inTTin()
    {
        System.out.println("\nten nhan vien:" + TenNhanVien + "\nluong co ban" + LuongCoBan + "\nhe so luong" + heSoLuong + "\nluong toi da " + LUONG_MAX );
    }
}
