package com.simplecalculator.app;

public class CalculatorLogic 
{
	//create a method for Addition of Two number 
		public static int addNo(int y1 ,int y2)
		{
			return y1+y2;
		}
		
		//create a method for Subtraction of Two number 
		public static int subNo(int y1 ,int y2) 
		{
			return y1-y2;
		}
		
		//create a method for Multiplication of Two number 
		public static int mulNo(int y1 ,int y2)
		{	
					return y1*y2;
		}
				
		//create a method for Division of Two number 
		public static int divNo(int y1 ,int y2)
		{
			try {
					return y1/y2;
				}
			catch(Exception e)
				{
					System.out.println(e);
				}
			return y2;
			
		}
	

}
