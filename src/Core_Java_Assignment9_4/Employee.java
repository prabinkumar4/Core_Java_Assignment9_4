package Core_Java_Assignment9_4;


	import java.util.Comparator; 
	import java.util.TreeSet; 
	
	public class Employee {

	    public static void main(String a[]){ 
	        //By using name comparator (String comparison) 
	        TreeSet<Empl> nameComp = new TreeSet<Empl>(new MyNameComp()); 
	        nameComp.add(new Empl("Ankur",12000)); 
	        nameComp.add(new Empl("Prashant",22000)); 
	        nameComp.add(new Empl("Rahul",8000)); 
	        nameComp.add(new Empl("Chandan",14000)); 
	        for(Empl e:nameComp){ 
	          //  System.out.println ; 
	        } 
	        System.out.println("==========================="); 
	        //By using salary comparator (int comparison) 
	        TreeSet<Empl> salComp = new TreeSet<Empl>(new MySalaryComp()); 
	        salComp.add(new Empl("Ankur",12000)); 
	        salComp.add(new Empl("Prashant",22000)); 
	        salComp.add(new Empl("Rahul",8000)); 
	        salComp.add(new Empl("Chandan",14000)); 
	        for(Empl e:salComp){ 
	            System.out.println(e) ; 
	        } 
	    }
	       
	}
	class MyNameComp implements Comparator<Empl>{ 
	    @Override 
	    public int compare(Empl e1, Empl e2) { 
	        return e1.getName().compareTo(e2.getName()); 
	    } 
	}    
	class MySalaryComp implements Comparator<Empl>{ 
	    @Override 
	    public int compare(Empl e1, Empl e2) { 
	        if(e1.getSalary() > e2.getSalary()){ 
	            return 1; 
	        } else { 
	            return -1; 
	        } 
	    } 
	} 
	class Empl{ 
	      
	    private String name; 
	    private int salary; 
	      
	    public Empl(String n, int s){ 
	        this.name = n; 
	        this.salary = s; 
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
	    public String toString(){ 
	        return "Name: "+this.name+"-- Salary: "+this.salary; 
	    } 
	}
