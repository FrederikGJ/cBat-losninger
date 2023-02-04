public int countCode(String str) {
        //string-2 ---> countCode form codingbat website. 
  int counter = 0;
  if(str.length()>3){
    for(int i = 0; i < str.length()-3; i++){
      if(str.substring(i,i+2).equals("co")&& str.substring(i+3,i+4).equals("e")){
        counter++;
      }
    }
    return counter;
  }
  
  return 0;
}
