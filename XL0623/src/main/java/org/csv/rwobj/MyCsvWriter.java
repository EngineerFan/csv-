package org.csv.rwobj;

import java.nio.charset.Charset;

import com.csvreader.CsvWriter;

public class MyCsvWriter extends CsvWriter{

	public MyCsvWriter(String targetPath, char charname, Charset charsetname) {
		super(targetPath, charname, charsetname);
		// TODO Auto-generated constructor stub
	}

}
