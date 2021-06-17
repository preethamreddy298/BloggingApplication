/*package com.cg.blogging.entities;

public class User {
private int userId;
private String password;
private String role;

}*/
package com.cg.blogging.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
    private String password;
	private String role;
	public User() {}
	
	
	public User(Integer userId, String password, String role) {
		super();
		this.userId = userId;
		this.password = password;
		this.role = role;
	}


	public Integer getuserId() {
		return userId;
	}
	public void setId(Integer id) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Student [userId=" + userId + ", password=" + password + ", role=" + role + "]";
	}


}


