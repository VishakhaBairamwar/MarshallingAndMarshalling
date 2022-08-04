package om.BikkadIT.Conversion;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import om.BikkadIT.Student;

public class JavaToXml {
	
	public static void main(String[] args) throws JAXBException {
		
		Student stu=new Student();
		stu.setStudentId(111);
		stu.setStudentName("Namrata");
		stu.setStudentAge(25);
		stu.setStudentRank(12);
		
		JAXBContext context=JAXBContext.newInstance(Student.class);
		Marshaller marshaller = context.createMarshaller();	
		marshaller.marshal(stu,System.out);
		
		
	}

}
