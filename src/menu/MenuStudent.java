package menu;

import manager.ComplaintManager;
import manager.StudentManager;

import java.util.Scanner;

public class MenuStudent {
    public static void menu2() {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();
        ComplaintManager complaintManager = new ComplaintManager();

        while (true) {
            System.out.println("Quản lý học sinh");
            System.out.println("1. Hiển thị score");
            System.out.println("2. Khiếu nại ( hoặc đề xuất hoạt động)");
            System.out.println("3. Thoát");

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
                    studentManager.display();
                    break;
                case 2:
                    complaintManager.submitComplaint();
                    break;
                case 3:
                    return;
            }
        }
    }}
