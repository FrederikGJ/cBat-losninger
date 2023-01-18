public int roundSum(int a, int b, int c)
{
return round10(a) +  round10(b) + round10(c); 
}

public int round10(int num)
{
  int tmp1 = num % 10;
  int tmp2 = num - tmp1;

  if(tmp1 <= 9 && tmp1 >= 5)
  {
  return tmp2 + 10;
  }
  return tmp2;
}
