package main;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class MyGraph {

    private HashMap<Integer, Node> nodeLookup = new HashMap<>();

    public static class Node{
        private int id;
        LinkedList<Node> adjacent = new LinkedList<>();

        private Node(int id){
            this.id = id;
        }
    }

    private Node getNode(int id){
        return new Node(id);
    }

    public void addEdge(int source, int destination){
        Node s = getNode(source);
        Node d = getNode(destination);

        s.adjacent.add(d);
    }

    //Depth First Search - use isVisited and recursion
    public boolean hasPathsDFS(int source, int destination){
        Node s = getNode(source);
        Node d = getNode(destination);

        HashSet<Integer> visited = new HashSet<>();
        return hasPathsDFS(s, d, visited);
    }

    private boolean hasPathsDFS(Node source, Node destination, HashSet<Integer> visited) {
        if(visited.contains(source.id)){
            return false;
        }
        visited.add(source.id);

        if(source == destination){
            return true;
        }

        for(Node child : source.adjacent){
            if (hasPathsDFS(child, destination, visited)){
                return true;
            }
        }
        return false;
    }

    //Breadth First Search - use Queue and add children - Pop and add children
    public boolean hashPathBDS(Node source, Node destination){
        LinkedList<Node> nextToVisit = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();

        nextToVisit.add(source);

        while(!nextToVisit.isEmpty()){
            Node node = nextToVisit.remove();
            if(node == destination){
                return true;
            }

            if(visited.contains(node.id)){
                continue;
            }

            visited.add(node.id);

            for(Node child: node.adjacent){
                nextToVisit.add(child);
            }
        }

        return false;
    }


}
