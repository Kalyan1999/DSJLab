public interface StackInterface<T>
{
	void push(T ob);
	T pop();
	int stackSize();
	T topElement();
	void display();
}