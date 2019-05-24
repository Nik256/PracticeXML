package entity.goods.clothes;

import entity.Good;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "coat")
public class Coat {
    @XmlElement(name = "good")
    private List<Good> good;

    public Coat() {
    }

    public Coat(List<Good> good) {
        this.good = good;
    }

    public List<Good> getGood() {
        return good;
    }

    public void setGood(List<Good> good) {
        this.good = good;
    }
}
