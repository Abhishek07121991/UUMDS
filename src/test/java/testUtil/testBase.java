package testUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testBase {
	Properties prop;
	public File file = null;
	public static WebDriver driver = null;
	Connection con = null;
	public static String ofilePath;
	public static boolean fileFlag;
	private static boolean isFolderCreated;

	public void initialization(String url) {
		// System.setProperty("webdriver.chrome.driver",
		// "C:/Software/chromedriver.exe");
		// driver=new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\Abhishek\\geckodriver.exe");
		//String browserurl="ljavad03.finbel.intra:8081/QUOTAWeb/home.do";
		//String browserurl="ljavad03.finbel.intra:8081/QUOTAWeb/home.do";
		driver = new FirefoxDriver();
		//String browserurl = null;
		/*
		 * System.out.println("url is--->>>" + url); if (url.equals("QUOTA")) {
		 * browserurl = configFile("url_QUOTA"); } else { browserurl =
		 * configFile("url_PLDA"); }
		 */
		driver.get(url);
		driver.manage().window().maximize();
	}

	public String configFile(String key) {

		String filpath = "src\\test\\java\\config\\config.properties";
		prop = new Properties();
		FileInputStream ip = null;
		try {
			ip = new FileInputStream(filpath);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			prop.load(ip);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return prop.getProperty(key);
	}

	/*
	 * public static Map oexcelDataReader(String FilePath,String SheetName,int
	 * ValueCoumnIndex,int KeyColumnRange) throws IOException {
	 * 
	 * 
	 * FileInputStream inputStream = new FileInputStream(new File(FilePath));
	 * 
	 * XSSFWorkbook workbook = new XSSFWorkbook(inputStream); XSSFSheet sheet =
	 * workbook.getSheet(SheetName);
	 * 
	 * 
	 * Map<String,String> excelMap=new HashMap<String, String>();
	 * 
	 * for (int i=1;i<=KeyColumnRange;i++) {
	 * 
	 * Object okey=(Object)sheet.getRow(i).getCell(0); //System.out.println(okey);
	 * String okeyexcel=(String)okey.toString();
	 * 
	 * Object ovalue=(Object)sheet.getRow(i).getCell(ValueCoumnIndex);
	 * //System.out.println("object value--->>"+ovalue); if (ovalue==null) {
	 * 
	 * String ovalueexcel=""; excelMap.put(okeyexcel,ovalueexcel);
	 * 
	 * } else {
	 * 
	 * String ovalueexcel=ovalue.toString(); excelMap.put(okeyexcel,ovalueexcel); }
	 * 
	 * 
	 * 
	 * }
	 * 
	 * return excelMap;
	 * 
	 * 
	 * }
	 * 
	 * 
	 * public void storeMessageTextFile(String filename,String filePath,String
	 * omessage) throws IOException{ //String filename="quotaResponse.txt"; //String
	 * filePath = System.getProperty("user.dir"); //create a new file file = new
	 * File(filePath + "\\" + filename); try { if (!file.exists()) {
	 * file.createNewFile(); System.out.println("File is created"); } else {
	 * System.out.println("File already exist"); } } catch (IOException e) {
	 * e.printStackTrace(); } FileWriter fr=new FileWriter(filePath + "\\" +
	 * filename); BufferedWriter br=new BufferedWriter(fr); br.write(omessage);
	 * br.close(); }
	 * 
	 * public void deleteMessageTextFile() { file.delete(); }
	 * 
	 * 
	 * public int responseCodeFetch(String statusCode) { Map<String,Integer>
	 * statusMap=new HashMap<String,Integer>();
	 * 
	 * { System.out.println("statuscode value is: "+statusCode); statusMap.put("OK",
	 * 200); statusMap.put("Created", 201); statusMap.put("No Content", 204);
	 * statusMap.put("Not Found", 404); statusMap.put("Bad Request", 400);
	 * statusMap.put("Forbidden", 403);
	 * 
	 * }
	 * System.out.println("statuscode value in integer: "+statusMap.get(statusCode))
	 * ; return statusMap.get(statusCode);
	 * 
	 * }
	 * 
	 * public static void main(String[] args) throws ClassNotFoundException,
	 * SQLException { // TODO Auto-generated method stub
	 * 
	 * //String dbUrl = "jdbc:db2://pldd1.finbel.intra:50560/PLDAM"; String dbUrl =
	 * "jdbc:db2://9.182.233.201:50000/PLDA_EXP"; //Database Username String
	 * username = "db2user"; //Database Password String password =
	 * "welcome@localdb"; //Query to Execute String query =
	 * "select ACTUAL_STATUS_CODE from PLDA_TEST_GF.DECLARATION_V2 where Declaration_Ref='19BEI0000000000122'"
	 * ; //Load mysql jdbc driver Class.forName("com.ibm.db2.jcc.DB2Driver");
	 * //Create Connection to DB Connection con =
	 * DriverManager.getConnection(dbUrl,username,password);
	 * 
	 * //Create Statement Object Statement stmt = con.createStatement();
	 * 
	 * // Execute the SQL Query. Store results in ResultSet ResultSet rs=
	 * stmt.executeQuery(query); rs.next(); String omg= rs.getString(1); // While
	 * Loop to iterate through all data and print results System.out.println(omg);
	 * 
	 * 
	 * // closing DB Connection con.close();
	 * 
	 * }
	 * 
	 * public ResultSet dbConnection(String query) throws ClassNotFoundException,
	 * SQLException { // TODO Auto-generated method stub
	 * 
	 * //String dbUrl = "jdbc:db2://pldd1.finbel.intra:50560/PLDAM"; //String dbUrl
	 * = "jdbc:db2://9.182.233.201:50000/PLDA_EXP"; String dbUrl =
	 * "jdbc:db2://pldd1.finbel.intra:50560/TARBEL2";
	 * 
	 * //Database Username //String username = "db2user"; String username =
	 * "syadav"; //Database Password //String password = "welcome@localdb"; String
	 * password = "rb6dii6rgyka"; //Query to Execute // String query =
	 * "select ACTUAL_STATUS_CODE from PLDA_TEST_GF.DECLARATION_V2 where Declaration_Ref='19BEI0000000000122'"
	 * ;
	 * 
	 * //Load mysql jdbc driver Class.forName("com.ibm.db2.jcc.DB2Driver"); //Create
	 * Connection to DB con = DriverManager.getConnection(dbUrl,username,password);
	 * 
	 * //Create Statement Object Statement stmt = con.createStatement();
	 * 
	 * // Execute the SQL Query. Store results in ResultSet ResultSet rs=
	 * stmt.executeQuery(query);
	 * 
	 * return rs; }
	 * 
	 * 
	 * public ResultSet dbConnection(String query, String dbName) throws
	 * ClassNotFoundException, SQLException { // TODO Auto-generated method stub
	 * String s1="PLDA"; String dbUrl=null; if (s1.equals(dbName)) {
	 * 
	 * dbUrl = "jdbc:db2://pldd1.finbel.intra:50560/PLDAM"; } else { dbUrl =
	 * "jdbc:db2://pldd1.finbel.intra:50560/TARBEL2";
	 * 
	 * } //String dbUrl = "jdbc:db2://9.182.233.201:50000/PLDA_EXP";
	 * 
	 * //Database Username //String username = "db2user"; String username =
	 * "syadav"; //Database Password //String password = "welcometolocaldb"; String
	 * password = "rb6dii6rgyka"; //Query to Execute // String query =
	 * "select ACTUAL_STATUS_CODE from PLDA_TEST_GF.DECLARATION_V2 where Declaration_Ref='19BEI0000000000122'"
	 * ;
	 * 
	 * //Load mysql jdbc driver Class.forName("com.ibm.db2.jcc.DB2Driver"); //Create
	 * Connection to DB con = DriverManager.getConnection(dbUrl,username,password);
	 * 
	 * //Create Statement Object Statement stmt = con.createStatement();
	 * 
	 * // Execute the SQL Query. Store results in ResultSet ResultSet rs=
	 * stmt.executeQuery(query);
	 * 
	 * return rs; }
	 * 
	 * public void dbConnectionClose() throws SQLException { con.close(); }
	 * 
	 * protected static JSONObject parseJSON(String path) { JSONParser parser = new
	 * JSONParser(); JSONObject jsonObject = null;; try { jsonObject = (JSONObject)
	 * parser.parse(path); } catch (ParseException e) { // TODO Auto-generated catch
	 * block e.printStackTrace(); } return jsonObject;
	 * 
	 * }
	 * 
	 * 
	 * 
	 * public void foldeCreation() { if(!isFolderCreated) { Date date =
	 * Calendar.getInstance().getTime(); DateFormat dateFormat = new
	 * SimpleDateFormat("yyyy-MMM-dd hhmmss"); String strDate =
	 * dateFormat.format(date); // Create a java.io.File object, specify the name of
	 * the folder ofilePath="C:\\screenShot\\"+strDate;
	 * System.out.println("odate-->>"+ofilePath); File f=new File(ofilePath);
	 * 
	 * // Create directory with specified name, true is returned if created. boolean
	 * flag=f.mkdir();
	 * 
	 * // Print whether true/false
	 * System.out.println("Directory created (T/F)? "+flag); isFolderCreated=true; }
	 * 
	 * }
	 * 
	 * public void takeScreenShot(String fileName) throws IOException {
	 * TakesScreenshot scrShot =((TakesScreenshot)driver);
	 * 
	 * //Call getScreenshotAs method to create image file
	 * 
	 * File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	 * 
	 * //Move image file to new destination
	 * System.out.println("file name :"+fileName);
	 * System.out.println("filePath is :"+ofilePath);
	 * System.out.println(ofilePath+"\\"+fileName+".png"); File DestFile=new
	 * File(ofilePath+"\\"+fileName+".png");
	 * 
	 * //Copy file at destination
	 * 
	 * FileUtils.copyFile(SrcFile, DestFile);
	 * 
	 * }
	 * 
	 * public static String getRandomNumericString(int n) { String NumericString
	 * ="0123456789"; StringBuilder sb = new StringBuilder(n);
	 * 
	 * for (int i = 0; i < n; i++) {
	 * 
	 * // generate a random number between // 0 to NumericString variable length int
	 * index = (int)(NumericString.length() Math.random());
	 * 
	 * // add Character one by one in end of sb sb.append(NumericString
	 * .charAt(index)); }
	 * 
	 * return sb.toString(); }
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
}
