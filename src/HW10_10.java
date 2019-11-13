public class HW10_10 {
	//Used code from https://github.com/maxalthoff/intro-to-java-exercises/blob/master/10/E10_10/E10_10.java#L28
  public static void main(String[] args) {
	  
	
    Queue q = new Queue();
  

    for (int i = 1; i <= 20; i++) {
    	q.enqueue(i);
    }
    
    int size = q.getSize();
    for (int i = 0; i < size; i++) {
      System.out.print(q.dequeue() + " ");
    }
    System.out.println();
  }
}


