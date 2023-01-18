public int maxTriple(int[] nums) {
  int a = nums[0];
  int b = nums[nums.length/2];
  int c = nums[nums.length-1];
  
  
  if(nums.length == 1)return nums[0];
  if(nums.length == 2 && a < c) return c;
  if(nums.length == 2 && a > c) return a;
 
  if(a>b && b>=c || a>c && c>=b) return a;
  if(b>a && a>=c || b>c && c>=a) return b;
  if(c>b && b>=a || c>a && a>=b) return c; 
  

  return -1;
}

