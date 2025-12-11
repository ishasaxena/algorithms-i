package ii.union.find;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

//Dyanmic Connectivity problem
public class UnionFind {
    static void main(String[] args) {
        int N = StdIn.readInt();
        UnionFind unionFind = new UnionFind(N);
        while(!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if(!unionFind.connected(p,q)) {
                unionFind.union(p, q);
                StdOut.println(p + " " + q);
            }
        }
    }

    private void union(int p, int q) {
    }

    private boolean connected(int p, int q) {
        return false;
    }

    UnionFind(int N) {

    }
}
