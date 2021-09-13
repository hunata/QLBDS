package entities;

import java.util.Scanner;

public class Diem {
    private int x, y;

    public void setX(int x) {
        if (x < -10 || x > 10)
            return;
        this.x = x;
    }

    public void setY(int y) {
        if (y < -10 || y > 10)
            this.y = y;
    }

    public Diem() {
        this.x = 0;
        this.y = 0;
    }

    public Diem(int px, int py) {
        this.x = px;
        this.y = py;
    }

    public static Diem formConsoleDiem() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Diem d1 = Diem.parseFromString(str);
        return d1;
    }

    public static Diem parseFromString(String str) {
        String[] parts = str.split(",");
        Diem ret = new Diem();
        ret.x = Integer.parseInt(parts[0]);
        ret.y = Integer.parseInt(parts[1]);
        return ret;
    }

    public String toString() {
        final StringBuffer sb = new StringBuffer("");
        sb.append("x=").append(x);
        sb.append(", y=").append(y);
        sb.append('\n');
        return sb.toString();
    }

    public static Diem generate() {
        final int max = 10;
        final int min = -10;
        int x = (int) Math.floor(Math.random() * (max - min)) + min;
        int y = (int) Math.floor(Math.random() * (max - min)) + min;
        return new Diem(x, y);
    }

    public double distance(Diem another) {
        double dx = another.x - this.x;
        double dy = another.y - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
