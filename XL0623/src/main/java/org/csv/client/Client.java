package org.csv.client;

import java.nio.charset.Charset;

import org.csv.rwobj.MyCsvReader;
import org.csv.rwobj.MyCsvWriter;

public class Client {

	public static void main(String[] args) throws Exception{
		MyCsvReader csvReader = new MyCsvReader("C:\\Users\\FXL\\Desktop\\starwoodhotels_20170605.csv",',',Charset.forName("GBK"));
		MyCsvWriter csvWriter = new MyCsvWriter("C:\\Users\\FXL\\Desktop\\temp.csv", ',',Charset.forName("GBK"));
		csvWriter.setForceQualifier(true);
		long startTime = System.currentTimeMillis();
		String[] newHeaders ={};
		while(csvReader.readRecord()){
            if(csvReader.getCurrentRecord()==0){
            	newHeaders = csvReader.getValues();
            }
			System.out.println(csvReader.getCurrentRecord()+": "+csvReader.get(0)+" "+csvReader.get(1));
			
			String[] tmp = {csvReader.getValues()[0],csvReader.getValues()[1]};
			if(!newHeaders[1].equals(tmp[1]) && ("".equals(tmp[1])||tmp==null)){
				tmp[1] = "null";
				csvWriter.writeRecord(tmp);
			}else{
				csvWriter.writeRecord(new String[]{csvReader.getValues()[0],csvReader.getValues()[1]});
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println((endTime-startTime)+"毫秒");
		csvReader.close();
		csvWriter.close();
		
	}
}
