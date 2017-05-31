package domain.beer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ColorBean {

    private final List<String> colorsList;

    public ColorBean() {
        colorsList = new ArrayList<>(Arrays.asList(new String[]{"light", "brown", "dark"}));
    }

    public List<String> getColorsList() {
        return colorsList;
    }
}
