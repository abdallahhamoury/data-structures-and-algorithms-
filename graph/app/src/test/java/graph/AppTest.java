package graph;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class AppTest {
    @Test 
    public void graph() {
//    An empty graph properly returns null
        Graph myGraph = new Graph();
        assertNull(myGraph.toString());
//    Node can be successfully added to the graph
        myGraph.addNode("8");
        assertEquals("[8]", myGraph.getNodes().toString());
//    A graph with only one node and edge can be properly returned
        myGraph.addEdge("8", "8", 0);
        assertEquals("[8]", myGraph.getNeighbors("8").toString());
        assertEquals("{8=[8]}", myGraph.nodeList.toString());
//    An edge can be successfully added to the graph
        myGraph.addNode("5");
        myGraph.addEdge("8", "5", 70);
        assertEquals("[8, 5]", myGraph.getNeighbors("8").toString());
        assertEquals("[8]", myGraph.getNeighbors("5").toString());
//    A collection of all nodes can be properly retrieved from the graph
        assertEquals("[5, 8]", myGraph.getNodes().toString());
//    All appropriate neighbors can be retrieved from the graph
        assertEquals("{5=[8], 8=[8, 5]}", myGraph.nodeList.toString());
//    The proper size is returned, representing the number of nodes in the graph
        assertEquals(2, myGraph.size());
    }
    @Test
    public void graphBreadthFirst() {
        // if the graph is empty return null
        Graph myGraph = new Graph();
        assertNull(myGraph.breadthFirst(null));
        // if we have one node with no edges return that node
        myGraph.addNode("8");
        assertEquals("[8]", myGraph.breadthFirst("8").toString());
        // graph with only one node and one edge with itself return that node
        myGraph.addEdge("8", "8", 0);
        assertEquals("[8]", myGraph.breadthFirst("8").toString());
        // happy path
        myGraph.addNode("2");
        myGraph.addNode("1");
        myGraph.addNode("9");
        myGraph.addNode("7");
        myGraph.addNode("5");
        myGraph.addEdge("8", "9", 10);
        myGraph.addEdge("8", "2", 20);
        myGraph.addEdge("8", "1", 20);
        myGraph.addEdge("5", "1", 50);
        myGraph.addEdge("7", "5", 70);
        assertEquals("[8, 9, 2, 1, 5, 7]", myGraph.breadthFirst("8").toString());
    }
    @Test
    public void businessTrip() {
        Graph myGraph = new Graph();
        myGraph.addNode("8");
        myGraph.addNode("1");
        myGraph.addNode("2");
        myGraph.addNode("9");
        myGraph.addNode("7");
        myGraph.addNode("5");
        myGraph.addEdge("8" , "1" , 50);
        myGraph.addEdge("5" , "1" , 70);
        myGraph.addEdge("7" , "5", 20);
        myGraph.addEdge("8" , "9", 100);
        myGraph.addEdge("8" , "2", 40);
        myGraph.addEdge("8" , "5", 60);
        // move in the same node
        String[] trip5 = {"8"};
        assertEquals("true, $0" , myGraph.businessTrip("8",trip5));
        // valid trips
        String[] trip6 = {"8" , "2"};
        String[] trip = {"8" , "1" , "5"};
        assertEquals("true, $40" , myGraph.businessTrip("8",trip6));
        assertEquals("true, $120" , myGraph.businessTrip("8",trip));
        // invalid trips
        String[] trip2 = {"8" , "7"};
        String[] trip4 = {"8" , "9" , "5" };
        assertEquals("False, $0" , myGraph.businessTrip("8",trip2));
        assertEquals("False, $0" , myGraph.businessTrip("8",trip4));
        // Round trip
        String[] trip1 = {"8" , "1" , "5", "8" };
        String[] trip3 = {"8" , "1" , "5" , "7" , "5" , "1" , "8" };
        assertEquals("true, $180" , myGraph.businessTrip("8",trip1));
        assertEquals("true, $280" , myGraph.businessTrip("8",trip3));
    }
}