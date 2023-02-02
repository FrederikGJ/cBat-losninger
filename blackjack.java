public int blackjack(int a, int b) {
        //from Logic-2 --> blackjack
  if(a > 21 & b>21) return 0;
  if(a>b & a<=21) return a;
  if(b>a & b<=21) return b;
  if(a>b & a>21) return b;
  if(b>a & b>21) return a;
  return 0;
}