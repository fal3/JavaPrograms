
public class ExaggertingKid extends SchoolKid {
	public int getAge(){
		int newAge = super.getAge() + 2;
		return newAge;
	}
	public String getGreeting(){
		String greeting = super.getGreeting();
		return greeting + " I am the best";
	}
}
