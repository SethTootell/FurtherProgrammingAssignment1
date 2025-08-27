package melbnb;
public class Property {
    private String property;
	private String location;
    private String description;
    private String type;
    private String host;
    private int maxGuests;
    private int rating;
    private int pricePerNight;
    private int serviceFeePerNight;
    private int cleaningFee;
    private int discountPercent;

    public Property(String property,
            String location,
            String description,
            String type,
            String host,
            int maxGuests,
            int rating,
            int pricePerNight,
            int serviceFeePerNight,
            int cleaningFee,
            int discountPercent) {
        this.property = property;
        this.description = description;
        this.type = type;
        this.host = host;
        this.maxGuests = maxGuests;
        this.rating = rating;
        this.pricePerNight = pricePerNight;
        this.serviceFeePerNight = serviceFeePerNight;
        this.cleaningFee = cleaningFee;
        this.discountPercent = discountPercent;
    }

    public String getProperty() {
		return property;
	}
	public String getLocation() {
		return location;
	}
	public String getDescription() {
		return description;
	}
	public String getType() {
		return type;
	}
	public String getHost() {
		return host;
	}
	public int getMaxGuests() {
		return maxGuests;
	}
	public int getRating() {
		return rating;
	}
	public int getPricePerNight() {
		return pricePerNight;
	}
	public int getServiceFeePerNight() {
		return serviceFeePerNight;
	}
	public int getCleaningFee() {
		return cleaningFee;
	}
	public int getDiscountPercent() {
		return discountPercent;
	}
}
