
public abstract class PayCalculator {
	private double payRate;
	public double computePay(int hours){
		return payRate*hours;
	}
	void setPayRate(double payRate){
		this.payRate = payRate;
	}
	public double getPayRate(){
		return payRate;
	}

}
