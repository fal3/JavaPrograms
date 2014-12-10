
class NegativeCounterException extends Exception {
	public NegativeCounterException(){
		super("NegativeCounterException");
	}
	public NegativeCounterException(String message){
		super(message);
	}
}
