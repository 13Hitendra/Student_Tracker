package ArrayAssignment;

public class UniqueDupRep {
// find most repeated , unique and duplicate element.
public static void position(int[]arr) {
		
		for(int i=0;i<arr.length;i++)
		{
			boolean status=false;
			for(int k=i-1;k>=0;k--) {
				if(arr[i]==arr[k]) {
					status=true;
					break;
				}
			}
			if(!status)
			{
				int count=1;
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j])
					{
						count++;
					}	
				}System.out.println(arr[i]+"--->"+count);
			}
		}
	}

public static void mostRepeat(int []arr) {
	int maxRep=0;
	int mostRepeated=arr[0];
	
	for(int i=0;i<arr.length;i++) {		
		int count=1;
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				count++;
			}
		}
		if(count>maxRep) {
			maxRep=count;		
			mostRepeated=arr[i];
		}	
	}System.out.println("most repeated = "+mostRepeated);	
	
}

public static void duplicate(int []arr) {
	
	for (int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] == arr[j]) {
                System.out.print(" "+arr[i]);
                break;
            }
        }
    }
}

public static void unique(int arr[]) {
	
	boolean num;
	for(int i=0;i<arr.length;i++) {
		num=true;
		for(int j=0;j<arr.length;j++) {
			if(i!=j && arr[i]==arr[j]) {
				num=false;
				break;
			}
		}
		if(num) {
			System.out.println("unique number= "+arr[i]+" ");
		}
		
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,4,1,2,2,1,3,4,2};
		//position(arr);
		mostRepeat(arr);
		unique(arr);
		System.out.println("--------------------");
		duplicate(arr);
		
	}

}
