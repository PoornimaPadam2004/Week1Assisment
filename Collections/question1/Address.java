package Collections.question1;

public class Address {
	  private String street;
	    private String city;
	    private String state;
	    private String zipCode;

	    public Address(String street, String city, String state, String zipCode) {
	        this.street = street;
	        this.city = city;
	        this.state = state;
	        this.zipCode = zipCode;
	    }

	    public String getStreet() {
	        return street;
	    }

	    public void setStreet(String street) {
	        this.street = street;
	    }

	    public String getCity() {
	        return city;
	    }

	    public void setCity(String city) {
	        this.city = city;
	    }

	    public String getState() {
	        return state;
	    }

	    public void setState(String state) {
	        this.state = state;
	    }

	    public String getZipCode() {
	        return zipCode;
	    }

	    public void setZipCode(String zipCode) {
	        this.zipCode = zipCode;
	    }

	    @Override
	    public String toString() {
	        return street + ", " + city + ", " + state + " - " + zipCode;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;
	        Address address = (Address) obj;
	        return street.equals(address.street) &&
	                city.equals(address.city) &&
	                state.equals(address.state) &&
	                zipCode.equals(address.zipCode);
	    }

	    @Override
	    public int hashCode() {
	        return street.hashCode() + city.hashCode() + state.hashCode() + zipCode.hashCode();
	    }

}
