
public class deck {
	
int[] deck = new int[20];
int[] tpdeck = new int[20];
int[] handcard = new int[5];



int handcount=5;
int draw=3;
int dcount;
int cardcount =10;



public void shuffle(int[] array, int count){
	int temp, temp2, randomnum1, randomnum2;
	
	for(int l =0; l<count; l++ ) {
		randomnum1 = (int)(Math.random()*array.length);
		temp=array[randomnum1];
		randomnum2 = (int)(Math.random()*array.length);
		temp2=array[randomnum2];
		array[randomnum1]=temp2;
		array[randomnum2]=temp;
		
	}
	
}
	
public void handcheck() {
	
}

public void showcard() {
	for(int e=0; e<handcount; e++) {
		switch(handcard[e]) {
		
		case 0:
System.out.print("|"+"�󽽷�"+"|");
			
			break;
		
		case 1:
			System.out.print("|"+"����"+"|");
			
			break;
case 2:
	System.out.print("|"+"���й��"+"|");
			break;
case 3:
	System.out.print("|"+"�Ǹ����ϰ�"+"|");
	break;
case 4:
	System.out.print("|"+"���"+"|");
	break;
case 5:
	System.out.print("|"+"ȸ��"+"|");
	break;
case 6:
	System.out.print("|"+"ȸ�ǻ��"+"|");
	break;
case 7:
	System.out.print("|"+"�ĸ���"+"|");
	break;
case 8:
	System.out.print("|"+"����"+"|");
	break;
case 9:
	System.out.print("|"+"���̾�"+"|");
	break;
		
		
		
		
		}
		
		
		
		
		
		
	}
}



public void setdeck(){
	
	for(int i=0; i<deck.length; i++) {
		tpdeck[i]=deck[i];
	}
	

	
}
	
public int cardref(int[] array) {
	int count=0;
	if(array[0]!=0) {
		count = count +1;
	}
	else if(array[1]!=0) {
		count = count +1;
	}
	else if(array[2]!=0) {
		count = count +1;
	}
	else if(array[3]!=0) {
		count = count +1;
	}
	else if(array[4]!=0) {
		count = count +1;
	}
	else if(array[5]!=0) {
		count = count +1;
	}
	else if(array[6]!=0) {
		count = count +1;
	}
	else if(array[7]!=0) {
		count = count +1;
	}
	else if(array[8]!=0) {
		count = count +1;
	}
	else if(array[9]!=0) {
		count = count +1;
	}
	else if(array[10]!=0) {
		count = count +1;
	}
	else if(array[11]!=0) {
		count = count +1;
	}
	else if(array[12]!=0) {
		count = count +1;
	}
	else if(array[13]!=0) {
		count = count +1;
	}
	else if(array[14]!=0) {
		count = count +1;
	}
	else if(array[15]!=0) {
		count = count +1;
	}
	else if(array[16]!=0) {
		count = count +1;
	}
	else if(array[17]!=0) {
		count = count +1;
	}
	else if(array[18]!=0) {
		count = count +1;
	}
	else if(array[19]!=0) {
		count = count +1;
	}
	return count;
	
	
	
}


}
