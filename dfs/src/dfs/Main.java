
package dfs;

public class Main {
    public static void main(String args[])
	{   System.out.println("Here,");
            System.out.println("A-->0,B-->1,C-->2;D-->3,E-->4,F-->5");
                    System.out.println("Every Step:");
		Dfs F = new Dfs(6);
		F.add(0, 1);
		F.add(0, 2);
		F.add(1, 5);
		F.add(1, 3);
		F.add(2, 4);
		F.add(3, 4);
                F.add(3, 5);
		F.add(5, 4);        
		System.out.println(
			"Following is DFS "
			+ "(starting from vertex A(0)");

		F.DFS(0);
	}
}
