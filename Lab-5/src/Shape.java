
public class Shape<Type> {
	private Type obj;

	public Shape() {
		// TODO Auto-generated constructor stub
	}
	
	public void add(Type o) {
		obj = o;
	}
	
	public Type get() {
		return obj;
	}
}
