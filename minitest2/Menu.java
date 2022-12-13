package minitest2;

import java.util.Scanner;

public class Menu {
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        StudentManager studentManager = new StudentManager();
        studentManager.listStudent[0] = new Student(1, "vinh", 20, "HaNoi", "nam", 60);
        studentManager.listStudent[1] = new Student(2, "minh", 20, "HaNoi", "nam", 60);
        studentManager.listStudent[2] = new Student(3, "linh", 20, "HaNoi", "nam", 60);
        studentManager.listStudent[3] = new Student(4,"Trang", 20, "Hưng yên", "nữ", 30);
        do {
            System.out.println("Menu lựa chọn");
            System.out.println("1.hiển thị danh sách sinh viên");
            System.out.println("2.Hiển thị sinh viên điểm cao - thấp :");
            System.out.println("3.thêm sinh viên :");
            System.out.println("4.Tìm theo tên");
            System.out.println("5.Xóa theo tên:");
            System.out.println("6.Tìm theo giơới tính");
            System.out.println("7.Sửa theo Id :");
            System.out.println("enter choice:");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    studentManager.display();
                    break;
                case 2:
                    studentManager.maxMin();
                    break;
                case 3:
                    studentManager.AddStudent();
                    break;
                case 4:
                    System.out.println("Tìm theo tên");
                    String name = scanner.nextLine();
                    studentManager.findByName(name);
                    break;
                case 5:
                    System.out.println("xóa theo tên:");
                    String name1 = scanner.nextLine();
                    studentManager.deletedByName(name1);
                    break;
                case 6:
                    System.out.println("tìm theo giới tính:");
                    String gender = scanner.nextLine();
                    studentManager.searchByGender(gender);
                    break;
                case 7:
                    studentManager.changeByName();
                    break;


            }


        } while (choice != 0) ;
    }

}



