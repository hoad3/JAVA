package Bai2;

public class Vector {
    private int x;
    private int y;
    private int z;

    public Vector() {
        x = 0;
        y = 0;
        z = 0;
    }

    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return this.z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public Vector CongVT(Vector A) {
        x += A.x;
        y += A.y;
        z += A.z;
        return new Vector(x, y, z);
    }

    public Vector TruVT(Vector A) {
        x -= A.x;
        y -= A.y;
        z -= A.z;
        return new Vector(x, y, z);
    }

    public Vector NhanHangSo(int A) {
       int newx = this.x * A;
       int newy = this.y * A;
       int newz = this.z * A;
        return new Vector(newx, newy, newz);
    }

    public int NhanVohuong(Vector A) {
        return this.x * A.x + this.y * A.y + this.z * A.z;
    }

    @Override
    public String toString() {
        return "{" +
                " x='" + getX() + "'" +
                ", y='" + getY() + "'" +
                ", z='" + getZ() + "'" +
                "}";
    }
}
