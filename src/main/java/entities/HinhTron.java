package entities;

import java.util.Scanner;

public class HinhTron extends Hinh{
    private double banKinh;
    Diem center = new Diem();

    public HinhTron() {
    }

    public HinhTron(double banKinh){
        this.banKinh = banKinh;
    }

    public void formConsole(Scanner sc) {
//        Diem d = new Diem();
//        System.out.println("- Điểm trái trên: ");
//        String Diem = sc.nextLine();
//        d.formConsoleDiem(sc);
//        System.out.println(d)
        System.out.println("- Bán kính ");
        banKinh = sc.nextDouble();

        System.out.println("Nhập vào điểm trung tâm: ");
        Diem.formConsoleDiem();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Hình tròn:\n");
        sb.append("- Điểm trung tâm: "). append(center.formConsoleDiem());
        sb.append(", Chiều rộng = ").append(banKinh);
        sb.append('\n');
        return sb.toString();
    }

    public double calculator() {
        double s = (banKinh * banKinh) * Math.PI;
        return s;
    }

}