public class Q25
{
    public static void main(String[] args) 
  {  
  static int MAX = 100;
  int top;
  int a[] = new int[MAX];	// Maximum size of Stack


  boolean isEmpty ()
  {
    return (top < 0);
  }
  Q25()
  {
    top = -1;
  }

  boolean push (int x)
  {
    if (top >= (MAX - 1))
      {
	System.out.println ("Overflow condition reached");
	return false;
      }
    else
      {
	a[++top] = x;
	System.out.println (x + " pushed into stack");
	return true;
      }
  }


  int pop ()
  {
    if (top < 0)
      {
	System.out.println ("Underflow condition reached");
	return 0;
      }
    else
      {
	int x = a[top--];
	return x;
      }
  }


  int peek ()
  {
    if (top < 0)
      {
	System.out.println ("Underflow condition");
	return 0;
      }
    else
      {
	int x = a[top];
	return x;
      }
  }
}

class Main
{
  public static void main (String args[])
  {
    Q25 stk = new Q25 ();
      stk.push (20);
      stk.push (40);
      stk.push (60);
      System.out.println ("element poped out : " + stk.pop ());
  }
}
}