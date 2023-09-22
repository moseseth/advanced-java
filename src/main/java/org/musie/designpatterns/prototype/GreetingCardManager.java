package org.musie.designpatterns.prototype;

import java.util.HashMap;
import java.util.Map;

// Prototype manager
class GreetingCardManager {
    private final Map<String, GreetingCard> prototypes;

    public GreetingCardManager() {
        prototypes = new HashMap<>();
        prototypes.put("birthday", new GreetingCard("Friend", "Birthday", "Wishing you a fantastic day!"));
        prototypes.put("anniversary", new GreetingCard("Couple", "Anniversary", "Celebrating your love and happiness."));
        // Register more prototypes
    }

    public GreetingCard getPrototype(String type) {
        return prototypes.get(type).clone();
    }
}
