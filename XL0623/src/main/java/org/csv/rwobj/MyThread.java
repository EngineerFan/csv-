package org.csv.rwobj;

public class MyThread implements Runnable{

	private MyCsvReader csvReader;
	
	public MyThread(){}
	
	public MyThread(MyCsvReader csvReader) {
		this.setCsvReader(csvReader);
	}
	@Override
	public void run() {
		int i = 2000;
		while(i>0){
			System.out.println(i);
			i = i-1;
		}
	}
	public MyCsvReader getCsvReader() {
		return csvReader;
	}
	public void setCsvReader(MyCsvReader csvReader) {
		this.csvReader = csvReader;
	}

}
