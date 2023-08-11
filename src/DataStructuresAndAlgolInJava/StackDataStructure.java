package DataStructuresAndAlgolInJava;

import java.util.Stack;

// A stack is LIFO data structure
public class StackDataStructure
{

  public static void main(String[] args) {
    // declare a stack
    Stack<String> stack = new Stack<>();

    //System.out.println(stack.empty());
    // checking if the stack is empty

    stack.push("Minecraft");
    stack.push("Skyrin");
    stack.push("Doom");
    stack.push("Borderlands");
    stack.push("FFVII");
    stack.push("Skyrin");

    String myFav = stack.pop(); // remove the last object
    String seeFav = stack.peek(); // see the last object
    System.out.println(myFav);
    System.out.println(seeFav);
    System.out.println(stack);
  }
  }

