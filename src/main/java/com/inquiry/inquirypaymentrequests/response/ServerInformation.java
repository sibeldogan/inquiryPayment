package com.inquiry.inquirypaymentrequests.response;

import java.math.BigDecimal;

public class ServerInformation {

	private BigDecimal serverId;
	private String ipAddress;
	private String dsQuery;
	
	public BigDecimal getServerId() {
		return serverId;
	}

	public void setServerId(BigDecimal serverId) {
		this.serverId = serverId;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getDsQuery() {
		return dsQuery;
	}

	public void setDsQuery(String dsQuery) {
		this.dsQuery = dsQuery;
	}

	public ServerInformation() {
		// TODO Auto-generated constructor stub
	}

	public ServerInformation(BigDecimal serverId, String ipAddressString, String dsQuery) {
		super();
		this.serverId = serverId;
		this.ipAddress = ipAddressString;
		this.dsQuery = dsQuery;
	}

	@Override
	public String toString() {
		return "ServerInformation [serverId=" + serverId + ", ipAddressString=" + ipAddress + ", dsQuery="
				+ dsQuery + "]";
	}
	
	
}
