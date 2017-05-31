package domain;

import java.util.ArrayList;

import java.util.List;

public class BeerExpertBean implements ExpertBean {

    @Override
    public List<String> getExpert(String color) {
        List<String> brands = new ArrayList<>();
        if (color == null) {
            return brands;
        }
        switch (color.toLowerCase().trim()) {
            case "light":
                brands.add("Hoegaarden");
                brands.add("Brugs Witbier");
                break;
            case "brown":
                brands.add("Westmalle bruin");
                brands.add("Leffe bruin");
                break;
            case "dark":
                brands.add("Affligem Donker");
                break;
        }
        return brands;
    }
}
