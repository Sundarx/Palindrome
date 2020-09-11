//SUNDAR RAJ
public class LinkedStackDS<T> implements LinkedStackADT<T>
{
	private StackNode<T> stackTop;

	public LinkedStackDS()
	{
		stackTop = null;
	}

	public LinkedStackDS(StackNode<T> top)
	{
		stackTop = top;
	}

	public LinkedStackDS(LinkedStackDS<T> copyStack)
	{
		stackTop = copyStack.stackTop;
		if(!copyStack.isEmptyStack())
		{
			while(!copyStack.isEmptyStack())
			{
				this.push((T)copyStack.peek());
				copyStack.pop();
			}
		}
		else
		{
			throw new StackUnderflowException();
		}
	}

    //Returns true if empty stack, false if not empty
	public boolean isEmptyStack()
	{
		return (stackTop == null);
	}

	//Adds item T to the stack
	public void push(T value)
	{
		if(this.isEmptyStack())
		{
			stackTop = new StackNode<T>(value, null);
		}
		else
		{
			stackTop = new StackNode<T>(value, stackTop);
		}
	}

    //If stack is not empty, retrieve item T at the top of stack
    //If stack is empty, throw StackUnderflowException
	public T peek() throws StackUnderflowException
	{
		if(this.isEmptyStack())
		{
			throw new StackUnderflowException();
		}
		return stackTop.getValue();
	}

    //If stack is not empty, remove item T from the top of stack
    //If stack is empty, throw StackUnderflowException
	public void pop() throws StackUnderflowException
	{
		if(this.isEmptyStack())
		{
			throw new StackUnderflowException();
		}
		stackTop = stackTop.getNext();
	}

	//Inner class
	public class StackNode<T>
	{
	    private T value;
	    private StackNode<T> next;

	    public StackNode()
	    {
	    	value = null;
	    	next = null;
	    }

	    public StackNode(T value, StackNode<T> next)
	    {
	    	this.value = value;
	   		this.next = next;
	    }

	    public T getValue()
	    {
	    	return value;
	    }

	    public StackNode<T> getNext()
	    {
	     	return next;
	    }

	    public void setValue(T value)
	    {
	       	this.value = value;
	    }

	    public void setNext(StackNode<T> next)
	    {
			this.next = next;
	    }

	    public String toString()
	    {
	    	return (String)value;
		}
	}
}