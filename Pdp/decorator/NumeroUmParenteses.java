package decoraor;

public class NumeroUmParenteses extends NumeroUmDecorator{
	public NumeroUmParenteses(Number n) {
		super(n);
	}
	
	public void imprimir() {
		System.out.println("(1)");
	}
}
