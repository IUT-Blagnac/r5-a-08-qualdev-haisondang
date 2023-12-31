package dojo;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String target;
    private String owner;
    private List<String> cocktails;

    public Order() {
        this.cocktails = new ArrayList<String>() {
        };
    }

    public void declareTarget(String t) {
        this.target=t;
    }

    public void declareOwner(String x) {
        this.owner=x;
    }

    public List<String> getCocktails() {
        return this.cocktails;
    }
}
