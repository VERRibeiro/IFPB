package decoraor;

public class NumeroUmChaves extends NumeroUmDecorator{
	public NumeroUmChaves(Number n) {
		super(n);
	}
	
	public void imprimir() {
		System.out.println("{1}");
	}
}
