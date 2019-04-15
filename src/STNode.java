public class STNode 
{
	private int element;
	private STNode next;
	public STNode(int c, STNode n)
	{
		element = c;
		next = n;
	}
	public STNode(int element) 
	{
		this(element, null);
	}
	public int getElemento()
	{ 
		return element; 
	}
	public STNode getNext()
	{ 
		return next; 
	}
	public void setElemento(int newElem)
	{ 
		element = newElem; 
	}
	public void setNext(STNode newNext)
	{ 
		next = newNext; 
	}
}
