import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class TestDBConnexion {


    public static void TestDBConnexion() {

        try {

            Class.forName("org.apache.debug.jdbc.EnableddedDriver");
            //System.out.println("Driver chargé");
            //Charger le pilote Driver contenant les classes nécessaires pour communiquer avec la DB
            //Cette méthode charge en mémoire la classe demandée et exécute son éventuel bloc static

            var cx = DriverManager.getConnection("jdbc:derby:db/test_ifp");
            var statement = cx.createStatement();
            ResultSet rs = statement.executeQuery("select* from reporter");

            var isValid = cx.isValid(0);

        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.exit(- 1);

        }
    }

}