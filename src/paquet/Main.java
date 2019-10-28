package paquet;

import java.util.ArrayList;
import java.util.List;

import com.jwetherell.algorithms.data_structures.Graph;
import com.jwetherell.algorithms.data_structures.Graph.Edge;
import com.jwetherell.algorithms.data_structures.Graph.Vertex;
import com.jwetherell.algorithms.graph.AStar;

public class Main {

	public static void main(String[] args) {
		new Main();

	}
	public Main() {
		Graph<Integer> grafo = new Graph<Integer>(verticies, edges);
		AStar<Integer> aStar = new AStar<Integer>();
		List<Graph.Edge<Integer>> Res = aStar.aStar(grafo, v8, v9);
		for (Edge<Integer> edge : Res) {
			System.out.println("De " + String.valueOf(edge.getFromVertex().getValue()) + " a " + String.valueOf(edge.getToVertex().getValue()) + " con un coste de " + String.valueOf(edge.getCost()));
		}
	}
        final List<Vertex<Integer>> verticies = new ArrayList<Vertex<Integer>>();
        final Graph.Vertex<Integer> v1 = new Graph.Vertex<Integer>(1);
        final Graph.Vertex<Integer> v2 = new Graph.Vertex<Integer>(2);
        final Graph.Vertex<Integer> v3 = new Graph.Vertex<Integer>(3);
        final Graph.Vertex<Integer> v4 = new Graph.Vertex<Integer>(4);
        final Graph.Vertex<Integer> v5 = new Graph.Vertex<Integer>(5);
        final Graph.Vertex<Integer> v6 = new Graph.Vertex<Integer>(6);
        final Graph.Vertex<Integer> v7 = new Graph.Vertex<Integer>(7);
        final Graph.Vertex<Integer> v8 = new Graph.Vertex<Integer>(8);
        final Graph.Vertex<Integer> v9 = new Graph.Vertex<Integer>(9);
        {
            verticies.add(v1);
            verticies.add(v2);
            verticies.add(v3);
            verticies.add(v4);
            verticies.add(v5);
            verticies.add(v6);
            verticies.add(v7);
            verticies.add(v8);
            verticies.add(v9);
        }

        final List<Edge<Integer>> edges = new ArrayList<Edge<Integer>>();
        final Graph.Edge<Integer> e1_2 = new Graph.Edge<Integer>(7, v1, v2);
        final Graph.Edge<Integer> e1_3 = new Graph.Edge<Integer>(9, v1, v3);
        final Graph.Edge<Integer> e3_4 = new Graph.Edge<Integer>(11, v3, v4);
        final Graph.Edge<Integer> e4_6 = new Graph.Edge<Integer>(2, v4, v6);
        final Graph.Edge<Integer> e6_7 = new Graph.Edge<Integer>(9, v6, v7);
        final Graph.Edge<Integer> e4_7 = new Graph.Edge<Integer>(16, v4, v7);
        final Graph.Edge<Integer> e2_8 = new Graph.Edge<Integer>(30, v2, v8);
        final Graph.Edge<Integer> e5_9 = new Graph.Edge<Integer>(10, v5, v9);
        final Graph.Edge<Integer> e7_6 = new Graph.Edge<Integer>(7, v7, v6);
        final Graph.Edge<Integer> e7_5 = new Graph.Edge<Integer>(30, v7, v5);



        {
            edges.add(e1_2);
            edges.add(e1_3);
            edges.add(e3_4);
            edges.add(e4_6);
            edges.add(e6_7);
            edges.add(e4_7);
            edges.add(e2_8);
            edges.add(e5_9);
            edges.add(e7_6);
            edges.add(e7_5);
        }
}
