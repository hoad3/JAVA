package baitaptrenlop;

public class main {
    public static void main(String[] args) {
        //hinh chu nhat
        HinhCN hinhCN = new HinhCN();
        hinhCN.NhapvaoDaivaRong();
        hinhCN.XuatTen();
        hinhCN.Tinhchuvi();
        hinhCN.Tinhdientich();
        hinhCN.inChuvi();
        hinhCN.inDientich();
        //hinh tron
        Hinhtron hinhtron = new Hinhtron();
        hinhtron.XuatTen();
        hinhtron.NhapBankinh();
        hinhtron.Tinhchuvi();
        hinhtron.Tinhdientich();
        hinhtron.inChuvi();
        hinhtron.inDientich();
    }
}
