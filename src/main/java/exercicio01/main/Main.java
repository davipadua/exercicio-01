package exercicio01.main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main app = new Main();
		app.start();
		

	}

	private void start() {
		// TODO Auto-generated method stub
		
		
		int idade = 15;
		System.out.println("A idade � de " + idade + " anos");
		
		idade = (idade + 5) * 2;
		System.out.println("Resultado 1: " + idade);
		
		idade -= 5;
		System.out.println("Resultado 2: " + idade);
		
		if(idade > 20) {
			
			System.out.println("A idade � maior que 20");
			
		} else {
			
			System.out.println("A idaden � menor que 20");
			
			
		}
	}

}
