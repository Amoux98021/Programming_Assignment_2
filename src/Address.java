class Address {
    private String street;
    private String state;
    private String zipcode;
    private String city;

    //constructor for the class

    public Address(String street, String state, String zipcode, String city) {
        this.street = street;
        this.state = state;
        this.zipcode = zipcode;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    //toString method used

    @Override
    public String toString() {
        return "\nProperty Address :" + "\n" + street + "\n"
                + city + " " + state + " , " + zipcode;
    }
}