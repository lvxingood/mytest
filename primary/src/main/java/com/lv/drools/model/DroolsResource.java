package com.lv.drools.model;

import org.kie.api.io.ResourceType;

public class DroolsResource {
	private String path;
	private ResourceType type;
	private String username = null;
	private String password = null;

	/**
	 * 
	 * @param path
	 *            The path to this resource.
	 * @param pathType
	 *            The type of path (FILE, URL, etc).
	 * @param type
	 *            The type of resource (DRL, Binary package, DSL, etc)
	 */
	public DroolsResource(String path,  ResourceType type) {
		this.path = path;
		this.type = type;
	}

	/**
	 * 
	 * @param path
	 *            The path to this resource.
	 * @param pathType
	 *            The type of path (FILE, URL, etc).
	 * @param type
	 *            The type of resource (DRL, Binary package, DSL, etc)
	 * @param username
	 *            The user name for connecting to the resource.
	 * @param password
	 *            The password for connecting to the resource.
	 */
	public DroolsResource(String path,  ResourceType type, String username, String password) {
		this.path = path;
		this.type = type;
		this.username = username;
		this.password = password;
	}

}
