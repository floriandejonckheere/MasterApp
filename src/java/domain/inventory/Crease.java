/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.inventory;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Range;

/**
 * INcrease or DEcrease
 *
 * @author florian
 */
public class Crease {

    @NotNull
    @Min(value = 1, message = "{Min.Crease.increase}")
    @Max(50)
    private int increase;

    @NotNull
    @Range(min = 1, max = 25, message = "{Range.Crease.decrease}")
    private int decrease;

    public int getIncrease() {
        return increase;
    }

    public void setIncrease(int increase) {
        this.increase = increase;
    }

    public int getDecrease() {
        return decrease;
    }

    public void setDecrease(int decrease) {
        this.decrease = decrease;
    }
}
