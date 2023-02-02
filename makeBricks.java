public boolean makeBricks(int small, int big, int goal){

    	if(small + big*5 >= goal & goal%5<=small)return true;
	return false;
}
