import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		Properties props =new Properties();
		props.put("1001", "Sandeep");
		props.put("1002", "XXXXXXXXXX");
		props.load(new FileReader("src\\sap.properties"));
		
		System.out.println(props.getProperty("uname"));
		System.out.println(props.getProperty("1001"));

	}

}
