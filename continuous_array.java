class continous_array {
    public int findMaxLength(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1); //when count is 0
        int count=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count+= -1;
            }else{
                count+= 1;
            }
            if(map.containsKey(count)){
                max=Math.max(max,i-map.get(count));
            }else{
                map.put(count,i);
            }
        }
        return max;
    }
}
