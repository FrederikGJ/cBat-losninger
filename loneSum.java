public int loneSum(int a, int b, int c) {
//from  Logic-2 > loneSum  .. 
    if(a != b & b ==c) return a;
    if(a == b & a != c & c == b) return a;
    if(a ==c & b != c) return b;
    if(a == b & c != a) return c;
    if(a != b & b != c & a != c) return a+b+c;
  return 0;
}
