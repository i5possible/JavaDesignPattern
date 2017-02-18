package mediator;

abstract class Country {
    protected String countryName;
    protected UnitedNations unitedNations;

    public Country(String countryName, UnitedNations unitedNations) {
        this.countryName = countryName;
        this.unitedNations = unitedNations;
    }

    public void getMessage(String message) {
        System.out.println(countryName + " received the message : " + message);
    }

    public void declare(String message) {
        unitedNations.declare(message, this);
    }
}

