package databases;

import com.beust.jcommander.ParameterException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;

import static java.lang.System.getProperties;

public class UnitTestConnectDB {

    @Test
    public void testDatabaseConnection() throws Exception {
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        List<String> actualString = connectToSqlDB.readDataBase("students","stID");
        List<Integer> expectedString = null;
    }
}
