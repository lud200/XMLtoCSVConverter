package Parser;
import java.util.Date;

import org.jsefa.xml.annotation.Namespace;
import org.jsefa.xml.annotation.XmlDataType;
import org.jsefa.xml.annotation.XmlElement;
import org.jsefa.xml.annotation.XmlNamespaces;
@XmlNamespaces(@Namespace(uri = "www.a-simple-namespace-sample.org/yellowPages"))
@XmlDataType(defaultElementName = "employee")

public class Employee {
	 @XmlElement(pos = 1)
	    String name;

	    @XmlElement(pos = 2)
	    Role role;

	    @XmlElement(pos = 3)
	    boolean executive = false;

	    @XmlElement(pos = 4, format = "dd.MM.yyyy")
	    Date birthDate;

	    @XmlElement(pos = 5)
	    Score score;
}
