
public enum CoffeeType {

	CAPPUCCINO(1, "CAPPUCCINO"), ESPRESSO(2, "ESPRESSO"), ICELATTE(2, "ICELATTE"), AMERICANO(4, "AMERICANO");

	private final Integer key;
	private final String value;

	private CoffeeType(Integer key, String value) {
		this.key = key;
		this.value = value;
	}

	public Integer getKey() {
		return this.key;
	}

	public String getValue() {
		return this.value;
	}

}
