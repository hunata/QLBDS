import entities.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
         /*Hãy xây dựng chương trình Java cho phép
        Ghi nhận thông tin các mảnh đất mà thương nhân mua được từ console
        Xuất ra thông tin các mảnh đất có một loại hình dạng nào đó (ví dụ: hình vuông, hình tròn, …)
        Nhận thông tin giá đất trên m2 từ console, hãy cho biết tổng tiền mà thương nhân cần chi trả để sở hữu tất cả các mảnh đất
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Số mảnh đất: ");
        int n = Integer.parseInt(sc.nextLine());
        Hinh[] list = new Hinh[n];
        for (int i = 0; i < n; i++) {
            System.out.format("Mảnh đất thứ %d", i + 1);
            System.out.format("- Loại : 1 - Hình chữ nhật, 2 - Hình vuông, 3 - Hình tròn, 4 - Hình tam giác \n");
//            int type = Integer.parseInt(sc.nextLine());
            int type = sc.nextInt();
//            if (type == 0) {
//                list[i] = new HinhChuNhat();
//            } else if (type == 1) {
//                list[i] = new HinhVuong();
//            } else if (type == 2) {
//                list[i] = new HinhTron();
//            } else {
//                list[i] = new HinhTamGiac();
//            }
            list[i] = createHinh(type);
            list[i].formConsole(sc);
        }
        for (Hinh h : list) {
            System.out.println(h);
        }
        double pricePerUnit = 5;
        double total = 0;
        for (Hinh s : list) {
            total += pricePerUnit * s.calculator();
        }
        System.out.println("Tổng tiền: " + total);
    }
    private static Hinh createHinh(int type) {
        switch (type) {
            case 1:
                return new HinhChuNhat();

            case 2:
                return new HinhVuong();

            case 3:
                return new HinhTron();

            case 4:
                return new HinhTamGiac();

            default:
                return null;
        }
    }
}
