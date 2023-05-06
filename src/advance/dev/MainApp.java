package advance.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] students = new Student[3];
		input(students);
		print(students);
	}

	private static void print(Student[] students) {
		// TODO Auto-generated method stub
		for (int j = 0; j < students.length; j++) {
			System.out.format("student[%d] : ", j + 1);
			System.out.println(students[j].toString());
		}
	}

	public static void input(Student[] students) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < students.length; i++) {
			System.out.println("Nhap thong tin sinh vien thu " + (i + 1));
			System.out.print("Ten: ");
			String name = sc.next();
			System.out.print("Tuoi: ");
			int age = sc.nextInt();
			System.out.print("Dia chi: ");
			String address = sc.next();
			System.out.print("So dien thoai: ");
			String phoneNumber = sc.next();
			System.out.print("Diem trung binh: ");
			double gpa = sc.nextFloat();
			students[i] = new Student(name, age, address, phoneNumber, gpa);
		}
		sc.close();
	}

}