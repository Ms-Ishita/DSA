class NumArray {
    int[] treeArr;
    int n;
    int[] arr;
    public void build(int i,int[] arr,int left, int right){
        if(left == right){
            treeArr[i] = arr[left];
            return;
        }
        int mid = left+(right-left)/2;
        build(2*i+1,arr,left, mid);
        build(2*i+2, arr, mid+1,right);
        treeArr[i] = treeArr[2*i+1] + treeArr[2*i+2];

    }
    public NumArray(int[] nums) {
        this.arr = nums;
        n = nums.length;
        treeArr = new int[4*n];
        build(0,arr,0,n-1);   
    }
    public void updateRec(int i, int left, int right, int index, int value){
        if(left == right){
            treeArr[i] = value;
            return;
        }
        int mid = left+(right-left)/2;
        if(index<=mid){
            updateRec(i*2+1, left, mid,index, value);
        }else{
            updateRec(i*2+2,mid+1, right, index, value);
        }
        treeArr[i] = treeArr[2*i+1] + treeArr[2*i+2];
        

    }
    public void update(int index, int val) {
        updateRec(0,0,n-1,index, val);
    }
    public int query(int i , int[] treeArr, int left, int right, int l, int r){
        if(left>r || right<l)return 0;
        if(left>=l && right<=r){
            return treeArr[i];
        }
        int mid = left+(right-left)/2;
        int leftAns = query(i*2+1, treeArr,left, mid, l,r);
        int rightAns = query(i*2+2, treeArr, mid+1, right,l, r);
        return leftAns + rightAns;


    }
    public int sumRange(int left, int right) {
        return query(0,treeArr, 0, n-1, left, right);
        
        
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */