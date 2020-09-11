//SUNDAR RAJ
public interface LinkedStackADT<T>
{
    //Returns true if empty stack, false if not empty
	public abstract boolean isEmptyStack();

	//Adds item T to the stack
	public void push(T value);

    //If stack is not empty, retrieve item T at the top of stack
    //If stack is empty, throw StackUnderflowException
	public T peek() throws StackUnderflowException;

    //If stack is not empty, remove item T from the top of stack
    //If stack is empty, throw StackUnderflowException
	public void pop() throws StackUnderflowException;
}