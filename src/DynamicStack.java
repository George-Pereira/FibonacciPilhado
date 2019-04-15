
public class DynamicStack 
{
	private STNode topo;
	private int tamanho;
	public DynamicStack() 
	{
		this.topo = null;
		this.tamanho = 0;
	}
	public boolean isEmpty() 
	{
		return topo == null;
	}
	public int getTamanho() 
	{
		return tamanho;
	}
	public int mostraTopo() throws EmptyStackException 
	{
		if(isEmpty()) 
		{
			throw new EmptyStackException();
		}
		return topo.getElemento();
	}
	public void push(int elemento) 
	{
		STNode disco = new STNode(elemento, topo);
		topo = disco;
		tamanho++;
	}
	public int pop() throws EmptyStackException 
	{
		if(isEmpty()) 
		{
			throw new EmptyStackException();
		}
		int popped = topo.getElemento();
		topo = topo.getNext();
		tamanho--;
		return popped;
	}
	public void mostraConversão() 
	{
		int current;
		while(topo != null)
		{
			try 
			{
				current = pop();
				System.out.print(current);
			}
			catch (EmptyStackException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
