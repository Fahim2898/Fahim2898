package dfs;
import java.util.*;
public class Dfs {

	private int V; 
	private LinkedList<Integer> adj[];
	@SuppressWarnings("unchecked") Dfs(int v)
	{
		V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; ++i)
			adj[i] = new LinkedList();
	}

	void add(int v, int w)
	{
		adj[v].add(w); 
                
                System.out.println(" "+v +"----->" +""+w);
	}

	void DFSUtil(int v, boolean visit[])
	{
		visit[v] = true;
		System.out.print(v + " ");

		Iterator<Integer> i = adj[v].listIterator();
		while (i.hasNext()) 
		{
			int n = i.next();
			if (!visit[n])
				DFSUtil(n, visit);
		}
                
	}
	void DFS(int v)
	{
		boolean visit[] = new boolean[V];

		DFSUtil(v, visit);
                System.out.println("");
	}
	}

