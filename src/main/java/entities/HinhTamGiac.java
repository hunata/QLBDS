package entities;

import java.util.Scanner;

public class HinhTamGiac extends Hinh {
    private Diem d1, d2, d3;

    public HinhTamGiac() {
        this.d1 = Diem.generate();
        this.d2 = Diem.generate();
        this.d3 = Diem.generate();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Hinh Tam Giác: \n");
        sb.append("Điểm d1: ").append(d1);
        sb.append("\nĐiểm d2: ").append(d2);
        sb.append("\nĐiểm d3: ").append(d3);
        sb.append('\n');
        return sb.toString();
    }

    public double calculator() {
        double p = (this.d1.distance(d2) + this.d2.distance(d3) + this.d3.distance(d1)) / 2;
        double s = Math.sqrt(p * (p - this.d1.distance(d2)) * (p - this.d2.distance(d3)) * (p - this.d3.distance(d1)));
        return s;
    }
}
