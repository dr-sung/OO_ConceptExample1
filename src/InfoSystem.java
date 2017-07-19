
import java.util.HashMap;
import java.util.Map;

/**
 * @author Hong Sung
 */

public class InfoSystem {

	private static final Map<String, String> locationDatabase;
	private static final Map<String, String> directionDatabase;

	static {
		locationDatabase = new HashMap<>();
		locationDatabase.put("P2", "MCS111");
		locationDatabase.put("OOP", "MCS113");
		locationDatabase.put("P1", "MCS115");

		directionDatabase = new HashMap<>();
		directionDatabase.put("MCS111", "left turn - right turn");
		directionDatabase.put("MCS113", "go straight");
		directionDatabase.put("MCS115", "left turn - left turn - right turn");
	}

	static String getLocation(String nextClass) {
		return locationDatabase.get(nextClass);
	}

	static String getDirection(String location) {
		return directionDatabase.get(location);
	}
	
}
