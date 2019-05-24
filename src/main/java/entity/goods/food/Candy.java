package entity.goods.food;

import entity.Good;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "candy")
public class Candy {
    @XmlElement(name = "good")
    private List<Good> good;

    public Candy() {
    }

    public Candy(List<Good> good) {
        this.good = good;
    }

    public List<Good> getGood() {
        return good;
    }

    public void setGood(List<Good> good) {
        this.good = good;
    }
}
