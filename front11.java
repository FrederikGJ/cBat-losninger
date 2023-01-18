public int[] front11(int[] a, int[]b)
{
int[] arr1 = new int[1];
int[] arr2 = new int[2];

if(a.length == 0 && b.length == 0) return a;
if(a.length == 0 && b.length > 0)
{
arr1[0] = b[0];
return arr1;
}
if(a.length > 0 && b.length == 0)
{
arr1[0] = a[0];
return arr1;
}
arr2[0] = a[0];
arr2[1] = b[0];
return arr2;



}
