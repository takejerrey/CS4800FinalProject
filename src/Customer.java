public abstract class Customer {
    private String name;
    private String address;
    private County.Area operatingCounty;
    private DietaryRestriction.DietPlan diet;

    public Customer(String name, String address, County.Area operatingCounty, DietaryRestriction.DietPlan diet) {
        this.name = name;
        this.address = address;
        this.operatingCounty = operatingCounty;
        this.diet = diet;
    }

    abstract void orderFood(Restaurant restaurant);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public County.Area getOperatingCountry() {
        return operatingCounty;
    }

    public void setOperatingCounty(County.Area operatingCounty) {
        this.operatingCounty = operatingCounty;
    }

    public DietaryRestriction.DietPlan getDiet() {
        return diet;
    }

    public void setDiet(DietaryRestriction.DietPlan diet) {
        this.diet = diet;
    }
}
