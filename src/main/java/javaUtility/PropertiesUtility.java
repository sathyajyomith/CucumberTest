package javaUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtility {
public static String readpropertyData(String key) throws IOException {
String curdir=System.getProperty("user.dir");	
FileInputStream file=new  FileInputStream(curdir+"/src/test/resources/TestData.properties");
Properties ob=new Properties();
ob.load(file);
String value=ob.getProperty(key);
return value;





}




}
