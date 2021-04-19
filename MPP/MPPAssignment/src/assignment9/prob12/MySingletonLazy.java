package assignment9.prob12;

import java.util.Optional;

public class MySingletonLazy {
	
	private static MySingletonLazy instance=null;
	public static int count=0;
	
	private MySingletonLazy() {
		count++;
	};
	
	public static MySingletonLazy getInstance() {
		
		return Optional.ofNullable(instance).orElseGet(MySingletonLazy::setAndGet);
	}
	
	private static MySingletonLazy setAndGet() {
		instance = new MySingletonLazy();
		return instance;
	}

}
