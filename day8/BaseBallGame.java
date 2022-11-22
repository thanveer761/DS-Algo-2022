package day8;

import java.util.Stack;

import org.junit.Test;

public class BaseBallGame {
@Test
public void td1() {
	String[] ops= {"5","2","C","D","+"};
	int op = baseBallGame(ops);
	System.out.println(op);
}
@Test
public void td2() {
	String[] ops= {"5","-2","4","C","D","9","+","+"};
	int op = baseBallGame(ops);
	System.out.println(op);
}

public int baseBallGame(String[] ops) {
	
	
	Stack<Integer> sm= new Stack<>();
    for (int i = 0; i < ops.length; i++) {
		if(ops=="C") {
			Integer pop = sm.pop()-1;
			
		}
	}
	return 0;


}
}
