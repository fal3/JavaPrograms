
class EmptyArrayException extends Exception {
	public EmptyArrayException()
	{
		super("Empty array");
	}
	public EmptyArrayException(String message)
	{
		super(message);
	}

}
