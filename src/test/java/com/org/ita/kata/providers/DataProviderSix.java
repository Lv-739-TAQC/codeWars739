package com.org.ita.kata.providers;

import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Locale;

import static com.org.ita.kata.providers.StudentProvider.combineDataWithStudent;

public class DataProviderSix {

    @DataProvider(name = "dpFloatingPointApproximation")
    public static Object[][] dpFloatingPointApproximation() {
        Object[][] data = new Object[][]{
                {1.29999999155e-08, 2.6e-08},
                {6.999999997549999e-10, 1.4e-09},
                {2.499996875007812e-06, 5.0e-06},
                {1.1999999280000085e-07, 2.4e-07},
                {1.29999999155e-8, 2.6e-8},
                {6.999999997549999e-10, 1.4e-9},
                {2.499996875007812e-6, 5.0e-6},
                {1.1999999280000085e-7, 2.4e-7},
                {1.0499999999944874e-11, 2.1e-11},
                {8.499638780702988e-5, 1.7e-4},
                {9.499999548750044e-8, 1.9e-7},
                {8.999999959500001e-9, 1.8e-8},
                {2.0999999779500002e-8, 4.2e-8},
                {3.499938752143656e-5, 7.0e-5},
                {9.499999999548749e-11, 1.9e-10},
                {1.499999887500017e-7, 3.0e-7},
                {1.4998875168718365e-4, 3.0e-4},
                {1.849999999828875e-10, 3.7e-10},
                {8.499996387503072e-7, 1.7e-6},
                {1.6499998638750228e-7, 3.3e-7}
        };
        return combineDataWithStudent(data);
    }

    @DataProvider(name = "dpTestFindNb")
    public static Object[][] dpTestFindNb() {
        Object[][] data = new Object[][]{
                {-1, 108806345136785L},
                {55100, 2304422822859502500L},
                {-1, 2304422822859502501L},
                {-1, 4},
                {-1, 16},
                {2022, 4183059834009L},
                {-1, 24723578342962L},
                {4824, 135440716410000L},
                {3568, 40539911473216L},
                {3218, 26825883955641L},
                {-1, 41364076483082L},
                {2485, 9541025211025L},
                {-1, 112668204662785L},
                {4788, 131443152397956L},
                {-1, 1893663570150369082L},
                {-1, 1916725365911420101L},
                {-1, 2286907654001300101L},
                {53374, 2028968419246890625L},
                {52960, 1966746178996998400L},
                {54989, 2285909812317728025L},
                {52009, 1829240141760462025L},
                {-1, 1858678649402324410L},
                {-1, 2222072903092933802L},
                {-1, 1928408118310822501L},
                {-1, 1572084468017461477L},
                {53927, 2114370829902666384L},
                {-1, 1725178829186918162L},
                {-1, 2101540021104034226L},
                {-1, 1660276652006872901L},
                {-1, 2233162961835723226L},
                {50267, 1596206793966565284L},
                {-1, 1595444828388674482L},
                {-1, 1716846351451546897L},
                {-1, 1979999991706325626L},
                {-1, 1826287543989068357L},
                {-1, 1829521528146940357L},
                {-1, 1980149290453950626L},
                {50501, 1626136955350964001L},
                {52035, 1832900697562356900L},
                {-1, 1790303715437959226L},
                {54902, 2271477770777916009L},
                {51514, 1760588919591141025L},
                {50414, 1614960356266919025L},
                {-1, 1681307316760522501L},
                {-1, 1693888428098196101L},
                {-1, 1579380459862062026L},
                {51090, 1703337157252964025L},
                {-1, 1858536273742222097L},
                {-1, 1964370545724801601L},
                {-1, 1946327037588712010L},
                {54634, 2227449671849847025L},
                {-1, 1699339926936528901L},
                {-1, 2000231817892070401L},
                {53796, 2093900758169270436L},
                {51391, 1743834174036714496L},
                {51234, 1722622112044130025L},
                {-1, 2203411715674414282L},
                {-1, 1874676559781241226L},
                {-1, 1816891240604208562L},
                {-1, 1677480767361921601L},
                {-1, 1933829416165534210L},
                {-1, 2160538659706868101L},
                {-1, 1825163685570716101L},
                {50735, 1656486067588430400L},
                {51936, 1818991733158400256L},
                {-1, 2050033565898893585L},
                {54067, 2136412765284809284L},
                {-1, 1954002445128140626L},
                {50823, 1668008608506133776L},
                {54457, 2198724467029980409L},
                {-1, 1791272944032109210L},
                {50530, 1629875347856461225L},
                {53040, 1978656682863182400L},
                {51288, 1729896020164173456L},
                {-1, 2232672821084298322L},
                {-1, 1995722519049189226L},
                {50098, 1574848930930882201L},
                {-1, 1811298820550490442L},
                {50374, 1609841069223765625L},
                {54176, 2153692952729323776L},
                {50893, 1677217108391337241L},
                {-1, 1718590977479168101L},
                {-1, 2283416636719730626L},
                {-1, 1594175492019103877L},
                {-1, 1667483556370424101L},
                {-1, 1979999991706325626L},
                {53565, 2058167239519646025L},
                {-1, 2277938829573892522L},
                {51977, 1824742372420044009L},
                {-1, 1936324111552263226L},
                {-1, 1964222140138353217L},
                {-1, 2285244765963786026L},
                {50803, 1665384587290813636L},
                {52572, 1909741243164118884L},
                {53060, 1981642742351388900L},
                {53077, 1984183549161913009L},
                {51730, 1790303715437959225L},
                {-1, 2199370539061755082L},
                {-1, 1985529670924474082L},
                {53929, 2114684508594385225L},
                {-1, 2254809170048044402L},
                {50487, 1624334517610093584L},
                {-1, 1657400441344826410L},
                {53974, 2121751510934055625L},
                {-1, 2114998222186795717L},
                {54467, 2200339914060901284L},
                {50338, 1605244125707608681L},
                {-1, 1857397562903877697L},
                {53375, 2029120478784000000L},
                {-1, 1594683135642369601L},
                {-1, 2277441336292210882L},
                {54004, 2126472676213860100L},
                {51164, 1713227141943180900L},
                {51368, 1740714493255068816L}
        };
        return combineDataWithStudent(data);
    }

    @DataProvider(name = "dpMean")
    public static Object[][] dpMean() {
        Object[][] data = new Object[][]{
                {"London", 51.199999999999996},
                {"Beijing", 52.416666666666664}
        };
        return combineDataWithStudent(data);
    }

    @DataProvider(name = "dpVariance")
    public static Object[][] dpVariance() {
        Object[][] data = new Object[][]{
                {"London", 57.42833333333374},
                {"Beijing", 4808.37138888889}
        };
        return combineDataWithStudent(data);
    }

    @DataProvider(name = "dpNbaCup")
    public static Object[][] dpNbaCup(){
        String resultSheet1 = "Los Angeles Clippers 104 Dallas Mavericks 88,New York Knicks 101 Atlanta Hawks 112,Indiana Pacers 103 Memphis Grizzlies 112,"
                + "Los Angeles Lakers 111 Minnesota Timberwolves 112,Phoenix Suns 95 Dallas Mavericks 111,Portland Trail Blazers 112 New Orleans Pelicans 94,"
                + "Sacramento Kings 104 Los Angeles Clippers 111,Houston Rockets 85 Denver Nuggets 105,Memphis Grizzlies 76 Cleveland Cavaliers 106,"
                + "Milwaukee Bucks 97 New York Knicks 122,Oklahoma City Thunder 112 San Antonio Spurs 106,Boston Celtics 112 Philadelphia 76ers 95,"
                + "Brooklyn Nets 100 Chicago Bulls 115,Detroit Pistons 92 Utah Jazz 87,Miami Heat 104 Charlotte Hornets 94,"
                + "Toronto Raptors 106 Indiana Pacers 99,Orlando Magic 87 Washington Wizards 88,Golden State Warriors 111 New Orleans Pelicans 95,"
                + "Atlanta Hawks 94 Detroit Pistons 106,Chicago Bulls 97 Cleveland Cavaliers 95,";
        String resultSheet2 = "San Antonio Spurs 111 Houston Rockets 86,Chicago Bulls 103 Dallas Mavericks 102,Minnesota Timberwolves 112 Milwaukee Bucks 108,"
                + "New Orleans Pelicans 93 Miami Heat 90,Boston Celtics 81 Philadelphia 76ers 65,Detroit Pistons 115 Atlanta Hawks 87,"
                + "Toronto Raptors 92 Washington Wizards 82,Orlando Magic 86 Memphis Grizzlies 76,Los Angeles Clippers 115 Portland Trail Blazers 109,"
                + "Los Angeles Lakers 97 Golden State Warriors 136,Utah Jazz 98 Denver Nuggets 78,Boston Celtics 99 New York Knicks 85,"
                + "Indiana Pacers 98 Charlotte Hornets 86,Dallas Mavericks 87 Phoenix Suns 99,Atlanta Hawks 81 Memphis Grizzlies 82,"
                + "Miami Heat 110 Washington Wizards 105,Detroit Pistons 94 Charlotte Hornets 99,Orlando Magic 110 New Orleans Pelicans 107,"
                + "Los Angeles Clippers 130 Golden State Warriors 95,Utah Jazz 102 Oklahoma City Thunder 113,San Antonio Spurs 84 Phoenix Suns 104,"
                + "Chicago Bulls 103 Indiana Pacers 94,Milwaukee Bucks 106 Minnesota Timberwolves 88,Los Angeles Lakers 104 Portland Trail Blazers 102,"
                + "Houston Rockets 120 New Orleans Pelicans 100,Boston Celtics 111 Brooklyn Nets 105,Charlotte Hornets 94 Chicago Bulls 86,Cleveland Cavaliers 103 Dallas Mavericks 97";
        String resultSheet3 = resultSheet1 + resultSheet2;

        Object[][] data = {
                {"Boston Celtics:W=4;D=0;L=0;Scored=403;Conceded=350;Points=12", resultSheet3, "Boston Celtics"},
                {"Boston Celt:This team didn't play!", resultSheet3, "Boston Celt"}
        };

        return combineDataWithStudent(data);
    }

    @DataProvider(name = "dpEasyBalance")
    public static Object[][] dpEasyBalance() {
        Locale.setDefault(Locale.ENGLISH);
        String filePath1 = "src/main/resources/balance/input1.txt";
        String filePath2 = "src/main/resources/balance/input2.txt";
        String filePath3 = "src/main/resources/balance/input3.txt";
        String solution1 = "Original Balance: 1000.00\\r\\n" +
                "125 Market 125.45 Balance 874.55\\r\\n" +
                "126 Hardware 34.95 Balance 839.60\\r\\n" +
                "127 Video 7.45 Balance 832.15\\r\\n" +
                "128 Book 14.32 Balance 817.83\\r\\n" +
                "129 Gasoline 16.10 Balance 801.73\\r\\n" +
                "Total expense  198.27\\r\\n" +
                "Average expense  39.65";
        String solution2 = "Original Balance: 1883.00\\r\\n" +
                "001 Picture 120.30 Balance 1762.70\\r\\n" +
                "002 Beauty 17.50 Balance 1745.20\\r\\n" +
                "003 Picture 128.00 Balance 1617.20\\r\\n" +
                "004 Music 3.20 Balance 1614.00\\r\\n" +
                "005 Grocery 120.30 Balance 1493.70\\r\\n" +
                "006 Market 12.22 Balance 1481.48\\r\\n" +
                "007 Grocery 11.00 Balance 1470.48\\r\\n" +
                "008 Books 17.60 Balance 1452.88\\r\\n" +
                "009 Pen 71.41 Balance 1381.47\\r\\n" +
                "Total expense  501.53\\r\\n" +
                "Average expense  55.73";
        String solution3 = "Original Balance: 1327.00\\r\\n" +
                "001 Car 3.20 Balance 1323.80\\r\\n" +
                "002 Meat 54.00 Balance 1269.80\\r\\n" +
                "003 Beauty 17.50 Balance 1252.30\\r\\n" +
                "004 Photos 17.50 Balance 1234.80\\r\\n" +
                "005 Car 24.81 Balance 1209.99\\r\\n" +
                "006 Stamps 12.22 Balance 1197.77\\r\\n" +
                "007 Market 17.00 Balance 1180.77\\r\\n" +
                "008 Hairdresser 110.73 Balance 1070.04\\r\\n" +
                "009 Photos 17.00 Balance 1053.04\\r\\n" +
                "010 Gasoline 17.50 Balance 1035.54\\r\\n" +
                "Total expense  291.46\\r\\n" +
                "Average expense  29.15";
        Object[][] data = new Object[][]{
                {solution1, getStringFromFile(filePath1)},
                {solution2, getStringFromFile(filePath2)},
                {solution3, getStringFromFile(filePath3)}
        };
        return combineDataWithStudent(data);
    }

    public static String getStringFromFile(String filePath) {
        try {
            Path fileName = Path.of(filePath);
            return Files.readString(fileName);
        } catch (IOException e) {
            System.out.println("File not found: " + e);
        }
        return filePath;

    }

    @DataProvider(name = "dpStockSummary")
    public static Object[][] stockSummaryTest() {
        Object[][] data = new Object[6][3];
        data[0][0] = new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
        data[0][1] = new String[]{"A", "B"};
        data[0][2] = "(A : 200) - (B : 1140)";
        data[1][0] = new String[]{"BBAR 150", "CDXE 515", "BKWR 250", "BTSQ 890", "DRTY 600"};
        data[1][1] = new String[]{"A", "B", "C", "D"};
        data[1][2] = "(A : 0) - (B : 1290) - (C : 515) - (D : 600)";
        data[2][0] = new String[]{"CBART 20", "CDXEF 50", "BKWRK 25", "BTSQZ 89", "DRTYM 60"};
        data[2][1] = new String[]{"A", "B", "C", "W"};
        data[2][2] = "(A : 0) - (B : 114) - (C : 70) - (W : 0)";
        data[3][0] = new String[]{"ROXANNE 102", "RHODODE 123", "BKWRKAA 125", "BTSQZFG 239", "DRTYMKH 060"};
        data[3][1] = new String[]{"B", "R", "D", "X"};
        data[3][2] = "(B : 364) - (R : 225) - (D : 60) - (X : 0)";
        data[4][0] = new String[]{};
        data[4][1] = new String[]{"B", "R", "D", "X"};
        data[4][2] = "";
        data[5][0] = new String[]{"ROXANNE 102", "RHODODE 123", "BKWRKAA 125", "BTSQZFG 239", "DRTYMKH 060"};
        data[5][1] = new String[]{};
        data[5][2] = "";

        return combineDataWithStudent(data);
    }
}

