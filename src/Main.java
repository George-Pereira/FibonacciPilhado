import javax.swing.JOptionPane;
public class Main 
{
	public static void main(String [] args) 
	{
		DynamicStack pilha = new DynamicStack ();
		int nTermo = Integer.parseInt(JOptionPane.showInputDialog("Insira o termo desejado"));
		int Fibonacci = 0;
		int aux;
		pilha.push(0);
		pilha.push(1);
		if(nTermo == 1) 
		{
			try 
			{
				System.out.println("1º Termo de Fibonacci = " + pilha.pop());
			}
			catch (EmptyStackException e) 
			{
				e.printStackTrace();
			}
		}
		else if(nTermo == 0) 
		{
			try 
			{
				pilha.pop();
				System.out.println("Termo 0 de Fibonacci = " + pilha.pop());
			}
			catch (EmptyStackException e) 
			{
				e.printStackTrace();
			}
		}
		else if(nTermo < 0) 
		{
			System.out.println("Para de encher cara...");
		}
		else 
		{
			while(nTermo > 1) 
			{
				try 
				{
					aux = pilha.pop();
					Fibonacci = pilha.pop() + aux;
					pilha.push(aux);
					pilha.push(Fibonacci);
					Fibonacci = 0;
					nTermo--;
				}
				catch (EmptyStackException e) 
				{
					e.printStackTrace();
				}
			}
			try 
			{
				System.out.println("Termo de Fibonacci desejado = " + pilha.pop());
			}
			catch (EmptyStackException e) 
			{
				e.printStackTrace();
			}
		}
	}
}