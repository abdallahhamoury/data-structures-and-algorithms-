package stakandqueue;

public class Stackqueuepseudo {
    static Stack stackOne = new Stack();
    static Stack stackTwo = new Stack();

    public void enqueue(String x)
    {
           while (!stackOne.isEmppty())
        {
            stackTwo.push(stackOne.pop());
        }
           stackOne.push(x);

         while (!stackTwo.isEmppty())
         {
            stackOne.push(stackTwo.pop());
               }
         }
        public   String dequeue()
        {
        if (stackOne.isEmppty())
        {
            System.out.println("empty");
        }
        String y = (String) stackOne.peek();
        stackOne.pop();
        return y;
    }
}
