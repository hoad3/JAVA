package Bai1;

class HinhTron {

    private final float PI = 3.14F;
    private float BanKinh;

    public float setCV() {
        return CV();
    }

    public float setDT() {
        return DT();
    }

    public HinhTron(float BanKinh) {
        this.BanKinh = BanKinh;
    }

    public float CV() {
        float CV = 2 * PI * BanKinh;
        return CV;
    }

    public float DT() {
        float DT = PI * (BanKinh * BanKinh);
        return DT;
    }
}
