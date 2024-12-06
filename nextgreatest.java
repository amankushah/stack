import java.util.Stack;
class nextgreatest
{
    public static void main(String[] args) 
    {
        int arr[]={1,5,3,2,1,6,3,4};
        int n=arr.length;
        int i=0;
        int res[]=new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);
        res[n-1]=-1;
        for(i=n-2;i>=0;i--)
        {
           while(!st.isEmpty() && st.peek() <= arr[i])
           {
            st.pop();
           }
           if(st.size()==0) res[i]=-1;
           else res[i]=st.peek();
           st.push(arr[i]);
        }
     for(i=0;i<n;i++)
     {
        System.out.print(res[i]+" ");
     }
        
    }
}