package marksheet;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner studentno = new Scanner(System.in);
		System.out.println("ENTER THE STUDENT NO");
		int sNo = studentno.nextInt();
		System.out.println("ENTER THE STUDENT NAME");
		Scanner studentname = new Scanner(System.in);
		String studentName = studentname.nextLine();
		System.out.println("ENTER MARKS FOR SUBJECT 1");
		Scanner subject1 = new Scanner(System.in);
		int Sub1 = subject1.nextInt();
		System.out.println("ENTER MARKS FOR SUBJECT 2");
		Scanner subject2 = new Scanner(System.in);
		int Sub2 = subject2.nextInt();
		System.out.println("ENTER MARKS FOR SUBJECT 3");
		Scanner subject3 = new Scanner(System.in);
		int Sub3 = subject3.nextInt();
		System.out.println("ENTER MARKS FOR SUBJECT 4");
		Scanner subject4 = new Scanner(System.in);
		int Sub4 = subject4.nextInt();
		System.out.println("ENTER MARKS FOR SUBJECT 5");
		Scanner subject5 = new Scanner(System.in);
		int Sub5 = subject5.nextInt();
		int total = Sub1 + Sub2 + Sub3 + Sub4 + Sub5;
		double average = total /5;
		double sub1average = Sub1 /1;
		double sub2average = Sub2 /1;
		double sub3average = Sub3 /1;
		double sub4average = Sub4 /1;
		double sub5average = Sub5 /1;
		


		System.out.println("");
		System.out.println("Welcome to Student Mark List Application");
		System.out.println("__________________________________________________________________________________________");
		System.out.println("SNo  Student Name\t\tSub1\tSub2\tSub3\tSub4\tSub5\tTotal\tAverage");
		System.out.println("__________________________________________________________________________________________");
		System.out.println(sNo + "    " + studentName + "\t\t\t" + Sub1 +"\t" + Sub2 + "\t" + Sub3 + "\t" + Sub4 + "\t" + Sub5 +"\t" + total +"\t" + average);
		System.out.println("__________________________________________________________________________________________");
		System.out.println("\t\tAverage"+ "\t\t" + (int)sub1average + "\t" + (int)sub2average+ "\t" + (int)sub3average +"\t" + (int)sub4average+"\t"+ (int)sub5average+ "\t");
		
	}

}
