package sk.stuba.fei.uim.oop.entity.grant;

import java.util.Set;

public class AgencyImplementation implements AgencyInterface {
    private String name;
    private Set<GrantInterface> allGrants;
    private Set<GrantInterface> grantsIssuedInYear;
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void addGrant(GrantInterface gi, int year) {
        allGrants.add(gi);
        if (gi.getYear() == year) {
            grantsIssuedInYear.add(gi);
        }
    }

    @Override
    public Set<GrantInterface> getAllGrants() {
        return allGrants;
    }

    @Override
    public Set<GrantInterface> getGrantsIssuedInYear(int year) {
        return grantsIssuedInYear;
    }
}
