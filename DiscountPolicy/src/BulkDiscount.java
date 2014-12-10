
public class BulkDiscount extends DiscountPolicy {
	private int minimum;
	private double percent;
	
	public BulkDiscount(int minimum, double percent){
		this.minimum = minimum;
		this.percent = percent;
	}
	public double computeDiscount(int count, double itemCost){
		double discount;
		if (count > minimum){
			discount = (count*itemCost)*(1-percent);
			return discount;
		}
		else{
			return 0;
		}
	}
}
