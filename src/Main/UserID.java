import java.util.UUID;

public class UserID {
	public static String getUserUUID() {
		String UserUUID = null;
		return UserUUID;
	}
	
	public static String makeUserUUID(){
		String UserUUID = java.util.UUID.randomUUID().toString();
		return UserUUID;
	}
	
	public static void addMeshID() {
		// Add a MeshID to UserID.json
	}
}
