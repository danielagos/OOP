package sk.stuba.fei.uim.oop.entity.grant;

import sk.stuba.fei.uim.oop.entity.organization.OrganizationInterface;
import sk.stuba.fei.uim.oop.entity.people.PersonInterface;

import java.util.Set;

public class ProjectImplementation implements ProjectInterface
{
    private String projectName;
    private int startingYear;
    private int endingYear;
    private int budgetForYear;
    private int totalBudget;
    private Set<PersonInterface> allParticipants;
    private OrganizationInterface applicant;

    @Override
    public String getProjectName() {
        return projectName;
    }

    @Override
    public void setProjectName(String name) {
        this.projectName = name;
    }

    @Override
    public int getStartingYear() {
        return startingYear;
    }

    @Override
    public void setStartingYear(int year) {
        this.startingYear = year;
    }

    @Override
    public int getEndingYear() {
        return endingYear;
    }

    @Override
    public int getBudgetForYear(int year) {
        return budgetForYear;
    }

    @Override
    public void setBudgetForYear(int year, int budget) {
        this.budgetForYear = budget;
    }

    @Override
    public int getTotalBudget() {
        return totalBudget;
    }

    @Override
    public void addParticipant(PersonInterface participant) {
        allParticipants.add(participant);
    }

    @Override
    public Set<PersonInterface> getAllParticipants() {
        return allParticipants;
    }

    @Override
    public OrganizationInterface getApplicant() {
        return applicant;
    }

    @Override
    public void setApplicant(OrganizationInterface applicant) {
        this.applicant = applicant;
    }
}
