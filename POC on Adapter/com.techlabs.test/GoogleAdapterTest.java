package com.company.structural.adapter.test;

import com.company.structural.adapter.model.GoogleAdapter;
import com.company.structural.adapter.model.GoogleDrive;

public class GoogleAdapterTest {

	public static void main(String[] args) {

		GoogleDrive file1 = new GoogleAdapter("upload");
		GoogleDrive file2 = new GoogleAdapter("download");
		GoogleDrive file3 = new GoogleAdapter("delete");
		
		file1.operation("upload", "File1");
		file2.operation("download", "File2");
		file3.operation("delete", "File3");
		
	}

}
