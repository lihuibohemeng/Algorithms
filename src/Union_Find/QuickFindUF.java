package Union_Find;

/**
 * Created with IntelliJ IDEA.
 * User: 刘莉慧
 * Date: 2017/12/2
 * Time: 20:21
 * To change this template use File | Settings | File Templates.
 */
//快速查找算法
public class QuickFindUF {
    private int[] id;

    public QuickFindUF(int N){
        id = new int[N];
        for(int i = 0; i<N;i++){
            id[i] = i;
        }
    }
//    连通性操作
    public boolean connected(int p ,int q){
        return id[p] == id[q];
    }
//    合并操作
    public void union(int p,int q){
        int pid = id[p];
        int qid = id[q];
        for(int i = 0; i<id.length; i ++){
            if(id[i] == pid){
                id[i] = qid;
            }
        }
    }

}
