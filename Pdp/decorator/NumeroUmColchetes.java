package decoraor;

public class NumeroUmColchetes extends NumeroUmDecorator{

	public NumeroUmColchetes(Number n) {
		super(n);
	}
	
	public void imprimir() {
		System.out.println("[1]");
	}
}
