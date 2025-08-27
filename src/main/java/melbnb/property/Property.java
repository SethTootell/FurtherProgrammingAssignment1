package melbnb.property;
public class Property {
    final private String property;
	final private String location;
    final private String description;
    final private String type;
    final private String host;
    final private Integer maxGuests;
    final private Double rating;
    final private Integer pricePerNight;
    final private Double serviceFeePerNight;
    final private Integer cleaningFee;
    final private Integer discountPercent;

    public static Property fromLine(String[] line) {
        PropertyCsvLine csvLine = new PropertyCsvLine(line);
        return new Property(csvLine);
    }

    private Property(PropertyCsvLine line) {
        this.property = line.get(0);
        this.location = line.get(1);
        this.description = line.get(2);
        this.type = line.get(3);
        this.host = line.get(4);
        this.maxGuests = line.getInt(5);
        this.rating = line.getDouble(6);
        this.pricePerNight = line.getInt(7);
        this.serviceFeePerNight = line.getDouble(8);
        this.cleaningFee = line.getInt(9);
        this.discountPercent = line.getInt(10);
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
	public Integer getMaxGuests() {
		return maxGuests;
	}
	public Double getRating() {
		return rating;
	}
	public Integer getPricePerNight() {
		return pricePerNight;
	}
	public Double getServiceFeePerNight() {
		return serviceFeePerNight;
	}
	public Integer getCleaningFee() {
		return cleaningFee;
	}
	public Integer getDiscountPercent() {
		return discountPercent;
	}
}
