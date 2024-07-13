package com.collections;

public class FunctionalInterface
{

    public static void main(String[] args) 
    {
        A a = new A() 
        {
            public void m1() 
            {
                System.out.println("Hello");
            }
        };
        a.m1(); 
        
        C c =()->
        {
        	System.out.println("World");
        };
        c.m2();
    }
}

interface A 
{
    public void m1();
}

interface C
{
	public void m2();
}
