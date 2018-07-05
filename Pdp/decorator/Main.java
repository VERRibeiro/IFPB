package decoraor;


public class Main {
	public static void main (String[] args)
	//  ***********************************************
	{
		Numero1 n1 = new Numero1();
		n1.imprimir();
		
		NumeroUmChaves n2 = new NumeroUmChaves(n1);
		System.out.println("-------");
		n2.imprimir();
		System.out.println("-------");
		NumeroUmColchetes n3 = new NumeroUmColchetes(n1);
		n3.imprimir();
		System.out.println("-------");
		NumeroUmParenteses n4 = new NumeroUmParenteses(n1);
		n4.imprimir();
	}
}
