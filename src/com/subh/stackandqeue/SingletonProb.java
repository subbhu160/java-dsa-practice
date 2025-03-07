package com.subh.stackandqeue;

public class SingletonProb {
	
	private static final SingletonProb instance = new SingletonProb();
	
	
	void SingletonProb()
	{
		
	}
	
	public SingletonProb getInProb()
	{
		return instance;
	}
	
	public void welmsg()
	{
		System.out.println("example of singleton pattern");
	}

	public static void main(String[] args) {

      SingletonProb st = instance.getInProb();
      st.welmsg();

	}

}
