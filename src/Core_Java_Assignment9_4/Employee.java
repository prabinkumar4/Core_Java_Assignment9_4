package Core_Java_Assignment9_4;


import java.util.Comparator; 
import java.util.TreeSet; 

public class Employee {

    public static void main(String a[]){ 
        //By using name comparator (String comparison) 
        TreeSet<Emp> EmpnameComp = new TreeSet<Emp>(new EmpNameComp()); 
        EmpnameComp.add(new Emp("Ankur",8000,"peon")); //Employee details added to the treeSet
        EmpnameComp.add(new Emp("Ansh",10000,"gaurd")); 
        EmpnameComp.add(new Emp("Rahul",6000,"sweeper")); 
        EmpnameComp.add(new Emp("Chandan",18000,"supervisor")); 
        for(Emp e:EmpnameComp){ 
        	  
        } 
        System.out.println("============Sorted Output===============");  
        //By using salary comparator (int comparison) 
        TreeSet<Emp> EmpsalComp = new TreeSet<Emp>(new EmpSalaryComp()); 
        EmpsalComp.add(new Emp("Ankur",8000,"peon")); //Employee details added to the treeSet
        EmpsalComp.add(new Emp("Ansh",10000,"gaurd")); 
        EmpsalComp.add(new Emp("Rahul",6000,"sweeper")); 
        EmpsalComp.add(new Emp("Chandan",18000,"supervisor")); 
        for(Emp e:EmpsalComp){ 
            System.out.println(e) ; 
        } 
    }
       
}
class EmpNameComp implements Comparator<Emp>{ 
    @Override 
    public int compare(Emp e1, Emp e2) { 
        return e1.getName().compareTo(e2.getName()); 
    } 
}    
class EmpSalaryComp implements Comparator<Emp>{ 
    @Override 
    public int compare(Emp e1, Emp e2) { 
        if(e1.getSalary() > e2.getSalary()){ 
            return 1; 
        } else { 
            return -1; 
        } 
    } 
} 
class Emp{ 
      
    private String name; 
    private int salary; 
    private String designation; 
      
    public Emp(String n, int s,String d){ 
        this.name = n; 
        this.salary = s; 
        this.designation = d; 
    } 
      
    public String getName() { 
        return name; 
    } 
    public void setName(String name) { 
        this.name = name; 
    } 
    public int getSalary() { 
        return salary; 
    } 
    public void setSalary(int salary) { 
        this.salary = salary; 
    } 
    
    public String getDesignation() { 
        return designation; 
    } 
    public void setDesignation(String designation) { 
        this.designation = designation; 
    }
    
    public String toString(){ 
        return "Name: "+this.name+"-- Salary: "+this.salary+"-- Designation: "+this.designation; 
    } 
}
