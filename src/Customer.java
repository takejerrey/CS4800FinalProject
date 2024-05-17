public class Customer {
    private String name;
    private String address;
    private County.Area county;
    private DietaryRestriction.DietPlan diet;

    public Customer(String name, String address, County.Area county, DietaryRestriction.DietPlan diet) {
        this.name = name;
        this.address = address;
        this.county = county;
        this.diet = diet;
    }

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

    public County.Area getCounty() {
        return county;
    }

    public void setCounty(County.Area county) {
        this.county = county;
    }

    public DietaryRestriction.DietPlan getDiet() {
        return diet;
    }

    public void setDiet(DietaryRestriction.DietPlan diet) {
        this.diet = diet;
    }
}
