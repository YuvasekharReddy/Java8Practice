package com.example;

import java.util.*;
import java.util.stream.Collectors;

public class Student_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st=new Student(14,"yuva","ug");
		Student st1=new Student(15,"raj","sg");
		Student st2=new Student(14,"yuva","ug");
		System.out.println(st==st1);
		System.out.println(st==st2);
		System.out.println(st.equals(st2));
		List<Student> ls=new ArrayList<>();
	//	Set<Student> lss=new HashSet<>();
		ls.add(st);
		ls.add(st1);
		ls.add(st2);
//		for(Student s:ls) {
//			
//			System.out.println(s);
//		}
	//	System.out.println(ls);
		
		Object[] st11 = ls.toArray();
	      for (Object s : st11) {
	        if (ls.indexOf(s) != ls.lastIndexOf(s)) {
	            ls.remove(ls.lastIndexOf(s));
	         }
	      }

	    System.out.println("Distinct List "+ls);
		
	    ls = ls.stream().distinct().collect(Collectors.toList());
	    
	    System.out.println("Java 8 Distinct List "+ls);
	    
	   
	    for(int i=0;i<ls.size();i++){
	        for(int j=i+1;j<ls.size();j++){
	            if(ls.get(i).equals(ls.get(j))){
	                ls.remove(j);
	                j--;
	            }
	        }
	    }
	    
	    System.out.println("external Duplicate Remove:"+ls);
	    
	    
	}

}

class Student{
	int sid;
	String name;
	String cllass;
	public Student(int sid, String name, String cllass) {
		super();
		this.sid = sid;
		this.name = name;
		this.cllass = cllass;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCllass() {
		return cllass;
	}
	public void setCllass(String cllass) {
		this.cllass = cllass;
	}
	
	
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", cllass=" + cllass + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cllass == null) ? 0 : cllass.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + sid;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (cllass == null) {
			if (other.cllass != null)
				return false;
		} else if (!cllass.equals(other.cllass))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sid != other.sid)
			return false;
		return true;
	}
	
}
