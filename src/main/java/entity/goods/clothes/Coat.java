package entity.goods.clothes;

import entity.Good;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "coat")
public class Coat {
    @XmlElementWrapper(name = "coat")
    @XmlElement(name = "good")
    private List<Good> goodList;

    public Coat() {
    }

    public Coat(List<Good> goodList) {
        this.goodList = goodList;
    }

    public List<Good> getGoodList() {
        return goodList;
    }

    public void setGoodList(List<Good> goodList) {
        this.goodList = goodList;
    }
}
