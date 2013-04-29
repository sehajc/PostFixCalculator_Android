package com.thunderlizard.postfixcalculator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import java.util.StringTokenizer;


public class RPNCalculatorBrain {
	private ArrayList<String> mInputList;
	
	public String calculate(String input)
	{
		populateListFromInput(input);
		
		Stack<String> calculationStack = new Stack<String>();
		Iterator<String> iterator = mInputList.iterator();
		
		while (iterator.hasNext())
		{
			String element = iterator.next();
			//If Operand push onto the stack
			if (element.matches("[0-9]*"))
			{
				calculationStack.push(element);
			}
			//If Operator pop last two operands and calculate
			//Then push result
			else if (element.matches("[-+]")) 
			{
				if (element.equals("+"))
				{
					try {
						int operand2 = Integer.parseInt(calculationStack.pop());
						int operand1 = Integer.parseInt(calculationStack.pop());
						int result = operand1 + operand2;
						calculationStack.push("" + result);
					} catch (Exception e) {
						return "error1";
					}
					
				}
				else if (element.equals("-"))
				{
					try{
						int operand2 = Integer.parseInt(calculationStack.pop());
						int operand1 = Integer.parseInt(calculationStack.pop());
						int result = operand1 - operand2;
						calculationStack.push("" + result);
					}
					catch (Exception e) {
						return "error1";
					}
				}
			}
			//Something other than numbers or operators was input
			else 
			{
				return "error2";
			}	
		}
		
		//Returning the only element left in the stack
		if (calculationStack.size() == 1) 
		{
			return calculationStack.pop();
		}
		else 
		{
			return "error1";
		}
		
	}

	private void populateListFromInput(String input) 
	{
		mInputList = new ArrayList<String>();
		StringTokenizer tokenizer = new StringTokenizer(input);
		while (tokenizer.hasMoreTokens()) 
		{
			mInputList.add(tokenizer.nextToken());
		}
	}

}
