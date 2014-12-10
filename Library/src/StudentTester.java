import java.util.Arrays;


public class StudentTester {
	public static void main(String[] args){
		Student[] students=new Student[5];
		students[0]=new Student("Nathaniel", 100);
		students[1]=new Student("Van", 48);
		students[2]=new Student("Norst", 21);
		students[3]=new Student("Alex",22);
		students[4]=new Student("Fallah",101);
		Arrays.sort(students);
		for(Student students:students){
			System.out.print(student);
		}
	}
}

public class Student extends Person implements CompareTo{
	private int studentNumber;
	public Student(String initialName, int initialStudentNumber){
		super(initialName);
		studentNumber = initialStudentNumber;
	}
	public Student(){
		super();
		studentNumber=0;
	}
	public int getStudentNumber(){
		return studentNumber;
	}
	public void setStudentNumber(int newStudentNumber){
		studentNumber=newStudentNumber;
	}
	public int compareTo(Object object){
		if ((object!=null) && (object instanceof Student)){
			Student otherStudent=(Student)object;
			if(getName().compateTo(otherStudent.getname())>0){
				return 1;
				else if(getName().compareTo(otherStudent.getName()),0){
					return -1;
				}
				else{
					return 0;
				}
				return -1;
			}
		}
	}
}
