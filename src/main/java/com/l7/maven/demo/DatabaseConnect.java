package com.l7.maven.demo;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnect {
	
	private Properties props;
	
	public DatabaseConnect() {
		props=new Properties();
		
		InputStream resourceAsStream=getClass().getClassLoader().getResourceAsStream("db.properties");
		
		try {
			props.load(resourceAsStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public Properties getProps() {
		return props;
	}
	
	public static void main(String[] args) throws SQLException {
		DatabaseConnect obj=new DatabaseConnect();
		Properties props=obj.getProps();
		
		System.out.println(props);
		
		
		
		
	}
}
