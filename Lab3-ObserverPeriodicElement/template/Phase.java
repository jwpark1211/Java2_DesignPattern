package template;

public enum Phase {
	gas,
	liq,
	solid,
	artificial;
	
	//get names()
	public static String[] names() {
		String[] names = new String[Phase.values().length];
		for(Phase n: Phase.values()) {
			names[n.ordinal()] = n.toString();
		}
		return names;
	}
}
