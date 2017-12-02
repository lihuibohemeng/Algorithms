package Union_Find;

/**
 * Created with IntelliJ IDEA.
 * User: 刘莉慧
 * Date: 2017/12/2
 * Time: 20:42
 * To change this template use File | Settings | File Templates.
 */
// 路径压缩的带权快速合并算法
public class WeigthQuickUnionUF {
    private int[] id;
    private int[] sz;
    public WeigthQuickUnionUF(int N){
        id = new int[N];
        for(int i=0;i<N;i++){
            id[i] = i;
            sz[i] = 1;
        }
    }
    private int root(int i){
        while(i !=id[i]){
//            压缩路径算法
            id [i] = id[id[i]];
            i = id[i];
        }
        return i;
    }
    //    是否连通
    public boolean connected(int p,int q){
        return root(p) == root(q);
    }
    /*带权并查集即是结点存有权值信息的并查集。

    当两个元素之间的关系可以量化，并且关系可以合并时，可以使用带权并查集来维护元素之间的关系。

    带权并查集每个元素的权通常描述其与并查集中祖先的关系，这种关系如何合并，路径压缩时就如何压缩。

    带权并查集可以推算集合内点的关系，而一般并查集只能判断属于某个集合。*/
    public void union(int p,int q){
        int i = root(p);
        int j = root(q);
        if(i == j){
            return ;
        }
        if(sz[i] < sz[j]){
            id[i] = j;
            sz[j] += sz[i];
        }else{
            id [j] = i;
            sz[i]+=sz[j];
        }

    }
}
