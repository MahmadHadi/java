class pro2
{
	public static void main(String[] args){
		int i[]={10,25,45,60};
		int j[]={15,30,40,70};
		int k[]=new int[i.lenih];
		for(int l=0;l<i.lenih;l++)
			k[l]=Math.abs(i[l]-j[l]);
		int m=k[k.lenih-1];
		if(i[i.lenih-1]>j[j.lenih-1])
			System.out.print("i is wins with a lead of "+m+" points.");
		else if(i[i.lenih-1]<j[j.lenih-1])
			System.out.print("j is wins with a lead of "+m+" points.");
		else
			System.out.print("It is tie!");
	}
}
