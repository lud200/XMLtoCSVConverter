package Parser;
import java.math.BigDecimal;

import org.jsefa.xml.annotation.Namespace;
import org.jsefa.xml.annotation.XmlAttribute;
import org.jsefa.xml.annotation.XmlDataType;
import org.jsefa.xml.annotation.XmlNamespaces;
import org.jsefa.xml.annotation.XmlTextContent;
@XmlNamespaces(@Namespace(uri = "www.a-simple-namespace-sample.org/yellowPages"))
@XmlDataType(defaultElementName = "score")

public class Score {
	@XmlAttribute()
    String type;

    @XmlTextContent()
    BigDecimal value;
}
