package creational.objectpooling;

import java.util.Enumeration;
import java.util.Hashtable;

public abstract class ObjectPool<T> {

	private long expiryTime;
	private Hashtable<T,Long> unlocked,locked;
	
	public ObjectPool() {
		expiryTime=30000;
		unlocked=new Hashtable<T,Long>();
		locked=new Hashtable<T,Long>();
		}
	
	protected abstract T create();
	
	public abstract boolean validate(T t);
	
	public abstract void expire(T t);
	
	public synchronized T checkout(){
		Long now=System.currentTimeMillis();
		T t;
		if(unlocked.size()>0){
			Enumeration<T> e=unlocked.keys();
			while(e.hasMoreElements()){
				t=e.nextElement();
				if((now-unlocked.get(t))>expiryTime){
					unlocked.remove(t);
					expire(t);
					t=null;
				}
				else if(validate(t)){
					unlocked.remove(t);
					locked.put(t,now);
					return t;
				}
				else{
					unlocked.remove(t);
					expire(t);
					t=null;
				}
			}
			
		}
		t=create();
		locked.put(t,now);
		return t;
		
		
	}
	
	public synchronized void checkin(T t){
		locked.remove(t);
		unlocked.put(t,System.currentTimeMillis());
	}
	
	
}
