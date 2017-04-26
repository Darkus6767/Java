
public class MyException extends Exception {
	public MyException()
	{
		System.out.println("Utworzenie wyj¹tku");
	}
}
class ExceptionSample{
	public void doSth() throws MyException{
		System.out.println("Zg³oszenie wyj¹tku MyException");
		throw new MyException();
	}
}

