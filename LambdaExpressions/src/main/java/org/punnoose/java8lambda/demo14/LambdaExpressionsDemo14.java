package org.punnoose.java8lambda.demo14;

/**
 * Variable Scoping Demo
 * @author "Punnoose Pullolickal"
 *
 */
public class LambdaExpressionsDemo14 {

	private int instanceVariable=0;
	
	public void foo(){
		int localVariable =0;
		
		//bar(10, localVariable -> System.out.print(localVariable)); // <- Illegal; Variables having duplicate name
		
		//bar(10, i->{double localVariable =0;}); // <- Illegal; Variables having duplicate name
		
		//bar (10, i-> {localVariable = 10;}); // <- Illegal; local variables are effectively final 
		
		bar (10, i-> {int j = i+localVariable;}); // <- Legal; local variables can be used in lambdas
		
		bar(10, i-> this.instanceVariable++); // <- Legal; Instance variables can be updates
		
	}
	
	public void bar(int i, MyFunction function){
		function.myFunction(i);
	}

}

@FunctionalInterface
interface MyFunction{
	void myFunction(int i);
}