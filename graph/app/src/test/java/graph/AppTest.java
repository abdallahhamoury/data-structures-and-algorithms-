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
        myGraph.addEdge("8", "8");
        assertEquals("[8]", myGraph.getNeighbors("8").toString());
        assertEquals("{8=[8]}", myGraph.nodeList.toString());
//    An edge can be successfully added to the graph
        myGraph.addNode("5");
        myGraph.addEdge("8", "5");
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
        myGraph.addEdge("8", "8");
        assertEquals("[8]", myGraph.breadthFirst("8").toString());
        // happy path
        myGraph.addNode("2");
        myGraph.addNode("1");
        myGraph.addNode("9");
        myGraph.addNode("7");
        myGraph.addNode("5");
        myGraph.addEdge("8", "9");
        myGraph.addEdge("8", "2");
        myGraph.addEdge("8", "1");
        myGraph.addEdge("5", "1");
        myGraph.addEdge("7", "5");
        assertEquals("[8, 9, 2, 1, 5, 7]", myGraph.breadthFirst("8").toString());
    }
}