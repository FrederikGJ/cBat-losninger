public boolean evenlySpaced(int a, int b, int c) {
//solved with a sorting algo that i found online! 
//I knew I needed them orderd for the solution I just did'nt knew how.
  int temp;

    if (b < a) {
      temp = a;
      a = b;
      b = temp;
    }

    if (c < b) {
      temp = b;
      b = c;
      c = temp;
    }

    if (b < a) {
      temp = a;
      a = b;
      b = temp;
    }
    
  if(c-b == b-a ) return true;
  return false;
}
