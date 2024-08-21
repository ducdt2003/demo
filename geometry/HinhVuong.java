package geometry;

public class HinhVuong extends HinhHoc {
    private double canh;

    public HinhVuong() {
    }

    public HinhVuong(double canh) {
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    @Override
    public String toString() {
        return "HinhVuong{" +
                "canh=" + canh +
                '}';
    }
}
