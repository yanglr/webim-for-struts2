/*
 * MenusAction.java
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package webim.actions;

import java.util.List;

import webim.client.WebimEndpoint;
import webim.client.WebimMenu;

/**
 * 读取菜单: /Webim/menus.do
 * 
 * @author Ery Lee <ery.lee at gmail.com>
 * @since 1.0
 */
@SuppressWarnings("serial")
public class MenusAction extends WebimAction {

	private List<WebimMenu> data;

	public String execute() {
		WebimEndpoint endpoint = currentEndpoint();
		setData(plugin.menu(endpoint.getId()));
		return SUCCESS;
	}

	public List<WebimMenu> getData() {
		return data;
	}

	public void setData(List<WebimMenu> data) {
		this.data = data;
	}

}