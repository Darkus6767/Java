
public class MyException extends Exception {
	public MyException()
	{
		System.out.println("Utworzenie wyj�tku");
	}
}
class ExceptionSample{
	public void doSth() throws MyException{
		System.out.println("Zg�oszenie wyj�tku MyException");
		throw new MyException();
	}
}

