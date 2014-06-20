/*
 * WebimPlugin.java
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
package webim.struts2;

import java.util.ArrayList;
import java.util.List;

import webim.client.WebimEndpoint;
import webim.client.WebimMember;
import webim.client.WebimMenu;
import webim.client.WebimNotification;
import webim.client.WebimRoom;

/**
 * WebIM插件接口 
 * 
 * @author Ery Lee <ery.lee at gmail.com>
 * @since 5.4
 */
public class WebimPlugin {

	/**
     * API: current user
     *
     * 返回当前的Webim端点(用户)
	 *
     * @return current user
     */
	public WebimEndpoint endpoint() {
		// TODO: 应替换该代码，返回集成系统的当前用户。
		WebimEndpoint ep = new WebimEndpoint("1", "user1");
		ep.setPic_url("https://1.gravatar.com/avatar/136e370cbf1cf500cbbf791e56dac614?d=https%3A%2F%2Fidenticons.github.com%2F577292a0aa8cb84aa3e6f06fee6f711c.png&s=70"); // �û�ͷ��
		ep.setShow("available");
		ep.setUrl(""); // 用户空间
		ep.setStatus(""); // 用户状态
		return ep;
	}
	
	/**
     * API: Buddies of current user.
     *
     * Buddy:
     *
     *  id:         uid
     *  uid:        uid
     *  nick:       nick
     *  pic_url:    url of photo
     *  presence:   online | offline
     *  show:       available | unavailable | away | busy | hidden
     *  url:        url of home page of buddy
     *  status:     buddy status information
     *  group:      group of buddy

     * @param string current uid
     *
     * @return Buddy list
     *
     */	
	public List<WebimEndpoint> buddies(String uid) {
		//TODO: DEMO CODE
		List<WebimEndpoint> buddies = new ArrayList<WebimEndpoint>();
		WebimEndpoint e = new WebimEndpoint("1", "user1");
		e.setPic_url("https://1.gravatar.com/avatar/136e370cbf1cf500cbbf791e56dac614?d=https%3A%2F%2Fidenticons.github.com%2F577292a0aa8cb84aa3e6f06fee6f711c.png&s=50");
		buddies.add(e);
		e = new WebimEndpoint("2", "user2");
		e.setPic_url("https://1.gravatar.com/avatar/136e370cbf1cf500cbbf791e56dac614?d=https%3A%2F%2Fidenticons.github.com%2F577292a0aa8cb84aa3e6f06fee6f711c.png&s=50");
		buddies.add(e);
		return buddies;
	}

	/**
     * API: buddies by ids
     *
     * @param buddy id array
     *
     * @return Buddy list
     *
     */	
	public List<WebimEndpoint> buddiesByIds(String uid, String[] ids) {
		List<WebimEndpoint> buddies = new ArrayList<WebimEndpoint>();
		WebimEndpoint e = new WebimEndpoint("1", "user1");
		e.setPic_url("https://1.gravatar.com/avatar/136e370cbf1cf500cbbf791e56dac614?d=https%3A%2F%2Fidenticons.github.com%2F577292a0aa8cb84aa3e6f06fee6f711c.png&s=50");
		buddies.add(e);
		e = new WebimEndpoint("2", "user2");
		e.setPic_url("https://1.gravatar.com/avatar/136e370cbf1cf500cbbf791e56dac614?d=https%3A%2F%2Fidenticons.github.com%2F577292a0aa8cb84aa3e6f06fee6f711c.png&s=50");
		buddies.add(e);
		return buddies;

	}

	/**
	 * 根据roomId读取群组
	 * 
	 * @param roomId
	 * @return 群组
	 */
	public WebimRoom findRoom(String roomId) {
		// TODO: 示例代码，需要替换
		if(roomId.equals("room1")) {
			WebimRoom room = new WebimRoom("room1", "Room1");
			room.setPic_url("/Webim/static/images/room.png");
			return room;
		}
		return null;
	}

    /**
     * API：rooms of current user
     *
     * @param uid
     *
     * @return rooms
     *
     * Room:
     *
     *  id:         Room ID,
     *  nick:       Room Nick
     *  url:        Home page of room
     *  pic_url:    Pic of Room
     *  status:     Room status
     *  count:      count of online members
     *  all_count:  count of all members
     *  blocked:    true | false
     */
	public List<WebimRoom> rooms(String uid) {
		// TODO: 示例代码，需要替换
		List<WebimRoom> rooms = new ArrayList<WebimRoom>();
		WebimRoom room = new WebimRoom("room1", "Room1");
		room.setPic_url("/Webim/static/images/room.png");
		rooms.add(room);
		return rooms;
	}
	
	/**
     * API: rooms by ids
     *
     * @param room id array
     *
     * @return rooms
     *
     * Room
     *
     */
    public List<WebimRoom> roomsByIds(String uid, String[] ids) {
		// TODO: 示例代码，需要替换
		List<WebimRoom> rooms = new ArrayList<WebimRoom>();
		WebimRoom room = new WebimRoom("room1", "Room1");
		room.setPic_url("/Webim/static/images/room.png");
		rooms.add(room);
		return rooms;
    }
    
    /**
     * API: members of room
     *
     * @param roomId
     * @return member list
     */    
    public List<WebimMember> members(String roomId) {
    	List<WebimMember> members = new ArrayList<WebimMember>();
    	members.add(new WebimMember("1", "user1"));
    	members.add(new WebimMember("2", "user2"));
    	return members;
    }
    
    /**
     * API: notifications of current user
     *
     * @return notification list
     *
     * Notification:
     *
     *  text: text
     *  link: link
     */    
    public List<WebimNotification> notifications(String uid) {
    	List<WebimNotification> notifications = new ArrayList<WebimNotification>();
    	notifications.add(new WebimNotification("通知演示", "#"));
    	return notifications;
    }
    

    /**
     * API: menu
     *
     * @return menu list
     *
     * Menu:
     *
     * icon
     * text
     * link
     */
    public List<WebimMenu> menu(String uid) {
    	return new ArrayList<WebimMenu>();
    }
    
}