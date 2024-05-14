public class Customer
{
    private String name;
    private String address;
    private County county;
    private DietaryRestriction dietaryRestriction;

    public Customer(String name, String address, County county, DietaryRestriction dietaryRestriction)
    {
        this.name = name;
        this.address = address;
        this.county = county;
        this.dietaryRestriction = dietaryRestriction;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public County getCounty()
    {
        return county;
    }

    public void setCounty(County county)
    {
        this.county = county;
    }

    public DietaryRestriction getDietaryRestriction()
    {
        return dietaryRestriction;
    }

    public void setDietaryRestriction(DietaryRestriction dietaryRestriction)
    {
        this.dietaryRestriction = dietaryRestriction;
    }
}
