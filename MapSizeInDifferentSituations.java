import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.ConcurrentSkipListMap;


public class MapSizeInDifferentSituations {

	public static void main(String[] args) {
		 System.out.println("--------------61-------------");
		//61
		Map<Integer, String> m = new LinkedHashMap<Integer, String>();
        m.put(11, "audi");
        m.put(null, null);
        m.put(11, "bmw");
        m.put(null, "fer");

        System.out.println(m.size());
        System.out.println(m);
        
        System.out.println("----------------62-----------");
        //62
        /*Map<Integer,String> concurrentSkipListMap=new ConcurrentSkipListMap<Integer,String>();
        
        concurrentSkipListMap.put(11, "audi");
        concurrentSkipListMap.put(44, null);
        
        Iterator<Integer> keyIterator = concurrentSkipListMap.keySet().iterator();
        while (keyIterator.hasNext()) {
               System.out.println(keyIterator.next());
        }*/
        System.out.println("----------------63-----------");
        //63
        
        HashMap<Employe, String> hm=new HashMap<Employe, String>();
        hm.put(new Employe("a"), "emp1");
        hm.put(new Employe("b"), "emp2");
        hm.put(new Employe("a"), "emp1 OVERRIDDEN");
        
        System.out.println("HashMap's data> "+hm);
        System.out.println("HashMap's size> "+hm.size());
        System.out.println(hm.get(new Employe("a")));
        
        System.out.println("--------------64-------------");
        
        //64
        HashMap<Employee1, String> hm2=new HashMap<Employee1, String>();
        hm2.put(new Employee1("a"), "emp1");
        hm2.put(new Employee1("b"), "emp2");
        hm2.put(new Employee1("a"), "emp1 OVERRIDDEN");
        
        System.out.println("HashMap's data> "+hm2);
        System.out.println("HashMap's size> "+hm2.size());
        System.out.println(hm2.get(new Employee1("a")));
        
        System.out.println("--------------65-------------");
        HashMap<Employee2, String> hm3=new HashMap<Employee2, String>();
        hm3.put(new Employee2("a"), "emp1");
        hm3.put(new Employee2("b"), "emp2");
        hm3.put(new Employee2("a"), "emp1 OVERRIDDEN");
        
        System.out.println("HashMap's data> "+hm3);
        System.out.println("HashMap's size> "+hm3.size());
        System.out.println(hm3.get(new Employee2("a")));
        
        System.out.println("--------------66-------------");
        Map<Integer, String> hashMap = new HashMap<Integer, String>();
        
        hashMap.put(11, "a");
        hashMap.put(null, "c");
        hashMap.put(null, null);

        System.out.println(hashMap.size());
        System.out.println(hashMap);
        
        System.out.println("--------------67-------------");
      /*  Vector<String> vector = new Vector<String>();
        
        vector.add("1");
        vector.add("2");

        Iterator<String> iterator = vector.iterator();
        while (iterator.hasNext()) {
               vector.add("3");
               System.out.println(iterator.next());
        }*/
        System.out.println("--------------68-------------");
        Map<Integer,String> hashMap4=new HashMap<Integer,String>();
        hashMap4.put(11, "a");
        Collections.unmodifiableMap(hashMap4);
        hashMap4.put(12, "b");
        System.out.println(hashMap4);
        
        System.out.println("--------------69-------------");
       /* Map<Integer, String> hashtable = new Hashtable<Integer, String>();
        
        hashtable.put(11, "a");
        hashtable.put(null, "c");
        hashtable.put(null, null);

        System.out.println(hashtable.size());
        System.out.println(hashtable);
        */
        System.out.println("--------------70-------------");
        
        HashMap<Employee3, String> hm4=new HashMap<Employee3, String>();
        hm4.put(new Employee3("a"), "emp1");
        hm4.put(new Employee3("b"), "emp2");
        hm4.put(new Employee3("a"), "emp1 OVERRIDDEN");
        
        System.out.println("HashMap's data> "+hm4);
        System.out.println("HashMap's size> "+hm4.size());
        System.out.println(hm4.get(new Employee3("a")));
        
        System.out.println("--------------71-------------");
        
        HashMap<Employee4, String> hm5=new HashMap<Employee4, String>();
        hm5.put(new Employee4("a"), "emp1");
        hm5.put(new Employee4("b"), "emp2");
        hm5.put(new Employee4("a"), "emp1 OVERRIDDEN");
        
        System.out.println("HashMap's data> "+hm5);
        System.out.println("HashMap's size> "+hm5.size());
        System.out.println(hm5.get(new Employee4("a")));
        
        System.out.println("--------------72-------------");
        
        HashMap<Employee5, String> hm6=new HashMap<Employee5, String>();
        hm6.put(new Employee5("a"), "emp1");
        hm6.put(new Employee5("b"), "emp2");
        hm6.put(new Employee5("a"), "emp1 OVERRIDDEN");
        
        System.out.println("HashMap's data> "+hm6);
        System.out.println("HashMap's size> "+hm6.size());
        System.out.println(hm6.get(new Employee5("a")));
        
        System.out.println("--------------73-------------");
        
        HashMap<Employee6, String> hm7=new HashMap<Employee6, String>();
        hm7.put(new Employee6("a"), "emp1");
        hm7.put(new Employee6("b"), "emp2");
        hm7.put(new Employee6("a"), "emp1 OVERRIDDEN");
        
        System.out.println("HashMap's data> "+hm7);
        System.out.println("HashMap's size> "+hm7.size());
        System.out.println(hm7.get(new Employee6("a")));
        
        System.out.println("--------------74-------------");
        
        List<String> arrayList = new ArrayList<String>();
        
        arrayList.add("a");
        arrayList.add("a");
        arrayList.clear();  
        arrayList.add("b");
        arrayList.add("b"); 
        System.out.println(arrayList.size());
        
        System.out.println("--------------75-------------");
        
        Set hashSet = new HashSet();
        
        hashSet.add("1");
        hashSet.add(1);
        hashSet.add(null);
        hashSet.add("null");
        System.out.println(hashSet);

        System.out.println("--------------76-------------");
        
        Map<String, String> hashMap5 = new HashMap<String, String>();
        hashMap5.put(new String("a"), "audi");
        hashMap5.put(new String("a"), "ferrari");
        System.out.println(hashMap5);

        System.out.println("--------------77-------------");

        Map<String, String> identityHashMap = new IdentityHashMap<String, String>();
        identityHashMap.put(new String("a"), "audi");
        identityHashMap.put(new String("a"), "ferrari");
        System.out.println(identityHashMap);
        
        System.out.println("--------------78-------------");
        
       /* Map<Integer, String> m2 = new TreeMap<Integer, String>();
        m2.put(11, "audi");
        m2.put(null, null);
        m2.put(11, "bmw");
        m2.put(null, "fer");

        System.out.println(m2.size());
        System.out.println(m2);*/
        System.out.println("--------------79-------------");
        
        String[] ar = { "c", "d", "b", "a", "e" };
        NestedClass in = new NestedClass();
        Arrays.sort(ar, in);
        for (String str : ar)
               System.out.print(str + " ");
        System.out.println(Arrays.binarySearch(ar, "b"));
        
        System.out.println("--------------80-------------");
       
        System.out.println(Days.weekDays.size());
        
        Days day=Days.Monday;
        System.out.println( (day.isWeekDay() ? "is WeekDay" : "is weekEnd"));
        
        day=Days.Sunday;
        System.out.println( (day.isWeekDay() ? "is WeekDay" : "is weekEnd"));
        
        
        day=Days.Monday;
        System.out.println(Days.allDays.contains(day));

        System.out.println(day.ordinal());

        System.out.println("--------------81-------------");   
        
        Set s = new LinkedHashSet();
        s.add("1");
        s.add(1);
        s.add(3);
        s.add(2);
        System.out.println(s);

        System.out.println("--------------82-------------");   
        
        Employee8 emp1=new Employee8("sam","4");
        Employee8 emp2=new Employee8("amy","2");
 
        ArrayList<Employee8> list=new ArrayList<Employee8>();
        list.add(emp1);
        list.add(emp2);
        Collections.sort(list);
        System.out.println(list);
        
        System.out.println("--------------83-------------");   

        Employee9 empA=new Employee9("sam","4");
        Employee9 empB=new Employee9("amy","2");
        ArrayList<Employee9> listA=new ArrayList<Employee9>();
        listA.add(empA);
        listA.add(empB);
        Collections.sort(listA,new Employee9());
        System.out.println(listA); 
        
        System.out.println("--------------84-------------");   
        
        Employee10 emp10=new Employee10("ankit");
        Employee10 emp20=new Employee10("brad");
       
       ArrayList<Employee10> list0=new ArrayList<Employee10>();
        list0.add(emp10);
        list0.add(emp20);
 
        Collections.sort(list0,new Employee10.ComparatorName());
        System.out.println(list0);
        
        System.out.println("--------------85-------------");   
        
        Integer intArray[]={2,3,1};
        Arrays.sort(intArray, new Sort());
        for(int i: intArray){
           System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("--------------86-------------");
        
 /*       Set<Integer> treeSet = new TreeSet<Integer>(new Comparator<Integer>() {
            public int compareTo(Integer o1, Integer o2) {
                  return o2.compareTo(o1);
            }
        });
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(2);
        System.out.println(treeSet);*/
        
        System.out.println("--------------87-------------");
        Collection<Integer> collection = new HashSet<Integer>();
        collection.add(3);
        collection.add(1);
        collection.add(2);
 
        Set<Integer> treeSet2 = new TreeSet<Integer>(collection);
        System.out.println(treeSet2);
        
        System.out.println("--------------88-------------");
        
/*        Collection<Integer> collection2 = new HashSet<Integer>();
        collection2.add(3);
        collection2.add(1);
        collection2.add(2);
        collection2.add(null);
 
        Set<Integer> treeSet3 = new TreeSet<Integer>();
        treeSet3.addAll(collection2);
        System.out.println(treeSet3); */ 
        
        System.out.println("--------------89-------------");
        
		Map<Integer, Integer> treeMap = new TreeMap<Integer, Integer>(
				new Comparator<Integer>() {
					public int compare(Integer o1, Integer o2) {
						return o2.compareTo(o1);
					}
				});
		treeMap.put(4, 1);
		treeMap.put(2, 1);
		treeMap.put(3, 1);

		System.out.println(treeMap);
		
		System.out.println("--------------90-------------");
		
		 Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	        map.put(1, 2);
	        map.put(2, 1);
	        map.put(4, 8);
	     
	        Set<Entry<Integer, Integer>> set = map.entrySet();
	        List<Entry<Integer, Integer>> list02 = new ArrayList<Entry<Integer, Integer>>(set);
	 
	        Collections.sort(list02, new Sort2());     
	 
	        for(Map.Entry<Integer, Integer> entry:list02)
	         System.out.print(entry.getKey()); 
	        
	       System.out.println();
	       System.out.println("--------------91-------------");
	       
		Map<Integer, Integer> map01 = new LinkedHashMap<Integer, Integer>();
		map01.put(4, 1);
		map01.put(2, 6);
		map01.put(5, 1);

		Set<Entry<Integer, Integer>> entrySet = map01.entrySet();
		List<Entry<Integer, Integer>> listOfentrySet = new ArrayList<Entry<Integer, Integer>>(
				entrySet);

		Collections.sort(listOfentrySet, new Sort3());

		for (Map.Entry<Integer, Integer> entry : listOfentrySet)
			System.out.print(entry.getKey());
        
	    	System.out.println();
	       System.out.println("--------------92----------------");
	       
	       List<Number> numberList = new ArrayList<Number>();
           numberList.add(2);
           numberList.add(3);
           m(numberList);
           
           System.out.println();
           System.out.println("--------------93----------------");
           
          /* List<Integer> l = new ArrayList<Integer>();
           l.add(2);
           m2(l);*/
           
           System.out.println();
           System.out.println("--------------94----------------");
           
           Abc o = new Abc();

           Integer i[] = { 1, 2 };
           o.display(i);

           Double d[] = { 1.1, 2.2 };
			o.display(d);
			
			System.out.println();
	        System.out.println("--------------95----------------");
	        
	        	List<Integer> list03 = new ArrayList<Integer>();
	           list03.add(2);
	           list03.add(3);
	           System.out.println(sum(list03));
           
	       	System.out.println();
	        System.out.println("--------------96----------------");
	        
	     /*   List<Integer> list04 = new ArrayList<Integer>();
	           list04.add(2);
	           list04.add(3);
	           m3(list04);*/
	           
	        System.out.println();
		    System.out.println("--------------97----------------");
		    
		    /*	List<Integer> list05 = new ArrayList<Integer>();
		    	list05.add(1);
		    	list05.add(2);
	           System.out.println(sum2(list05));*/
	           
	           
		        System.out.println();
			    System.out.println("--------------98----------------");
			    
			    PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		           q.add(1);
		           q.add(2);
		           q.add(3);
		           System.out.println(q.poll());
		           System.out.println(q.offer(4));
		           q.add(1);
		           q.remove(2);
		           System.out.println(q.peek());
		           System.out.println(q);
		
				    System.out.println("--------------FIN----------------");
	}
	//part of 97
/*	 public static double sum2(List<? extends Number> list05) {
		 list05.add(4);
         double sum = 0;
         for (Number num : list05) {
                sum += num.doubleValue();
         }
         return sum;
  }*/
	 
	//part of 96
	 public static void m3(List<Number> list) {
         System.out.println(list);
  }
	 
	//part of 92
	 static void m(List<? super Double> l) {
         System.out.print(l.get(0));
         System.out.print(l.get(1));
  }
	 
	//part of 93
	  static void m2(List<? super Double> l) {
          System.out.println(l.get(0));
          System.out.println(l.get(1));
   }
	  
	  //part of 95
	  
	  public static double sum(List<? extends Number> list) {
          double sum = 0;
          for (Number num : list) {
                 sum += num.doubleValue();
          }
          return sum;
   }
		
		//part of 79
    static class NestedClass implements Comparator<String> {

    	public int compare(String s1, String s2) 
    	{
    		return s2.compareTo(s1);
    	}
    }
    //part of 80
    private enum Days {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

        public static Set<Days> allDays = EnumSet.allOf(Days.class);
        
        public static Set<Days> weekDays = EnumSet.range(Monday, Friday);
  
  public boolean isWeekDay() {
    return weekDays.contains(this);
  }   
 }
}
//part of 63
class Employe {
    
    private String name;
    
    public Employe(String name) { // constructor
           this.name = name;
    }
 
 
    //no hashCode() method
 
    //no equals() method
    
    @Override
    public String toString() {
           return "Employe[ name=" + name + "] ";
    }
 
}

//part of 64
class Employee1 {
    
    private String name;
    
    public Employee1(String name) { // constructor
           this.name = name;
    }
    
    @Override
    public int hashCode(){
           return (this.name==null ? 0: this.name.hashCode() );       
    }
 
    @Override
    public boolean equals(Object obj){    
           Employee1 emp=(Employee1)obj;
           return (emp.name==this.name || emp.name.equals(this.name));       
    }
 
    @Override
    public String toString() {
           return "Employee1[ name=" + name + "] ";
    }
 
}

//part of 65
class Employee2 {
    
    private String name;
    
    public Employee2(String name) { // constructor
           this.name = name;
    }
    
    @Override
    public int hashCode(){
           return 1;         
    }
 
    @Override
    public boolean equals(Object obj){           
           return true;      
    }
 
    @Override
    public String toString() {
           return "Employee2[ name=" + name + "] ";
    }
 
}

//part of 70
class Employee3 {
    
    private String name;
    
    public Employee3(String name) { // constructor
           this.name = name;
    }
 
    @Override
    public int hashCode(){
           return 1;         
    }
 
    //no equals() method
    
    @Override
    public String toString() {
           return "Employee3[ name=" + name + "] ";
    }
 
}

//part of 71
class Employee4 {
    
    private String name;
    
    public Employee4(String name) { // constructor
           this.name = name;
    }
    
    //no hashCode() method
    
    @Override
    public boolean equals(Object obj){           
           return true;      
    }
 
    @Override
    public String toString() {
           return "Employee4[ name=" + name + "] ";
    }
 
}

//part of 72
class Employee5 {
    
    private String name;
    
    public Employee5(String name) { // constructor
           this.name = name;
    }
    
    @Override
    public int hashCode(){
           return (this.name==null ? 0: this.name.hashCode() );       
    }
 
    //no equals() method
    
    
    @Override
    public String toString() {
           return "Employee5[ name=" + name + "] ";
    }
 
}

//part of 73
class Employee6 {
    
    private String name;
    
    public Employee6(String name) { // constructor
           this.name = name;
    }
    
    //no hashCode() method
    
    @Override
    public boolean equals(Object obj){    
           Employee6 emp=(Employee6)obj;
           return (emp.name==this.name || emp.name.equals(this.name));       
    }
 
    @Override
    public String toString() {
           return "Employee[ name=" + name + "] ";
    }
 
}
//part of 82
class Employee8 implements Comparable<Employee8>{
    String name;
    String id;
    public Employee8(String name, String id) {
        this.name = name;
        this.id = id;
    } 
    @Override
    public int compareTo(Employee8 otherEmployee) {
       return this.name.compareTo(otherEmployee.name);
    }
 
    @Override
    public String toString() {
        return "{" + "name=" + name + ", id=" + id  + '}';
    }
}

//part of 83
class Employee9 implements Comparator<Employee9>{
    String name;
    String id;
   
    public Employee9() {}
   
    public Employee9(String name, String id) {
        this.name = name;
        this.id = id;
    }
   
    @Override
    public int compare(Employee9 obj1, Employee9 obj2) {
           return obj2.name.compareTo(obj1.name);
    }
 
    @Override
    public String toString() {
        return "{" + "name=" + name + ", id=" + id  + '}';
    } 
}

//part of 84
class Employee10{
    String name; 
    public Employee10() {}
    public Employee10(String name) {
        this.name = name;
    }  
    public String toString() {
        return "name=" + name;
    }
    static class ComparatorName implements Comparator<Employee10>{
        public int compare(Employee10 obj1, Employee10 obj2) {
           return obj1.name.compareTo(obj2.name);
        }
    }
}

//part of 85
class Sort implements Comparator<Integer> {
    public int compare(Integer o1, Integer o2) {
           return o2.compareTo(o1);
    }
}

//part of 90
class Sort2 implements Comparator<Map.Entry<Integer, Integer>>{
    @Override
    public int compare( Map.Entry<Integer, Integer> entry1, Map.Entry<Integer, Integer> entry2 ){
        return (entry2.getValue()).compareTo( entry1.getValue() );
    }
}

//part of 91
class Sort3 implements Comparator<Map.Entry<Integer, Integer>>{
    @Override
    public int compare( Map.Entry<Integer, Integer> entry1, Map.Entry<Integer, Integer> entry2 ){
        return (entry2.getKey()).compareTo( entry1.getKey() );
    }
}

//part of 94
class Abc {
    <t> void display(t obj[]) {
           for (t i : obj) {
                  System.out.print(i + "  ");
           }
    }
}