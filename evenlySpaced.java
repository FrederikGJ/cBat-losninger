public boolean evenlySpaced(int a, int b, int c) {
//solved with a sorting algo that i found online! 
//I knew I needed the ints to be orderd for the solution.
//I just did'nt know how to write the algo.
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
