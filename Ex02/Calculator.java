
import java.util.*;
public class Calculator

{
	private Stack<Float> stk = new Stack<Float>();
	private float result;

	public float sum(float a, float b)
	{
		result = a+b;
		stk.push(result); 
		return result ;
	}

	public float multiply(float a, float b)
	{
		result = a*b;
		stk.push(result); 
		return result ;
	}

	public float subtract(float a, float b)
	{
		result = a-b;
		stk.push(result); 
		return result ;
	}

	public float divide(float a, float b)
	{
		result = a/b;
		stk.push(result); 
		return result ;
	}

	public void showResults()
	{
		while(!stk.empty())
		{
			System.out.println(stk.peek());
			stk.pop();
		}
	}

}