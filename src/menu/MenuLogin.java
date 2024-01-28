package menu;

import login.LoginManager;

import java.util.Scanner;

public class MenuLogin {
    public static void menulogin() {
        Scanner scanner = new Scanner(System.in);
        LoginManager loginManager = new LoginManager();
        MenuTeacher menuTeacher = new MenuTeacher();
        MenuStudent menuStudent = new MenuStudent();
        while (true) {
            System.out.println("Menu Login");
            System.out.println("1. Dang Nhap");
            System.out.println("2. Dang Ki");
            System.out.println("3. Thoat");
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
                case 2:
                    System.out.println("Dang ki");
                    System.out.println("1. Hoc sinh dang ki");
                    System.out.println("2. Giao vien dang ki");
                    System.out.println("3. Quay lai");
                    System.out.println("Nhập lựa chọn của bạn: ");
                    int registrationChoice = scanner.nextInt();
                    scanner.nextLine();
                    switch (registrationChoice){
                        case 1:
                            System.out.println("Dang ki danh cho hoc sinh");
                            loginManager.registerStudent();
                            break;
                        case 2:
                            System.out.println("Dang ki danh cho giao vien");
                            loginManager.registerTeacher();
                            break;
                        case 3:
                            System.out.println("Quay lai menu");
                            break;
                        default:
                            System.out.println("Loi, chon lai menu");
                            break;
                    }
                    break;
                case 1:
                    System.out.println("Dang nhap");
                    System.out.println("1. Hoc sinh dang nhap");
                    System.out.println("2. Giao vien dang nhap");
                    System.out.println("3. Quay lai");
                    System.out.print("Nhập lựa chọn của bạn: ");
                    int loginChoice = scanner.nextInt();
                    scanner.nextLine();
                    switch (loginChoice){
                        case 1:
                            System.out.println("Dang nhap danh cho hoc sinh");
                            if (loginManager.studentLogin()) {
                                menuStudent.menu2();
                            };
                            break;
                        case 2:
                            System.out.println("Dang nhap danh cho giao vien");
                            if (loginManager.teacherLogin()) {
                                menuTeacher.menu1();

                            }


                            break;
                        case 3:
                            System.out.println("Quay lai menu");
                            break;
                        default:
                            System.out.println("Loi, chon lai menu");
                            break;
                    }
                    break;
                case 3:
                    return;
            }
        }
    }
}
