package domain.newsletter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FrameworkBean {

    private final List<String> webFrameworkList;

    public FrameworkBean() {
        webFrameworkList = new ArrayList<>(
                Arrays.asList(new String[]{"Spring MVC", "Struts 2", "JSF", "Ruby on Rails"}));
    }

    public List<String> getWebFrameworkList() {
        return webFrameworkList;
    }
}
