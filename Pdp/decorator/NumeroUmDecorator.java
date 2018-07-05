package decoraor;

public class NumeroUmDecorator implements Number{
	private Number number;
	public NumeroUmDecorator(Number n) {
		this.number = n;
	}
	public Number getNumeroUm() {
		return this.number;
	}
	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		
	}
}
