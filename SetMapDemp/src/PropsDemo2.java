import java.util.Properties;
import java.util.Set;

public class PropsDemo2 {

	public static void main(String[] args) {
		Properties props=System.getProperties();
		Set<Object> key=props.keySet();
		for(Object key1:key) {
			System.out.println(key+"   "+props.getProperty((String)key1));
		}
		

	}

}
