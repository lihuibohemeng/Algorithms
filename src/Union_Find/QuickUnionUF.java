package Union_Find;

/**
 * Created with IntelliJ IDEA.
 * User: 刘莉慧
 * Date: 2017/12/2
 * Time: 20:32
 * To change this template use File | Settings | File Templates.
 */
public class QuickUnionUF {
    private int[] id;
    public QuickUnionUF(int N){
        id = new int[N];
        for(int i=0;i<N;i++){
            id[i] = i;
        }
    }
    private int root(int i){
        while(i !=id[i]){
            i = id[i];
        }
        return i;
    }
//    是否连通
    public boolean connected(int p,int q){
        return root(p) == root(q);
    }

    public void union(int p,int q){
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }
}
