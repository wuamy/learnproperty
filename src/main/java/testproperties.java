import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
/**
 * Created by wu on 4/6/2017.
 */
public class testproperties {
    private static String hostName;
    private static String emailFrom;
    private static String emailTo;
    private static String emailCc;

    private static final String configFileName = "config.properties";
    private static final Properties prop = new Properties();

    public static void main(String[] args) {
        try {
            readConfig(args);
        } catch (Exception e){
            System.out.println("please enter config file");
        }

    }

    private static void readConfig(String[] args) throws FileNotFoundException, IOException {
        if (args.length != 0) {
            prop.load(new FileInputStream(args[0]));
        }
        String hostName = prop.getProperty("hostName").trim();
        String emailFrom = prop.getProperty("emailFrom").trim();
        String emailTo = prop.getProperty("emailTo").trim();
        String emailCc = prop.getProperty("emailCc").trim();

        System.out.println(hostName);
        System.out.println(emailFrom);
        System.out.println(emailTo);
        System.out.println(emailCc);
    }


}
