import java.beans.*;

/**
 * @author Gary
 * This is an example of the java.beans API using the BeanInfo object to obtain the properties of TestBean
 * 
 */
public class JavaBeanAPITest{
	public static void main(String[] argv) throws Exception {
			    // creates a java.beans introspector object , Added stopClass arg to remove class name
			    BeanInfo testBeanInfo = Introspector.getBeanInfo(TestBean.class, Object.class);
			    
			    // creates an array containing the editable properties of the bean
			    PropertyDescriptor[] propDescriptors = testBeanInfo.getPropertyDescriptors();

			    // for loop prints out all properties from TestBean
			      for (PropertyDescriptor propDescriptor : propDescriptors) {
			        //prints out property name
			        System.out.println(propDescriptor.getName());
			        //makes the Introspector re-analyze existing Class objects
			        Introspector.flushCaches();
			      }
		 }
//Test bean for the Property Descriptor test			   
class TestBean implements java.io.Serializable {
	//Class Variables
	private static final long serialVersionUID = 1L;
	private String name = "";
	private int age = 1;
	private String dateOfBirth = "";
	public TestBean(){
		
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the dateOfBirth
	 */
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}	
	
}

}