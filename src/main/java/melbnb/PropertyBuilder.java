package melbnb;

import java.util.Optional;

public class PropertyBuilder {
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

    public Property build() {
        return new Property(property, location, description, type, host, maxGuests, rating, pricePerNight,
                serviceFeePerNight, cleaningFee, discountPercent);
    }

	public void setProperty(String property) {
		this.property = property;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public void setMaxGuests(int maxGuests) {
		this.maxGuests = maxGuests;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public void setPricePerNight(int pricePerNight) {
		this.pricePerNight = pricePerNight;
	}

	public void setServiceFeePerNight(int serviceFeePerNight) {
		this.serviceFeePerNight = serviceFeePerNight;
	}

	public void setCleaningFee(int cleaningFee) {
		this.cleaningFee = cleaningFee;
	}

	public void setDiscountPercent(int discountPercent) {
		this.discountPercent = discountPercent;
	}
}
