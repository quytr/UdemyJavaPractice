package academy.OOPPart1;

import java.util.Locale;

public class Car {

    private int door;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("holden")) {
            this.model = model;
        }else{
            this.model = "unknown";
        }
    }

    public String getModel() {
        return this.model;
    }


}
