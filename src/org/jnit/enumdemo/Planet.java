package org.jnit.enumdemo;
//group of related predefined set of constants
//An enum can also have constant values
public enum Planet {
	
	MERCURY(1,false),
	VENUS(2,false),
	EARTH(3,true),
	MARS(4,true);
	
	private Planet (int order,boolean liveable){
		this.order = order;
		this.liveable = liveable;
	}
	
	private int order;
    private boolean liveable;
    
	public boolean isLiveable() {
		return liveable;
	}

	public void setLiveable(boolean liveable) {
		this.liveable = liveable;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}
	
	

}
