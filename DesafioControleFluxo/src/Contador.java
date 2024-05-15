import java.util.Scanner;

public class Contador {

	public static void main(String[] args) throws Exception {
	/* receber parâmetros via terminal retorna inteiros*/
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o primeiro número:");
		int parametroUm = teclado.nextInt();
		System.out.println("Digite o segundo número:");
		int parametroDois = teclado.nextInt();
			
		try {
			contar(parametroUm, parametroDois);
            System.out.println("O programa foi finalizado");
		}
		catch (ParametrosInvalidosException exception) {
            //lançando exceção
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
    }

	static void contar(int parametroUm,int parametroDois) throws ParametrosInvalidosException {
		
        if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException();
        }
	
			int contagem = parametroDois - parametroUm;
			for(int i = 0; i <= contagem; i++) {
				System.out.println(i);
        }
	}

    }
  