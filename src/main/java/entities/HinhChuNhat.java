package entities;

import java.util.Scanner;

public class HinhChuNhat extends Hinh {
    private double chieuDai, chieuRong;
    Diem topLeft = new Diem();

    public HinhChuNhat() {
    }

    public HinhChuNhat(double chieuDai, double chieuRong){
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public void formConsole(Scanner sc) {
        System.out.println("- Chiều dài: ");
        chieuDai = sc.nextDouble();

        System.out.println("- Chiều rộng ");
        chieuRong = sc.nextDouble();

        System.out.println("Nhập vào điểm trái trên: ");
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Hình chữ nhật:\n");
        sb.append("- Điểm trái trên: "). append(topLeft.formConsoleDiem());
        sb.append("- Chiều dài = ").append(chieuDai);
        sb.append(", Chiều rộng = ").append(chieuRong);
        sb.append('\n');
        return sb.toString();
    }

    @Override
    public double calculator() {
        double s = this.chieuDai*chieuRong;
        return s;
    }
}
