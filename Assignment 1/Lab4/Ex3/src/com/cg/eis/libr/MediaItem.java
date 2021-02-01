package com.cg.eis.libr;

public abstract class MediaItem extends Item {

	private int runtime ;

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

	@Override
	public String toString() {
		return "MediaItem [runtime=" + runtime + "]";
	}
	
}
