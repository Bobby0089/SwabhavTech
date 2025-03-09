package com.company.structural.adapter.model;

public class DownloadFile implements CloudStorage{

	@Override
	public void uploadFile(String fileName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void downloadFile(String fileName) {
		System.out.println(fileName+" Downloaded");
	}

	@Override
	public void deleteFile(String fileName) {
		// TODO Auto-generated method stub
		
	}

}
