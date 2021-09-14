package entities;

import java.util.Scanner;

public class HinhVuong extends Hinh {
    private double chieuRong;
    Diem topLeft = new Diem();

    public HinhVuong() {
    }

    public HinhVuong(double chieuDai, double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public void formConsole(Scanner sc) {
        System.out.println("- Chiều rộng ");
        chieuRong = sc.nextDouble();

        System.out.println("Nhập vào điểm trái trên: ");
        topLeft = Diem.formConsoleDiem();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Hình vuông:\n");
        sb.append("- Điểm trái trên: ").append(topLeft);
        sb.append("- Chiều rộng = ").append(chieuRong);
        sb.append('\n');
        return sb.toString();
    }

    @Override
    public double calculator() {
        double s = this.chieuRong * chieuRong;
        return s;
    }
}

