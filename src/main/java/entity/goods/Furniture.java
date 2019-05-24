package entity.goods;

import entity.goods.furniture.Table;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "furniture")
public class Furniture {
    @XmlElement(name = "table")
    private List<Table> table;

    public Furniture() {
    }

    public Furniture(List<Table> table) {
        this.table = table;
    }

    public List<Table> getTable() {
        return table;
    }

    public void setTable(List<Table> table) {
        this.table = table;
    }
}
