package entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "good")
public class Good {
    @XmlAttribute(name = "id")
    private int id;
    @XmlElement(name = "manufacturer")
    private String manufacturer;
    @XmlElement(name = "model")
    private String model;
    @XmlElement(name = "date")
    private String date;
    @XmlElement(name = "color")
    private String color;
    @XmlElement(name = "amount")
    private String amount;
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
