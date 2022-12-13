package minitest2;

import java.util.Scanner;

public class StudentManager {
    public static Student[] listStudent = new Student[10];
    public void display() {
        for (Student p : listStudent) {
            if (p != null) {
                System.out.println(p);
            }
        }
    }

    public void maxMin() {
        Student student = null;
        double max = 0;
        for (Student p : listStudent) {
            if (p != null) {
                if (p.getAvg() > max) {
                    max = p.getAvg();
                    student = p;
                }

            }

        }
        for (Student p : listStudent) {
            if (p != null) {
                if (p.getAvg() == max) {
                    System.out.println("day la diem cao nhat : " + p);
                }

            }

        }

        Student student1 = null;
        double min = listStudent[0].getAvg();
        for (Student b : listStudent) {
            if (b != null) {
                if (b.getAvg() < min) {
                    min = b.getAvg();
                    student1 = b;
                }
            }
        }
        for (Student p : listStudent) {
            if (p != null) {
                if (p.getAvg() == min) {
                    System.out.println("day la diem thap nhat : " + p);
                }

            }

        }
    }

    public void AddStudent() {
        int index = 0;
        for (Student student : listStudent) {
            if (student != null) {
                index++;


            }
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tên");
        String name = scanner.nextLine();
        System.out.println("nhập tuổi");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập địa chỉ:");
        String address = scanner.nextLine();
        System.out.println("nhập giới tính:");
        String gender = scanner.nextLine();
        System.out.println("nhập điểm :");
        double avg = Integer.parseInt(scanner.nextLine());
        listStudent[index + 1] = new Student(index + 1, name, age, address, gender, avg);


    }

    public void findByName(String name) {
        Student student1 = null;
        for (Student c : listStudent) {
            if (c != null) {
                if (c.getName().equals(name)) {
                    student1 = c;
                }


            }

        }
        System.out.println(student1);

    }

    public void deletedByName(String name) {
        for (int i = 0; i < listStudent.length; i++) {
            if (listStudent[i] != null) {
                if (listStudent[i].getName().equals(name)) {
                    listStudent[i] = null;

                }
            }


        }

    }

    public void searchByGender(String gender) {
        for (Student c : listStudent) {
            if (c != null) {
                if (c.getGender().contains(gender)) {
                    System.out.println(c);
                }
            }
        }
    }

    public void changeByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("sửa theo id:");
        int A = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên");
        String name = scanner.nextLine();
        System.out.println("nhập tuổi");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập địa chỉ");
        String address = scanner.nextLine();
        System.out.println("nhập giới tính:");
        String gender = scanner.nextLine();
        System.out.println("nhập điểm trung bình");
        double avg = Integer.parseInt(scanner.nextLine());
        for (Student student : listStudent) {
            if (student != null) {
                if (A == student.getId()) {
                    student.setName(name);
                    student.setAge(age);
                    student.setAddress(address);
                    student.setGender(gender);
                    student.setAvg(avg);

                    break;
                }
            }
        }
    }
}


















