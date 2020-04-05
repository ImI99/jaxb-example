package legoset;

import lombok.Data;
import movie.YearAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;
import java.net.URL;
import java.time.Year;
import java.util.List;
import java.util.Set;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"name", "theme", "subtheme","year","pieces","tags","minifigs","weight","url"})
@Data
public class LegoSet {

        @XmlAttribute
        private String number;
        private String name;
        private String theme;
        private String subtheme;
        @XmlJavaTypeAdapter(YearAdapter.class)
        private Year year;
        private int pieces;

        @XmlElementWrapper(name = "tags")
        @XmlElement(name="tag")
        private java.util.Set<String> tags;

        @XmlElementWrapper(name = "minifigs")
        @XmlElement(name="minifig")
        private java.util.Set<Minifig> minifigs;
        private Weight weight;

        private String url;

        public void setNumber(String number) {
                this.number = number;
        }

        public void setMinifigs(Set<Minifig> minifigs) {
                this.minifigs = minifigs;
        }

        public void setName(String name) {
                this.name = name;
        }

        public void setPieces(int pieces) {
                this.pieces = pieces;
        }

        public void setSubtheme(String subtheme) {
                this.subtheme = subtheme;
        }

        public void setTags(Set<String> tags) {
                this.tags = tags;
        }

        public void setTheme(String theme) {
                this.theme = theme;
        }

        public void setUrl(String url) {
                this.url = url;
        }

        public void setWeight(Weight weight) {
                this.weight = weight;
        }

        public void setYear(Year year) {
                this.year = year;
        }
}
