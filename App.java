package com.hcl.csvparser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import be.yildizgames.common.csv.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        
        BufferedReader buffrd = new BufferedReader(new FileReader(args[0]));
        
        String s;
        buffrd.readLine();
        
        while((s=buffrd.readLine()) != null) {
        	
        	String str[] = s.split(",");
        	
        	Employee emp = new Employee(Integer.parseInt(str[0]),str[1],str[2]);
        	System.out.println(emp);
        	
        	//System.out.println(str[0]+ " " + str[1] + " "+ str[2]);
        }
    
       
        
        
        
    }
}

