package Parser;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

import org.jsefa.common.converter.DateConverter;
import org.jsefa.common.converter.SimpleTypeConverterConfiguration;
import org.jsefa.xml.XmlIOFactory;
import org.jsefa.xml.XmlSerializer;
import org.jsefa.xml.namespace.QName;

public class Serialize {
	void start() {
        XmlSerializer serializer = XmlIOFactory.createFactory(Department.class).createSerializer();

        StringWriter writer = new StringWriter();
        serializer.open(writer);
        serializer.getLowLevelSerializer().writeXmlDeclaration("1.0", "ISO-8859-1");
        serializer.getLowLevelSerializer().writeStartElement(
                QName.create("www.a-simple-namespace-sample.org/yellowPages", "yellowPages"));

        Department department = createDepartment("Development");

        department.employees.add(createEmployee("Erwin Schmidt", Role.SENIOR_DEVELOPER, "23.5.1964",
                new BigDecimal(7.5)));

        serializer.write(department);
        serializer.getLowLevelSerializer().writeEndElement();
        serializer.close(true);
        System.out.println("Resulting document:");
        System.out.println(writer.toString());
    }
	private Department createDepartment(String name) {
        Department department = new Department();
        department.name = name;
        department.employees = new ArrayList<Employee>();
        return department;
    }
	private Employee createEmployee(String string, Role role, String birthDate, BigDecimal score) {
        Employee employee = new Employee();
        employee.name = string;
        employee.role = role;
        employee.birthDate = createDate(birthDate);
        Score scoreObj = new Score();
        scoreObj.type = "performance";
        scoreObj.value = score;
        employee.score = scoreObj;
        return employee;
    }
	private Date createDate(String date) {
        return DateConverter.create(SimpleTypeConverterConfiguration.EMPTY).fromString(date);
    }
	public static void main(String[] args) {
        (new Serialize()).start();
    }	
}
