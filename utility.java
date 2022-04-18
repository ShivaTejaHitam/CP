static int[] convert(String s)
{
        String[] str=s.split(" ");
        int[] num=new int[str.length];
        for(int i=0;i<str.length;i++)
        {
            num[i]=Integer.parseInt(str[i]);
        }     
        return num;
}