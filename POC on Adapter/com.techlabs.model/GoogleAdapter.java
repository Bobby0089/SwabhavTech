package com.company.structural.adapter.model;

public class GoogleAdapter implements GoogleDrive {

	private CloudStorage cloud;
	
	public GoogleAdapter(String fileOperation)
	{
		if(fileOperation.equalsIgnoreCase("upload"))
		{
			cloud = new UploadFile();
		}
		else if(fileOperation.equalsIgnoreCase("download"))
		{
			cloud = new DownloadFile();
		}
		else if(fileOperation.equalsIgnoreCase("delete"))
		{
			cloud = new DeleteFile();
		}
	}

	@Override
	public void operation(String operation, String fileName) {
		if(operation.equalsIgnoreCase("upload"))
		{
			cloud.uploadFile(fileName);
		}
		else if(operation.equalsIgnoreCase("download"))
		{
			cloud.downloadFile(fileName);
		}
		else if(operation.equalsIgnoreCase("delete"))
		{
			cloud.deleteFile(fileName);
		}
	}	
}
