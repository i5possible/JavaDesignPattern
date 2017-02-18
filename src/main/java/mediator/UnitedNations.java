package mediator;

import java.util.ArrayList;
import java.util.List;

abstract class UnitedNations {
    protected List<Country> countries = new ArrayList();

    public UnitedNations() {
    }

    public void declare(String message, Country country) {
        String messageWithCountry = country.countryName + " declared : " + message;
        countries.forEach(c -> c.getMessage(messageWithCountry));
        System.out.println();
    }

    public boolean addCountries(Country country) {
        countries.add(country);
        return true;
    }
}
