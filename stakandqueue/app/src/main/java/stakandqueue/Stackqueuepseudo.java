package stakandqueue;

public class Stackqueuepseudo {
    static Stack stackOne = new Stack();
    static Stack stackTwo = new Stack();

    public void enqueue(String x)
    {
           while (!stackOne.isEmpty())
        {
            stackTwo.push(stackOne.pop());
        }
           stackOne.push(x);

         while (!stackTwo.isEmpty())
         {
            stackOne.push(stackTwo.pop());
               }
         }
        public   String dequeue()
        {
        if (stackOne.isEmpty())
        {
            System.out.println("empty");
        }
        String y = (String) stackOne.peek();
        stackOne.pop();
        return y;
    }
}
