package entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "good")
@XmlType(propOrder = {"id", "manufacturer", "model", "date", "color", "amount"})
public class Good {
    private int id;
    private String manufacturer;
    private String model;
    private String date;
    private String color;
    private String amount;

    public Good() {
    }

    public Good(int id, String manufacturer, String model, String date, String color, String amount) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.date = date;
        this.color = color;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    @XmlAttribute
    public void setId(int id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @XmlElement(name = "manufacturer")
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    @XmlElement(name = "model")
    public void setModel(String model) {
        this.model = model;
    }

    public String getDate() {
        return date;
    }

    @XmlElement(name = "date")
    public void setDate(String date) {
        this.date = date;
    }

    public String getColor() {
        return color;
    }

    @XmlElement(name = "color")
    public void setColor(String color) {
        this.color = color;
    }

    public String getAmount() {
        return amount;
    }

    @XmlElement(name = "amount")
    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Good{" +
                "id=" + id +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", date='" + date + '\'' +
                ", color='" + color + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }
}
