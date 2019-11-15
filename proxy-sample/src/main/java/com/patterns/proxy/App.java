package com.patterns.proxy;

/**
 
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String message;
        CommProxy proxy = new CommProxy();
        
        proxy.reset();
        message = proxy.receive();
        System.out.println("Mess-1"+ message);
        proxy.reset();
        message = proxy.receive();
        System.out.println("Mess-2"+ message);
        proxy.reset();
        message = proxy.receive();
        System.out.println("Mess-3"+ message);
    }
}
