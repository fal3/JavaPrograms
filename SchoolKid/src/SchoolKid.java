import java.util.Scanner;
public class SchoolKid {
	private String name;
	private int age;
	private String teacher;
	private String greeting;
	
	public void setname(String newName){
		name = newName;
	}
	public void setAge(int newAge){
		age = newAge;
	}
	public void setTeacher(String newTeacher){
		teacher = newTeacher;
	}
	public void setGreeting(String newGreeting){
		greeting = newGreeting;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getTeacher(){
		return teacher;
	}
	public String getGreeting(){
		return greeting;
	}

}
