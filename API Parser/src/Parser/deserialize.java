package Parser;
import java.io.*;

import org.jsefa.Deserializer;
import org.jsefa.xml.XmlIOFactory;
import org.jsefa.xml.XmlReaderFactory;
import java.util.*;
public class deserialize {
	void start() throws IOException {
        Deserializer deserializer = XmlIOFactory.createFactory(Department.class).createDeserializer();
        deserializer.open(createFileReader());
        while (deserializer.hasNext()) {
            Department department = deserializer.next();
            print(department);
        }
        deserializer.close(true);

    }
	private void print(Department department) throws IOException{
		FileWriter fw = new FileWriter("E:\\a.csv");
	    PrintWriter output = new PrintWriter(fw);
		output.println("---------------------------");
		output.println("Department " + department.name);
		output.println("Employees: ");        
        for (Employee employee : department.employees) {
        	
        	output.println("---------------------------");
        	output.println("Name: " + employee.name);
        	output.println("Role: " + employee.role);
        	output.println("Executive: " + employee.executive);
        	output.println("Birthdate: " + employee.birthDate);
            output.println("Score type: " + employee.score.type);
            output.println("Score value: " + employee.score.value);
        }
        output.close();
        fw.close( );
    }
	private Reader createFileReader() {
        return XmlReaderFactory.create(this.getClass().getResourceAsStream("yellow-pages.xml"));
    }
	public static void main(String[] args)throws IOException {
        (new deserialize()).start();
    }
}
