package compareToPractice;

public class Student implements Comparable<Student>
{
    private String firstName, lastName;
    private double gpa;
    
    public Student(String firstName, String lastName, double gpa)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public double getGpa()
    {
        return gpa;
    }
    
    public String toString()
    {
        return lastName + ", " + firstName + ": " + gpa;
    }
    
    /*
     * Students are ordered by GPA (highest comes first)
     * followed by last name followed by first name (alphabetically)
     */
    public int compareTo(Student other)
    {
    	Double doubleA = this.gpa;
    	Double doubleB = other.gpa;
    	
    	if (doubleA.compareTo(doubleB) < 0) {
        	return -doubleA.compareTo(doubleB);
        } else if (doubleA.compareTo(doubleB) > 0) {
        	return -doubleA.compareTo(doubleB);
        } else {
        	if (this.lastName.compareTo(other.lastName) < 0) {
            	return this.lastName.compareTo(other.lastName);
            } else if (this.lastName.compareTo(other.lastName) > 0) {
            	return this.lastName.compareTo(other.lastName);
            } else {
            	return this.firstName.compareTo(other.firstName);
            }
        }
    }
}
