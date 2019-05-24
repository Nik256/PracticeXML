package entity.goods.food;

import entity.Good;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "cake")
public class Cake {
    @XmlElement(name = "good")
    private List<Good> good;

    public Cake() {
    }

    public Cake(List<Good> good) {
        this.good = good;
    }

    public List<Good> getGood() {
        return good;
    }

    public void setGood(List<Good> good) {
        this.good = good;
    }
}
