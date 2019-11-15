package com.patterns.proxy;

public class CommImpl implements Comm {
private static int INFOLENGTH = 10;
private boolean isAlive = false;
private String information;
public String receive() {
	// TODO Auto-generated method stub
	if(isAlive) mockCall();
	return read();
}
public boolean reset() {
	if(isAlive) isAlive=false;
	else isAlive = true;
	return isAlive;
}
public String read() {
	// TODO Auto-generated method stub
	if(isAlive)
	information = this.generateInfo();
	return information;
}
 void mockCall() {
	try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

String generateInfo() {
	StringBuffer sb = new StringBuffer();
	String base = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	for(int i=0;i<INFOLENGTH;i++) {
	double d = Math.random();
	d = (d*100)%100;
	d = (d+i)%10;
	sb.append(base.charAt((int)d));
	}

	return sb.toString();
}

}
