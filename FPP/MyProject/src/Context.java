
public class Context {

	private Expression expression;
	
	public Context(Expression expression){
	      this.expression = expression;
	}
	
	public static Number evaluate(Expression expression) {
	    return expression.evaluate(num1,num2);
	}
}
