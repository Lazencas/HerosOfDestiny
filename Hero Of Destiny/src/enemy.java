
public class enemy {
int monnum;
String monname;
int HP;
int em;



public void mopspawn() {
	
	int no;
	no = (int)(Math.random()*3)+1;
	
	for(int i=0; i<no; i++) {
		monnum=2;
		 HP=20;
		 monname="���ձ��屳";
		 em=10;
	}
		 
}

public void middlespawn() {
	
		monnum=1;
		 HP=60;
		 monname="���ձ� ������";
		 em=100;
}

public void bossspawn() {

		monnum=0;
		 HP=150;
		 monname="����";
		 em=200;

}
	



	
	
}
