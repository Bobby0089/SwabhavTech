package com.company.structural.adapter.model;

public class UploadFile implements CloudStorage {

	@Override
	public void uploadFile(String fileName) {
		System.out.println(fileName + " uploaded successfully");
	}

	@Override
	public void downloadFile(String fileName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteFile(String fileName) {
		// TODO Auto-generated method stub
		
	}

}
