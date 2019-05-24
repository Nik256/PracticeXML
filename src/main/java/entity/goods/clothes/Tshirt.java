package entity.goods.clothes;

import entity.Good;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "tshirt")
public class Tshirt {
    @XmlElement(name = "good")
    private List<Good> good;

    public Tshirt() {
    }

    public Tshirt(List<Good> good) {
        this.good = good;
    }

    public List<Good> getGood() {
        return good;
    }

    public void setGood(List<Good> good) {
        this.good = good;
    }
}
