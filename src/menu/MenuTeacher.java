package menu;

import login.LoginManager;
import manager.StudentManager;

import java.util.Scanner;

public class MenuTeacher {
    public static void menu1() {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();
        while (true) {
            System.out.println("Quản lý học sinh(giáo viên)");
            System.out.println("1. Hiển thị các hs");
            System.out.println("2. Thêm hs");
            System.out.println("3. Sửa hs");
            System.out.println("4. Xóa hs");
            System.out.println("5. Điểm trung bình của học sinh (nhap id)");
            System.out.println("6. Học sinh điểm cao nhất");
            System.out.println("7. Đọc file");
            System.out.println("8. Ghi file");
            System.out.println("9. Thoát");
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
                    studentManager.add(studentManager.create());
                    break;
                case 3:
                    studentManager.edit();
                    break;
                case 4:
                    studentManager.delete();
                    break;
                case 5:
                    studentManager.averageScore();
                    break;
                case 6:
                    studentManager.highestScore();
                    break;

                case 7:
                    studentManager.read();
                    break;
                case 8:
                    studentManager.write();

                case 9:
                    return;
            }

        }

    }
}

