class NoServiceRequestException extends Exception{
	public NoServiceRequestException()
	{
		super("No service request");
	}
	public NoServiceRequestException(String message)
	{
		super(message);
	}
}
