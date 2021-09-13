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
            System.out.format("mảnh đất thứ %d", i + 1);
            System.out.format("- Loại Mảnh: 0 Hình chữ nhật, 1 Hình vuông, 2 Hình tròn, 3 Hinh tam giác \n");
            int type = Integer.parseInt(sc.nextLine());
            if (type == 0) {
                list[i] = new HinhChuNhat();

            } else if (type == 1) {
                list[i] = new HinhVuong();
            } else if (type == 2) {
                list[i] = new HinhTron();
            } else {
                list[i] = new HinhTamGiac();
            }
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
}