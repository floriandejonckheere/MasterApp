/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.newsletter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author florian
 */
public class Newsletter {

    private boolean subscribed;
    private List<String> topics;

    public Newsletter() {
        this.topics = new ArrayList<>();
        topics.add("Ruby on Rails");
    }

    public boolean isSubscribed() {
        return subscribed;
    }

    public void setSubscribed(boolean subscribed) {
        this.subscribed = subscribed;
    }

    public List<String> getTopics() {
        return topics;
    }

    public void setTopics(List<String> topics) {
        this.topics = topics;
    }
}
