import java.util.*;
public class Ex4 {
public static void main(String[] args) {
	int[] nArr = {9,6,7,3,5};
	
	for(int i =0; i<nArr.length-1; i++) {
		int index=i;
		for(int j =i+1; j<nArr.length; j++) {
			if(nArr[index]>nArr[j]) index=j;
		}
		if(index != i) {
			int tmp = nArr[index];
			nArr[index]=nArr[i];
			nArr[i]=tmp;
		}
		System.out.println(i+1+"ȸ��"+Arrays.toString(nArr));
	}
	System.out.println(Arrays.toString(nArr));
}


}
