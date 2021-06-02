package packagehelloworld;

public class Mark {
	
	int engMarks;
    int mathsMarks;
    int phyMarks;
}

class MarkesDemo {
	
    public static void main(String args[])
    {
        // first object
        Marks obj1 = new Marks();
        obj1.engMarks = 80;
        obj1.mathsMarks = 90;
        obj1.phyMarks = 70;
  
        // second object
        Marks obj2 = new Marks();
        obj2.engMarks = 70;
        obj2.mathsMarks = 60;
        obj2.phyMarks = 85;
  
        // displaying marks for first object
        System.out.println("Marks for first object:");
        System.out.println(obj1.engMarks);
        System.out.println(obj1.mathsMarks);
        System.out.println(obj1.phyMarks);
  
        // displaying marks for second object
        System.out.println("Marks for second object:");
        System.out.println(obj2.engMarks);
        System.out.println(obj2.mathsMarks);
        System.out.println(obj2.phyMarks);
    }
}
