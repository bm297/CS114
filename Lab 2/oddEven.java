

//Method 1:
long oddevenfact(int x)
{
if (x>2)
return(oddevenfact(x-2) * (long) x);
else
return((long) x);
}


//Method 2:

static public long oddevenfact(int n)
{
if (n == 1 || n == 0)
{
return 1;
}
else
{
return n * oddevenfact(n-2);
}
}
