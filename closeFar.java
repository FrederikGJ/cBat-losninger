public boolean closeFar(int a, int b, int c) {
  int x = Math.abs(a), y = Math.abs(b), z = Math.abs(c); 
  
  if(
    y <= x-3 && z == x-1 ||
    y >= x+3 && z == x+1 ||
    z <= x-3 && y == x-1 ||
    z >= x+3 && y == x+1 ||
    
    z >= x+2 && y == x-1 ||
    z <= x-2 && y == x+1 ||
    y >= x+2 && z == x-1 ||
    y <= x-2 && z == x+1 ||
    
    y == x && z == x-2 ||
    y == x && z == x+2 ||
    z == x && y == x-2 ||
    z == x && y == x+2 
    ) return true;
    return false;
}
