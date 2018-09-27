package com.homeo.restws.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="file")
@XmlAccessorType(XmlAccessType.FIELD)
public class FileUpload  implements Serializable {

	private static final long serialVersionUID = -4864462008169653053L;

	@XmlElement(name="url")
	private String url="";

	@XmlElement(name="type")
	private String type="";

	@XmlElement(name="size")
	private String size="";

	@XmlElement(name="deleteType")
	private String deleteType="";//DELETE

	@XmlElement(name="name")
	private String name="";

	@XmlElement(name="thumbnailUrl")
	private String thumbnailUrl;

	@XmlElement(name="success")
	private String success="";	

	@XmlElement(name="error")
	private String error;

	@XmlElement(name="deleteUrl")
	private String deleteUrl;


	// default constructor 
	public FileUpload() {
		super();
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}


	public String getDeleteType() {
		return deleteType;
	}


	public void setDeleteType(String deleteType) {
		this.deleteType = deleteType;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getThumbnailUrl() {
		return thumbnailUrl;
	}


	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}


	public String getSuccess() {
		return success;
	}


	public void setSuccess(String success) {
		this.success = success;
	}


	public String getError() {
		return error;
	}


	public void setError(String error) {
		this.error = error;
	}


	public String getDeleteUrl() {
		return deleteUrl;
	}


	public void setDeleteUrl(String deleteUrl) {
		this.deleteUrl = deleteUrl;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deleteType == null) ? 0 : deleteType.hashCode());
		result = prime * result + ((deleteUrl == null) ? 0 : deleteUrl.hashCode());
		result = prime * result + ((error == null) ? 0 : error.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((size == null) ? 0 : size.hashCode());
		result = prime * result + ((success == null) ? 0 : success.hashCode());
		result = prime * result + ((thumbnailUrl == null) ? 0 : thumbnailUrl.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((url == null) ? 0 : url.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FileUpload other = (FileUpload) obj;
		if (deleteType == null) {
			if (other.deleteType != null)
				return false;
		} else if (!deleteType.equals(other.deleteType))
			return false;
		if (deleteUrl == null) {
			if (other.deleteUrl != null)
				return false;
		} else if (!deleteUrl.equals(other.deleteUrl))
			return false;
		if (error == null) {
			if (other.error != null)
				return false;
		} else if (!error.equals(other.error))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (size == null) {
			if (other.size != null)
				return false;
		} else if (!size.equals(other.size))
			return false;
		if (success == null) {
			if (other.success != null)
				return false;
		} else if (!success.equals(other.success))
			return false;
		if (thumbnailUrl == null) {
			if (other.thumbnailUrl != null)
				return false;
		} else if (!thumbnailUrl.equals(other.thumbnailUrl))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "{url=" + url + ", type=" + type + ", size=\"" + size + "\", deleteType=" + deleteType + ", name="
				+ name + ", thumbnailUrl=" + thumbnailUrl + ", success=" + success + ", error=" + error + ", deleteUrl="
				+ deleteUrl + "}";
	}


}
