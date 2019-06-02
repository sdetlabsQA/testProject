

//package (if needed)
//Import statements

/** Comments
 * @author Life
 *
 */

//Any code except package / import should be inside class definition.
public class TestObject1 {

	//public : Access modifier
	//static : it can be called without using object.
	//void : return type
	//main : function name
	//(String[] args) String[] : dataType
	//args : variable of type String[]
	
	//main() is a function.
	public static void main(String[] args) {
	
		TestObject1 t = new TestObject1();
		//t is an instance / reference variable which refers to object of a class.
		//new TestObject() is an Object and can be created w/o assigning to t.
		//or new TestObject();
		//TestObject() is a default constructor, provided by JAVA, if not defined
		//by coder.
		//I can create multiple objects of this class.
		TestObject1 t1 = new TestObject1();
		TestObject1 t2 = new TestObject1();	
	}
}
