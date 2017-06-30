package org.csv.rwobj;

import java.io.FileNotFoundException;
import java.nio.charset.Charset;

import com.csvreader.CsvReader;

public class MyCsvReader extends CsvReader{

	
	public MyCsvReader(String sourcePath, char charname, Charset charsetname) throws FileNotFoundException {
		super(sourcePath, charname, charsetname);
	}

}
