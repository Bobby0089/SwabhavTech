package com.company.structural.adapter.model;

public interface CloudStorage {

	void uploadFile(String fileName);
	void downloadFile(String fileName);
	void deleteFile(String fileName);
}
