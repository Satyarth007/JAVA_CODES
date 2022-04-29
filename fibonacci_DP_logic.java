// give input using main method, 
public int fib(int n) {
         if(n==0 || n==1) // like base cases, i mean everyone knows first two elements
             return n;
         int a[]=new int[n+1];// to store repetative values
        a[0]=0; // a[0] most common repeting value
        a[1]=1; // a[1] most common repeting value
        for(int i=2;i<a.length;i++){
            a[i]=a[i-1]+a[i-2];// next element using last two values stored in array 
        }
        return a[n]; // returning the n^th fib no.
    }
