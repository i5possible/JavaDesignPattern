package mediator;

public class Main {
    public static void main(String[] args) {
        UnitedNations securityCouncil = new UnitedNationsSecurityCouncil();
        USA usa = new USA("USA", securityCouncil);
        China china = new China("China", securityCouncil);
        Iraq iraq = new Iraq("Iraq", securityCouncil);

        securityCouncil.addCountries(usa);
        securityCouncil.addCountries(china);
        securityCouncil.addCountries(iraq);

        usa.declare("No nuclear weapons! Or we will start a war to terminate it!");
        iraq.declare("We don't have any nuclear weapons! And we don't afraid to start a war with anyone!");
        china.declare("We should be harmonious...");
    }
}
