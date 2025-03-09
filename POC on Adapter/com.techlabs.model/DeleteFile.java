package com.company.structural.adapter.model;

public class DeleteFile implements CloudStorage{

	@Override
	public void uploadFile(String fileName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void downloadFile(String fileName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteFile(String fileName) {
		System.out.println(fileName + " deleted successfully");
	}

}
