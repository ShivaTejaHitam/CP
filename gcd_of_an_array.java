
int GCD(int a,int b)
{
    if(b==0)
        return a;
    return GCD(b,a%b);
}

int gcd_of_an_array(int[] arr)
{
    int gcd=GCD(arr[0],arr[1]);
    for(int i=2;i<arr.length;i++)
    {
        gcd=GCD(gcd,arr[i]);
    }
    return gcd;
}
