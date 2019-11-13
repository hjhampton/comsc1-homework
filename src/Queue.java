public class Queue {
	//Used code from https://github.com/maxalthoff/intro-to-java-exercises/blob/master/10/E10_10/Queue.java
  public int[] elements;
  private int size;
  private static final int DEFAULT_SIZE = 8;

  public Queue() {
    elements = new int[DEFAULT_SIZE];
    size = 0;
  }
  
  public void enqueue(int v) {
    if (size == elements.length) {
      int[] temp = new int[elements.length * 2];
      System.arraycopy(elements, 0, temp, 0, elements.length);
      elements = temp;
    }
    elements[size++] = v;
  }

  public int dequeue() {
    int element = elements[0];
    for (int i = 1; i < getSize(); i++) {
      elements[i - 1] = elements[i];
    }
    size--;
    return element;
  }

  public boolean empty() {
    return size == 0;
  }

  public int getSize() {
    return size;
  }
}

//import java.util.*;
//
//public class Queue {
//
//	public void getSize(String [] queue) {
//		System.out.println(queue.length);
//	}
//	
//	public void enqueue(String name, String [] originalArray) {
//		//https://stackoverflow.com/questions/8869419/java-arrays-change-size for help
//		String [] newArray = Arrays.copyOf(originalArray, originalArray.length + 1);
//		newArray[originalArray.length] = name;
//		System.out.println(newArray[]);
//	}
//}


