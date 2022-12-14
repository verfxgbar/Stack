package de.verfxgbar.utils;

public class TestKlasse {

	private Stack stack;

	public TestKlasse() {
		stack = new Stack<String>();
		stack.push("1");
		stack.push("2");
		stack.push("3");
		
		visualize();

	}

	public void visualize() {
		Stack pStack = this.stack;
		String finalPrint = "";
		int counter = 1;
		while (!pStack.isEmpty()) {
			finalPrint += counter + ": " + pStack.top() + "\n";
			pStack.pop();
			counter++;
		}
		
		System.out.println(finalPrint);
	}

}
