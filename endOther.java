public boolean endOther(String a, String b) {
  String aa = a.toLowerCase();
  String bb = b.toLowerCase();
  
  if(aa == bb) return true;
  if(aa.endsWith(bb)) return true;
  if(bb.endsWith(aa)) return true;
  
return false;  
}
