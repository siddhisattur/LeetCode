class Compute {
    
    public int[] rotate(int arr[], int n, int k)
    {
        int temp[]=new int[n];
        for(int i=0;i<n;i++){
            temp[(i+k)%n]=arr[i];
        }
        return temp;
    }
}
