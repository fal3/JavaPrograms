
public class RegularPay extends PayCalculator{
	public RegularPay(double payRate){
		setPayRate(payRate);
	}
}

public class HazardPay extends PayCalculator{
	public HazardPay(double payRate){
		setPayRate(payRate);
	}
	public double computePay(int hours){
		double pay = super.computePay(hours);
		return pay*1.5;
	}
}
