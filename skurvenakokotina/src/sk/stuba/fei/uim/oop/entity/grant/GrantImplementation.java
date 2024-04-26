package sk.stuba.fei.uim.oop.entity.grant;

import java.util.Set;

public class GrantImplementation implements GrantInterface {
    private String identifier;
    private int year;
    private AgencyInterface agency;
    private int budget;
    private int remainingBudget;
    private int budgetForProject;
    private Set<ProjectInterface> registeredProjects;
    private GrantState state;
    @Override
    public String getIdentifier() {
        return identifier;
    }

    @Override
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public AgencyInterface getAgency() {
        return agency;
    }

    @Override
    public void setAgency(AgencyInterface agency) {
        this.agency = agency;
    }

    @Override
    public int getBudget() {
        return budget;
    }

    @Override
    public void setBudget(int budget) {
        this.budget = budget;
    }

    @Override
    public int getRemainingBudget() {
        return remainingBudget;
    }

    @Override
    public int getBudgetForProject(ProjectInterface project) {
        return budgetForProject;
    }

    //TODO
    @Override
    public boolean registerProject(ProjectInterface project) {
        return false;
    }

    @Override
    public Set<ProjectInterface> getRegisteredProjects() {
        return registeredProjects;
    }

    @Override
    public GrantState getState() {
        return state;
    }

    @Override
    public void callForProjects() {
        state = GrantState.STARTED;
    }

    @Override
    public void evaluateProjects() {
        state = GrantState.EVALUATING;
    }

    @Override
    public void closeGrant() {
        state = GrantState.CLOSED;
    }
}
