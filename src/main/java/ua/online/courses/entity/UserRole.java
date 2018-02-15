package ua.online.courses.entity;

public enum UserRole {

	ROLE_ADMIN("ADMIN"), ROLE_CLIENT("CLIENT");
	
	private String roleName;

	private UserRole(String roleName) {
		this.roleName = roleName;
	}
	
	public String getRoleName() {
		return roleName;
	}
	
}
