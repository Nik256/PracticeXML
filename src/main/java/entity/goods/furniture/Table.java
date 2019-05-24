package entity.goods.furniture;

import entity.Good;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "table")
public class Table {
    @XmlElementWrapper(name = "table")
    @XmlElement(name = "good")
    private List<Good> goodList;

    public Table() {
    }

    public Table(List<Good> goodList) {
        this.goodList = goodList;
    }

    public List<Good> getGoodList() {
        return goodList;
    }

    public void setGoodList(List<Good> goodList) {
        this.goodList = goodList;
    }
}
