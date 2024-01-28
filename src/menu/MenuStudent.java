package menu;

import login.LoginManager;
import manager.StudentManager;

import java.util.Scanner;

public class MenuStudent {
    public static void menu2() {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();
        while (true) {
            System.out.println("Quản lý học sinh");
            System.out.println("1. Hiển thị score");
            System.out.println("2. Thoát");
            int choice = 0;
            while (true) {
                try {
                    System.out.println("Nhập lựa chọn của bạn");
                    choice = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (Exception e) {
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
                }
            }
            switch (choice){
                case 1:
                    studentManager.getScores();
                    break;
                case 2:
                    return;
            }
        }
    }}
