package com.company;

import java.util.*;

public class Countries {
    private Map<String,Country> countries;

    public Countries() {
        countries = new HashMap<>();
    }

    public void addCountry(String name, String iso2code) {
        countries.put(iso2code, new Country(name, iso2code));
    }

    public void setRegion(String iso2code, String region) {
        countries.get(iso2code).setRegion(region);
    }

    public void setIncomeLevel(String iso2code, String incomeLevel) {
        countries.get(iso2code).setIncomeLevel(incomeLevel);
    }

    public void setLifeExpectancy(String iso2code, String lifeExpectancy) {
        countries.get(iso2code).setLifeExpectancy(Double.parseDouble(lifeExpectancy));
    }

    public String report() {
        StringBuilder report = new StringBuilder();
        Set<String> keys = countries.keySet();
        for (String key: keys) {
            report.append(countries.get(key).getReportRow() + "\n");
        }
        return report.toString();
    }
}
