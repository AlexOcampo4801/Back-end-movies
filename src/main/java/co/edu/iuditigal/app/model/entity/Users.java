package co.edu.iuditigal.app.model.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "users_id")
	private int usersId;
	private String name;
	private String email;
	private String password;
	@Column (name = "create_at")
	private LocalDateTime createAt;
	@ManyToOne
	@JoinColumn (name = "profile_id")
	private Profile profileId;
	/**
	 * @return the usersId
	 */
	public int getUsersId() {
		return usersId;
	}
	/**
	 * @param usersId the usersId to set
	 */
	public void setUsersId(int usersId) {
		this.usersId = usersId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the createAt
	 */
	public LocalDateTime getCreateAt() {
		return createAt;
	}
	/**
	 * @param createAt the createAt to set
	 */
	public void setCreateAt(LocalDateTime createAt) {
		this.createAt = createAt;
	}
	/**
	 * @return the profileId
	 */
	public Profile getProfileId() {
		return profileId;
	}
	/**
	 * @param profileId the profileId to set
	 */
	public void setProfileId(Profile profileId) {
		this.profileId = profileId;
	}
	
	
}
