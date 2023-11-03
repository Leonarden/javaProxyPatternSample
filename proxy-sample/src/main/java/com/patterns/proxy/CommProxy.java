package com.patterns.proxy;

public class CommProxy implements Comm{

	private  CommImpl comm;
    private boolean isAlive;
    
	public CommProxy() {
		comm = new CommImpl();
	}
	
	public String receive() {
	   
		if(isAlive) /*new information arrived */
			return comm.receive(); 
		else
			return "NO NEW INFORMATION=" + comm.receive();
	}

	public boolean reset() {
		isAlive = comm.reset();
		return isAlive;
		// TODO Auto-generated method stub
		
	}


	
}
