package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<WeightedNode> nodeList = new ArrayList<>();
        nodeList.add(new WeightedNode("a",0));
        nodeList.add(new WeightedNode("b",1));
        nodeList.add(new WeightedNode("c",2));
        nodeList.add(new WeightedNode("d",3));
        nodeList.add(new WeightedNode("e",4));
        nodeList.add(new WeightedNode("f",5));
        nodeList.add(new WeightedNode("g",6));

        WeightedGraph weightedGraph = new WeightedGraph(nodeList);
        weightedGraph.addWeightedEdge(0,1,2);
        weightedGraph.addWeightedEdge(0,2,5);
        weightedGraph.addWeightedEdge(1,2,6);
        weightedGraph.addWeightedEdge(1,3,1);
        weightedGraph.addWeightedEdge(1,4,3);
        weightedGraph.addWeightedEdge(2,5,8);
        weightedGraph.addWeightedEdge(3,4,4);
        weightedGraph.addWeightedEdge(4,6,9);
        weightedGraph.addWeightedEdge(5,6,7);
        System.out.println("dijkstra from source node 'a'(i = 0)");
        weightedGraph.dijkstra(nodeList.get(0));

    }
}
