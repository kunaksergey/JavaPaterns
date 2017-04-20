package ua.shield.paterns.builder;

/**
 * Created by sa on 19.04.17.
 */
public class Pizza {
    private String dough="";
    private String souce="";
    private String topic="";

    @Override
    public String toString() {
        return "Pizza{" +
                "dough='" + dough + '\'' +
                ", souce='" + souce + '\'' +
                ", topic='" + topic + '\'' +
                '}';
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setSouce(String souce) {
        this.souce = souce;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}

