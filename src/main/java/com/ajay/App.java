package com.ajay;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
	int x,y,s;
	System.out.println("Numbers are ="+args[0]+" & "+args[1]);
	x=Integer.parseInt(args[0]);
	y=Integer.parseInt(args[1]);
	s=x+y;
        System.out.println( "Sum = "+s);
    }
}
