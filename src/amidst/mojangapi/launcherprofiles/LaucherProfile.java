package amidst.mojangapi.launcherprofiles;

import java.util.List;

import amidst.mojangapi.ReleaseType;

public class LaucherProfile {
	private String name;
	private String lastVersionId;
	private String gameDir;
	private List<ReleaseType> allowedReleaseTypes;

	public LaucherProfile() {
		// no-argument constructor for gson
	}

	public String getName() {
		return name;
	}

	public String getLastVersionId() {
		return lastVersionId;
	}

	public String getGameDir() {
		return gameDir;
	}

	public boolean isAllowed(ReleaseType releaseType) {
		return allowedReleaseTypes.contains(releaseType);
	}
}