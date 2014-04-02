package Parser;
import java.util.List;

import org.jsefa.xml.annotation.ListItem;
import org.jsefa.xml.annotation.Namespace;
import org.jsefa.xml.annotation.XmlAttribute;
import org.jsefa.xml.annotation.XmlDataType;
import org.jsefa.xml.annotation.XmlElementList;
import org.jsefa.xml.annotation.XmlNamespaces;

@XmlNamespaces(@Namespace(uri = "www.a-simple-namespace-sample.org/yellowPages"))
@XmlDataType(defaultElementName = "department")
public class Department {
	@XmlAttribute()
    String name;

    @XmlElementList(items = {@ListItem(name = "employee")})
    List<Employee> employees;


}
