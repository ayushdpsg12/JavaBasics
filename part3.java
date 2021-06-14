package basics;

import java.util.Scanner;

public class part3 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in); 
		
		String std_name,std_rollno;         
		float std_marks;
		int std_attendence;    
		
	     System.out.println("Enter Name, roll no, marks, attendence of student 1");
	     std_name = sc.next(); 
	     std_rollno = sc.next();
	     std_marks = sc.nextFloat();
	     std_attendence = sc.nextInt();
	     
	     if(std_marks<0) {std_marks=0;}
	     
	     student s1 =new student(std_name,std_rollno,std_marks,std_attendence);
	   
	     
	     if(s1.getAttendence()>75)
	     {s1.setMarks((float) (s1.getMarks()*1.1));}
	     if(s1.getMarks()>100)
	     {s1.setMarks(100);}
	     
	     
	     
	     sc.nextLine();
	     System.out.println("Enter Name, roll no, marks, attendence of student 2");
	     std_name = sc.next();
	     std_rollno = sc.next();
         std_marks = sc.nextFloat();
	     std_attendence = sc.nextInt();
	     
	     if(std_marks<0) {std_marks=0;}
	     
	    student s2 =new student(std_name,std_rollno,std_marks,std_attendence);
	   
	     
	     if(s2.getAttendence()>75)
	     {s2.setMarks((float) (s2.getMarks()*1.1));}
	     if(s2.getMarks()>100)
	     {s2.setMarks(100);}
	     
	     
	     
	  System.out.println(s1.getName()+" "+s1.getRollNo()+" "+s1.getMarks()+" "+s1.getAttendence());   
	  System.out.println(s2.getName()+" "+s2.getRollNo()+" "+s2.getMarks()+" "+s2.getAttendence());   
	     
		

	}

}

class student{
	
	private String name;
	private String rollNo;
	private float marks;
	private int attendence;
	
	public student(String a, String b, float c, int d)
	{
		name=a;
		rollNo=b;
		marks=c;
		attendence=d;
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public int getAttendence() {
		return attendence;
	}
	public void setAttendence(int attendence) {
		this.attendence = attendence;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	
	
	
  }

