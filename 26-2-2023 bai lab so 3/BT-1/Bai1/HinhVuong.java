package Bai1;

class HinhVuong {
    private int Canh;

    public int setChuVi() {
        int ChuVi = Canh * 4;
        return ChuVi;
    }

    public int setDienTich() {
        int DienTich = Canh * Canh;
        return DienTich;
    }

    public HinhVuong(int Canh) {
        this.Canh = Canh;
    }

    public void ChuVi() {

    }

    public void DienTich() {

    }
}
