import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("  ============================================================================================================================================  ");
		
		
		System.out.println("+  LSr  kK                                                ZdgBgEZ    bSQU          XPDDi                         Mg   iBB                      +");
		System.out.println("+  BBQ  BBv                                               BBBuQQB    BBdi          BBBBBQ                       iBB   iQB                      +");
		System.out.println("+  BBS  BBi  i iiii   iiiiiii  iiiiiii      ii            BB   BB   rBQi           BBL PQB   i iiii      ii    iYBBv         iii i   ii   i    +");
		System.out.println("+  BBQBBBBi sBBBBBBB  BBBBBBB  BBBBQBBu vQBBBBi           BQi  BB  RBQBQB          BBU  BBi UBBBBBBB  BBBBBk   MBBBQX vQB  BBBBBBBi SBB  BBB   +");
		System.out.println("+  BBQirQBi rBQ  BBB  BBi  BB  QQD  BBr iBBi              BBi  BQ    BB            BBX  BBi vBB  BBB  BBv   i    BB   iBB  BQk  BBi LBB  QBM   +");
		System.out.println("+  BBU  BBi rBBgQgQU  BBi      gBb  BBr iQBQBBBB          BQi  QB    QB            BBk  BBi vBBgQgQu  BBBBBQB    BB   iBB  BBU  BQi vBB  EBD   +");
		System.out.println("+  BBd  BBi rBB       BBi      BBR  BBv      kBB          BBi  BB    BB            BBq  BBi vBB           iBB   iBQr  iBB  BQP  BBi LBQ  ZBD   +");
		System.out.println("+  QBB  BBv LQBBBQBB  BBv      QBBBBBBJ rBBBBQBB          BBBBBBB   iBBi           BBBBQBBi uQBBBBBQ  BBBBBQB   iBBBB vBB  BBE  BBi UBBBBBBZ   +");
		System.out.println("+  ii   ii                                                                                                                               RBg   +");
		System.out.println("+                                                                                                                                        BBQ   +");
		System.out.println("+                                                                                                                                        JZY   +");
		System.out.println("  ============================================================================================================================================  ");

	
		//Ÿ��Ʋ�߰� 1�� ��ٸ�
		try{
			
			Thread.sleep(6000);
		}catch(Exception e){}
		
		
		
		
		//������ ��ȣ�� ���� ���� ch
		int joker=0;
		int ch;
		int job;
		int[] deck = new int[20];
		 int[] tpdeck = new int[20];
		int boss =0;
		 user us = new user();
		 deck dk = new deck();
		 
		 for(int q=0; q<20; q++) {
			 dk.deck[q]=0;
			 dk.tpdeck[q]=0;
		 }
		 for(int w=0; w<5; w++) {
			dk.handcard[w]=0;
		 }
		 
		Scanner sc = new Scanner(System.in);
		 status st = new status();
		 us.cardcount=10;
		 System.out.println("������ ���հ� ���� ���뿡 ������ ������ ���ÿ�. �����ϰ� ���ÿ�!(���ڳ� Ư�������Է½� �����ϰ� 3�̻� ���ڴ� 3�������)");
		 System.out.println("1.���ձ��������  2.�������������  3.�븶����������");
		 try {
				ch=sc.nextInt();
				 
				 if(ch==1) {
					 
					 
					 us.setHP(70);
					 us.HP=70;
					 us.money =50;
					 us.job=1;
					 
					 for(int i=0; i<deck.length; i++) {
						 deck[i]=0;
					 }
					 deck[0]=1;deck[1]=1;deck[2]=1;deck[3]=1;
					 deck[4]=2;deck[5]=2;deck[6]=2;deck[7]=2;
					 deck[8]=3;deck[9]=3;
					
					 dk.deck[0]=1; dk.deck[1]=1; dk.deck[2]=1; dk.deck[3]=1;
					 dk.deck[4]=2; dk.deck[5]=2; dk.deck[6]=2; dk.deck[7]=2;
					 dk.deck[8]=3; dk.deck[9]=3;
					 
					 
                 
                   for(int q=0; q<deck.length; q++) {
                 	   deck[q]=tpdeck[q];
                    }
					
					 
					
					 System.out.println("������ ������ ���� ����� �Բ� �����Ͽ� ������ ����� ���⿡ ���Ƴ־����ϴ�.");
					 try{Thread.sleep(2000);
						}catch(Exception e){}
					 System.out.println("����� �ڽ��� ������ ������ �л��� ���ձ����� �����ϱ� ���Ͽ� ���ձ��� ����ϴ� �δ뿡 �����Ͽ����ϴ�.");
					 try{Thread.sleep(2000);
						}catch(Exception e){}
					 System.out.println("������ ������� ���� ����� �Ȱ� ����������  ������ ���ձ��� ���Ͽ� ����� �˸��ϰ� �������");
					 try{Thread.sleep(2000);
						}catch(Exception e){}
					 System.out.println("�ɰ��� �λ��� ���� ����� ������ ��Ż�Ͽ� ��� ���� �Ʒ����� ���� ���� ������ ��ٸ��� �־����ϴ�.");
					 try{Thread.sleep(2000);
						}catch(Exception e){}
					 System.out.println("����� �̷���Ȳ�� ��� ������ ���տ��� �г밡 ġ�о����ϴ�. �׷��� ���ڱ� �Ӹ��ӿ� ��� ��Ҹ��� ��������ϴ�.");
					 try{Thread.sleep(2000);
						}catch(Exception e){}
					 System.out.println("\"���� ���ϴ°�? ���� �� ���� �ְڴ�. ��� ���� ��ȥ�� ���� �������ڴ�. �� ���ȿ� ���Ϸ��� �� �ڽ��� ������ �񷯶�!\"");
					 try{Thread.sleep(2000);
						}catch(Exception e){}
					 System.out.println("����� ������ ���� ����ִ� ���� �Ųٷ� ��� �ڽ��� ������ ���� ��ϴ�.");
					 try{Thread.sleep(2000);
						}catch(Exception e){}
					 System.out.println("��û�� ������ �з��԰� �����Ȱ��� ���� ���δ��� ��� �� ��� ��ó�� �������� ���ȿ��� ���� �������ϴ�.");
					 try{Thread.sleep(2000);
						}catch(Exception e){}
					 System.out.println("����� ������ ���� �г�� �������� ���¿�� �Ͼ�ϴ�.");

				 }
				 
				 else if(ch==2) {
					 
					us.job=2;
					
					 for(int i=0; i<deck.length; i++) {
						 deck[i]=0;
					 }
					 deck[0]=4;deck[1]=4;deck[2]=4;deck[3]=4;
					 deck[4]=5;deck[5]=5;deck[6]=5;deck[7]=5;
					 deck[8]=6;deck[9]=6;
					
					 dk.deck[0]=4; dk.deck[1]=4; dk.deck[2]=4; dk.deck[3]=4;
					 dk.deck[4]=5; dk.deck[5]=5; dk.deck[6]=5; dk.deck[7]=5;
					 dk.deck[8]=6; dk.deck[9]=6;
					 
					 
                 
                   for(int q=0; q<deck.length; q++) {
                 	   deck[q]=tpdeck[q];
                    }
					
					 
					 us.setHP(60);
					 us.HP=60;
					 us.money=80;
					 
					 System.out.println("����� ��� �� ������ִ� �����ִ� ������ �Ͽ��Դϴ�. ����� ������ ����� ���������ֽ��ϴ�.");
					 try{Thread.sleep(2000);
						}catch(Exception e){}
					 System.out.println("������ ���� ���� ū ������ ���������� �׵� ������ ���� �پ �������� ���� ���� �����Ͽ����ϴ�.");
					 try{Thread.sleep(2000);
						}catch(Exception e){}
					 System.out.println("������ ���� ������ ������ ���� ���� ��� �������� ���� ���ϰ� ����� ������ ����� ������� �Ͽ����ϴ�.");
					 try{Thread.sleep(2000);
						}catch(Exception e){}
					 System.out.println("���� ����� ������ ���� ������ �������� �ڽ��� �����ϱ� ���Ͽ� ������ ����Ϸ� �����ϴ�.");

					 
				 }
				 else  {
					
					 us.job=3;
					us.money =100;
					us.HP=50;
					 us.setHP(50);
					 
					 for(int i=0; i<deck.length; i++) {
						 deck[i]=0;
					 }
					 deck[0]=7;deck[1]=7;deck[2]=7;deck[3]=7;
					 deck[4]=8;deck[5]=8;deck[6]=8;deck[7]=8;
					 deck[8]=9;deck[9]=9;
					
					 dk.deck[0]=7; dk.deck[1]=7; dk.deck[2]=7; dk.deck[3]=7;
					 dk.deck[4]=8; dk.deck[5]=8; dk.deck[6]=8; dk.deck[7]=8;
					 dk.deck[8]=9; dk.deck[9]=9;
					 
					 
                 
                   for(int q=0; q<deck.length; q++) {
                 	   deck[q]=tpdeck[q];
                    }
					
					 
					 System.out.println("��� ����� ������ �������� ����� ����� ������ �������� ���� ��� ���ڷ� ���� �˴ϴ�.");
					 try{Thread.sleep(2000);
						}catch(Exception e){}
					 System.out.println("����� �������� ���ڷ� ������ �� �������� �Ƿ°� ��ǰ�� �������� ��ź�ϰ� �׿Ͱ��� �Ǳ����� ������ �����մϴ�.");
					 try{Thread.sleep(2000);
						}catch(Exception e){}
					 System.out.println("��� �� ������ ������ �����Ͽ��� ���� ������ �ձ��� ������û�� ��ü���� ���� �μ� ����� ����� �����ϴ�.");
					 try{Thread.sleep(2000);
						}catch(Exception e){}
					 System.out.println("����� ������ ��ٸ��� ����ؼ� ������ ���������� ������ ������ ������ ���ƿ��� �ʽ��ϴ�.");
					 try{Thread.sleep(2000);
						}catch(Exception e){}
					 System.out.println("����� �ᱹ ������ ã�� �����Ǽ��� ���Ͽ� ������� ����մϴ�.");


					 
					 
				 }
				
		 
				 
				}catch(InputMismatchException e){
					System.out.println("���ڳ� Ư�����ڸ� �Է������Ƿ� �����մϴ�.");
					
				}
/*		
*/		
		//������ ��ü���� �ݺ���
		 while(us.HP>0 && boss==0 && joker==0) {
			System.out.println("================================================================================");
			relic rc = new relic();
			
			int[] relic = new int[4];
			relic[0]=0; relic[1]=0; relic[2]=0; relic[3]=0; 
			
			int[] relic1 = new int[4];
			relic1[0]=0; relic1[1]=0;relic1[2]=0;relic1[3]=0;
			
			int[] relic2 = new int[4];
			relic2[0]=0; relic2[1]=0;relic2[2]=0;relic2[3]=0;
			
			

			map mp = new map();
			//���� �� ��ġ
			int mylocation=11;
			mp.mapping(mylocation);
			//å����
			
				System.out.println("���簡�����ִ�ī���");
				for(int z=0; z<20; z++) {
					if(dk.deck[z]==1) {
					
						System.out.println("����");
					}
					else if (dk.deck[z]==2)	{
						System.out.println("���й��");
					}
		else if (dk.deck[z]==3)	{
			System.out.println("�Ǹ����ϰ�");
					}
		else if (dk.deck[z]==4)	{
			System.out.println("���");
		}
		else if (dk.deck[z]==5)	{
			System.out.println("ȸ��");
		}
		else if (dk.deck[z]==6)	{
			System.out.println("ȸ�ǻ��");
		}
		else if (dk.deck[z]==7)	{
			System.out.println("�ĸ���");
		}
		else if (dk.deck[z]==8)	{
			System.out.println("����");
		}
		else if (dk.deck[z]==9)	{
			System.out.println("���̾�");
		}
						
				}
				try{Thread.sleep(2000);
				}catch(Exception e){}
			
			
			System.out.println("ü��:"+us.HP);
			System.out.print("����: ");rc.showrelic(relic);rc.showrelic(relic1); rc.showrelic(relic2);System.out.println("");
			System.out.println("������:"+us.money);
			System.out.println("���� �� ���ΰ�?(���ڳ�Ư�������Է½� �����ϰ� 2�̻� ���ڴ� 2�����)");
			System.out.println("1.�޽�  2.����");
try {
	ch=sc.nextInt();
	if(ch==1) {
		mylocation=21;
		
		//�޽�
		System.out.println("�޽�");
		System.out.println("ü���� 20ȸ���մϴ�.");
		us.HP=us.HP + 20;

		
		mp.mapping(mylocation);
		//��ٷȴٰ�
		 try{Thread.sleep(2000);
			}catch(Exception e){}
		
		mylocation=31;
		//�߰�������Ʋ
		
		System.out.println("===============�ߺ�===============");
		System.out.println("���ձ� ������� ���� �߻�!");
		enemy middle = new enemy();
	       middle.monname="���ձ� ������";
	       middle.HP=20;
	       middle.em=100;
	       middle.monnum=1;
		dk.setdeck();               //deck�� tpdeck�� ����
        dk.shuffle(dk.tpdeck, 15);	//ī�����
        
        int b=0;
        for(int k=0; k<dk.handcard.length; k++) { //ī�� 5��̰� ����
        	
        	
        	
        		if(dk.tpdeck[b]!=0) {
            		dk.handcard[k]=dk.tpdeck[b];
            		dk.tpdeck[b]=0;
            		b++;
     		
            	}
            	else if(dk.tpdeck[b]==0){
            		b++;
            		k--;	
            	}	
        }
        
        
        while(us.HP>0 || middle.HP>0) {
        	b=0;
       int ccount=0;
       
       for(int d= 0; d<20; d++) {
    	   if(dk.tpdeck[d]!=0) {
    		   ccount=ccount+1;
    	   }
    	   else {
    		   
    	   }
       }
     
       System.out.print("����: ");rc.showrelic(relic);rc.showrelic(relic1); rc.showrelic(relic2);System.out.println(""); 	
       dk.showcard();
       System.out.println("");
       
       
       int defense=0;
       System.out.println("��ī���"+us.cardcount);
       System.out.println("����ī���"+ccount);
       System.out.println("�����ü��:"+us.HP);
       System.out.println("����ü��:"+middle.HP);
       System.out.println("����� ī�带  3�� �����Ͻÿ�. ��ҺҰ� ������ ����!");
       System.out.println("1.  2.  3.  4.  5. 6.Ȯ��");
       
      

       
       int attack=0;
       for(int h=0; h<3; h++) {
       ch=sc.nextInt();
       switch(ch) {
       case 1:
     	  if(dk.handcard[0]==1) {
     		  System.out.println("1��ī����");
     		 attack = attack + 7;
     		 dk.handcard[0]=0;
     	  }
     	  else if (dk.handcard[0]==2) {
     		 System.out.println("1��ī����");
     		 defense= defense + 1;
     		dk.handcard[0]=0;
     	  }
     	 else if (dk.handcard[0]==3) {
     		System.out.println("1��ī����");
     		 attack = attack + 10;
    		  defense = defense -2;
    		  dk.handcard[0]=0;
    	  }
     	 else if (dk.handcard[0]==4) {
     		System.out.println("1��ī����");
     		attack = attack + 5;
     		dk.handcard[0]=0;
    	  }
     	 else if (dk.handcard[0]==5) {
     		System.out.println("1��ī����");
     		defense= defense + 2;
     		dk.handcard[0]=0;
    	  }
     	 else if (dk.handcard[0]==6) {
     		System.out.println("1��ī����");
     		attack = attack + 6;
  		  defense = defense + 2;
  		dk.handcard[0]=0;
    	  }
     	 else if (dk.handcard[1]==7) {
     		System.out.println("1��ī����");
    		  attack = attack +3;
    		  dk.handcard[0]=0;
    	  }
     	 else if (dk.handcard[1]==8) {
     		System.out.println("1��ī����");
     		defense = defense + 1;
     		dk.handcard[0]=0;
    	  }
     	 else if (dk.handcard[1]==9) {
     		System.out.println("1��ī����");
    		  attack= attack + 20;
    		  dk.handcard[0]=0;
    	  }
     	else {
     		System.out.println("�ٽü����ϼ���");
    		h--;
    	  }
     	  
     	  break;
   case 2:
	   if(dk.handcard[1]==1) {
  		  System.out.println("2��ī����");
  		 attack = attack + 7;
  		 dk.handcard[1]=0;
  	  }
  	  else if (dk.handcard[1]==2) {
  		 System.out.println("2��ī����");
  		 defense= defense + 1;
  		dk.handcard[1]=0;
  	  }
  	 else if (dk.handcard[1]==3) {
  		System.out.println("2��ī����");
  		 attack = attack + 10;
 		  defense = defense -2;
 		  dk.handcard[1]=0;
 	  }
  	 else if (dk.handcard[1]==4) {
  		System.out.println("2��ī����");
  		attack = attack + 5;
  		dk.handcard[1]=0;
 	  }
  	 else if (dk.handcard[1]==5) {
  		System.out.println("2��ī����");
  		defense= defense + 2;
  		dk.handcard[1]=0;
 	  }
  	 else if (dk.handcard[1]==6) {
  		System.out.println("2��ī����");
  		attack = attack + 6;
		  defense = defense + 2;
		dk.handcard[1]=0;
 	  }
  	 else if (dk.handcard[1]==7) {
  		System.out.println("2��ī����");
 		  attack = attack +3;
 		  dk.handcard[1]=0;
 	  }
  	 else if (dk.handcard[1]==8) {
  		System.out.println("2��ī����");
  		defense = defense + 1;
  		dk.handcard[1]=0;
 	  }
  	 else if (dk.handcard[1]==9) {
  		System.out.println("2��ī����");
 		  attack= attack + 20;
 		  dk.handcard[1]=0;
 	  }  
  	else  {
 		System.out.println("�ٽü����ϼ���");
		h--;
	  }
     	  break;
     	  
   case 3:
	   if(dk.handcard[2]==1) {
  		  System.out.println("3��ī����");
  		 attack = attack + 7;
  		 dk.handcard[2]=0;
  	  }
  	  else if (dk.handcard[2]==2) {
  		 System.out.println("3��ī����");
  		 defense= defense + 1;
  		dk.handcard[2]=0;
  	  }
  	 else if (dk.handcard[2]==3) {
  		System.out.println("3��ī����");
  		 attack = attack + 10;
 		  defense = defense -2;
 		  dk.handcard[2]=0;
 	  }
  	 else if (dk.handcard[2]==4) {
  		System.out.println("3��ī����");
  		attack = attack + 5;
  		dk.handcard[2]=0;
 	  }
  	 else if (dk.handcard[2]==5) {
  		System.out.println("3��ī����");
  		defense= defense + 2;
  		dk.handcard[2]=0;
 	  }
  	 else if (dk.handcard[2]==6) {
  		System.out.println("3��ī����");
  		attack = attack + 6;
		  defense = defense + 2;
		dk.handcard[2]=0;
 	  }
  	 else if (dk.handcard[2]==7) {
  		System.out.println("3��ī����");
 		  attack = attack +3;
 		  dk.handcard[2]=0;
 	  }
  	 else if (dk.handcard[2]==8) {
  		System.out.println("3��ī����");
  		defense = defense + 1;
  		dk.handcard[2]=0;
 	  }
  	 else if (dk.handcard[2]==9) {
  		System.out.println("3��ī����");
 		  attack= attack + 20;
 		  dk.handcard[2]=0;
 	  }
  	else  {
 		System.out.println("�ٽü����ϼ���");
		h--;
	  }
 	  break;
   case 4:
	   if(dk.handcard[3]==1) {
  		  System.out.println("4��ī����");
  		 attack = attack + 7;
  		 dk.handcard[3]=0;
  	  }
  	  else if (dk.handcard[3]==2) {
  		 System.out.println("4��ī����");
  		 defense= defense + 1;
  		dk.handcard[3]=0;
  	  }
  	 else if (dk.handcard[3]==3) {
  		System.out.println("4��ī����");
  		 attack = attack + 10;
 		  defense = defense -2;
 		  dk.handcard[3]=0;
 	  }
  	 else if (dk.handcard[3]==4) {
  		System.out.println("4��ī����");
  		attack = attack + 5;
  		dk.handcard[3]=0;
 	  }
  	 else if (dk.handcard[3]==5) {
  		System.out.println("4��ī����");
  		defense= defense + 2;
  		dk.handcard[3]=0;
 	  }
  	 else if (dk.handcard[3]==6) {
  		System.out.println("4��ī����");
  		attack = attack + 6;
		  defense = defense + 2;
		dk.handcard[3]=0;
 	  }
  	 else if (dk.handcard[3]==7) {
  		System.out.println("4��ī����");
 		  attack = attack +3;
 		  dk.handcard[3]=0;
 	  }
  	 else if (dk.handcard[3]==8) {
  		System.out.println("4��ī����");
  		defense = defense + 1;
  		dk.handcard[3]=0;
 	  }
  	 else if (dk.handcard[3]==9) {
  		System.out.println("4��ī����");
 		  attack= attack + 20;
 		  dk.handcard[3]=0;
 	  }
  	else if (dk.handcard[3]==0) {
 		System.out.println("�ٽü����ϼ���");
		h--;
	  }
 	  break;
   case 5:
	   if(dk.handcard[4]==1) {
  		  System.out.println("5��ī����");
  		 attack = attack + 7;
  		 dk.handcard[4]=0;
  	  }
  	  else if (dk.handcard[4]==2) {
  		 System.out.println("5��ī����");
  		 defense= defense + 1;
  		dk.handcard[4]=0;
  	  }
  	 else if (dk.handcard[4]==3) {
  		System.out.println("5��ī����");
  		 attack = attack + 10;
 		  defense = defense -2;
 		  dk.handcard[4]=0;
 	  }
  	 else if (dk.handcard[4]==4) {
  		System.out.println("5��ī����");
  		attack = attack + 5;
  		dk.handcard[4]=0;
 	  }
  	 else if (dk.handcard[4]==5) {
  		System.out.println("5��ī����");
  		defense= defense + 2;
  		dk.handcard[4]=0;
 	  }
  	 else if (dk.handcard[4]==6) {
  		System.out.println("5��ī����");
  		attack = attack + 6;
		  defense = defense + 2;
		dk.handcard[4]=0;
 	  }
  	 else if (dk.handcard[4]==7) {
  		System.out.println("5��ī����");
 		  attack = attack +3;
 		  dk.handcard[4]=0;
 	  }
  	 else if (dk.handcard[4]==8) {
  		System.out.println("5��ī����");
  		defense = defense + 1;
  		dk.handcard[4]=0;
 	  }
  	 else if (dk.handcard[4]==9) {
  		System.out.println("5��ī����");
 		  attack= attack + 20;
 		  dk.handcard[4]=0;
 	  }
  	else  {
 		System.out.println("�ٽü����ϼ���");
		h--;
	  }
 	  break;
   case 6:
	   System.out.println("Ȯ��");
	   break;
 	  default :
 		 System.out.println("�ٽü����ϼ���");
 		 h--;
 		  break;
       
       }
       }
       
       System.out.println("����� ����!");
       middle.HP = middle.HP - attack;
       System.out.println("����"+attack+"��ŭ�� ���ظ� �Ծ���.");
       if(middle.HP<=0) {
    	   System.out.println("���� ��������!");
    	   System.out.println("����� ������ ȹ���Ͽ���!");
    	   System.out.println("�����"+middle.em+"��ŭ�� ���� ȹ���Ͽ���.");
    	   relic[0]=1;
    	   us.HP= us.HP+30;
    	   us.money = us.money+middle.em;
    	   break;
       }
       int beh = (int)(Math.random()*10);
       if(beh<8) {
    	   System.out.println("�������� ����!");
    	   us.HP = us.HP + defense - 10; 
    	   System.out.println("�����"+-(defense - 10)+"��ŭ�� ���ظ� �Ծ���.");
       }
       else {
    	   System.out.println("�������� �ϰ�!");
    	   us.HP = us.HP + defense - 25;
    	   System.out.println("�����"+-(defense - 25)+"��ŭ�� ���ظ� �Ծ���.");
       }
       
       if(us.HP<=0) {
    	   System.out.println("����� ��������!");
    	   break;
       }
      attack=0;
      defense = 0;
      ccount=0;
       for(int d= 0; d<20; d++) {
    	   if(dk.tpdeck[d]!=0) {
    		   ccount=ccount+1;
    	   }
    	   else {
    		   
    	   }
       }
       System.out.println("���Ⳳ������"+ccount);
      //����ī��� 3�� �̸��϶�
       if(ccount<3) {
    	   dk.setdeck();               
           
           
    	   for(int u=0; u<5; u++) {
    		   for(int y=0; y<20; y++) {
    			 if ( dk.handcard[u]== dk.tpdeck[y]) {
    				 dk.tpdeck[y]=0;
    				 break;
    			 }
    			 else {
    				 
    			 }
    			 
    		   }
    		   
    	   } 
    	   
    	   dk.shuffle(dk.tpdeck, 15);
    	   
       }
       
    
       b=0;
       //�󽽷����� üũ�ϰ� ���ڸ��� ī��ֱ�  
       for(int k=0; k<dk.handcard.length; k++) { //ī�� 5��̰� ����

    	   if(dk.handcard[k]==0) {
    	   
   		if(dk.tpdeck[b]!=0) {
       		dk.handcard[k]=dk.tpdeck[b];
       		dk.tpdeck[b]=0;
       		b++;
       		
       		
       	}
       	else if(dk.tpdeck[b]==0){
       		b++;
       		k--;
       		
       	}	
   		
    	   }
    	   else {
    		   
    	   }
   		
   }
   
   
     

		}//�����ݺ� ������ ���ȣ
        
        try{Thread.sleep(3000);
		}catch(Exception e){}
        mylocation=31;
        mp.mapping(mylocation);
        

		//��
        System.out.println("===============�Ϲݸ�===============");
		System.out.println("���ձ� �屳�� ���� �߻�!");
		enemy mon1 = new enemy();
	       mon1.monname="���ձ� �屳";
	       mon1.HP=15;
	       mon1.em=20;
	       mon1.monnum=2;
		dk.setdeck();               //deck�� tpdeck�� ����
        dk.shuffle(dk.tpdeck, 15);	//ī�����
       
        b=0;
        for(int k=0; k<dk.handcard.length; k++) { //ī�� 5��̰� ����
        	
        	
        	
        		if(dk.tpdeck[b]!=0) {
            		dk.handcard[k]=dk.tpdeck[b];
            		dk.tpdeck[b]=0;
            		b++;
     		
            	}
            	else if(dk.tpdeck[b]==0){
            		b++;
            		k--;	
            	}	
        }
        
        
        while(us.HP>0 || mon1.HP>0) {
        	b=0;
       int ccount=0;
       
       for(int d= 0; d<20; d++) {
    	   if(dk.tpdeck[d]!=0) {
    		   ccount=ccount+1;
    	   }
    	   else {
    		   
    	   }
       }
     
       System.out.print("����: ");rc.showrelic(relic);rc.showrelic(relic1); rc.showrelic(relic2);System.out.println(""); 	
       dk.showcard();
       System.out.println("");
       
       
       int defense=0;
       System.out.println("��ī���"+us.cardcount);
       System.out.println("����ī���"+ccount);
       System.out.println("�����ü��:"+us.HP);
       System.out.println("����ü��:"+mon1.HP);
       System.out.println("����� ī�带  3�� �����Ͻÿ�. ��ҺҰ� ������ ����!");
       System.out.println("1.  2.  3.  4.  5. 6.Ȯ��");
       
      

       
       int attack=0;
       for(int h=0; h<3; h++) {
       ch=sc.nextInt();
       switch(ch) {
       case 1:
     	  if(dk.handcard[0]==1) {
     		  System.out.println("1��ī����");
     		 attack = attack + 7;
     		 dk.handcard[0]=0;
     	  }
     	  else if (dk.handcard[0]==2) {
     		 System.out.println("1��ī����");
     		 defense= defense + 1;
     		dk.handcard[0]=0;
     	  }
     	 else if (dk.handcard[0]==3) {
     		System.out.println("1��ī����");
     		 attack = attack + 10;
    		  defense = defense -2;
    		  dk.handcard[0]=0;
    	  }
     	 else if (dk.handcard[0]==4) {
     		System.out.println("1��ī����");
     		attack = attack + 5;
     		dk.handcard[0]=0;
    	  }
     	 else if (dk.handcard[0]==5) {
     		System.out.println("1��ī����");
     		defense= defense + 2;
     		dk.handcard[0]=0;
    	  }
     	 else if (dk.handcard[0]==6) {
     		System.out.println("1��ī����");
     		attack = attack + 6;
  		  defense = defense + 2;
  		dk.handcard[0]=0;
    	  }
     	 else if (dk.handcard[1]==7) {
     		System.out.println("1��ī����");
    		  attack = attack +3;
    		  dk.handcard[0]=0;
    	  }
     	 else if (dk.handcard[1]==8) {
     		System.out.println("1��ī����");
     		defense = defense + 1;
     		dk.handcard[0]=0;
    	  }
     	 else if (dk.handcard[1]==9) {
     		System.out.println("1��ī����");
    		  attack= attack + 20;
    		  dk.handcard[0]=0;
    	  }
     	else {
     		System.out.println("�ٽü����ϼ���");
    		h--;
    	  }
     	  
     	  break;
   case 2:
	   if(dk.handcard[1]==1) {
  		  System.out.println("2��ī����");
  		 attack = attack + 7;
  		 dk.handcard[1]=0;
  	  }
  	  else if (dk.handcard[1]==2) {
  		 System.out.println("2��ī����");
  		 defense= defense + 1;
  		dk.handcard[1]=0;
  	  }
  	 else if (dk.handcard[1]==3) {
  		System.out.println("2��ī����");
  		 attack = attack + 10;
 		  defense = defense -2;
 		  dk.handcard[1]=0;
 	  }
  	 else if (dk.handcard[1]==4) {
  		System.out.println("2��ī����");
  		attack = attack + 5;
  		dk.handcard[1]=0;
 	  }
  	 else if (dk.handcard[1]==5) {
  		System.out.println("2��ī����");
  		defense= defense + 2;
  		dk.handcard[1]=0;
 	  }
  	 else if (dk.handcard[1]==6) {
  		System.out.println("2��ī����");
  		attack = attack + 6;
		  defense = defense + 2;
		dk.handcard[1]=0;
 	  }
  	 else if (dk.handcard[1]==7) {
  		System.out.println("2��ī����");
 		  attack = attack +3;
 		  dk.handcard[1]=0;
 	  }
  	 else if (dk.handcard[1]==8) {
  		System.out.println("2��ī����");
  		defense = defense + 1;
  		dk.handcard[1]=0;
 	  }
  	 else if (dk.handcard[1]==9) {
  		System.out.println("2��ī����");
 		  attack= attack + 20;
 		  dk.handcard[1]=0;
 	  }  
  	else  {
 		System.out.println("�ٽü����ϼ���");
		h--;
	  }
     	  break;
     	  
   case 3:
	   if(dk.handcard[2]==1) {
  		  System.out.println("3��ī����");
  		 attack = attack + 7;
  		 dk.handcard[2]=0;
  	  }
  	  else if (dk.handcard[2]==2) {
  		 System.out.println("3��ī����");
  		 defense= defense + 1;
  		dk.handcard[2]=0;
  	  }
  	 else if (dk.handcard[2]==3) {
  		System.out.println("3��ī����");
  		 attack = attack + 10;
 		  defense = defense -2;
 		  dk.handcard[2]=0;
 	  }
  	 else if (dk.handcard[2]==4) {
  		System.out.println("3��ī����");
  		attack = attack + 5;
  		dk.handcard[2]=0;
 	  }
  	 else if (dk.handcard[2]==5) {
  		System.out.println("3��ī����");
  		defense= defense + 2;
  		dk.handcard[2]=0;
 	  }
  	 else if (dk.handcard[2]==6) {
  		System.out.println("3��ī����");
  		attack = attack + 6;
		  defense = defense + 2;
		dk.handcard[2]=0;
 	  }
  	 else if (dk.handcard[2]==7) {
  		System.out.println("3��ī����");
 		  attack = attack +3;
 		  dk.handcard[2]=0;
 	  }
  	 else if (dk.handcard[2]==8) {
  		System.out.println("3��ī����");
  		defense = defense + 1;
  		dk.handcard[2]=0;
 	  }
  	 else if (dk.handcard[2]==9) {
  		System.out.println("3��ī����");
 		  attack= attack + 20;
 		  dk.handcard[2]=0;
 	  }
  	else  {
 		System.out.println("�ٽü����ϼ���");
		h--;
	  }
 	  break;
   case 4:
	   if(dk.handcard[3]==1) {
  		  System.out.println("4��ī����");
  		 attack = attack + 7;
  		 dk.handcard[3]=0;
  	  }
  	  else if (dk.handcard[3]==2) {
  		 System.out.println("4��ī����");
  		 defense= defense + 1;
  		dk.handcard[3]=0;
  	  }
  	 else if (dk.handcard[3]==3) {
  		System.out.println("4��ī����");
  		 attack = attack + 10;
 		  defense = defense -2;
 		  dk.handcard[3]=0;
 	  }
  	 else if (dk.handcard[3]==4) {
  		System.out.println("4��ī����");
  		attack = attack + 5;
  		dk.handcard[3]=0;
 	  }
  	 else if (dk.handcard[3]==5) {
  		System.out.println("4��ī����");
  		defense= defense + 2;
  		dk.handcard[3]=0;
 	  }
  	 else if (dk.handcard[3]==6) {
  		System.out.println("4��ī����");
  		attack = attack + 6;
		  defense = defense + 2;
		dk.handcard[3]=0;
 	  }
  	 else if (dk.handcard[3]==7) {
  		System.out.println("4��ī����");
 		  attack = attack +3;
 		  dk.handcard[3]=0;
 	  }
  	 else if (dk.handcard[3]==8) {
  		System.out.println("4��ī����");
  		defense = defense + 1;
  		dk.handcard[3]=0;
 	  }
  	 else if (dk.handcard[3]==9) {
  		System.out.println("4��ī����");
 		  attack= attack + 20;
 		  dk.handcard[3]=0;
 	  }
  	else if (dk.handcard[3]==0) {
 		System.out.println("�ٽü����ϼ���");
		h--;
	  }
 	  break;
   case 5:
	   if(dk.handcard[4]==1) {
  		  System.out.println("5��ī����");
  		 attack = attack + 7;
  		 dk.handcard[4]=0;
  	  }
  	  else if (dk.handcard[4]==2) {
  		 System.out.println("5��ī����");
  		 defense= defense + 1;
  		dk.handcard[4]=0;
  	  }
  	 else if (dk.handcard[4]==3) {
  		System.out.println("5��ī����");
  		 attack = attack + 10;
 		  defense = defense -2;
 		  dk.handcard[4]=0;
 	  }
  	 else if (dk.handcard[4]==4) {
  		System.out.println("5��ī����");
  		attack = attack + 5;
  		dk.handcard[4]=0;
 	  }
  	 else if (dk.handcard[4]==5) {
  		System.out.println("5��ī����");
  		defense= defense + 2;
  		dk.handcard[4]=0;
 	  }
  	 else if (dk.handcard[4]==6) {
  		System.out.println("5��ī����");
  		attack = attack + 6;
		  defense = defense + 2;
		dk.handcard[4]=0;
 	  }
  	 else if (dk.handcard[4]==7) {
  		System.out.println("5��ī����");
 		  attack = attack +3;
 		  dk.handcard[4]=0;
 	  }
  	 else if (dk.handcard[4]==8) {
  		System.out.println("5��ī����");
  		defense = defense + 1;
  		dk.handcard[4]=0;
 	  }
  	 else if (dk.handcard[4]==9) {
  		System.out.println("5��ī����");
 		  attack= attack + 20;
 		  dk.handcard[4]=0;
 	  }
  	else  {
 		System.out.println("�ٽü����ϼ���");
		h--;
	  }
 	  break;
   case 6:
	   System.out.println("Ȯ��");
	   break;
 	  default :
 		 System.out.println("�ٽü����ϼ���");
 		 h--;
 		  break;
       
       }
       }
       
       System.out.println("����� ����!");
       mon1.HP = mon1.HP - attack;
       System.out.println("����"+attack+"��ŭ�� ���ظ� �Ծ���.");
       if(mon1.HP<=0) {
    	   System.out.println("���� ��������!");
    	   System.out.println("�����"+mon1.em+"��ŭ�� ���� ȹ���Ͽ���.");
    	   us.money = us.money+mon1.em;
    	   break;
       }
       
    	   System.out.println("�屳�� ����!");
    	   us.HP = us.HP + defense - 10; 
    	   System.out.println("�����"+-(defense - 10)+"��ŭ�� ���ظ� �Ծ���.");
       
     
       if(us.HP<=0) {
    	   System.out.println("����� ��������!");
    	   break;
       }
      attack=0;
      defense = 0;
      ccount=0;
       for(int d= 0; d<20; d++) {
    	   if(dk.tpdeck[d]!=0) {
    		   ccount=ccount+1;
    	   }
    	   else {
    		   
    	   }
       }
       System.out.println("���Ⳳ������"+ccount);
      //����ī��� 3�� �̸��϶�
       if(ccount<3) {
    	   dk.setdeck();               
           
           
    	   for(int u=0; u<5; u++) {
    		   for(int y=0; y<20; y++) {
    			 if ( dk.handcard[u]== dk.tpdeck[y]) {
    				 dk.tpdeck[y]=0;
    				 break;
    			 }
    			 else {
    				 
    			 }
    			 
    		   }
    		   
    	   } 
    	   
    	   dk.shuffle(dk.tpdeck, 15);
    	   
       }
       
    
       b=0;
       //�󽽷����� üũ�ϰ� ���ڸ��� ī��ֱ�  
       for(int k=0; k<dk.handcard.length; k++) { //ī�� 5��̰� ����

    	   if(dk.handcard[k]==0) {
    	   
   		if(dk.tpdeck[b]!=0) {
       		dk.handcard[k]=dk.tpdeck[b];
       		dk.tpdeck[b]=0;
       		b++;
       		
       		
       	}
       	else if(dk.tpdeck[b]==0){
       		b++;
       		k--;
       		
       	}	
   		
    	   }
    	   else {
    		   
    	   }
   		
   }
   
   
     

		}//�����ݺ� ������ ���ȣ
        mylocation=41;
    	mp.mapping(mylocation);
        
		System.out.println("���簡�����ִ�ī���");
		for(int z=0; z<20; z++) {
			if(dk.deck[z]==1) {
			
				System.out.println("����");
			}
			else if (dk.deck[z]==2)	{
				System.out.println("���й��");
			}
else if (dk.deck[z]==3)	{
	System.out.println("�Ǹ����ϰ�");
			}
else if (dk.deck[z]==4)	{
	System.out.println("���");
}
else if (dk.deck[z]==5)	{
	System.out.println("ȸ��");
}
else if (dk.deck[z]==6)	{
	System.out.println("ȸ�ǻ��");
}
else if (dk.deck[z]==7)	{
	System.out.println("�ĸ���");
}
else if (dk.deck[z]==8)	{
	System.out.println("����");
}
else if (dk.deck[z]==9)	{
	System.out.println("���̾�");
}
				
		}
		try{Thread.sleep(2000);
		}catch(Exception e){}
		
        System.out.println("���� �� ���ΰ�?(���ڳ�Ư�������Է½� �����ϰ� 2�̻� ���ڴ� 2�����)");
		System.out.println("1.�޽�  2.����");
		ch=sc.nextInt();
        //�޻󰥷���
        if(ch==1) {
        	mylocation=51;
        	mp.mapping(mylocation);
        	System.out.println("�޽�");
			System.out.println("ü���� 20ȸ���մϴ�.");
			us.HP=us.HP + 20;
        	
			try{Thread.sleep(2000);
			}catch(Exception e){}
			
			System.out.println("===============��������===============");
			System.out.println("���հ� ���� �߻�!");
			enemy satan = new enemy();
			satan.monname="���ձ� �屳";
			satan.HP=50;
			satan.em=500;
			satan.monnum=0;
			dk.setdeck();               //deck�� tpdeck�� ����
	        dk.shuffle(dk.tpdeck, 15);	//ī�����
	       
	        b=0;
	        for(int k=0; k<dk.handcard.length; k++) { //ī�� 5��̰� ����
	        	
	        	
	        	
	        		if(dk.tpdeck[b]!=0) {
	            		dk.handcard[k]=dk.tpdeck[b];
	            		dk.tpdeck[b]=0;
	            		b++;
	     		
	            	}
	            	else if(dk.tpdeck[b]==0){
	            		b++;
	            		k--;	
	            	}	
	        }
	        
	        
	        while(us.HP>0 || satan.HP>0) {
	        	b=0;
	       int ccount=0;
	       
	       for(int d= 0; d<20; d++) {
	    	   if(dk.tpdeck[d]!=0) {
	    		   ccount=ccount+1;
	    	   }
	    	   else {
	    		   
	    	   }
	       }
	     
	       System.out.print("����: ");rc.showrelic(relic);rc.showrelic(relic1); rc.showrelic(relic2);System.out.println(""); 	
	       dk.showcard();
	       System.out.println("");
	       
	       
	       int defense=0;
	       System.out.println("��ī���"+us.cardcount);
	       System.out.println("����ī���"+ccount);
	       System.out.println("�����ü��:"+us.HP);
	       System.out.println("����ü��:"+satan.HP);
	       System.out.println("����� ī�带  3�� �����Ͻÿ�. ��ҺҰ� ������ ����!");
	       System.out.println("1.  2.  3.  4.  5. 6.Ȯ��");
	       
	      

	       int attack=0;
	       for(int h=0; h<3; h++) {
	       ch=sc.nextInt();
	       switch(ch) {
	       case 1:
	     	  if(dk.handcard[0]==1) {
	     		  System.out.println("1��ī����");
	     		 attack = attack + 7;
	     		 dk.handcard[0]=0;
	     	  }
	     	  else if (dk.handcard[0]==2) {
	     		 System.out.println("1��ī����");
	     		 defense= defense + 1;
	     		dk.handcard[0]=0;
	     	  }
	     	 else if (dk.handcard[0]==3) {
	     		System.out.println("1��ī����");
	     		 attack = attack + 10;
	    		  defense = defense -2;
	    		  dk.handcard[0]=0;
	    	  }
	     	 else if (dk.handcard[0]==4) {
	     		System.out.println("1��ī����");
	     		attack = attack + 5;
	     		dk.handcard[0]=0;
	    	  }
	     	 else if (dk.handcard[0]==5) {
	     		System.out.println("1��ī����");
	     		defense= defense + 2;
	     		dk.handcard[0]=0;
	    	  }
	     	 else if (dk.handcard[0]==6) {
	     		System.out.println("1��ī����");
	     		attack = attack + 6;
	  		  defense = defense + 2;
	  		dk.handcard[0]=0;
	    	  }
	     	 else if (dk.handcard[1]==7) {
	     		System.out.println("1��ī����");
	    		  attack = attack +3;
	    		  dk.handcard[0]=0;
	    	  }
	     	 else if (dk.handcard[1]==8) {
	     		System.out.println("1��ī����");
	     		defense = defense + 1;
	     		dk.handcard[0]=0;
	    	  }
	     	 else if (dk.handcard[1]==9) {
	     		System.out.println("1��ī����");
	    		  attack= attack + 20;
	    		  dk.handcard[0]=0;
	    	  }
	     	else {
	     		System.out.println("�ٽü����ϼ���");
	    		h--;
	    	  }
	     	  
	     	  break;
	   case 2:
		   if(dk.handcard[1]==1) {
	  		  System.out.println("2��ī����");
	  		 attack = attack + 7;
	  		 dk.handcard[1]=0;
	  	  }
	  	  else if (dk.handcard[1]==2) {
	  		 System.out.println("2��ī����");
	  		 defense= defense + 1;
	  		dk.handcard[1]=0;
	  	  }
	  	 else if (dk.handcard[1]==3) {
	  		System.out.println("2��ī����");
	  		 attack = attack + 10;
	 		  defense = defense -2;
	 		  dk.handcard[1]=0;
	 	  }
	  	 else if (dk.handcard[1]==4) {
	  		System.out.println("2��ī����");
	  		attack = attack + 5;
	  		dk.handcard[1]=0;
	 	  }
	  	 else if (dk.handcard[1]==5) {
	  		System.out.println("2��ī����");
	  		defense= defense + 2;
	  		dk.handcard[1]=0;
	 	  }
	  	 else if (dk.handcard[1]==6) {
	  		System.out.println("2��ī����");
	  		attack = attack + 6;
			  defense = defense + 2;
			dk.handcard[1]=0;
	 	  }
	  	 else if (dk.handcard[1]==7) {
	  		System.out.println("2��ī����");
	 		  attack = attack +3;
	 		  dk.handcard[1]=0;
	 	  }
	  	 else if (dk.handcard[1]==8) {
	  		System.out.println("2��ī����");
	  		defense = defense + 1;
	  		dk.handcard[1]=0;
	 	  }
	  	 else if (dk.handcard[1]==9) {
	  		System.out.println("2��ī����");
	 		  attack= attack + 20;
	 		  dk.handcard[1]=0;
	 	  }  
	  	else  {
	 		System.out.println("�ٽü����ϼ���");
			h--;
		  }
	     	  break;
	     	  
	   case 3:
		   if(dk.handcard[2]==1) {
	  		  System.out.println("3��ī����");
	  		 attack = attack + 7;
	  		 dk.handcard[2]=0;
	  	  }
	  	  else if (dk.handcard[2]==2) {
	  		 System.out.println("3��ī����");
	  		 defense= defense + 1;
	  		dk.handcard[2]=0;
	  	  }
	  	 else if (dk.handcard[2]==3) {
	  		System.out.println("3��ī����");
	  		 attack = attack + 10;
	 		  defense = defense -2;
	 		  dk.handcard[2]=0;
	 	  }
	  	 else if (dk.handcard[2]==4) {
	  		System.out.println("3��ī����");
	  		attack = attack + 5;
	  		dk.handcard[2]=0;
	 	  }
	  	 else if (dk.handcard[2]==5) {
	  		System.out.println("3��ī����");
	  		defense= defense + 2;
	  		dk.handcard[2]=0;
	 	  }
	  	 else if (dk.handcard[2]==6) {
	  		System.out.println("3��ī����");
	  		attack = attack + 6;
			  defense = defense + 2;
			dk.handcard[2]=0;
	 	  }
	  	 else if (dk.handcard[2]==7) {
	  		System.out.println("3��ī����");
	 		  attack = attack +3;
	 		  dk.handcard[2]=0;
	 	  }
	  	 else if (dk.handcard[2]==8) {
	  		System.out.println("3��ī����");
	  		defense = defense + 1;
	  		dk.handcard[2]=0;
	 	  }
	  	 else if (dk.handcard[2]==9) {
	  		System.out.println("3��ī����");
	 		  attack= attack + 20;
	 		  dk.handcard[2]=0;
	 	  }
	  	else  {
	 		System.out.println("�ٽü����ϼ���");
			h--;
		  }
	 	  break;
	   case 4:
		   if(dk.handcard[3]==1) {
	  		  System.out.println("4��ī����");
	  		 attack = attack + 7;
	  		 dk.handcard[3]=0;
	  	  }
	  	  else if (dk.handcard[3]==2) {
	  		 System.out.println("4��ī����");
	  		 defense= defense + 1;
	  		dk.handcard[3]=0;
	  	  }
	  	 else if (dk.handcard[3]==3) {
	  		System.out.println("4��ī����");
	  		 attack = attack + 10;
	 		  defense = defense -2;
	 		  dk.handcard[3]=0;
	 	  }
	  	 else if (dk.handcard[3]==4) {
	  		System.out.println("4��ī����");
	  		attack = attack + 5;
	  		dk.handcard[3]=0;
	 	  }
	  	 else if (dk.handcard[3]==5) {
	  		System.out.println("4��ī����");
	  		defense= defense + 2;
	  		dk.handcard[3]=0;
	 	  }
	  	 else if (dk.handcard[3]==6) {
	  		System.out.println("4��ī����");
	  		attack = attack + 6;
			  defense = defense + 2;
			dk.handcard[3]=0;
	 	  }
	  	 else if (dk.handcard[3]==7) {
	  		System.out.println("4��ī����");
	 		  attack = attack +3;
	 		  dk.handcard[3]=0;
	 	  }
	  	 else if (dk.handcard[3]==8) {
	  		System.out.println("4��ī����");
	  		defense = defense + 1;
	  		dk.handcard[3]=0;
	 	  }
	  	 else if (dk.handcard[3]==9) {
	  		System.out.println("4��ī����");
	 		  attack= attack + 20;
	 		  dk.handcard[3]=0;
	 	  }
	  	else if (dk.handcard[3]==0) {
	 		System.out.println("�ٽü����ϼ���");
			h--;
		  }
	 	  break;
	   case 5:
		   if(dk.handcard[4]==1) {
	  		  System.out.println("5��ī����");
	  		 attack = attack + 7;
	  		 dk.handcard[4]=0;
	  	  }
	  	  else if (dk.handcard[4]==2) {
	  		 System.out.println("5��ī����");
	  		 defense= defense + 1;
	  		dk.handcard[4]=0;
	  	  }
	  	 else if (dk.handcard[4]==3) {
	  		System.out.println("5��ī����");
	  		 attack = attack + 10;
	 		  defense = defense -2;
	 		  dk.handcard[4]=0;
	 	  }
	  	 else if (dk.handcard[4]==4) {
	  		System.out.println("5��ī����");
	  		attack = attack + 5;
	  		dk.handcard[4]=0;
	 	  }
	  	 else if (dk.handcard[4]==5) {
	  		System.out.println("5��ī����");
	  		defense= defense + 2;
	  		dk.handcard[4]=0;
	 	  }
	  	 else if (dk.handcard[4]==6) {
	  		System.out.println("5��ī����");
	  		attack = attack + 6;
			  defense = defense + 2;
			dk.handcard[4]=0;
	 	  }
	  	 else if (dk.handcard[4]==7) {
	  		System.out.println("5��ī����");
	 		  attack = attack +3;
	 		  dk.handcard[4]=0;
	 	  }
	  	 else if (dk.handcard[4]==8) {
	  		System.out.println("5��ī����");
	  		defense = defense + 1;
	  		dk.handcard[4]=0;
	 	  }
	  	 else if (dk.handcard[4]==9) {
	  		System.out.println("5��ī����");
	 		  attack= attack + 20;
	 		  dk.handcard[4]=0;
	 	  }
	  	else  {
	 		System.out.println("�ٽü����ϼ���");
			h--;
		  }
	 	  break;
	   case 6:
		   System.out.println("Ȯ��");
		   break;
	 	  default :
	 		 System.out.println("�ٽü����ϼ���");
	 		 h--;
	 		  break;
	       
	       }
	       }
	       
	       System.out.println("����� ����!");
	       satan.HP = satan.HP - attack;
	       System.out.println("����"+attack+"��ŭ�� ���ظ� �Ծ���.");
	       if(satan.HP<=0) {
	    	   System.out.println("������ ��������!");
	    	   System.out.println("�����"+satan.em+"��ŭ�� ���� ȹ���Ͽ���.");
	    	   us.money = us.money+satan.em;
	    	   boss=1;
	    	   break;
	       }
	       
	       int beh = (int)(Math.random()*10);
	       if(beh<9) {
	    	   System.out.println("������ ����!");
	    	   us.HP = us.HP + defense - 15; 
	    	   System.out.println("�����"+-(defense - 15)+"��ŭ�� ���ظ� �Ծ���.");
	       }
	       else {
	    	   System.out.println("������ �ϰ�!");
	    	   us.HP = us.HP + defense - 40;
	    	   System.out.println("�����"+-(defense - 40)+"��ŭ�� ���ظ� �Ծ���.");
	       }
	       
	     
	       if(us.HP<=0) {
	    	   System.out.println("����� ��������!");
	    	   break;
	       }
	      attack=0;
	      defense = 0;
	      ccount=0;
	       for(int d= 0; d<20; d++) {
	    	   if(dk.tpdeck[d]!=0) {
	    		   ccount=ccount+1;
	    	   }
	    	   else {
	    		   
	    	   }
	       }
	       System.out.println("���Ⳳ������"+ccount);
	      //����ī��� 3�� �̸��϶�
	       if(ccount<3) {
	    	   dk.setdeck();               
	           
	           
	    	   for(int u=0; u<5; u++) {
	    		   for(int y=0; y<20; y++) {
	    			 if ( dk.handcard[u]== dk.tpdeck[y]) {
	    				 dk.tpdeck[y]=0;
	    				 break;
	    			 }
	    			 else {
	    				 
	    			 }
	    			 
	    		   }
	    		   
	    	   } 
	    	   
	    	   dk.shuffle(dk.tpdeck, 15);
	    	   
	       }
	       
	    
	       b=0;
	       //�󽽷����� üũ�ϰ� ���ڸ��� ī��ֱ�  
	       for(int k=0; k<dk.handcard.length; k++) { //ī�� 5��̰� ����

	    	   if(dk.handcard[k]==0) {
	    	   
	   		if(dk.tpdeck[b]!=0) {
	       		dk.handcard[k]=dk.tpdeck[b];
	       		dk.tpdeck[b]=0;
	       		b++;
	       		
	       		
	       	}
	       	else if(dk.tpdeck[b]==0){
	       		b++;
	       		k--;
	       		
	       	}	
	   		
	    	   }
	    	   else {
	    		   
	    	   }
	   		
	   }
			}//�����ݺ� ������ ���ȣ
        }
        
     
        
        
        
        
        
        //���� �޻󰥷��濡�� ���ΰ����
        else {
    		System.out.println("���簡�����ִ�ī���");
			for(int z=0; z<20; z++) {
				if(dk.deck[z]==1) {
				
					System.out.println("����");
				}
				else if (dk.deck[z]==2)	{
					System.out.println("���й��");
				}
	else if (dk.deck[z]==3)	{
		System.out.println("�Ǹ����ϰ�");
				}
	else if (dk.deck[z]==4)	{
		System.out.println("���");
	}
	else if (dk.deck[z]==5)	{
		System.out.println("ȸ��");
	}
	else if (dk.deck[z]==6)	{
		System.out.println("ȸ�ǻ��");
	}
	else if (dk.deck[z]==7)	{
		System.out.println("�ĸ���");
	}
	else if (dk.deck[z]==8)	{
		System.out.println("����");
	}
	else if (dk.deck[z]==9)	{
		System.out.println("���̾�");
	}
					
			}
			try{Thread.sleep(2000);
			}catch(Exception e){}
        	//�������� ����
			System.out.println("========================����========================");
        	int aa=0; int bb=0; int cc=0; int dd=0; int ee=0; 
        	System.out.println("������:"+us.money);
        	System.out.println("�������! ���°� ���� ���ֽ��ϴ�!");
        	System.out.println("1.����ī��:30��   2.���ī��:10��  3.����Ư��ī��:80��   4.��Ŀī��:200��   5.�����Ǻ���:150��   6.������");
        	while(ch!=6) {
        		
        ch=sc.nextInt();
        switch(ch) {
        case 1:
        	if(aa==0) {
        	if(us.money>=30) {
        if(us.job==1) {
        	System.out.println("ī�带�����߽��ϴ�");
        	 us.cardcount= us.cardcount+1;
        	dk.deck[10]=1; aa=1;
        	us.money=us.money-30;
        }
        else if(us.job==2) {
        	System.out.println("ī�带�����߽��ϴ�");
        	 us.cardcount= us.cardcount+1;
        	dk.deck[10]=4; aa=1;
        	us.money=us.money-30;
        }
        else if(us.job==3) {
        	System.out.println("ī�带�����߽��ϴ�");
        	 us.cardcount= us.cardcount+1;
        	dk.deck[10]=7; aa=1;
        	us.money=us.money-30;
        }
        	}else {
        		System.out.println("���̺����մϴ�.");
        	}
        	}else {System.out.println("��������!");}
        	
        	break;
        	
case 2:
	if(bb==0) {
	if(us.money>=10) {
	if(us.job==1) {
		System.out.println("ī�带�����߽��ϴ�");
		 us.cardcount= us.cardcount+1;   	dk.deck[11]=2;bb=1;
    	us.money=us.money-10;
    }
    else if(us.job==2) {
    	System.out.println("ī�带�����߽��ϴ�");
    	 us.cardcount= us.cardcount+1;
    	dk.deck[11]=5;bb=1;
    	us.money=us.money-10;
    }
    else if(us.job==3) {
    	System.out.println("ī�带�����߽��ϴ�");
    	 us.cardcount= us.cardcount+1;
    	dk.deck[11]=8;bb=1;
    	us.money=us.money-10;
    }
	}
    else {
		System.out.println("���̺����մϴ�.");
	}}else {System.out.println("��������!");}

        	break;
case 3:
	if(cc==0) {
	if(us.money>=80) {
		if(us.job==1) {
			System.out.println("ī�带�����߽��ϴ�");
			 us.cardcount= us.cardcount+1;
	    	dk.deck[12]=3;cc=1;
	    	us.money=us.money-80;
	    }
	    else if(us.job==2) {
	    	System.out.println("ī�带�����߽��ϴ�");
	    	 us.cardcount= us.cardcount+1;
	    	dk.deck[12]=6;cc=1;
	    	us.money=us.money-80;
	    }
	    else if(us.job==3) {
	    	System.out.println("ī�带�����߽��ϴ�");
	    	 us.cardcount= us.cardcount+1;
	    	dk.deck[12]=9;cc=1;
	    	us.money=us.money-80;
	    }
		}
	    else {
			System.out.println("���̺����մϴ�.");
		}}else {System.out.println("��������");}
	break;
	
case 4:
	if(us.money>=200) {
		System.out.println("�������������� ��ձ� ��վ�!");
		System.out.println("�ڳ� ��𰡼��� �����ϴ°� �����ϰԳ� ������");
		 
	us.money=us.money-200;
	break;
	}else {
		System.out.println("���̺����մϴ�.");
	}
	break;
	
case 5:
	if(ee==0) {
	if(us.money>=150) {
		System.out.println("�����������߽��ϴ�");
		ee=1;
		us.cardcount=us.cardcount+1;
		us.HP=us.HP+20;
		us.money=us.money-150;
		relic1[1]=1;
		if(us.job==1) {
	    	dk.deck[13]=3;
	    }
	    else if(us.job==2) {
	    	dk.deck[13]=6;	
	    }
	    else if(us.job==3) {
	    	dk.deck[13]=9;
	    }
	}else {
		System.out.println("���̺����մϴ�.");
	}}else {System.out.println("��������ϴ�!");}
	break;
case 6:
	System.out.println("����� �����ϴ�.");
	break;
        default:
        	System.out.println("����� ������!");
        	break;
        
   
        }
        	
        	
        	}
    		System.out.println("���簡�����ִ�ī���");
			for(int z=0; z<20; z++) {
				if(dk.deck[z]==1) {
				
					System.out.println("����");
				}
				else if (dk.deck[z]==2)	{
					System.out.println("���й��");
				}
	else if (dk.deck[z]==3)	{
		System.out.println("�Ǹ����ϰ�");
				}
	else if (dk.deck[z]==4)	{
		System.out.println("���");
	}
	else if (dk.deck[z]==5)	{
		System.out.println("ȸ��");
	}
	else if (dk.deck[z]==6)	{
		System.out.println("ȸ�ǻ��");
	}
	else if (dk.deck[z]==7)	{
		System.out.println("�ĸ���");
	}
	else if (dk.deck[z]==8)	{
		System.out.println("����");
	}
	else if (dk.deck[z]==9)	{
		System.out.println("���̾�");
	}
					
			}
			try{Thread.sleep(2000);
			}catch(Exception e){}
        	
        	
        	
        	
        	
        	//��ٷǴٰ� ����
        	
        	
        	System.out.println("===============��������===============");
			System.out.println("���հ� ���� �߻�!");
			enemy satan = new enemy();
			satan.monname="���ձ� �屳";
			satan.HP=50;
			satan.em=500;
			satan.monnum=0;
			dk.setdeck();               //deck�� tpdeck�� ����
	        dk.shuffle(dk.tpdeck, 15);	//ī�����
	       
	        b=0;
	        for(int k=0; k<dk.handcard.length; k++) { //ī�� 5��̰� ����
	        	
	        	
	        	
	        		if(dk.tpdeck[b]!=0) {
	            		dk.handcard[k]=dk.tpdeck[b];
	            		dk.tpdeck[b]=0;
	            		b++;
	     		
	            	}
	            	else if(dk.tpdeck[b]==0){
	            		b++;
	            		k--;	
	            	}	
	        }
	        
	        
	        while(us.HP>0 || satan.HP>0) {
	        	b=0;
	       int ccount=0;
	       
	       for(int d= 0; d<20; d++) {
	    	   if(dk.tpdeck[d]!=0) {
	    		   ccount=ccount+1;
	    	   }
	    	   else {
	    		   
	    	   }
	       }
	     
	       System.out.print("����: ");rc.showrelic(relic);rc.showrelic(relic1); rc.showrelic(relic2);System.out.println("");  	
	       dk.showcard();
	       System.out.println("");
	       
	       
	       int defense=0;
	       System.out.println("��ī���"+us.cardcount);
	       System.out.println("����ī���"+ccount);
	       System.out.println("�����ü��:"+us.HP);
	       System.out.println("����ü��:"+satan.HP);
	       System.out.println("����� ī�带  3�� �����Ͻÿ�. ��ҺҰ� ������ ����!");
	       System.out.println("1.  2.  3.  4.  5. 6.Ȯ��");
	       
	     

	       
	       int attack=0;
	       for(int h=0; h<3; h++) {
	       ch=sc.nextInt();
	       switch(ch) {
	       case 1:
	     	  if(dk.handcard[0]==1) {
	     		  System.out.println("1��ī����");
	     		 attack = attack + 7;
	     		 dk.handcard[0]=0;
	     	  }
	     	  else if (dk.handcard[0]==2) {
	     		 System.out.println("1��ī����");
	     		 defense= defense + 1;
	     		dk.handcard[0]=0;
	     	  }
	     	 else if (dk.handcard[0]==3) {
	     		System.out.println("1��ī����");
	     		 attack = attack + 10;
	    		  defense = defense -2;
	    		  dk.handcard[0]=0;
	    	  }
	     	 else if (dk.handcard[0]==4) {
	     		System.out.println("1��ī����");
	     		attack = attack + 5;
	     		dk.handcard[0]=0;
	    	  }
	     	 else if (dk.handcard[0]==5) {
	     		System.out.println("1��ī����");
	     		defense= defense + 2;
	     		dk.handcard[0]=0;
	    	  }
	     	 else if (dk.handcard[0]==6) {
	     		System.out.println("1��ī����");
	     		attack = attack + 6;
	  		  defense = defense + 2;
	  		dk.handcard[0]=0;
	    	  }
	     	 else if (dk.handcard[1]==7) {
	     		System.out.println("1��ī����");
	    		  attack = attack +3;
	    		  dk.handcard[0]=0;
	    	  }
	     	 else if (dk.handcard[1]==8) {
	     		System.out.println("1��ī����");
	     		defense = defense + 1;
	     		dk.handcard[0]=0;
	    	  }
	     	 else if (dk.handcard[1]==9) {
	     		System.out.println("1��ī����");
	    		  attack= attack + 20;
	    		  dk.handcard[0]=0;
	    	  }
	     	else {
	     		System.out.println("�ٽü����ϼ���");
	    		h--;
	    	  }
	     	  
	     	  break;
	   case 2:
		   if(dk.handcard[1]==1) {
	  		  System.out.println("2��ī����");
	  		 attack = attack + 7;
	  		 dk.handcard[1]=0;
	  	  }
	  	  else if (dk.handcard[1]==2) {
	  		 System.out.println("2��ī����");
	  		 defense= defense + 1;
	  		dk.handcard[1]=0;
	  	  }
	  	 else if (dk.handcard[1]==3) {
	  		System.out.println("2��ī����");
	  		 attack = attack + 10;
	 		  defense = defense -2;
	 		  dk.handcard[1]=0;
	 	  }
	  	 else if (dk.handcard[1]==4) {
	  		System.out.println("2��ī����");
	  		attack = attack + 5;
	  		dk.handcard[1]=0;
	 	  }
	  	 else if (dk.handcard[1]==5) {
	  		System.out.println("2��ī����");
	  		defense= defense + 2;
	  		dk.handcard[1]=0;
	 	  }
	  	 else if (dk.handcard[1]==6) {
	  		System.out.println("2��ī����");
	  		attack = attack + 6;
			  defense = defense + 2;
			dk.handcard[1]=0;
	 	  }
	  	 else if (dk.handcard[1]==7) {
	  		System.out.println("2��ī����");
	 		  attack = attack +3;
	 		  dk.handcard[1]=0;
	 	  }
	  	 else if (dk.handcard[1]==8) {
	  		System.out.println("2��ī����");
	  		defense = defense + 1;
	  		dk.handcard[1]=0;
	 	  }
	  	 else if (dk.handcard[1]==9) {
	  		System.out.println("2��ī����");
	 		  attack= attack + 20;
	 		  dk.handcard[1]=0;
	 	  }  
	  	else  {
	 		System.out.println("�ٽü����ϼ���");
			h--;
		  }
	     	  break;
	     	  
	   case 3:
		   if(dk.handcard[2]==1) {
	  		  System.out.println("3��ī����");
	  		 attack = attack + 7;
	  		 dk.handcard[2]=0;
	  	  }
	  	  else if (dk.handcard[2]==2) {
	  		 System.out.println("3��ī����");
	  		 defense= defense + 1;
	  		dk.handcard[2]=0;
	  	  }
	  	 else if (dk.handcard[2]==3) {
	  		System.out.println("3��ī����");
	  		 attack = attack + 10;
	 		  defense = defense -2;
	 		  dk.handcard[2]=0;
	 	  }
	  	 else if (dk.handcard[2]==4) {
	  		System.out.println("3��ī����");
	  		attack = attack + 5;
	  		dk.handcard[2]=0;
	 	  }
	  	 else if (dk.handcard[2]==5) {
	  		System.out.println("3��ī����");
	  		defense= defense + 2;
	  		dk.handcard[2]=0;
	 	  }
	  	 else if (dk.handcard[2]==6) {
	  		System.out.println("3��ī����");
	  		attack = attack + 6;
			  defense = defense + 2;
			dk.handcard[2]=0;
	 	  }
	  	 else if (dk.handcard[2]==7) {
	  		System.out.println("3��ī����");
	 		  attack = attack +3;
	 		  dk.handcard[2]=0;
	 	  }
	  	 else if (dk.handcard[2]==8) {
	  		System.out.println("3��ī����");
	  		defense = defense + 1;
	  		dk.handcard[2]=0;
	 	  }
	  	 else if (dk.handcard[2]==9) {
	  		System.out.println("3��ī����");
	 		  attack= attack + 20;
	 		  dk.handcard[2]=0;
	 	  }
	  	else  {
	 		System.out.println("�ٽü����ϼ���");
			h--;
		  }
	 	  break;
	   case 4:
		   if(dk.handcard[3]==1) {
	  		  System.out.println("4��ī����");
	  		 attack = attack + 7;
	  		 dk.handcard[3]=0;
	  	  }
	  	  else if (dk.handcard[3]==2) {
	  		 System.out.println("4��ī����");
	  		 defense= defense + 1;
	  		dk.handcard[3]=0;
	  	  }
	  	 else if (dk.handcard[3]==3) {
	  		System.out.println("4��ī����");
	  		 attack = attack + 10;
	 		  defense = defense -2;
	 		  dk.handcard[3]=0;
	 	  }
	  	 else if (dk.handcard[3]==4) {
	  		System.out.println("4��ī����");
	  		attack = attack + 5;
	  		dk.handcard[3]=0;
	 	  }
	  	 else if (dk.handcard[3]==5) {
	  		System.out.println("4��ī����");
	  		defense= defense + 2;
	  		dk.handcard[3]=0;
	 	  }
	  	 else if (dk.handcard[3]==6) {
	  		System.out.println("4��ī����");
	  		attack = attack + 6;
			  defense = defense + 2;
			dk.handcard[3]=0;
	 	  }
	  	 else if (dk.handcard[3]==7) {
	  		System.out.println("4��ī����");
	 		  attack = attack +3;
	 		  dk.handcard[3]=0;
	 	  }
	  	 else if (dk.handcard[3]==8) {
	  		System.out.println("4��ī����");
	  		defense = defense + 1;
	  		dk.handcard[3]=0;
	 	  }
	  	 else if (dk.handcard[3]==9) {
	  		System.out.println("4��ī����");
	 		  attack= attack + 20;
	 		  dk.handcard[3]=0;
	 	  }
	  	else if (dk.handcard[3]==0) {
	 		System.out.println("�ٽü����ϼ���");
			h--;
		  }
	 	  break;
	   case 5:
		   if(dk.handcard[4]==1) {
	  		  System.out.println("5��ī����");
	  		 attack = attack + 7;
	  		 dk.handcard[4]=0;
	  	  }
	  	  else if (dk.handcard[4]==2) {
	  		 System.out.println("5��ī����");
	  		 defense= defense + 1;
	  		dk.handcard[4]=0;
	  	  }
	  	 else if (dk.handcard[4]==3) {
	  		System.out.println("5��ī����");
	  		 attack = attack + 10;
	 		  defense = defense -2;
	 		  dk.handcard[4]=0;
	 	  }
	  	 else if (dk.handcard[4]==4) {
	  		System.out.println("5��ī����");
	  		attack = attack + 5;
	  		dk.handcard[4]=0;
	 	  }
	  	 else if (dk.handcard[4]==5) {
	  		System.out.println("5��ī����");
	  		defense= defense + 2;
	  		dk.handcard[4]=0;
	 	  }
	  	 else if (dk.handcard[4]==6) {
	  		System.out.println("5��ī����");
	  		attack = attack + 6;
			  defense = defense + 2;
			dk.handcard[4]=0;
	 	  }
	  	 else if (dk.handcard[4]==7) {
	  		System.out.println("5��ī����");
	 		  attack = attack +3;
	 		  dk.handcard[4]=0;
	 	  }
	  	 else if (dk.handcard[4]==8) {
	  		System.out.println("5��ī����");
	  		defense = defense + 1;
	  		dk.handcard[4]=0;
	 	  }
	  	 else if (dk.handcard[4]==9) {
	  		System.out.println("5��ī����");
	 		  attack= attack + 20;
	 		  dk.handcard[4]=0;
	 	  }
	  	else  {
	 		System.out.println("�ٽü����ϼ���");
			h--;
		  }
	 	  break;
	   case 6:
		   System.out.println("Ȯ��");
		   break;
	 	  default :
	 		 System.out.println("�ٽü����ϼ���");
	 		 h--;
	 		  break;
	       
	       }
	       }
	       
	       System.out.println("����� ����!");
	       satan.HP = satan.HP - attack;
	       System.out.println("����"+attack+"��ŭ�� ���ظ� �Ծ���.");
	       if(satan.HP<=0) {
	    	   System.out.println("������ ��������!");
	    	   System.out.println("�����"+satan.em+"��ŭ�� ���� ȹ���Ͽ���.");
	    	   us.money = us.money+satan.em;
	    	   boss=1;
	    	   break;
	       }

	       int beh = (int)(Math.random()*10);
	       if(beh<9) {
	    	   System.out.println("������ ����!");
	    	   us.HP = us.HP + defense - 15; 
	    	   System.out.println("�����"+-(defense - 15)+"��ŭ�� ���ظ� �Ծ���.");
	       }
	       else {
	    	   System.out.println("������ �ϰ�!");
	    	   us.HP = us.HP + defense - 40;
	    	   System.out.println("�����"+-(defense - 40)+"��ŭ�� ���ظ� �Ծ���.");
	       }
	       
	     
	       if(us.HP<=0) {
	    	   System.out.println("����� ��������!");
	    	   break;
	       }
	      attack=0;
	      defense = 0;
	      ccount=0;
	       for(int d= 0; d<20; d++) {
	    	   if(dk.tpdeck[d]!=0) {
	    		   ccount=ccount+1;
	    	   }
	    	   else {
	    		   
	    	   }
	       }
	       System.out.println("���Ⳳ������"+ccount);
	      //����ī��� 3�� �̸��϶�
	       if(ccount<3) {
	    	   dk.setdeck();               
	           
	           
	    	   for(int u=0; u<5; u++) {
	    		   for(int y=0; y<20; y++) {
	    			 if ( dk.handcard[u]== dk.tpdeck[y]) {
	    				 dk.tpdeck[y]=0;
	    				 break;
	    			 }
	    			 else {
	    				 
	    			 }
	    			 
	    		   }
	    		   
	    	   } 
	    	   
	    	   dk.shuffle(dk.tpdeck, 15);
	    	   
	       }
	       
	    
	       b=0;
	       //�󽽷����� üũ�ϰ� ���ڸ��� ī��ֱ�  
	       for(int k=0; k<dk.handcard.length; k++) { //ī�� 5��̰� ����

	    	   if(dk.handcard[k]==0) {
	    	   
	   		if(dk.tpdeck[b]!=0) {
	       		dk.handcard[k]=dk.tpdeck[b];
	       		dk.tpdeck[b]=0;
	       		b++;
	       		
	       		
	       	}
	       	else if(dk.tpdeck[b]==0){
	       		b++;
	       		k--;
	       		
	       	}	
	   		
	    	   }
	    	   else {
	    		   
	    	   }
	   		
	   }
	   
	   
	     

			}//�����ݺ� ������ ���ȣ
        	
        	
        	
        	
        	
        	
        	
        }
        
		
		
		
	}
	//�������å

	
	
	else {
		mylocation=22;
		//����
		System.out.println("========================����========================");
		int aa=0; int bb=0; int cc=0; int dd=0; int ee=0; 
		
    	System.out.println("������:"+us.money);
    	System.out.println("�������! ���°� ���� ���ֽ��ϴ�!");
    	System.out.println("1.����ī��:30��   2.���ī��:10��  3.����Ư��ī��:80��   4.��Ŀī��:200��   5.�����Ǻ���:150��   6.������");
    	while(ch!=6) {
    		
    ch=sc.nextInt();
    switch(ch) {
    case 1:
    	if(aa==0) {
    	if(us.money>=30) {
    if(us.job==1) {
    	System.out.println("ī�带�����߽��ϴ�");
    	 us.cardcount= us.cardcount+1;
    	dk.deck[10]=1; aa=1;
    	us.money=us.money-30;
    }
    else if(us.job==2) {
    	System.out.println("ī�带�����߽��ϴ�");
    	 us.cardcount= us.cardcount+1;
    	dk.deck[10]=4; aa=1;
    	us.money=us.money-30;
    }
    else if(us.job==3) {
    	System.out.println("ī�带�����߽��ϴ�");
    	 us.cardcount= us.cardcount+1;
    	dk.deck[10]=7; aa=1;
    	us.money=us.money-30;
    }
    	}else {
    		System.out.println("���̺����մϴ�.");
    	}
    	}else {System.out.println("��������!");}
    	
    	break;
    	
case 2:
if(bb==0) {
if(us.money>=10) {
if(us.job==1) {
	System.out.println("ī�带�����߽��ϴ�");
	 us.cardcount= us.cardcount+1;
	dk.deck[11]=2;bb=1;
	us.money=us.money-10;
}
else if(us.job==2) {
	System.out.println("ī�带�����߽��ϴ�");
	 us.cardcount= us.cardcount+1;
	dk.deck[11]=5;bb=1;
	us.money=us.money-10;
}
else if(us.job==3) {
	System.out.println("ī�带�����߽��ϴ�");
	 us.cardcount= us.cardcount+1;
	dk.deck[11]=8;bb=1;
	us.money=us.money-10;
}
}
else {
	System.out.println("���̺����մϴ�.");
}}else {System.out.println("��������!");}

    	break;
case 3:
if(cc==0) {
if(us.money>=80) {
	if(us.job==1) {
		System.out.println("ī�带�����߽��ϴ�");
		 us.cardcount= us.cardcount+1;
    	dk.deck[12]=3;cc=1;
    	us.money=us.money-80;
    }
    else if(us.job==2) {
    	System.out.println("ī�带�����߽��ϴ�");
    	 us.cardcount= us.cardcount+1;
    	dk.deck[12]=6;cc=1;
    	us.money=us.money-80;
    }
    else if(us.job==3) {
    	System.out.println("ī�带�����߽��ϴ�");
    	 us.cardcount= us.cardcount+1;
    	dk.deck[12]=9;cc=1;
    	us.money=us.money-80;
    }
	}
    else {
		System.out.println("���̺����մϴ�.");
	}}else {System.out.println("��������");}
break;

case 4:
if(us.money>=200) {
	System.out.println("�������������� ��ձ� ��վ�!");
	System.out.println("�ڳ� ��𰡼��� �����ϴ°� �����ϰԳ� ������");
	 
us.money=us.money-200;
break;
}else {
	System.out.println("���̺����մϴ�.");
}
break;

case 5:
if(ee==0) {
if(us.money>=150) {
	System.out.println("�����������߽��ϴ�");
	ee=1;
	us.cardcount=us.cardcount+1;
	us.HP=us.HP+20;
	us.money=us.money-150;
	relic1[1]=1;
	if(us.job==1) {
    	dk.deck[13]=3;
    }
    else if(us.job==2) {
    	dk.deck[13]=6;	
    }
    else if(us.job==3) {
    	dk.deck[13]=9;
    }
}else {
	System.out.println("���̺����մϴ�.");
}}else {System.out.println("��������ϴ�!");}
break;
case 6:
System.out.println("����� �����ϴ�.");
break;
    default:
    	System.out.println("����� ������!");
    	break; 
    }		    	
    	}			
		mp.mapping(mylocation);
		
		
		
		System.out.println("���簡�����ִ�ī���");
		for(int z=0; z<20; z++) {
			if(dk.deck[z]==1) {
			
				System.out.println("����");
			}
			else if (dk.deck[z]==2)	{
				System.out.println("���й��");
			}
else if (dk.deck[z]==3)	{
	System.out.println("�Ǹ����ϰ�");
			}
else if (dk.deck[z]==4)	{
	System.out.println("���");
}
else if (dk.deck[z]==5)	{
	System.out.println("ȸ��");
}
else if (dk.deck[z]==6)	{
	System.out.println("ȸ�ǻ��");
}
else if (dk.deck[z]==7)	{
	System.out.println("�ĸ���");
}
else if (dk.deck[z]==8)	{
	System.out.println("����");
}
else if (dk.deck[z]==9)	{
	System.out.println("���̾�");
}
				
		}
		try{Thread.sleep(2000);
		}catch(Exception e){}
    	
		mp.mapping(mylocation);
		System.out.println("���� �� ���ΰ�?(���ڳ�Ư�������Է½� �����ϰ� 2�̻� ���ڴ� 2�����)");
		System.out.println("1.�̺�Ʈ  2.�� ");
		ch=sc.nextInt();
		if(ch==1) {
			mylocation=32;
			//�̺�Ʈ
			System.out.println("�� �� ���� ������ �ִ� �̰��� �鸦���ΰ�?");
			System.out.println("1.�鸥��  2.�׳ɰ���");
			ch=sc.nextInt();
			if(ch==1) {
				System.out.println("������ ���ϴ�.");
				int no;
				no=(int)(Math.random()*100);
				if(no<15) {
					System.out.println("�������� ������ �߰��߽��ϴ�!");
					us.HP=us.HP+100;
					relic2[2]=1;
				}
				else if(no<30) {
					System.out.println("�������� �ູ�� �޾ҽ��ϴ�!");
					System.out.println("ü��ȸ��!");
					us.HP=us.HP+15;
				}
				else {
					us.HP=us.HP-150;
					System.out.println("�������� ���ָ� �޾ҽ��ϴ�!");
					System.out.println("ü���� ���Դϴ�! 150�� ������!");
					System.out.println("�����ü��:"+us.HP);
					
					if(us.HP<=0) {
						break;
					}
				}
				
			}
			else {
				System.out.println("����� �׳� �������ϴ�.");
			}
			
			
			
			
			
			mp.mapping(mylocation);
			System.out.println("���� �� ���ΰ�?(���ڳ�Ư�������Է½� �����ϰ� 2�̻� ���ڴ� 2�����)");
			System.out.println("1.���ʸ�  2.�����ʸ�");
			ch=sc.nextInt();
			if(ch==1) {
				mylocation=41;
				//����Ʋ
				System.out.println("��Ʋ");
				 System.out.println("===============�Ϲݸ�===============");
					System.out.println("���ձ� �屳�� ���� �߻�!");
					enemy mon1 = new enemy();
				       mon1.monname="���ձ� �屳";
				       mon1.HP=15;
				       mon1.em=20;
				       mon1.monnum=2;
					dk.setdeck();               //deck�� tpdeck�� ����
			        dk.shuffle(dk.tpdeck, 15);	//ī�����
			       
			      int  b=0;
			        for(int k=0; k<dk.handcard.length; k++) { //ī�� 5��̰� ����
			        	
			        	
			        	
			        		if(dk.tpdeck[b]!=0) {
			            		dk.handcard[k]=dk.tpdeck[b];
			            		dk.tpdeck[b]=0;
			            		b++;
			     		
			            	}
			            	else if(dk.tpdeck[b]==0){
			            		b++;
			            		k--;	
			            	}	
			        }
			        
			        
			        while(us.HP>0 || mon1.HP>0) {
			        	b=0;
			       int ccount=0;
			       
			       for(int d= 0; d<20; d++) {
			    	   if(dk.tpdeck[d]!=0) {
			    		   ccount=ccount+1;
			    	   }
			    	   else {
			    		   
			    	   }
			       }
			     
			       System.out.print("����: ");rc.showrelic(relic);rc.showrelic(relic1); rc.showrelic(relic2);System.out.println(""); 	
			       dk.showcard();
			       System.out.println("");
			       
			       
			       int defense=0;
			       System.out.println("��ī���"+us.cardcount);
			       System.out.println("����ī���"+ccount);
			       System.out.println("�����ü��:"+us.HP);
			       System.out.println("����ü��:"+mon1.HP);
			       System.out.println("����� ī�带  3�� �����Ͻÿ�. ��ҺҰ� ������ ����!");
			       System.out.println("1.  2.  3.  4.  5. 6.Ȯ��");
			       
			      

			       
			       int attack=0;
			       for(int h=0; h<3; h++) {
			       ch=sc.nextInt();
			       switch(ch) {
			       case 1:
			     	  if(dk.handcard[0]==1) {
			     		  System.out.println("1��ī����");
			     		 attack = attack + 7;
			     		 dk.handcard[0]=0;
			     	  }
			     	  else if (dk.handcard[0]==2) {
			     		 System.out.println("1��ī����");
			     		 defense= defense + 1;
			     		dk.handcard[0]=0;
			     	  }
			     	 else if (dk.handcard[0]==3) {
			     		System.out.println("1��ī����");
			     		 attack = attack + 10;
			    		  defense = defense -2;
			    		  dk.handcard[0]=0;
			    	  }
			     	 else if (dk.handcard[0]==4) {
			     		System.out.println("1��ī����");
			     		attack = attack + 5;
			     		dk.handcard[0]=0;
			    	  }
			     	 else if (dk.handcard[0]==5) {
			     		System.out.println("1��ī����");
			     		defense= defense + 2;
			     		dk.handcard[0]=0;
			    	  }
			     	 else if (dk.handcard[0]==6) {
			     		System.out.println("1��ī����");
			     		attack = attack + 6;
			  		  defense = defense + 2;
			  		dk.handcard[0]=0;
			    	  }
			     	 else if (dk.handcard[1]==7) {
			     		System.out.println("1��ī����");
			    		  attack = attack +3;
			    		  dk.handcard[0]=0;
			    	  }
			     	 else if (dk.handcard[1]==8) {
			     		System.out.println("1��ī����");
			     		defense = defense + 1;
			     		dk.handcard[0]=0;
			    	  }
			     	 else if (dk.handcard[1]==9) {
			     		System.out.println("1��ī����");
			    		  attack= attack + 20;
			    		  dk.handcard[0]=0;
			    	  }
			     	else {
			     		System.out.println("�ٽü����ϼ���");
			    		h--;
			    	  }
			     	  
			     	  break;
			   case 2:
				   if(dk.handcard[1]==1) {
			  		  System.out.println("2��ī����");
			  		 attack = attack + 7;
			  		 dk.handcard[1]=0;
			  	  }
			  	  else if (dk.handcard[1]==2) {
			  		 System.out.println("2��ī����");
			  		 defense= defense + 1;
			  		dk.handcard[1]=0;
			  	  }
			  	 else if (dk.handcard[1]==3) {
			  		System.out.println("2��ī����");
			  		 attack = attack + 10;
			 		  defense = defense -2;
			 		  dk.handcard[1]=0;
			 	  }
			  	 else if (dk.handcard[1]==4) {
			  		System.out.println("2��ī����");
			  		attack = attack + 5;
			  		dk.handcard[1]=0;
			 	  }
			  	 else if (dk.handcard[1]==5) {
			  		System.out.println("2��ī����");
			  		defense= defense + 2;
			  		dk.handcard[1]=0;
			 	  }
			  	 else if (dk.handcard[1]==6) {
			  		System.out.println("2��ī����");
			  		attack = attack + 6;
					  defense = defense + 2;
					dk.handcard[1]=0;
			 	  }
			  	 else if (dk.handcard[1]==7) {
			  		System.out.println("2��ī����");
			 		  attack = attack +3;
			 		  dk.handcard[1]=0;
			 	  }
			  	 else if (dk.handcard[1]==8) {
			  		System.out.println("2��ī����");
			  		defense = defense + 1;
			  		dk.handcard[1]=0;
			 	  }
			  	 else if (dk.handcard[1]==9) {
			  		System.out.println("2��ī����");
			 		  attack= attack + 20;
			 		  dk.handcard[1]=0;
			 	  }  
			  	else  {
			 		System.out.println("�ٽü����ϼ���");
					h--;
				  }
			     	  break;
			     	  
			   case 3:
				   if(dk.handcard[2]==1) {
			  		  System.out.println("3��ī����");
			  		 attack = attack + 7;
			  		 dk.handcard[2]=0;
			  	  }
			  	  else if (dk.handcard[2]==2) {
			  		 System.out.println("3��ī����");
			  		 defense= defense + 1;
			  		dk.handcard[2]=0;
			  	  }
			  	 else if (dk.handcard[2]==3) {
			  		System.out.println("3��ī����");
			  		 attack = attack + 10;
			 		  defense = defense -2;
			 		  dk.handcard[2]=0;
			 	  }
			  	 else if (dk.handcard[2]==4) {
			  		System.out.println("3��ī����");
			  		attack = attack + 5;
			  		dk.handcard[2]=0;
			 	  }
			  	 else if (dk.handcard[2]==5) {
			  		System.out.println("3��ī����");
			  		defense= defense + 2;
			  		dk.handcard[2]=0;
			 	  }
			  	 else if (dk.handcard[2]==6) {
			  		System.out.println("3��ī����");
			  		attack = attack + 6;
					  defense = defense + 2;
					dk.handcard[2]=0;
			 	  }
			  	 else if (dk.handcard[2]==7) {
			  		System.out.println("3��ī����");
			 		  attack = attack +3;
			 		  dk.handcard[2]=0;
			 	  }
			  	 else if (dk.handcard[2]==8) {
			  		System.out.println("3��ī����");
			  		defense = defense + 1;
			  		dk.handcard[2]=0;
			 	  }
			  	 else if (dk.handcard[2]==9) {
			  		System.out.println("3��ī����");
			 		  attack= attack + 20;
			 		  dk.handcard[2]=0;
			 	  }
			  	else  {
			 		System.out.println("�ٽü����ϼ���");
					h--;
				  }
			 	  break;
			   case 4:
				   if(dk.handcard[3]==1) {
			  		  System.out.println("4��ī����");
			  		 attack = attack + 7;
			  		 dk.handcard[3]=0;
			  	  }
			  	  else if (dk.handcard[3]==2) {
			  		 System.out.println("4��ī����");
			  		 defense= defense + 1;
			  		dk.handcard[3]=0;
			  	  }
			  	 else if (dk.handcard[3]==3) {
			  		System.out.println("4��ī����");
			  		 attack = attack + 10;
			 		  defense = defense -2;
			 		  dk.handcard[3]=0;
			 	  }
			  	 else if (dk.handcard[3]==4) {
			  		System.out.println("4��ī����");
			  		attack = attack + 5;
			  		dk.handcard[3]=0;
			 	  }
			  	 else if (dk.handcard[3]==5) {
			  		System.out.println("4��ī����");
			  		defense= defense + 2;
			  		dk.handcard[3]=0;
			 	  }
			  	 else if (dk.handcard[3]==6) {
			  		System.out.println("4��ī����");
			  		attack = attack + 6;
					  defense = defense + 2;
					dk.handcard[3]=0;
			 	  }
			  	 else if (dk.handcard[3]==7) {
			  		System.out.println("4��ī����");
			 		  attack = attack +3;
			 		  dk.handcard[3]=0;
			 	  }
			  	 else if (dk.handcard[3]==8) {
			  		System.out.println("4��ī����");
			  		defense = defense + 1;
			  		dk.handcard[3]=0;
			 	  }
			  	 else if (dk.handcard[3]==9) {
			  		System.out.println("4��ī����");
			 		  attack= attack + 20;
			 		  dk.handcard[3]=0;
			 	  }
			  	else if (dk.handcard[3]==0) {
			 		System.out.println("�ٽü����ϼ���");
					h--;
				  }
			 	  break;
			   case 5:
				   if(dk.handcard[4]==1) {
			  		  System.out.println("5��ī����");
			  		 attack = attack + 7;
			  		 dk.handcard[4]=0;
			  	  }
			  	  else if (dk.handcard[4]==2) {
			  		 System.out.println("5��ī����");
			  		 defense= defense + 1;
			  		dk.handcard[4]=0;
			  	  }
			  	 else if (dk.handcard[4]==3) {
			  		System.out.println("5��ī����");
			  		 attack = attack + 10;
			 		  defense = defense -2;
			 		  dk.handcard[4]=0;
			 	  }
			  	 else if (dk.handcard[4]==4) {
			  		System.out.println("5��ī����");
			  		attack = attack + 5;
			  		dk.handcard[4]=0;
			 	  }
			  	 else if (dk.handcard[4]==5) {
			  		System.out.println("5��ī����");
			  		defense= defense + 2;
			  		dk.handcard[4]=0;
			 	  }
			  	 else if (dk.handcard[4]==6) {
			  		System.out.println("5��ī����");
			  		attack = attack + 6;
					  defense = defense + 2;
					dk.handcard[4]=0;
			 	  }
			  	 else if (dk.handcard[4]==7) {
			  		System.out.println("5��ī����");
			 		  attack = attack +3;
			 		  dk.handcard[4]=0;
			 	  }
			  	 else if (dk.handcard[4]==8) {
			  		System.out.println("5��ī����");
			  		defense = defense + 1;
			  		dk.handcard[4]=0;
			 	  }
			  	 else if (dk.handcard[4]==9) {
			  		System.out.println("5��ī����");
			 		  attack= attack + 20;
			 		  dk.handcard[4]=0;
			 	  }
			  	else  {
			 		System.out.println("�ٽü����ϼ���");
					h--;
				  }
			 	  break;
			   case 6:
				   System.out.println("Ȯ��");
				   break;
			 	  default :
			 		 System.out.println("�ٽü����ϼ���");
			 		 h--;
			 		  break;
			       
			       }
			       }
			       
			       System.out.println("����� ����!");
			       mon1.HP = mon1.HP - attack;
			       System.out.println("����"+attack+"��ŭ�� ���ظ� �Ծ���.");
			       if(mon1.HP<=0) {
			    	   System.out.println("���� ��������!");
			    	   System.out.println("�����"+mon1.em+"��ŭ�� ���� ȹ���Ͽ���.");
			    	   us.money = us.money+mon1.em;
			    	   break;
			       }
			       
			    	   System.out.println("�屳�� ����!");
			    	   us.HP = us.HP + defense - 10; 
			    	   System.out.println("�����"+-(defense - 10)+"��ŭ�� ���ظ� �Ծ���.");
			       
			     
			       if(us.HP<=0) {
			    	   System.out.println("����� ��������!");
			    	   break;
			       }
			      attack=0;
			      defense = 0;
			      ccount=0;
			       for(int d= 0; d<20; d++) {
			    	   if(dk.tpdeck[d]!=0) {
			    		   ccount=ccount+1;
			    	   }
			    	   else {
			    		   
			    	   }
			       }
			       System.out.println("���Ⳳ������"+ccount);
			      //����ī��� 3�� �̸��϶�
			       if(ccount<3) {
			    	   dk.setdeck();               
			           
			           
			    	   for(int u=0; u<5; u++) {
			    		   for(int y=0; y<20; y++) {
			    			 if ( dk.handcard[u]== dk.tpdeck[y]) {
			    				 dk.tpdeck[y]=0;
			    				 break;
			    			 }
			    			 else {
			    				 
			    			 }
			    			 
			    		   }
			    		   
			    	   } 
			    	   
			    	   dk.shuffle(dk.tpdeck, 15);
			    	   
			       }
			       
			    
			       b=0;
			       //�󽽷����� üũ�ϰ� ���ڸ��� ī��ֱ�  
			       for(int k=0; k<dk.handcard.length; k++) { //ī�� 5��̰� ����

			    	   if(dk.handcard[k]==0) {
			    	   
			   		if(dk.tpdeck[b]!=0) {
			       		dk.handcard[k]=dk.tpdeck[b];
			       		dk.tpdeck[b]=0;
			       		b++;
			       		
			       		
			       	}
			       	else if(dk.tpdeck[b]==0){
			       		b++;
			       		k--;
			       		
			       	}	
			   		
			    	   }
			    	   else {
			    		   
			    	   }
			   		
			   }
			   
			   
			     

					}//�����ݺ� ������ ���ȣ
				
				
				
				
				
				
				
				
				
				mp.mapping(mylocation);
				System.out.println("���� �� ���ΰ�?(���ڳ�Ư�������Է½� �����ϰ� 2�̻� ���ڴ� 2�����)");
				System.out.println("1.�޽�  2.���� ");
				ch=sc.nextInt();
				if(ch==1) {
					mylocation=51;
					//�޽��̺�Ʈ
					
					System.out.println("�޽�");
					System.out.println("ü���� 20ȸ���մϴ�.");
					us.HP=us.HP + 20;

					
					
					mp.mapping(mylocation);
					//��ٷȴٰ� ������
					try{Thread.sleep(2000);
					}catch(Exception e){}

					System.out.println("===============��������===============");
					System.out.println("���հ� ���� �߻�!");
					enemy satan = new enemy();
					satan.monname="���ձ� �屳";
					satan.HP=50;
					satan.em=500;
					satan.monnum=0;
					dk.setdeck();               //deck�� tpdeck�� ����
			        dk.shuffle(dk.tpdeck, 15);	//ī�����
			       
			        b=0;
			        for(int k=0; k<dk.handcard.length; k++) { //ī�� 5��̰� ����
			        	
			        	
			        	
			        		if(dk.tpdeck[b]!=0) {
			            		dk.handcard[k]=dk.tpdeck[b];
			            		dk.tpdeck[b]=0;
			            		b++;
			     		
			            	}
			            	else if(dk.tpdeck[b]==0){
			            		b++;
			            		k--;	
			            	}	
			        }
			        
			        
			        while(us.HP>0 || satan.HP>0) {
			        	b=0;
			       int ccount=0;
			       
			       for(int d= 0; d<20; d++) {
			    	   if(dk.tpdeck[d]!=0) {
			    		   ccount=ccount+1;
			    	   }
			    	   else {
			    		   
			    	   }
			       }
			     
			       System.out.print("����: ");rc.showrelic(relic);rc.showrelic(relic1); rc.showrelic(relic2);System.out.println("");  	
			       dk.showcard();
			       System.out.println("");
			       
			       
			       int defense=0;
			       System.out.println("��ī���"+us.cardcount);
			       System.out.println("����ī���"+ccount);
			       System.out.println("�����ü��:"+us.HP);
			       System.out.println("����ü��:"+satan.HP);
			       System.out.println("����� ī�带  3�� �����Ͻÿ�. ��ҺҰ� ������ ����!");
			       System.out.println("1.  2.  3.  4.  5. 6.Ȯ��");
			       
			      

			       
			       int attack=0;
			       for(int h=0; h<3; h++) {
			       ch=sc.nextInt();
			       switch(ch) {
			       case 1:
			     	  if(dk.handcard[0]==1) {
			     		  System.out.println("1��ī����");
			     		 attack = attack + 7;
			     		 dk.handcard[0]=0;
			     	  }
			     	  else if (dk.handcard[0]==2) {
			     		 System.out.println("1��ī����");
			     		 defense= defense + 1;
			     		dk.handcard[0]=0;
			     	  }
			     	 else if (dk.handcard[0]==3) {
			     		System.out.println("1��ī����");
			     		 attack = attack + 10;
			    		  defense = defense -2;
			    		  dk.handcard[0]=0;
			    	  }
			     	 else if (dk.handcard[0]==4) {
			     		System.out.println("1��ī����");
			     		attack = attack + 5;
			     		dk.handcard[0]=0;
			    	  }
			     	 else if (dk.handcard[0]==5) {
			     		System.out.println("1��ī����");
			     		defense= defense + 2;
			     		dk.handcard[0]=0;
			    	  }
			     	 else if (dk.handcard[0]==6) {
			     		System.out.println("1��ī����");
			     		attack = attack + 6;
			  		  defense = defense + 2;
			  		dk.handcard[0]=0;
			    	  }
			     	 else if (dk.handcard[1]==7) {
			     		System.out.println("1��ī����");
			    		  attack = attack +3;
			    		  dk.handcard[0]=0;
			    	  }
			     	 else if (dk.handcard[1]==8) {
			     		System.out.println("1��ī����");
			     		defense = defense + 1;
			     		dk.handcard[0]=0;
			    	  }
			     	 else if (dk.handcard[1]==9) {
			     		System.out.println("1��ī����");
			    		  attack= attack + 20;
			    		  dk.handcard[0]=0;
			    	  }
			     	else {
			     		System.out.println("�ٽü����ϼ���");
			    		h--;
			    	  }
			     	  
			     	  break;
			   case 2:
				   if(dk.handcard[1]==1) {
			  		  System.out.println("2��ī����");
			  		 attack = attack + 7;
			  		 dk.handcard[1]=0;
			  	  }
			  	  else if (dk.handcard[1]==2) {
			  		 System.out.println("2��ī����");
			  		 defense= defense + 1;
			  		dk.handcard[1]=0;
			  	  }
			  	 else if (dk.handcard[1]==3) {
			  		System.out.println("2��ī����");
			  		 attack = attack + 10;
			 		  defense = defense -2;
			 		  dk.handcard[1]=0;
			 	  }
			  	 else if (dk.handcard[1]==4) {
			  		System.out.println("2��ī����");
			  		attack = attack + 5;
			  		dk.handcard[1]=0;
			 	  }
			  	 else if (dk.handcard[1]==5) {
			  		System.out.println("2��ī����");
			  		defense= defense + 2;
			  		dk.handcard[1]=0;
			 	  }
			  	 else if (dk.handcard[1]==6) {
			  		System.out.println("2��ī����");
			  		attack = attack + 6;
					  defense = defense + 2;
					dk.handcard[1]=0;
			 	  }
			  	 else if (dk.handcard[1]==7) {
			  		System.out.println("2��ī����");
			 		  attack = attack +3;
			 		  dk.handcard[1]=0;
			 	  }
			  	 else if (dk.handcard[1]==8) {
			  		System.out.println("2��ī����");
			  		defense = defense + 1;
			  		dk.handcard[1]=0;
			 	  }
			  	 else if (dk.handcard[1]==9) {
			  		System.out.println("2��ī����");
			 		  attack= attack + 20;
			 		  dk.handcard[1]=0;
			 	  }  
			  	else  {
			 		System.out.println("�ٽü����ϼ���");
					h--;
				  }
			     	  break;
			     	  
			   case 3:
				   if(dk.handcard[2]==1) {
			  		  System.out.println("3��ī����");
			  		 attack = attack + 7;
			  		 dk.handcard[2]=0;
			  	  }
			  	  else if (dk.handcard[2]==2) {
			  		 System.out.println("3��ī����");
			  		 defense= defense + 1;
			  		dk.handcard[2]=0;
			  	  }
			  	 else if (dk.handcard[2]==3) {
			  		System.out.println("3��ī����");
			  		 attack = attack + 10;
			 		  defense = defense -2;
			 		  dk.handcard[2]=0;
			 	  }
			  	 else if (dk.handcard[2]==4) {
			  		System.out.println("3��ī����");
			  		attack = attack + 5;
			  		dk.handcard[2]=0;
			 	  }
			  	 else if (dk.handcard[2]==5) {
			  		System.out.println("3��ī����");
			  		defense= defense + 2;
			  		dk.handcard[2]=0;
			 	  }
			  	 else if (dk.handcard[2]==6) {
			  		System.out.println("3��ī����");
			  		attack = attack + 6;
					  defense = defense + 2;
					dk.handcard[2]=0;
			 	  }
			  	 else if (dk.handcard[2]==7) {
			  		System.out.println("3��ī����");
			 		  attack = attack +3;
			 		  dk.handcard[2]=0;
			 	  }
			  	 else if (dk.handcard[2]==8) {
			  		System.out.println("3��ī����");
			  		defense = defense + 1;
			  		dk.handcard[2]=0;
			 	  }
			  	 else if (dk.handcard[2]==9) {
			  		System.out.println("3��ī����");
			 		  attack= attack + 20;
			 		  dk.handcard[2]=0;
			 	  }
			  	else  {
			 		System.out.println("�ٽü����ϼ���");
					h--;
				  }
			 	  break;
			   case 4:
				   if(dk.handcard[3]==1) {
			  		  System.out.println("4��ī����");
			  		 attack = attack + 7;
			  		 dk.handcard[3]=0;
			  	  }
			  	  else if (dk.handcard[3]==2) {
			  		 System.out.println("4��ī����");
			  		 defense= defense + 1;
			  		dk.handcard[3]=0;
			  	  }
			  	 else if (dk.handcard[3]==3) {
			  		System.out.println("4��ī����");
			  		 attack = attack + 10;
			 		  defense = defense -2;
			 		  dk.handcard[3]=0;
			 	  }
			  	 else if (dk.handcard[3]==4) {
			  		System.out.println("4��ī����");
			  		attack = attack + 5;
			  		dk.handcard[3]=0;
			 	  }
			  	 else if (dk.handcard[3]==5) {
			  		System.out.println("4��ī����");
			  		defense= defense + 2;
			  		dk.handcard[3]=0;
			 	  }
			  	 else if (dk.handcard[3]==6) {
			  		System.out.println("4��ī����");
			  		attack = attack + 6;
					  defense = defense + 2;
					dk.handcard[3]=0;
			 	  }
			  	 else if (dk.handcard[3]==7) {
			  		System.out.println("4��ī����");
			 		  attack = attack +3;
			 		  dk.handcard[3]=0;
			 	  }
			  	 else if (dk.handcard[3]==8) {
			  		System.out.println("4��ī����");
			  		defense = defense + 1;
			  		dk.handcard[3]=0;
			 	  }
			  	 else if (dk.handcard[3]==9) {
			  		System.out.println("4��ī����");
			 		  attack= attack + 20;
			 		  dk.handcard[3]=0;
			 	  }
			  	else if (dk.handcard[3]==0) {
			 		System.out.println("�ٽü����ϼ���");
					h--;
				  }
			 	  break;
			   case 5:
				   if(dk.handcard[4]==1) {
			  		  System.out.println("5��ī����");
			  		 attack = attack + 7;
			  		 dk.handcard[4]=0;
			  	  }
			  	  else if (dk.handcard[4]==2) {
			  		 System.out.println("5��ī����");
			  		 defense= defense + 1;
			  		dk.handcard[4]=0;
			  	  }
			  	 else if (dk.handcard[4]==3) {
			  		System.out.println("5��ī����");
			  		 attack = attack + 10;
			 		  defense = defense -2;
			 		  dk.handcard[4]=0;
			 	  }
			  	 else if (dk.handcard[4]==4) {
			  		System.out.println("5��ī����");
			  		attack = attack + 5;
			  		dk.handcard[4]=0;
			 	  }
			  	 else if (dk.handcard[4]==5) {
			  		System.out.println("5��ī����");
			  		defense= defense + 2;
			  		dk.handcard[4]=0;
			 	  }
			  	 else if (dk.handcard[4]==6) {
			  		System.out.println("5��ī����");
			  		attack = attack + 6;
					  defense = defense + 2;
					dk.handcard[4]=0;
			 	  }
			  	 else if (dk.handcard[4]==7) {
			  		System.out.println("5��ī����");
			 		  attack = attack +3;
			 		  dk.handcard[4]=0;
			 	  }
			  	 else if (dk.handcard[4]==8) {
			  		System.out.println("5��ī����");
			  		defense = defense + 1;
			  		dk.handcard[4]=0;
			 	  }
			  	 else if (dk.handcard[4]==9) {
			  		System.out.println("5��ī����");
			 		  attack= attack + 20;
			 		  dk.handcard[4]=0;
			 	  }
			  	else  {
			 		System.out.println("�ٽü����ϼ���");
					h--;
				  }
			 	  break;
			   case 6:
				   System.out.println("Ȯ��");
				   break;
			 	  default :
			 		 System.out.println("�ٽü����ϼ���");
			 		 h--;
			 		  break;
			       
			       }
			       }
			       
			       System.out.println("����� ����!");
			       satan.HP = satan.HP - attack;
			       System.out.println("����"+attack+"��ŭ�� ���ظ� �Ծ���.");
			       if(satan.HP<=0) {
			    	   System.out.println("������ ��������!");
			    	   System.out.println("�����"+satan.em+"��ŭ�� ���� ȹ���Ͽ���.");
			    	   us.money = us.money+satan.em;
			    	   boss=1;
			    	   break;
			       }
			      
			       int beh = (int)(Math.random()*10);
			       if(beh<9) {
			    	   System.out.println("������ ����!");
			    	   us.HP = us.HP + defense - 15; 
			    	   System.out.println("�����"+-(defense - 15)+"��ŭ�� ���ظ� �Ծ���.");
			       }
			       else {
			    	   System.out.println("������ �ϰ�!");
			    	   us.HP = us.HP + defense - 40;
			    	   System.out.println("�����"+-(defense - 40)+"��ŭ�� ���ظ� �Ծ���.");
			       }
			       
			     
			       if(us.HP<=0) {
			    	   System.out.println("����� ��������!");
			    	   break;
			       }
			      attack=0;
			      defense = 0;
			      ccount=0;
			       for(int d= 0; d<20; d++) {
			    	   if(dk.tpdeck[d]!=0) {
			    		   ccount=ccount+1;
			    	   }
			    	   else {
			    		   
			    	   }
			       }
			       System.out.println("���Ⳳ������"+ccount);
			      //����ī��� 3�� �̸��϶�
			       if(ccount<3) {
			    	   dk.setdeck();               
			           
			           
			    	   for(int u=0; u<5; u++) {
			    		   for(int y=0; y<20; y++) {
			    			 if ( dk.handcard[u]== dk.tpdeck[y]) {
			    				 dk.tpdeck[y]=0;
			    				 break;
			    			 }
			    			 else {
			    				 
			    			 }
			    			 
			    		   }
			    		   
			    	   } 
			    	   
			    	   dk.shuffle(dk.tpdeck, 15);
			    	   
			       }
			       
			    
			       b=0;
			       //�󽽷����� üũ�ϰ� ���ڸ��� ī��ֱ�  
			       for(int k=0; k<dk.handcard.length; k++) { //ī�� 5��̰� ����

			    	   if(dk.handcard[k]==0) {
			    	   
			   		if(dk.tpdeck[b]!=0) {
			       		dk.handcard[k]=dk.tpdeck[b];
			       		dk.tpdeck[b]=0;
			       		b++;
			       		
			       		
			       	}
			       	else if(dk.tpdeck[b]==0){
			       		b++;
			       		k--;
			       		
			       	}	
			   		
			    	   }
			    	   else {
			    		   
			    	   }
			   		
			   }
			   
			   
			     

					}//�����ݺ� ������ ���ȣ
			        
					
					
					
					
					
					
					
					
					
					
					
				}
				
				
				else {
					mylocation=52;
					//�����̺�Ʈ
					System.out.println("========================����========================");
		        	System.out.println("������:"+us.money);
		        	System.out.println("�������! ���°� ���� ���ֽ��ϴ�!");
		        	System.out.println("1.����ī��:30��   2.���ī��:10��  3.����Ư��ī��:80��   4.��Ŀī��:200��   5.�����Ǻ���:150��   6.������");
		        	while(ch!=6) {
		        		
		        ch=sc.nextInt();
		        switch(ch) {
		        case 1:
		        	if(aa==0) {
		        	if(us.money>=30) {
		        if(us.job==1) {
		        	System.out.println("ī�带�����߽��ϴ�");
		        	 us.cardcount= us.cardcount+1;
		        	dk.deck[10]=1; aa=1;
		        	us.money=us.money-30;
		        }
		        else if(us.job==2) {
		        	System.out.println("ī�带�����߽��ϴ�");
		        	 us.cardcount= us.cardcount+1;
		        	dk.deck[10]=4; aa=1;
		        	us.money=us.money-30;
		        }
		        else if(us.job==3) {
		        	System.out.println("ī�带�����߽��ϴ�");
		        	 us.cardcount= us.cardcount+1;
		        	dk.deck[10]=7; aa=1;
		        	us.money=us.money-30;
		        }
		        	}else {
		        		System.out.println("���̺����մϴ�.");
		        	}
		        	}else {System.out.println("��������!");}
		        	
		        	break;
		        	
		case 2:
			if(bb==0) {
			if(us.money>=10) {
			if(us.job==1) {
				System.out.println("ī�带�����߽��ϴ�");
				 us.cardcount= us.cardcount+1;
		    	dk.deck[11]=2;bb=1;
		    	us.money=us.money-10;
		    }
		    else if(us.job==2) {
		    	System.out.println("ī�带�����߽��ϴ�");
		    	 us.cardcount= us.cardcount+1;
		    	dk.deck[11]=5;bb=1;
		    	us.money=us.money-10;
		    }
		    else if(us.job==3) {
		    	System.out.println("ī�带�����߽��ϴ�");
		    	 us.cardcount= us.cardcount+1;
		    	dk.deck[11]=8;bb=1;
		    	us.money=us.money-10;
		    }
			}
		    else {
				System.out.println("���̺����մϴ�.");
			}}else {System.out.println("��������!");}

		        	break;
		case 3:
			if(cc==0) {
			if(us.money>=80) {
				if(us.job==1) {
					System.out.println("ī�带�����߽��ϴ�");
					 us.cardcount= us.cardcount+1;
			    	dk.deck[12]=3;cc=1;
			    	us.money=us.money-80;
			    }
			    else if(us.job==2) {
			    	System.out.println("ī�带�����߽��ϴ�");
			    	 us.cardcount= us.cardcount+1;
			    	dk.deck[12]=6;cc=1;
			    	us.money=us.money-80;
			    }
			    else if(us.job==3) {
			    	System.out.println("ī�带�����߽��ϴ�");
			    	 us.cardcount= us.cardcount+1;
			    	dk.deck[12]=9;cc=1;
			    	us.money=us.money-80;
			    }
				}
			    else {
					System.out.println("���̺����մϴ�.");
				}}else {System.out.println("��������");}
			break;
			
		case 4:
			if(us.money>=200) {
				System.out.println("�������������� ��ձ� ��վ�!");
				System.out.println("�ڳ� ��𰡼��� �����ϴ°� �����ϰԳ� ������");
				 
			us.money=us.money-200;
			break;
			}else {
				System.out.println("���̺����մϴ�.");
			}
			break;
			
		case 5:
			if(ee==0) {
			if(us.money>=150) {
				System.out.println("�����������߽��ϴ�");
				ee=1;
				us.cardcount=us.cardcount+1;
				us.HP=us.HP+20;
				us.money=us.money-150;
				relic1[1]=1;
				if(us.job==1) {
			    	dk.deck[13]=3;
			    }
			    else if(us.job==2) {
			    	dk.deck[13]=6;	
			    }
			    else if(us.job==3) {
			    	dk.deck[13]=9;
			    }
			}else {
				System.out.println("���̺����մϴ�.");
			}}else {System.out.println("��������ϴ�!");}
			break;
		case 6:
			System.out.println("����� �����ϴ�.");
			break;
		        default:
		        	System.out.println("����� ������!");
		        	break; 
		        }		    	
		        	}			
					mp.mapping(mylocation);
					
					
					
					System.out.println("���簡�����ִ�ī���");
					for(int z=0; z<20; z++) {
						if(dk.deck[z]==1) {
						
							System.out.println("����");
						}
						else if (dk.deck[z]==2)	{
							System.out.println("���й��");
						}
			else if (dk.deck[z]==3)	{
				System.out.println("�Ǹ����ϰ�");
						}
			else if (dk.deck[z]==4)	{
				System.out.println("���");
			}
			else if (dk.deck[z]==5)	{
				System.out.println("ȸ��");
			}
			else if (dk.deck[z]==6)	{
				System.out.println("ȸ�ǻ��");
			}
			else if (dk.deck[z]==7)	{
				System.out.println("�ĸ���");
			}
			else if (dk.deck[z]==8)	{
				System.out.println("����");
			}
			else if (dk.deck[z]==9)	{
				System.out.println("���̾�");
			}
							
					}
					try{Thread.sleep(2000);
					}catch(Exception e){}
					
					//��ٷǴٰ� ������
					System.out.println("===============��������===============");
					System.out.println("���հ� ���� �߻�!");
					enemy satan = new enemy();
					satan.monname="���ձ� �屳";
					satan.HP=50;
					satan.em=500;
					satan.monnum=0;
					dk.setdeck();               //deck�� tpdeck�� ����
			        dk.shuffle(dk.tpdeck, 15);	//ī�����
			       
			        b=0;
			        for(int k=0; k<dk.handcard.length; k++) { //ī�� 5��̰� ����
			        	
			        	
			        	
			        		if(dk.tpdeck[b]!=0) {
			            		dk.handcard[k]=dk.tpdeck[b];
			            		dk.tpdeck[b]=0;
			            		b++;
			     		
			            	}
			            	else if(dk.tpdeck[b]==0){
			            		b++;
			            		k--;	
			            	}	
			        }
			        
			        
			        while(us.HP>0 || satan.HP>0) {
			        	b=0;
			       int ccount=0;
			       
			       for(int d= 0; d<20; d++) {
			    	   if(dk.tpdeck[d]!=0) {
			    		   ccount=ccount+1;
			    	   }
			    	   else {
			    		   
			    	   }
			       }
			     
			       System.out.print("����: ");rc.showrelic(relic);rc.showrelic(relic1); rc.showrelic(relic2);System.out.println(""); 	
			       dk.showcard();
			       System.out.println("");
			       
			       
			       int defense=0;
			       System.out.println("��ī���"+us.cardcount);
			       System.out.println("����ī���"+ccount);
			       System.out.println("�����ü��:"+us.HP);
			       System.out.println("����ü��:"+satan.HP);
			       System.out.println("����� ī�带  3�� �����Ͻÿ�. ��ҺҰ� ������ ����!");
			       System.out.println("1.  2.  3.  4.  5. 6.Ȯ��");
			       
			      

			       int attack=0;
			       for(int h=0; h<3; h++) {
			       ch=sc.nextInt();
			       switch(ch) {
			       case 1:
			     	  if(dk.handcard[0]==1) {
			     		  System.out.println("1��ī����");
			     		 attack = attack + 7;
			     		 dk.handcard[0]=0;
			     	  }
			     	  else if (dk.handcard[0]==2) {
			     		 System.out.println("1��ī����");
			     		 defense= defense + 1;
			     		dk.handcard[0]=0;
			     	  }
			     	 else if (dk.handcard[0]==3) {
			     		System.out.println("1��ī����");
			     		 attack = attack + 10;
			    		  defense = defense -2;
			    		  dk.handcard[0]=0;
			    	  }
			     	 else if (dk.handcard[0]==4) {
			     		System.out.println("1��ī����");
			     		attack = attack + 5;
			     		dk.handcard[0]=0;
			    	  }
			     	 else if (dk.handcard[0]==5) {
			     		System.out.println("1��ī����");
			     		defense= defense + 2;
			     		dk.handcard[0]=0;
			    	  }
			     	 else if (dk.handcard[0]==6) {
			     		System.out.println("1��ī����");
			     		attack = attack + 6;
			  		  defense = defense + 2;
			  		dk.handcard[0]=0;
			    	  }
			     	 else if (dk.handcard[1]==7) {
			     		System.out.println("1��ī����");
			    		  attack = attack +3;
			    		  dk.handcard[0]=0;
			    	  }
			     	 else if (dk.handcard[1]==8) {
			     		System.out.println("1��ī����");
			     		defense = defense + 1;
			     		dk.handcard[0]=0;
			    	  }
			     	 else if (dk.handcard[1]==9) {
			     		System.out.println("1��ī����");
			    		  attack= attack + 20;
			    		  dk.handcard[0]=0;
			    	  }
			     	else {
			     		System.out.println("�ٽü����ϼ���");
			    		h--;
			    	  }
			     	  
			     	  break;
			   case 2:
				   if(dk.handcard[1]==1) {
			  		  System.out.println("2��ī����");
			  		 attack = attack + 7;
			  		 dk.handcard[1]=0;
			  	  }
			  	  else if (dk.handcard[1]==2) {
			  		 System.out.println("2��ī����");
			  		 defense= defense + 1;
			  		dk.handcard[1]=0;
			  	  }
			  	 else if (dk.handcard[1]==3) {
			  		System.out.println("2��ī����");
			  		 attack = attack + 10;
			 		  defense = defense -2;
			 		  dk.handcard[1]=0;
			 	  }
			  	 else if (dk.handcard[1]==4) {
			  		System.out.println("2��ī����");
			  		attack = attack + 5;
			  		dk.handcard[1]=0;
			 	  }
			  	 else if (dk.handcard[1]==5) {
			  		System.out.println("2��ī����");
			  		defense= defense + 2;
			  		dk.handcard[1]=0;
			 	  }
			  	 else if (dk.handcard[1]==6) {
			  		System.out.println("2��ī����");
			  		attack = attack + 6;
					  defense = defense + 2;
					dk.handcard[1]=0;
			 	  }
			  	 else if (dk.handcard[1]==7) {
			  		System.out.println("2��ī����");
			 		  attack = attack +3;
			 		  dk.handcard[1]=0;
			 	  }
			  	 else if (dk.handcard[1]==8) {
			  		System.out.println("2��ī����");
			  		defense = defense + 1;
			  		dk.handcard[1]=0;
			 	  }
			  	 else if (dk.handcard[1]==9) {
			  		System.out.println("2��ī����");
			 		  attack= attack + 20;
			 		  dk.handcard[1]=0;
			 	  }  
			  	else  {
			 		System.out.println("�ٽü����ϼ���");
					h--;
				  }
			     	  break;
			     	  
			   case 3:
				   if(dk.handcard[2]==1) {
			  		  System.out.println("3��ī����");
			  		 attack = attack + 7;
			  		 dk.handcard[2]=0;
			  	  }
			  	  else if (dk.handcard[2]==2) {
			  		 System.out.println("3��ī����");
			  		 defense= defense + 1;
			  		dk.handcard[2]=0;
			  	  }
			  	 else if (dk.handcard[2]==3) {
			  		System.out.println("3��ī����");
			  		 attack = attack + 10;
			 		  defense = defense -2;
			 		  dk.handcard[2]=0;
			 	  }
			  	 else if (dk.handcard[2]==4) {
			  		System.out.println("3��ī����");
			  		attack = attack + 5;
			  		dk.handcard[2]=0;
			 	  }
			  	 else if (dk.handcard[2]==5) {
			  		System.out.println("3��ī����");
			  		defense= defense + 2;
			  		dk.handcard[2]=0;
			 	  }
			  	 else if (dk.handcard[2]==6) {
			  		System.out.println("3��ī����");
			  		attack = attack + 6;
					  defense = defense + 2;
					dk.handcard[2]=0;
			 	  }
			  	 else if (dk.handcard[2]==7) {
			  		System.out.println("3��ī����");
			 		  attack = attack +3;
			 		  dk.handcard[2]=0;
			 	  }
			  	 else if (dk.handcard[2]==8) {
			  		System.out.println("3��ī����");
			  		defense = defense + 1;
			  		dk.handcard[2]=0;
			 	  }
			  	 else if (dk.handcard[2]==9) {
			  		System.out.println("3��ī����");
			 		  attack= attack + 20;
			 		  dk.handcard[2]=0;
			 	  }
			  	else  {
			 		System.out.println("�ٽü����ϼ���");
					h--;
				  }
			 	  break;
			   case 4:
				   if(dk.handcard[3]==1) {
			  		  System.out.println("4��ī����");
			  		 attack = attack + 7;
			  		 dk.handcard[3]=0;
			  	  }
			  	  else if (dk.handcard[3]==2) {
			  		 System.out.println("4��ī����");
			  		 defense= defense + 1;
			  		dk.handcard[3]=0;
			  	  }
			  	 else if (dk.handcard[3]==3) {
			  		System.out.println("4��ī����");
			  		 attack = attack + 10;
			 		  defense = defense -2;
			 		  dk.handcard[3]=0;
			 	  }
			  	 else if (dk.handcard[3]==4) {
			  		System.out.println("4��ī����");
			  		attack = attack + 5;
			  		dk.handcard[3]=0;
			 	  }
			  	 else if (dk.handcard[3]==5) {
			  		System.out.println("4��ī����");
			  		defense= defense + 2;
			  		dk.handcard[3]=0;
			 	  }
			  	 else if (dk.handcard[3]==6) {
			  		System.out.println("4��ī����");
			  		attack = attack + 6;
					  defense = defense + 2;
					dk.handcard[3]=0;
			 	  }
			  	 else if (dk.handcard[3]==7) {
			  		System.out.println("4��ī����");
			 		  attack = attack +3;
			 		  dk.handcard[3]=0;
			 	  }
			  	 else if (dk.handcard[3]==8) {
			  		System.out.println("4��ī����");
			  		defense = defense + 1;
			  		dk.handcard[3]=0;
			 	  }
			  	 else if (dk.handcard[3]==9) {
			  		System.out.println("4��ī����");
			 		  attack= attack + 20;
			 		  dk.handcard[3]=0;
			 	  }
			  	else if (dk.handcard[3]==0) {
			 		System.out.println("�ٽü����ϼ���");
					h--;
				  }
			 	  break;
			   case 5:
				   if(dk.handcard[4]==1) {
			  		  System.out.println("5��ī����");
			  		 attack = attack + 7;
			  		 dk.handcard[4]=0;
			  	  }
			  	  else if (dk.handcard[4]==2) {
			  		 System.out.println("5��ī����");
			  		 defense= defense + 1;
			  		dk.handcard[4]=0;
			  	  }
			  	 else if (dk.handcard[4]==3) {
			  		System.out.println("5��ī����");
			  		 attack = attack + 10;
			 		  defense = defense -2;
			 		  dk.handcard[4]=0;
			 	  }
			  	 else if (dk.handcard[4]==4) {
			  		System.out.println("5��ī����");
			  		attack = attack + 5;
			  		dk.handcard[4]=0;
			 	  }
			  	 else if (dk.handcard[4]==5) {
			  		System.out.println("5��ī����");
			  		defense= defense + 2;
			  		dk.handcard[4]=0;
			 	  }
			  	 else if (dk.handcard[4]==6) {
			  		System.out.println("5��ī����");
			  		attack = attack + 6;
					  defense = defense + 2;
					dk.handcard[4]=0;
			 	  }
			  	 else if (dk.handcard[4]==7) {
			  		System.out.println("5��ī����");
			 		  attack = attack +3;
			 		  dk.handcard[4]=0;
			 	  }
			  	 else if (dk.handcard[4]==8) {
			  		System.out.println("5��ī����");
			  		defense = defense + 1;
			  		dk.handcard[4]=0;
			 	  }
			  	 else if (dk.handcard[4]==9) {
			  		System.out.println("5��ī����");
			 		  attack= attack + 20;
			 		  dk.handcard[4]=0;
			 	  }
			  	else  {
			 		System.out.println("�ٽü����ϼ���");
					h--;
				  }
			 	  break;
			   case 6:
				   System.out.println("Ȯ��");
				   break;
			 	  default :
			 		 System.out.println("�ٽü����ϼ���");
			 		 h--;
			 		  break;
			       
			       }
			       }
			       
			       System.out.println("����� ����!");
			       satan.HP = satan.HP - attack;
			       System.out.println("����"+attack+"��ŭ�� ���ظ� �Ծ���.");
			       if(satan.HP<=0) {
			    	   System.out.println("������ ��������!");
			    	   System.out.println("�����"+satan.em+"��ŭ�� ���� ȹ���Ͽ���.");
			    	   us.money = us.money+satan.em;
			    	   boss=1;
			    	   break;
			       }
			     
			       int beh = (int)(Math.random()*10);
			       if(beh<9) {
			    	   System.out.println("������ ����!");
			    	   us.HP = us.HP + defense - 15; 
			    	   System.out.println("�����"+-(defense - 15)+"��ŭ�� ���ظ� �Ծ���.");
			       }
			       else {
			    	   System.out.println("������ �ϰ�!");
			    	   us.HP = us.HP + defense - 40;
			    	   System.out.println("�����"+-(defense - 40)+"��ŭ�� ���ظ� �Ծ���.");
			       }
			       
			     
			       if(us.HP<=0) {
			    	   System.out.println("����� ��������!");
			    	   break;
			       }
			      attack=0;
			      defense = 0;
			      ccount=0;
			       for(int d= 0; d<20; d++) {
			    	   if(dk.tpdeck[d]!=0) {
			    		   ccount=ccount+1;
			    	   }
			    	   else {
			    		   
			    	   }
			       }
			       System.out.println("���Ⳳ������"+ccount);
			      //����ī��� 3�� �̸��϶�
			       if(ccount<3) {
			    	   dk.setdeck();               
			           
			           
			    	   for(int u=0; u<5; u++) {
			    		   for(int y=0; y<20; y++) {
			    			 if ( dk.handcard[u]== dk.tpdeck[y]) {
			    				 dk.tpdeck[y]=0;
			    				 break;
			    			 }
			    			 else {
			    				 
			    			 }
			    			 
			    		   }
			    		   
			    	   } 
			    	   
			    	   dk.shuffle(dk.tpdeck, 15);
			    	   
			       }
			       
			    
			       b=0;
			       //�󽽷����� üũ�ϰ� ���ڸ��� ī��ֱ�  
			       for(int k=0; k<dk.handcard.length; k++) { //ī�� 5��̰� ����

			    	   if(dk.handcard[k]==0) {
			    	   
			   		if(dk.tpdeck[b]!=0) {
			       		dk.handcard[k]=dk.tpdeck[b];
			       		dk.tpdeck[b]=0;
			       		b++;
			       		
			       		
			       	}
			       	else if(dk.tpdeck[b]==0){
			       		b++;
			       		k--;
			       		
			       	}	
			   		
			    	   }
			    	   else {
			    		   
			    	   }
			   		
			   }
					}//�����ݺ� ������ ���ȣ
					
				}
				
				
				
			}
		
			
			
			else {
				mylocation=42;
				//����Ʋ
				System.out.println("����Ʋ");
				 System.out.println("===============�Ϲݸ�===============");
					System.out.println("���ձ� �屳�� ���� �߻�!");
					enemy mon1 = new enemy();
				       mon1.monname="���ձ� �屳";
				       mon1.HP=1;
				       mon1.em=20;
				       mon1.monnum=2;
					dk.setdeck();               //deck�� tpdeck�� ����
			        dk.shuffle(dk.tpdeck, 15);	//ī�����
			       
			      int  b=0;
			        for(int k=0; k<dk.handcard.length; k++) { //ī�� 5��̰� ����
			        	
			        	
			        	
			        		if(dk.tpdeck[b]!=0) {
			            		dk.handcard[k]=dk.tpdeck[b];
			            		dk.tpdeck[b]=0;
			            		b++;
			     		
			            	}
			            	else if(dk.tpdeck[b]==0){
			            		b++;
			            		k--;	
			            	}	
			        }
			        
			        
			        while(us.HP>0 || mon1.HP>0) {
			        	b=0;
			       int ccount=0;
			       
			       for(int d= 0; d<20; d++) {
			    	   if(dk.tpdeck[d]!=0) {
			    		   ccount=ccount+1;
			    	   }
			    	   else {
			    		   
			    	   }
			       }
			     
			       System.out.print("����: ");rc.showrelic(relic);rc.showrelic(relic1); rc.showrelic(relic2);System.out.println(""); 	
			       dk.showcard();
			       System.out.println("");
			       
			       
			       int defense=0;
			       System.out.println("��ī���"+us.cardcount);
			       System.out.println("����ī���"+ccount);
			       System.out.println("�����ü��:"+us.HP);
			       System.out.println("����ü��:"+mon1.HP);
			       System.out.println("����� ī�带  3�� �����Ͻÿ�. ��ҺҰ� ������ ����!");
			       System.out.println("1.  2.  3.  4.  5. 6.Ȯ��");
			       
			      

			       
			       int attack=0;
			       for(int h=0; h<3; h++) {
			       ch=sc.nextInt();
			       switch(ch) {
			       case 1:
			     	  if(dk.handcard[0]==1) {
			     		  System.out.println("1��ī����");
			     		 attack = attack + 7;
			     		 dk.handcard[0]=0;
			     	  }
			     	  else if (dk.handcard[0]==2) {
			     		 System.out.println("1��ī����");
			     		 defense= defense + 1;
			     		dk.handcard[0]=0;
			     	  }
			     	 else if (dk.handcard[0]==3) {
			     		System.out.println("1��ī����");
			     		 attack = attack + 10;
			    		  defense = defense -2;
			    		  dk.handcard[0]=0;
			    	  }
			     	 else if (dk.handcard[0]==4) {
			     		System.out.println("1��ī����");
			     		attack = attack + 5;
			     		dk.handcard[0]=0;
			    	  }
			     	 else if (dk.handcard[0]==5) {
			     		System.out.println("1��ī����");
			     		defense= defense + 2;
			     		dk.handcard[0]=0;
			    	  }
			     	 else if (dk.handcard[0]==6) {
			     		System.out.println("1��ī����");
			     		attack = attack + 6;
			  		  defense = defense + 2;
			  		dk.handcard[0]=0;
			    	  }
			     	 else if (dk.handcard[1]==7) {
			     		System.out.println("1��ī����");
			    		  attack = attack +3;
			    		  dk.handcard[0]=0;
			    	  }
			     	 else if (dk.handcard[1]==8) {
			     		System.out.println("1��ī����");
			     		defense = defense + 1;
			     		dk.handcard[0]=0;
			    	  }
			     	 else if (dk.handcard[1]==9) {
			     		System.out.println("1��ī����");
			    		  attack= attack + 20;
			    		  dk.handcard[0]=0;
			    	  }
			     	else {
			     		System.out.println("�ٽü����ϼ���");
			    		h--;
			    	  }
			     	  
			     	  break;
			   case 2:
				   if(dk.handcard[1]==1) {
			  		  System.out.println("2��ī����");
			  		 attack = attack + 7;
			  		 dk.handcard[1]=0;
			  	  }
			  	  else if (dk.handcard[1]==2) {
			  		 System.out.println("2��ī����");
			  		 defense= defense + 1;
			  		dk.handcard[1]=0;
			  	  }
			  	 else if (dk.handcard[1]==3) {
			  		System.out.println("2��ī����");
			  		 attack = attack + 10;
			 		  defense = defense -2;
			 		  dk.handcard[1]=0;
			 	  }
			  	 else if (dk.handcard[1]==4) {
			  		System.out.println("2��ī����");
			  		attack = attack + 5;
			  		dk.handcard[1]=0;
			 	  }
			  	 else if (dk.handcard[1]==5) {
			  		System.out.println("2��ī����");
			  		defense= defense + 2;
			  		dk.handcard[1]=0;
			 	  }
			  	 else if (dk.handcard[1]==6) {
			  		System.out.println("2��ī����");
			  		attack = attack + 6;
					  defense = defense + 2;
					dk.handcard[1]=0;
			 	  }
			  	 else if (dk.handcard[1]==7) {
			  		System.out.println("2��ī����");
			 		  attack = attack +3;
			 		  dk.handcard[1]=0;
			 	  }
			  	 else if (dk.handcard[1]==8) {
			  		System.out.println("2��ī����");
			  		defense = defense + 1;
			  		dk.handcard[1]=0;
			 	  }
			  	 else if (dk.handcard[1]==9) {
			  		System.out.println("2��ī����");
			 		  attack= attack + 20;
			 		  dk.handcard[1]=0;
			 	  }  
			  	else  {
			 		System.out.println("�ٽü����ϼ���");
					h--;
				  }
			     	  break;
			     	  
			   case 3:
				   if(dk.handcard[2]==1) {
			  		  System.out.println("3��ī����");
			  		 attack = attack + 7;
			  		 dk.handcard[2]=0;
			  	  }
			  	  else if (dk.handcard[2]==2) {
			  		 System.out.println("3��ī����");
			  		 defense= defense + 1;
			  		dk.handcard[2]=0;
			  	  }
			  	 else if (dk.handcard[2]==3) {
			  		System.out.println("3��ī����");
			  		 attack = attack + 10;
			 		  defense = defense -2;
			 		  dk.handcard[2]=0;
			 	  }
			  	 else if (dk.handcard[2]==4) {
			  		System.out.println("3��ī����");
			  		attack = attack + 5;
			  		dk.handcard[2]=0;
			 	  }
			  	 else if (dk.handcard[2]==5) {
			  		System.out.println("3��ī����");
			  		defense= defense + 2;
			  		dk.handcard[2]=0;
			 	  }
			  	 else if (dk.handcard[2]==6) {
			  		System.out.println("3��ī����");
			  		attack = attack + 6;
					  defense = defense + 2;
					dk.handcard[2]=0;
			 	  }
			  	 else if (dk.handcard[2]==7) {
			  		System.out.println("3��ī����");
			 		  attack = attack +3;
			 		  dk.handcard[2]=0;
			 	  }
			  	 else if (dk.handcard[2]==8) {
			  		System.out.println("3��ī����");
			  		defense = defense + 1;
			  		dk.handcard[2]=0;
			 	  }
			  	 else if (dk.handcard[2]==9) {
			  		System.out.println("3��ī����");
			 		  attack= attack + 20;
			 		  dk.handcard[2]=0;
			 	  }
			  	else  {
			 		System.out.println("�ٽü����ϼ���");
					h--;
				  }
			 	  break;
			   case 4:
				   if(dk.handcard[3]==1) {
			  		  System.out.println("4��ī����");
			  		 attack = attack + 7;
			  		 dk.handcard[3]=0;
			  	  }
			  	  else if (dk.handcard[3]==2) {
			  		 System.out.println("4��ī����");
			  		 defense= defense + 1;
			  		dk.handcard[3]=0;
			  	  }
			  	 else if (dk.handcard[3]==3) {
			  		System.out.println("4��ī����");
			  		 attack = attack + 10;
			 		  defense = defense -2;
			 		  dk.handcard[3]=0;
			 	  }
			  	 else if (dk.handcard[3]==4) {
			  		System.out.println("4��ī����");
			  		attack = attack + 5;
			  		dk.handcard[3]=0;
			 	  }
			  	 else if (dk.handcard[3]==5) {
			  		System.out.println("4��ī����");
			  		defense= defense + 2;
			  		dk.handcard[3]=0;
			 	  }
			  	 else if (dk.handcard[3]==6) {
			  		System.out.println("4��ī����");
			  		attack = attack + 6;
					  defense = defense + 2;
					dk.handcard[3]=0;
			 	  }
			  	 else if (dk.handcard[3]==7) {
			  		System.out.println("4��ī����");
			 		  attack = attack +3;
			 		  dk.handcard[3]=0;
			 	  }
			  	 else if (dk.handcard[3]==8) {
			  		System.out.println("4��ī����");
			  		defense = defense + 1;
			  		dk.handcard[3]=0;
			 	  }
			  	 else if (dk.handcard[3]==9) {
			  		System.out.println("4��ī����");
			 		  attack= attack + 20;
			 		  dk.handcard[3]=0;
			 	  }
			  	else if (dk.handcard[3]==0) {
			 		System.out.println("�ٽü����ϼ���");
					h--;
				  }
			 	  break;
			   case 5:
				   if(dk.handcard[4]==1) {
			  		  System.out.println("5��ī����");
			  		 attack = attack + 7;
			  		 dk.handcard[4]=0;
			  	  }
			  	  else if (dk.handcard[4]==2) {
			  		 System.out.println("5��ī����");
			  		 defense= defense + 1;
			  		dk.handcard[4]=0;
			  	  }
			  	 else if (dk.handcard[4]==3) {
			  		System.out.println("5��ī����");
			  		 attack = attack + 10;
			 		  defense = defense -2;
			 		  dk.handcard[4]=0;
			 	  }
			  	 else if (dk.handcard[4]==4) {
			  		System.out.println("5��ī����");
			  		attack = attack + 5;
			  		dk.handcard[4]=0;
			 	  }
			  	 else if (dk.handcard[4]==5) {
			  		System.out.println("5��ī����");
			  		defense= defense + 2;
			  		dk.handcard[4]=0;
			 	  }
			  	 else if (dk.handcard[4]==6) {
			  		System.out.println("5��ī����");
			  		attack = attack + 6;
					  defense = defense + 2;
					dk.handcard[4]=0;
			 	  }
			  	 else if (dk.handcard[4]==7) {
			  		System.out.println("5��ī����");
			 		  attack = attack +3;
			 		  dk.handcard[4]=0;
			 	  }
			  	 else if (dk.handcard[4]==8) {
			  		System.out.println("5��ī����");
			  		defense = defense + 1;
			  		dk.handcard[4]=0;
			 	  }
			  	 else if (dk.handcard[4]==9) {
			  		System.out.println("5��ī����");
			 		  attack= attack + 20;
			 		  dk.handcard[4]=0;
			 	  }
			  	else  {
			 		System.out.println("�ٽü����ϼ���");
					h--;
				  }
			 	  break;
			   case 6:
				   System.out.println("Ȯ��");
				   break;
			 	  default :
			 		 System.out.println("�ٽü����ϼ���");
			 		 h--;
			 		  break;
			       
			       }
			       }
			       
			       System.out.println("����� ����!");
			       mon1.HP = mon1.HP - attack;
			       System.out.println("����"+attack+"��ŭ�� ���ظ� �Ծ���.");
			       if(mon1.HP<=0) {
			    	   System.out.println("���� ��������!");
			    	   System.out.println("�����"+mon1.em+"��ŭ�� ���� ȹ���Ͽ���.");
			    	   us.money = us.money+mon1.em;
			    	   break;
			       }
			       
			    	   System.out.println("�屳�� ����!");
			    	   us.HP = us.HP + defense - 10; 
			    	   System.out.println("�����"+-(defense - 10)+"��ŭ�� ���ظ� �Ծ���.");
			       
			     
			       if(us.HP<=0) {
			    	   System.out.println("����� ��������!");
			    	   break;
			       }
			      attack=0;
			      defense = 0;
			      ccount=0;
			       for(int d= 0; d<20; d++) {
			    	   if(dk.tpdeck[d]!=0) {
			    		   ccount=ccount+1;
			    	   }
			    	   else {
			    		   
			    	   }
			       }
			       System.out.println("���Ⳳ������"+ccount);
			      //����ī��� 3�� �̸��϶�
			       if(ccount<3) {
			    	   dk.setdeck();               
			           
			           
			    	   for(int u=0; u<5; u++) {
			    		   for(int y=0; y<20; y++) {
			    			 if ( dk.handcard[u]== dk.tpdeck[y]) {
			    				 dk.tpdeck[y]=0;
			    				 break;
			    			 }
			    			 else {
			    				 
			    			 }
			    			 
			    		   }
			    		   
			    	   } 
			    	   
			    	   dk.shuffle(dk.tpdeck, 15);
			    	   
			       }
			       
			    
			       b=0;
			       //�󽽷����� üũ�ϰ� ���ڸ��� ī��ֱ�  
			       for(int k=0; k<dk.handcard.length; k++) { //ī�� 5��̰� ����

			    	   if(dk.handcard[k]==0) {
			    	   
			   		if(dk.tpdeck[b]!=0) {
			       		dk.handcard[k]=dk.tpdeck[b];
			       		dk.tpdeck[b]=0;
			       		b++;
			       		
			       		
			       	}
			       	else if(dk.tpdeck[b]==0){
			       		b++;
			       		k--;
			       		
			       	}	
			   		
			    	   }
			    	   else {
			    		   
			    	   }
			   		
			   }
			   
			   
			     

					}//�����ݺ� ������ ���ȣ
				

				mp.mapping(mylocation);
				mylocation=52;
				
				

				//��ٷȴٰ� �����̺�Ʈ
				System.out.println("========================����========================");
	        	System.out.println("������:"+us.money);
	        	System.out.println("�������! ���°� ���� ���ֽ��ϴ�!");
	        	System.out.println("1.����ī��:30��   2.���ī��:10��  3.����Ư��ī��:80��   4.��Ŀī��:200��   5.�����Ǻ���:150��   6.������");
	        	while(ch!=6) {
	        		
	        ch=sc.nextInt();
	        switch(ch) {
	        case 1:
	        	if(aa==0) {
	        	if(us.money>=30) {
	        if(us.job==1) {
	        	System.out.println("ī�带�����߽��ϴ�");
	        	 us.cardcount= us.cardcount+1;
	        	dk.deck[10]=1; aa=1;
	        	us.money=us.money-30;
	        }
	        else if(us.job==2) {
	        	System.out.println("ī�带�����߽��ϴ�");
	        	 us.cardcount= us.cardcount+1;
	        	dk.deck[10]=4; aa=1;
	        	us.money=us.money-30;
	        }
	        else if(us.job==3) {
	        	System.out.println("ī�带�����߽��ϴ�");
	        	 us.cardcount= us.cardcount+1;
	        	dk.deck[10]=7; aa=1;
	        	us.money=us.money-30;
	        }
	        	}else {
	        		System.out.println("���̺����մϴ�.");
	        	}
	        	}else {System.out.println("��������!");}
	        	
	        	break;
	        	
	case 2:
		if(bb==0) {
		if(us.money>=10) {
		if(us.job==1) {
			System.out.println("ī�带�����߽��ϴ�");
			 us.cardcount= us.cardcount+1;
	    	dk.deck[11]=2;bb=1;
	    	us.money=us.money-10;
	    }
	    else if(us.job==2) {
	    	System.out.println("ī�带�����߽��ϴ�");
	    	 us.cardcount= us.cardcount+1;
	    	dk.deck[11]=5;bb=1;
	    	us.money=us.money-10;
	    }
	    else if(us.job==3) {
	    	System.out.println("ī�带�����߽��ϴ�");
	    	 us.cardcount= us.cardcount+1;
	    	dk.deck[11]=8;bb=1;
	    	us.money=us.money-10;
	    }
		}
	    else {
			System.out.println("���̺����մϴ�.");
		}}else {System.out.println("��������!");}

	        	break;
	case 3:
		if(cc==0) {
		if(us.money>=80) {
			if(us.job==1) {
				System.out.println("ī�带�����߽��ϴ�");
				 us.cardcount= us.cardcount+1;
		    	dk.deck[12]=3;cc=1;
		    	us.money=us.money-80;
		    }
		    else if(us.job==2) {
		    	System.out.println("ī�带�����߽��ϴ�");
		    	 us.cardcount= us.cardcount+1;
		    	dk.deck[12]=6;cc=1;
		    	us.money=us.money-80;
		    }
		    else if(us.job==3) {
		    	System.out.println("ī�带�����߽��ϴ�");
		    	 us.cardcount= us.cardcount+1;
		    	dk.deck[12]=9;cc=1;
		    	us.money=us.money-80;
		    }
			}
		    else {
				System.out.println("���̺����մϴ�.");
			}}else {System.out.println("��������");}
		break;
		
	case 4:
		if(us.money>=200) {
			System.out.println("�������������� ��ձ� ��վ�!");
			System.out.println("�ڳ� ��𰡼��� �����ϴ°� �����ϰԳ� ������");
			 
		us.money=us.money-200;
		break;
		}else {
			System.out.println("���̺����մϴ�.");
		}
		break;
		
	case 5:
		if(ee==0) {
		if(us.money>=150) {
			System.out.println("�����������߽��ϴ�");
			ee=1;
			us.cardcount=us.cardcount+1;
			us.HP=us.HP+20;
			us.money=us.money-150;
			relic1[1]=1;
			if(us.job==1) {
		    	dk.deck[13]=3;
		    }
		    else if(us.job==2) {
		    	dk.deck[13]=6;	
		    }
		    else if(us.job==3) {
		    	dk.deck[13]=9;
		    }
		}else {
			System.out.println("���̺����մϴ�.");
		}}else {System.out.println("��������ϴ�!");}
		break;
	case 6:
		System.out.println("����� �����ϴ�.");
		break;
	        default:
	        	System.out.println("����� ������!");
	        	break;
	        
	   
	        }
	        	
	        	
	        	}

				
				
				mp.mapping(mylocation);
				//��ٷȴٰ� ������
				System.out.println("���簡�����ִ�ī���");
				for(int z=0; z<20; z++) {
					if(dk.deck[z]==1) {
					
						System.out.println("����");
					}
					else if (dk.deck[z]==2)	{
						System.out.println("���й��");
					}
		else if (dk.deck[z]==3)	{
			System.out.println("�Ǹ����ϰ�");
					}
		else if (dk.deck[z]==4)	{
			System.out.println("���");
		}
		else if (dk.deck[z]==5)	{
			System.out.println("ȸ��");
		}
		else if (dk.deck[z]==6)	{
			System.out.println("ȸ�ǻ��");
		}
		else if (dk.deck[z]==7)	{
			System.out.println("�ĸ���");
		}
		else if (dk.deck[z]==8)	{
			System.out.println("����");
		}
		else if (dk.deck[z]==9)	{
			System.out.println("���̾�");
		}
						
				}
				try{Thread.sleep(2000);
				}catch(Exception e){}
				System.out.println("===============��������===============");
				System.out.println("���հ� ���� �߻�!");
				enemy satan = new enemy();
				satan.monname="���ձ� �屳";
				satan.HP=50;
				satan.em=500;
				satan.monnum=0;
				dk.setdeck();               //deck�� tpdeck�� ����
		        dk.shuffle(dk.tpdeck, 15);	//ī�����
		       
		        b=0;
		        for(int k=0; k<dk.handcard.length; k++) { //ī�� 5��̰� ����
		        	
		        	
		        	
		        		if(dk.tpdeck[b]!=0) {
		            		dk.handcard[k]=dk.tpdeck[b];
		            		dk.tpdeck[b]=0;
		            		b++;
		     		
		            	}
		            	else if(dk.tpdeck[b]==0){
		            		b++;
		            		k--;	
		            	}	
		        }
		        
		        
		        while(us.HP>0 || satan.HP>0) {
		        	b=0;
		       int ccount=0;
		       
		       for(int d= 0; d<20; d++) {
		    	   if(dk.tpdeck[d]!=0) {
		    		   ccount=ccount+1;
		    	   }
		    	   else {
		    		   
		    	   }
		       }
		     
		       System.out.print("����: ");rc.showrelic(relic);rc.showrelic(relic1); rc.showrelic(relic2);System.out.println(""); 	
		       dk.showcard();
		       System.out.println("");
		       
		       
		       int defense=0;
		       System.out.println("��ī���"+us.cardcount);
		       System.out.println("����ī���"+ccount);
		       System.out.println("�����ü��:"+us.HP);
		       System.out.println("����ü��:"+satan.HP);
		       System.out.println("����� ī�带  3�� �����Ͻÿ�. ��ҺҰ� ������ ����!");
		       System.out.println("1.  2.  3.  4.  5. 6.Ȯ��");
		       
		      

		       int attack=0;
		       for(int h=0; h<3; h++) {
		       ch=sc.nextInt();
		       switch(ch) {
		       case 1:
		     	  if(dk.handcard[0]==1) {
		     		  System.out.println("1��ī����");
		     		 attack = attack + 7;
		     		 dk.handcard[0]=0;
		     	  }
		     	  else if (dk.handcard[0]==2) {
		     		 System.out.println("1��ī����");
		     		 defense= defense + 1;
		     		dk.handcard[0]=0;
		     	  }
		     	 else if (dk.handcard[0]==3) {
		     		System.out.println("1��ī����");
		     		 attack = attack + 10;
		    		  defense = defense -2;
		    		  dk.handcard[0]=0;
		    	  }
		     	 else if (dk.handcard[0]==4) {
		     		System.out.println("1��ī����");
		     		attack = attack + 5;
		     		dk.handcard[0]=0;
		    	  }
		     	 else if (dk.handcard[0]==5) {
		     		System.out.println("1��ī����");
		     		defense= defense + 2;
		     		dk.handcard[0]=0;
		    	  }
		     	 else if (dk.handcard[0]==6) {
		     		System.out.println("1��ī����");
		     		attack = attack + 6;
		  		  defense = defense + 2;
		  		dk.handcard[0]=0;
		    	  }
		     	 else if (dk.handcard[1]==7) {
		     		System.out.println("1��ī����");
		    		  attack = attack +3;
		    		  dk.handcard[0]=0;
		    	  }
		     	 else if (dk.handcard[1]==8) {
		     		System.out.println("1��ī����");
		     		defense = defense + 1;
		     		dk.handcard[0]=0;
		    	  }
		     	 else if (dk.handcard[1]==9) {
		     		System.out.println("1��ī����");
		    		  attack= attack + 20;
		    		  dk.handcard[0]=0;
		    	  }
		     	else {
		     		System.out.println("�ٽü����ϼ���");
		    		h--;
		    	  }
		     	  
		     	  break;
		   case 2:
			   if(dk.handcard[1]==1) {
		  		  System.out.println("2��ī����");
		  		 attack = attack + 7;
		  		 dk.handcard[1]=0;
		  	  }
		  	  else if (dk.handcard[1]==2) {
		  		 System.out.println("2��ī����");
		  		 defense= defense + 1;
		  		dk.handcard[1]=0;
		  	  }
		  	 else if (dk.handcard[1]==3) {
		  		System.out.println("2��ī����");
		  		 attack = attack + 10;
		 		  defense = defense -2;
		 		  dk.handcard[1]=0;
		 	  }
		  	 else if (dk.handcard[1]==4) {
		  		System.out.println("2��ī����");
		  		attack = attack + 5;
		  		dk.handcard[1]=0;
		 	  }
		  	 else if (dk.handcard[1]==5) {
		  		System.out.println("2��ī����");
		  		defense= defense + 2;
		  		dk.handcard[1]=0;
		 	  }
		  	 else if (dk.handcard[1]==6) {
		  		System.out.println("2��ī����");
		  		attack = attack + 6;
				  defense = defense + 2;
				dk.handcard[1]=0;
		 	  }
		  	 else if (dk.handcard[1]==7) {
		  		System.out.println("2��ī����");
		 		  attack = attack +3;
		 		  dk.handcard[1]=0;
		 	  }
		  	 else if (dk.handcard[1]==8) {
		  		System.out.println("2��ī����");
		  		defense = defense + 1;
		  		dk.handcard[1]=0;
		 	  }
		  	 else if (dk.handcard[1]==9) {
		  		System.out.println("2��ī����");
		 		  attack= attack + 20;
		 		  dk.handcard[1]=0;
		 	  }  
		  	else  {
		 		System.out.println("�ٽü����ϼ���");
				h--;
			  }
		     	  break;
		     	  
		   case 3:
			   if(dk.handcard[2]==1) {
		  		  System.out.println("3��ī����");
		  		 attack = attack + 7;
		  		 dk.handcard[2]=0;
		  	  }
		  	  else if (dk.handcard[2]==2) {
		  		 System.out.println("3��ī����");
		  		 defense= defense + 1;
		  		dk.handcard[2]=0;
		  	  }
		  	 else if (dk.handcard[2]==3) {
		  		System.out.println("3��ī����");
		  		 attack = attack + 10;
		 		  defense = defense -2;
		 		  dk.handcard[2]=0;
		 	  }
		  	 else if (dk.handcard[2]==4) {
		  		System.out.println("3��ī����");
		  		attack = attack + 5;
		  		dk.handcard[2]=0;
		 	  }
		  	 else if (dk.handcard[2]==5) {
		  		System.out.println("3��ī����");
		  		defense= defense + 2;
		  		dk.handcard[2]=0;
		 	  }
		  	 else if (dk.handcard[2]==6) {
		  		System.out.println("3��ī����");
		  		attack = attack + 6;
				  defense = defense + 2;
				dk.handcard[2]=0;
		 	  }
		  	 else if (dk.handcard[2]==7) {
		  		System.out.println("3��ī����");
		 		  attack = attack +3;
		 		  dk.handcard[2]=0;
		 	  }
		  	 else if (dk.handcard[2]==8) {
		  		System.out.println("3��ī����");
		  		defense = defense + 1;
		  		dk.handcard[2]=0;
		 	  }
		  	 else if (dk.handcard[2]==9) {
		  		System.out.println("3��ī����");
		 		  attack= attack + 20;
		 		  dk.handcard[2]=0;
		 	  }
		  	else  {
		 		System.out.println("�ٽü����ϼ���");
				h--;
			  }
		 	  break;
		   case 4:
			   if(dk.handcard[3]==1) {
		  		  System.out.println("4��ī����");
		  		 attack = attack + 7;
		  		 dk.handcard[3]=0;
		  	  }
		  	  else if (dk.handcard[3]==2) {
		  		 System.out.println("4��ī����");
		  		 defense= defense + 1;
		  		dk.handcard[3]=0;
		  	  }
		  	 else if (dk.handcard[3]==3) {
		  		System.out.println("4��ī����");
		  		 attack = attack + 10;
		 		  defense = defense -2;
		 		  dk.handcard[3]=0;
		 	  }
		  	 else if (dk.handcard[3]==4) {
		  		System.out.println("4��ī����");
		  		attack = attack + 5;
		  		dk.handcard[3]=0;
		 	  }
		  	 else if (dk.handcard[3]==5) {
		  		System.out.println("4��ī����");
		  		defense= defense + 2;
		  		dk.handcard[3]=0;
		 	  }
		  	 else if (dk.handcard[3]==6) {
		  		System.out.println("4��ī����");
		  		attack = attack + 6;
				  defense = defense + 2;
				dk.handcard[3]=0;
		 	  }
		  	 else if (dk.handcard[3]==7) {
		  		System.out.println("4��ī����");
		 		  attack = attack +3;
		 		  dk.handcard[3]=0;
		 	  }
		  	 else if (dk.handcard[3]==8) {
		  		System.out.println("4��ī����");
		  		defense = defense + 1;
		  		dk.handcard[3]=0;
		 	  }
		  	 else if (dk.handcard[3]==9) {
		  		System.out.println("4��ī����");
		 		  attack= attack + 20;
		 		  dk.handcard[3]=0;
		 	  }
		  	else if (dk.handcard[3]==0) {
		 		System.out.println("�ٽü����ϼ���");
				h--;
			  }
		 	  break;
		   case 5:
			   if(dk.handcard[4]==1) {
		  		  System.out.println("5��ī����");
		  		 attack = attack + 7;
		  		 dk.handcard[4]=0;
		  	  }
		  	  else if (dk.handcard[4]==2) {
		  		 System.out.println("5��ī����");
		  		 defense= defense + 1;
		  		dk.handcard[4]=0;
		  	  }
		  	 else if (dk.handcard[4]==3) {
		  		System.out.println("5��ī����");
		  		 attack = attack + 10;
		 		  defense = defense -2;
		 		  dk.handcard[4]=0;
		 	  }
		  	 else if (dk.handcard[4]==4) {
		  		System.out.println("5��ī����");
		  		attack = attack + 5;
		  		dk.handcard[4]=0;
		 	  }
		  	 else if (dk.handcard[4]==5) {
		  		System.out.println("5��ī����");
		  		defense= defense + 2;
		  		dk.handcard[4]=0;
		 	  }
		  	 else if (dk.handcard[4]==6) {
		  		System.out.println("5��ī����");
		  		attack = attack + 6;
				  defense = defense + 2;
				dk.handcard[4]=0;
		 	  }
		  	 else if (dk.handcard[4]==7) {
		  		System.out.println("5��ī����");
		 		  attack = attack +3;
		 		  dk.handcard[4]=0;
		 	  }
		  	 else if (dk.handcard[4]==8) {
		  		System.out.println("5��ī����");
		  		defense = defense + 1;
		  		dk.handcard[4]=0;
		 	  }
		  	 else if (dk.handcard[4]==9) {
		  		System.out.println("5��ī����");
		 		  attack= attack + 20;
		 		  dk.handcard[4]=0;
		 	  }
		  	else  {
		 		System.out.println("�ٽü����ϼ���");
				h--;
			  }
		 	  break;
		   case 6:
			   System.out.println("Ȯ��");
			   break;
		 	  default :
		 		 System.out.println("�ٽü����ϼ���");
		 		 h--;
		 		  break;
		       
		       }
		       }
		       
		       System.out.println("����� ����!");
		       satan.HP = satan.HP - attack;
		       System.out.println("����"+attack+"��ŭ�� ���ظ� �Ծ���.");
		       if(satan.HP<=0) {
		    	   System.out.println("������ ��������!");
		    	   System.out.println("�����"+satan.em+"��ŭ�� ���� ȹ���Ͽ���.");
		    	   us.money = us.money+satan.em;
		    	   boss=1;
		    	   break;
		       }
		       
		       int beh = (int)(Math.random()*10);
		       if(beh<9) {
		    	   System.out.println("������ ����!");
		    	   us.HP = us.HP + defense - 15; 
		    	   System.out.println("�����"+-(defense - 15)+"��ŭ�� ���ظ� �Ծ���.");
		       }
		       else {
		    	   System.out.println("������ �ϰ�!");
		    	   us.HP = us.HP + defense - 40;
		    	   System.out.println("�����"+-(defense - 40)+"��ŭ�� ���ظ� �Ծ���.");
		       }
		       
		     
		       if(us.HP<=0) {
		    	   System.out.println("����� ��������!");
		    	   break;
		       }
		      attack=0;
		      defense = 0;
		      ccount=0;
		       for(int d= 0; d<20; d++) {
		    	   if(dk.tpdeck[d]!=0) {
		    		   ccount=ccount+1;
		    	   }
		    	   else {
		    		   
		    	   }
		       }
		       System.out.println("���Ⳳ������"+ccount);
		      //����ī��� 3�� �̸��϶�
		       if(ccount<3) {
		    	   dk.setdeck();               
		           
		           
		    	   for(int u=0; u<5; u++) {
		    		   for(int y=0; y<20; y++) {
		    			 if ( dk.handcard[u]== dk.tpdeck[y]) {
		    				 dk.tpdeck[y]=0;
		    				 break;
		    			 }
		    			 else {
		    				 
		    			 }
		    			 
		    		   }
		    		   
		    	   } 
		    	   
		    	   dk.shuffle(dk.tpdeck, 15);
		    	   
		       }
		       
		    
		       b=0;
		       //�󽽷����� üũ�ϰ� ���ڸ��� ī��ֱ�  
		       for(int k=0; k<dk.handcard.length; k++) { //ī�� 5��̰� ����

		    	   if(dk.handcard[k]==0) {
		    	   
		   		if(dk.tpdeck[b]!=0) {
		       		dk.handcard[k]=dk.tpdeck[b];
		       		dk.tpdeck[b]=0;
		       		b++;
		       		
		       		
		       	}
		       	else if(dk.tpdeck[b]==0){
		       		b++;
		       		k--;
		       		
		       	}	
		   		
		    	   }
		    	   else {
		    		   
		    	   }
		   		
		   }
				}//�����ݺ� ������ ���ȣ

			}
			
		}
		//����۾�
		
		
		else {
			mylocation=33;
			//����Ʋ
			System.out.println("��Ʋ");
			 System.out.println("===============�Ϲݸ�===============");
				System.out.println("���ձ� �屳�� ���� �߻�!");
				enemy mon1 = new enemy();
			       mon1.monname="���ձ� �屳";
			       mon1.HP=1;
			       mon1.em=20;
			       mon1.monnum=2;
				dk.setdeck();               //deck�� tpdeck�� ����
		        dk.shuffle(dk.tpdeck, 15);	//ī�����
		       
		      int  b=0;
		        for(int k=0; k<dk.handcard.length; k++) { //ī�� 5��̰� ����
		        	
		        	
		        	
		        		if(dk.tpdeck[b]!=0) {
		            		dk.handcard[k]=dk.tpdeck[b];
		            		dk.tpdeck[b]=0;
		            		b++;
		     		
		            	}
		            	else if(dk.tpdeck[b]==0){
		            		b++;
		            		k--;	
		            	}	
		        }
		        
		        
		        while(us.HP>0 || mon1.HP>0) {
		        	b=0;
		       int ccount=0;
		       
		       for(int d= 0; d<20; d++) {
		    	   if(dk.tpdeck[d]!=0) {
		    		   ccount=ccount+1;
		    	   }
		    	   else {
		    		   
		    	   }
		       }
		     
		       System.out.print("����: ");rc.showrelic(relic);rc.showrelic(relic1); rc.showrelic(relic2);System.out.println(""); 	
		       dk.showcard();
		       System.out.println("");
		       
		       
		       int defense=0;
		       System.out.println("��ī���"+us.cardcount);
		       System.out.println("����ī���"+ccount);
		       System.out.println("�����ü��:"+us.HP);
		       System.out.println("����ü��:"+mon1.HP);
		       System.out.println("����� ī�带  3�� �����Ͻÿ�. ��ҺҰ� ������ ����!");
		       System.out.println("1.  2.  3.  4.  5. 6.Ȯ��");
		       
		      

		       
		       int attack=0;
		       for(int h=0; h<3; h++) {
		       ch=sc.nextInt();
		       switch(ch) {
		       case 1:
		     	  if(dk.handcard[0]==1) {
		     		  System.out.println("1��ī����");
		     		 attack = attack + 7;
		     		 dk.handcard[0]=0;
		     	  }
		     	  else if (dk.handcard[0]==2) {
		     		 System.out.println("1��ī����");
		     		 defense= defense + 1;
		     		dk.handcard[0]=0;
		     	  }
		     	 else if (dk.handcard[0]==3) {
		     		System.out.println("1��ī����");
		     		 attack = attack + 10;
		    		  defense = defense -2;
		    		  dk.handcard[0]=0;
		    	  }
		     	 else if (dk.handcard[0]==4) {
		     		System.out.println("1��ī����");
		     		attack = attack + 5;
		     		dk.handcard[0]=0;
		    	  }
		     	 else if (dk.handcard[0]==5) {
		     		System.out.println("1��ī����");
		     		defense= defense + 2;
		     		dk.handcard[0]=0;
		    	  }
		     	 else if (dk.handcard[0]==6) {
		     		System.out.println("1��ī����");
		     		attack = attack + 6;
		  		  defense = defense + 2;
		  		dk.handcard[0]=0;
		    	  }
		     	 else if (dk.handcard[1]==7) {
		     		System.out.println("1��ī����");
		    		  attack = attack +3;
		    		  dk.handcard[0]=0;
		    	  }
		     	 else if (dk.handcard[1]==8) {
		     		System.out.println("1��ī����");
		     		defense = defense + 1;
		     		dk.handcard[0]=0;
		    	  }
		     	 else if (dk.handcard[1]==9) {
		     		System.out.println("1��ī����");
		    		  attack= attack + 20;
		    		  dk.handcard[0]=0;
		    	  }
		     	else {
		     		System.out.println("�ٽü����ϼ���");
		    		h--;
		    	  }
		     	  
		     	  break;
		   case 2:
			   if(dk.handcard[1]==1) {
		  		  System.out.println("2��ī����");
		  		 attack = attack + 7;
		  		 dk.handcard[1]=0;
		  	  }
		  	  else if (dk.handcard[1]==2) {
		  		 System.out.println("2��ī����");
		  		 defense= defense + 1;
		  		dk.handcard[1]=0;
		  	  }
		  	 else if (dk.handcard[1]==3) {
		  		System.out.println("2��ī����");
		  		 attack = attack + 10;
		 		  defense = defense -2;
		 		  dk.handcard[1]=0;
		 	  }
		  	 else if (dk.handcard[1]==4) {
		  		System.out.println("2��ī����");
		  		attack = attack + 5;
		  		dk.handcard[1]=0;
		 	  }
		  	 else if (dk.handcard[1]==5) {
		  		System.out.println("2��ī����");
		  		defense= defense + 2;
		  		dk.handcard[1]=0;
		 	  }
		  	 else if (dk.handcard[1]==6) {
		  		System.out.println("2��ī����");
		  		attack = attack + 6;
				  defense = defense + 2;
				dk.handcard[1]=0;
		 	  }
		  	 else if (dk.handcard[1]==7) {
		  		System.out.println("2��ī����");
		 		  attack = attack +3;
		 		  dk.handcard[1]=0;
		 	  }
		  	 else if (dk.handcard[1]==8) {
		  		System.out.println("2��ī����");
		  		defense = defense + 1;
		  		dk.handcard[1]=0;
		 	  }
		  	 else if (dk.handcard[1]==9) {
		  		System.out.println("2��ī����");
		 		  attack= attack + 20;
		 		  dk.handcard[1]=0;
		 	  }  
		  	else  {
		 		System.out.println("�ٽü����ϼ���");
				h--;
			  }
		     	  break;
		     	  
		   case 3:
			   if(dk.handcard[2]==1) {
		  		  System.out.println("3��ī����");
		  		 attack = attack + 7;
		  		 dk.handcard[2]=0;
		  	  }
		  	  else if (dk.handcard[2]==2) {
		  		 System.out.println("3��ī����");
		  		 defense= defense + 1;
		  		dk.handcard[2]=0;
		  	  }
		  	 else if (dk.handcard[2]==3) {
		  		System.out.println("3��ī����");
		  		 attack = attack + 10;
		 		  defense = defense -2;
		 		  dk.handcard[2]=0;
		 	  }
		  	 else if (dk.handcard[2]==4) {
		  		System.out.println("3��ī����");
		  		attack = attack + 5;
		  		dk.handcard[2]=0;
		 	  }
		  	 else if (dk.handcard[2]==5) {
		  		System.out.println("3��ī����");
		  		defense= defense + 2;
		  		dk.handcard[2]=0;
		 	  }
		  	 else if (dk.handcard[2]==6) {
		  		System.out.println("3��ī����");
		  		attack = attack + 6;
				  defense = defense + 2;
				dk.handcard[2]=0;
		 	  }
		  	 else if (dk.handcard[2]==7) {
		  		System.out.println("3��ī����");
		 		  attack = attack +3;
		 		  dk.handcard[2]=0;
		 	  }
		  	 else if (dk.handcard[2]==8) {
		  		System.out.println("3��ī����");
		  		defense = defense + 1;
		  		dk.handcard[2]=0;
		 	  }
		  	 else if (dk.handcard[2]==9) {
		  		System.out.println("3��ī����");
		 		  attack= attack + 20;
		 		  dk.handcard[2]=0;
		 	  }
		  	else  {
		 		System.out.println("�ٽü����ϼ���");
				h--;
			  }
		 	  break;
		   case 4:
			   if(dk.handcard[3]==1) {
		  		  System.out.println("4��ī����");
		  		 attack = attack + 7;
		  		 dk.handcard[3]=0;
		  	  }
		  	  else if (dk.handcard[3]==2) {
		  		 System.out.println("4��ī����");
		  		 defense= defense + 1;
		  		dk.handcard[3]=0;
		  	  }
		  	 else if (dk.handcard[3]==3) {
		  		System.out.println("4��ī����");
		  		 attack = attack + 10;
		 		  defense = defense -2;
		 		  dk.handcard[3]=0;
		 	  }
		  	 else if (dk.handcard[3]==4) {
		  		System.out.println("4��ī����");
		  		attack = attack + 5;
		  		dk.handcard[3]=0;
		 	  }
		  	 else if (dk.handcard[3]==5) {
		  		System.out.println("4��ī����");
		  		defense= defense + 2;
		  		dk.handcard[3]=0;
		 	  }
		  	 else if (dk.handcard[3]==6) {
		  		System.out.println("4��ī����");
		  		attack = attack + 6;
				  defense = defense + 2;
				dk.handcard[3]=0;
		 	  }
		  	 else if (dk.handcard[3]==7) {
		  		System.out.println("4��ī����");
		 		  attack = attack +3;
		 		  dk.handcard[3]=0;
		 	  }
		  	 else if (dk.handcard[3]==8) {
		  		System.out.println("4��ī����");
		  		defense = defense + 1;
		  		dk.handcard[3]=0;
		 	  }
		  	 else if (dk.handcard[3]==9) {
		  		System.out.println("4��ī����");
		 		  attack= attack + 20;
		 		  dk.handcard[3]=0;
		 	  }
		  	else if (dk.handcard[3]==0) {
		 		System.out.println("�ٽü����ϼ���");
				h--;
			  }
		 	  break;
		   case 5:
			   if(dk.handcard[4]==1) {
		  		  System.out.println("5��ī����");
		  		 attack = attack + 7;
		  		 dk.handcard[4]=0;
		  	  }
		  	  else if (dk.handcard[4]==2) {
		  		 System.out.println("5��ī����");
		  		 defense= defense + 1;
		  		dk.handcard[4]=0;
		  	  }
		  	 else if (dk.handcard[4]==3) {
		  		System.out.println("5��ī����");
		  		 attack = attack + 10;
		 		  defense = defense -2;
		 		  dk.handcard[4]=0;
		 	  }
		  	 else if (dk.handcard[4]==4) {
		  		System.out.println("5��ī����");
		  		attack = attack + 5;
		  		dk.handcard[4]=0;
		 	  }
		  	 else if (dk.handcard[4]==5) {
		  		System.out.println("5��ī����");
		  		defense= defense + 2;
		  		dk.handcard[4]=0;
		 	  }
		  	 else if (dk.handcard[4]==6) {
		  		System.out.println("5��ī����");
		  		attack = attack + 6;
				  defense = defense + 2;
				dk.handcard[4]=0;
		 	  }
		  	 else if (dk.handcard[4]==7) {
		  		System.out.println("5��ī����");
		 		  attack = attack +3;
		 		  dk.handcard[4]=0;
		 	  }
		  	 else if (dk.handcard[4]==8) {
		  		System.out.println("5��ī����");
		  		defense = defense + 1;
		  		dk.handcard[4]=0;
		 	  }
		  	 else if (dk.handcard[4]==9) {
		  		System.out.println("5��ī����");
		 		  attack= attack + 20;
		 		  dk.handcard[4]=0;
		 	  }
		  	else  {
		 		System.out.println("�ٽü����ϼ���");
				h--;
			  }
		 	  break;
		   case 6:
			   System.out.println("Ȯ��");
			   break;
		 	  default :
		 		 System.out.println("�ٽü����ϼ���");
		 		 h--;
		 		  break;
		       
		       }
		       }
		       
		       System.out.println("����� ����!");
		       mon1.HP = mon1.HP - attack;
		       System.out.println("����"+attack+"��ŭ�� ���ظ� �Ծ���.");
		       if(mon1.HP<=0) {
		    	   System.out.println("���� ��������!");
		    	   System.out.println("�����"+mon1.em+"��ŭ�� ���� ȹ���Ͽ���.");
		    	   us.money = us.money+mon1.em;
		    	   break;
		       }
		       
		    	   System.out.println("�屳�� ����!");
		    	   us.HP = us.HP + defense - 10; 
		    	   System.out.println("�����"+-(defense - 10)+"��ŭ�� ���ظ� �Ծ���.");
		       
		     
		       if(us.HP<=0) {
		    	   System.out.println("����� ��������!");
		    	   break;
		       }
		      attack=0;
		      defense = 0;
		      ccount=0;
		       for(int d= 0; d<20; d++) {
		    	   if(dk.tpdeck[d]!=0) {
		    		   ccount=ccount+1;
		    	   }
		    	   else {
		    		   
		    	   }
		       }
		       System.out.println("���Ⳳ������"+ccount);
		      //����ī��� 3�� �̸��϶�
		       if(ccount<3) {
		    	   dk.setdeck();               
		           
		           
		    	   for(int u=0; u<5; u++) {
		    		   for(int y=0; y<20; y++) {
		    			 if ( dk.handcard[u]== dk.tpdeck[y]) {
		    				 dk.tpdeck[y]=0;
		    				 break;
		    			 }
		    			 else {
		    				 
		    			 }
		    			 
		    		   }
		    		   
		    	   } 
		    	   
		    	   dk.shuffle(dk.tpdeck, 15);
		    	   
		       }
		       
		    
		       b=0;
		       //�󽽷����� üũ�ϰ� ���ڸ��� ī��ֱ�  
		       for(int k=0; k<dk.handcard.length; k++) { //ī�� 5��̰� ����

		    	   if(dk.handcard[k]==0) {
		    	   
		   		if(dk.tpdeck[b]!=0) {
		       		dk.handcard[k]=dk.tpdeck[b];
		       		dk.tpdeck[b]=0;
		       		b++;
		       		
		       		
		       	}
		       	else if(dk.tpdeck[b]==0){
		       		b++;
		       		k--;
		       		
		       	}	
		   		
		    	   }
		    	   else {
		    		   
		    	   }
		   		
		   }
		   
		   
		     

				}//�����ݺ� ������ ���ȣ
			
			
			mp.mapping(mylocation);
			mylocation=42;
			//��ٷȴٰ�����Ʋ
			System.out.println("��Ʋ");
			 System.out.println("===============�Ϲݸ�===============");
				System.out.println("���ձ� �屳�� ���� �߻�!");
			//	enemy mon1 = new enemy();
			       mon1.monname="���ձ� �屳";
			       mon1.HP=1;
			       mon1.em=20;
			       mon1.monnum=2;
				dk.setdeck();               //deck�� tpdeck�� ����
		        dk.shuffle(dk.tpdeck, 15);	//ī�����
		       
		        b=0;
		        for(int k=0; k<dk.handcard.length; k++) { //ī�� 5��̰� ����
		        	
		        	
		        	
		        		if(dk.tpdeck[b]!=0) {
		            		dk.handcard[k]=dk.tpdeck[b];
		            		dk.tpdeck[b]=0;
		            		b++;
		     		
		            	}
		            	else if(dk.tpdeck[b]==0){
		            		b++;
		            		k--;	
		            	}	
		        }
		        
		        
		        while(us.HP>0 || mon1.HP>0) {
		        	b=0;
		       int ccount=0;
		       
		       for(int d= 0; d<20; d++) {
		    	   if(dk.tpdeck[d]!=0) {
		    		   ccount=ccount+1;
		    	   }
		    	   else {
		    		   
		    	   }
		       }
		     
		       System.out.print("����: ");rc.showrelic(relic);rc.showrelic(relic1); rc.showrelic(relic2);System.out.println(""); 	
		       dk.showcard();
		       System.out.println("");
		       
		       
		       int defense=0;
		       System.out.println("��ī���"+us.cardcount);
		       System.out.println("����ī���"+ccount);
		       System.out.println("�����ü��:"+us.HP);
		       System.out.println("����ü��:"+mon1.HP);
		       System.out.println("����� ī�带  3�� �����Ͻÿ�. ��ҺҰ� ������ ����!");
		       System.out.println("1.  2.  3.  4.  5. 6.Ȯ��");
		       
		      

		       
		       int attack=0;
		       for(int h=0; h<3; h++) {
		       ch=sc.nextInt();
		       switch(ch) {
		       case 1:
		     	  if(dk.handcard[0]==1) {
		     		  System.out.println("1��ī����");
		     		 attack = attack + 7;
		     		 dk.handcard[0]=0;
		     	  }
		     	  else if (dk.handcard[0]==2) {
		     		 System.out.println("1��ī����");
		     		 defense= defense + 1;
		     		dk.handcard[0]=0;
		     	  }
		     	 else if (dk.handcard[0]==3) {
		     		System.out.println("1��ī����");
		     		 attack = attack + 10;
		    		  defense = defense -2;
		    		  dk.handcard[0]=0;
		    	  }
		     	 else if (dk.handcard[0]==4) {
		     		System.out.println("1��ī����");
		     		attack = attack + 5;
		     		dk.handcard[0]=0;
		    	  }
		     	 else if (dk.handcard[0]==5) {
		     		System.out.println("1��ī����");
		     		defense= defense + 2;
		     		dk.handcard[0]=0;
		    	  }
		     	 else if (dk.handcard[0]==6) {
		     		System.out.println("1��ī����");
		     		attack = attack + 6;
		  		  defense = defense + 2;
		  		dk.handcard[0]=0;
		    	  }
		     	 else if (dk.handcard[1]==7) {
		     		System.out.println("1��ī����");
		    		  attack = attack +3;
		    		  dk.handcard[0]=0;
		    	  }
		     	 else if (dk.handcard[1]==8) {
		     		System.out.println("1��ī����");
		     		defense = defense + 1;
		     		dk.handcard[0]=0;
		    	  }
		     	 else if (dk.handcard[1]==9) {
		     		System.out.println("1��ī����");
		    		  attack= attack + 20;
		    		  dk.handcard[0]=0;
		    	  }
		     	else {
		     		System.out.println("�ٽü����ϼ���");
		    		h--;
		    	  }
		     	  
		     	  break;
		   case 2:
			   if(dk.handcard[1]==1) {
		  		  System.out.println("2��ī����");
		  		 attack = attack + 7;
		  		 dk.handcard[1]=0;
		  	  }
		  	  else if (dk.handcard[1]==2) {
		  		 System.out.println("2��ī����");
		  		 defense= defense + 1;
		  		dk.handcard[1]=0;
		  	  }
		  	 else if (dk.handcard[1]==3) {
		  		System.out.println("2��ī����");
		  		 attack = attack + 10;
		 		  defense = defense -2;
		 		  dk.handcard[1]=0;
		 	  }
		  	 else if (dk.handcard[1]==4) {
		  		System.out.println("2��ī����");
		  		attack = attack + 5;
		  		dk.handcard[1]=0;
		 	  }
		  	 else if (dk.handcard[1]==5) {
		  		System.out.println("2��ī����");
		  		defense= defense + 2;
		  		dk.handcard[1]=0;
		 	  }
		  	 else if (dk.handcard[1]==6) {
		  		System.out.println("2��ī����");
		  		attack = attack + 6;
				  defense = defense + 2;
				dk.handcard[1]=0;
		 	  }
		  	 else if (dk.handcard[1]==7) {
		  		System.out.println("2��ī����");
		 		  attack = attack +3;
		 		  dk.handcard[1]=0;
		 	  }
		  	 else if (dk.handcard[1]==8) {
		  		System.out.println("2��ī����");
		  		defense = defense + 1;
		  		dk.handcard[1]=0;
		 	  }
		  	 else if (dk.handcard[1]==9) {
		  		System.out.println("2��ī����");
		 		  attack= attack + 20;
		 		  dk.handcard[1]=0;
		 	  }  
		  	else  {
		 		System.out.println("�ٽü����ϼ���");
				h--;
			  }
		     	  break;
		     	  
		   case 3:
			   if(dk.handcard[2]==1) {
		  		  System.out.println("3��ī����");
		  		 attack = attack + 7;
		  		 dk.handcard[2]=0;
		  	  }
		  	  else if (dk.handcard[2]==2) {
		  		 System.out.println("3��ī����");
		  		 defense= defense + 1;
		  		dk.handcard[2]=0;
		  	  }
		  	 else if (dk.handcard[2]==3) {
		  		System.out.println("3��ī����");
		  		 attack = attack + 10;
		 		  defense = defense -2;
		 		  dk.handcard[2]=0;
		 	  }
		  	 else if (dk.handcard[2]==4) {
		  		System.out.println("3��ī����");
		  		attack = attack + 5;
		  		dk.handcard[2]=0;
		 	  }
		  	 else if (dk.handcard[2]==5) {
		  		System.out.println("3��ī����");
		  		defense= defense + 2;
		  		dk.handcard[2]=0;
		 	  }
		  	 else if (dk.handcard[2]==6) {
		  		System.out.println("3��ī����");
		  		attack = attack + 6;
				  defense = defense + 2;
				dk.handcard[2]=0;
		 	  }
		  	 else if (dk.handcard[2]==7) {
		  		System.out.println("3��ī����");
		 		  attack = attack +3;
		 		  dk.handcard[2]=0;
		 	  }
		  	 else if (dk.handcard[2]==8) {
		  		System.out.println("3��ī����");
		  		defense = defense + 1;
		  		dk.handcard[2]=0;
		 	  }
		  	 else if (dk.handcard[2]==9) {
		  		System.out.println("3��ī����");
		 		  attack= attack + 20;
		 		  dk.handcard[2]=0;
		 	  }
		  	else  {
		 		System.out.println("�ٽü����ϼ���");
				h--;
			  }
		 	  break;
		   case 4:
			   if(dk.handcard[3]==1) {
		  		  System.out.println("4��ī����");
		  		 attack = attack + 7;
		  		 dk.handcard[3]=0;
		  	  }
		  	  else if (dk.handcard[3]==2) {
		  		 System.out.println("4��ī����");
		  		 defense= defense + 1;
		  		dk.handcard[3]=0;
		  	  }
		  	 else if (dk.handcard[3]==3) {
		  		System.out.println("4��ī����");
		  		 attack = attack + 10;
		 		  defense = defense -2;
		 		  dk.handcard[3]=0;
		 	  }
		  	 else if (dk.handcard[3]==4) {
		  		System.out.println("4��ī����");
		  		attack = attack + 5;
		  		dk.handcard[3]=0;
		 	  }
		  	 else if (dk.handcard[3]==5) {
		  		System.out.println("4��ī����");
		  		defense= defense + 2;
		  		dk.handcard[3]=0;
		 	  }
		  	 else if (dk.handcard[3]==6) {
		  		System.out.println("4��ī����");
		  		attack = attack + 6;
				  defense = defense + 2;
				dk.handcard[3]=0;
		 	  }
		  	 else if (dk.handcard[3]==7) {
		  		System.out.println("4��ī����");
		 		  attack = attack +3;
		 		  dk.handcard[3]=0;
		 	  }
		  	 else if (dk.handcard[3]==8) {
		  		System.out.println("4��ī����");
		  		defense = defense + 1;
		  		dk.handcard[3]=0;
		 	  }
		  	 else if (dk.handcard[3]==9) {
		  		System.out.println("4��ī����");
		 		  attack= attack + 20;
		 		  dk.handcard[3]=0;
		 	  }
		  	else if (dk.handcard[3]==0) {
		 		System.out.println("�ٽü����ϼ���");
				h--;
			  }
		 	  break;
		   case 5:
			   if(dk.handcard[4]==1) {
		  		  System.out.println("5��ī����");
		  		 attack = attack + 7;
		  		 dk.handcard[4]=0;
		  	  }
		  	  else if (dk.handcard[4]==2) {
		  		 System.out.println("5��ī����");
		  		 defense= defense + 1;
		  		dk.handcard[4]=0;
		  	  }
		  	 else if (dk.handcard[4]==3) {
		  		System.out.println("5��ī����");
		  		 attack = attack + 10;
		 		  defense = defense -2;
		 		  dk.handcard[4]=0;
		 	  }
		  	 else if (dk.handcard[4]==4) {
		  		System.out.println("5��ī����");
		  		attack = attack + 5;
		  		dk.handcard[4]=0;
		 	  }
		  	 else if (dk.handcard[4]==5) {
		  		System.out.println("5��ī����");
		  		defense= defense + 2;
		  		dk.handcard[4]=0;
		 	  }
		  	 else if (dk.handcard[4]==6) {
		  		System.out.println("5��ī����");
		  		attack = attack + 6;
				  defense = defense + 2;
				dk.handcard[4]=0;
		 	  }
		  	 else if (dk.handcard[4]==7) {
		  		System.out.println("5��ī����");
		 		  attack = attack +3;
		 		  dk.handcard[4]=0;
		 	  }
		  	 else if (dk.handcard[4]==8) {
		  		System.out.println("5��ī����");
		  		defense = defense + 1;
		  		dk.handcard[4]=0;
		 	  }
		  	 else if (dk.handcard[4]==9) {
		  		System.out.println("5��ī����");
		 		  attack= attack + 20;
		 		  dk.handcard[4]=0;
		 	  }
		  	else  {
		 		System.out.println("�ٽü����ϼ���");
				h--;
			  }
		 	  break;
		   case 6:
			   System.out.println("Ȯ��");
			   break;
		 	  default :
		 		 System.out.println("�ٽü����ϼ���");
		 		 h--;
		 		  break;
		       
		       }
		       }
		       
		       System.out.println("����� ����!");
		       mon1.HP = mon1.HP - attack;
		       System.out.println("����"+attack+"��ŭ�� ���ظ� �Ծ���.");
		       if(mon1.HP<=0) {
		    	   System.out.println("���� ��������!");
		    	   System.out.println("�����"+mon1.em+"��ŭ�� ���� ȹ���Ͽ���.");
		    	   us.money = us.money+mon1.em;
		    	   break;
		       }
		       
		    	   System.out.println("�屳�� ����!");
		    	   us.HP = us.HP + defense - 10; 
		    	   System.out.println("�����"+-(defense - 10)+"��ŭ�� ���ظ� �Ծ���.");
		       
		     
		       if(us.HP<=0) {
		    	   System.out.println("����� ��������!");
		    	   break;
		       }
		      attack=0;
		      defense = 0;
		      ccount=0;
		       for(int d= 0; d<20; d++) {
		    	   if(dk.tpdeck[d]!=0) {
		    		   ccount=ccount+1;
		    	   }
		    	   else {
		    		   
		    	   }
		       }
		       System.out.println("���Ⳳ������"+ccount);
		      //����ī��� 3�� �̸��϶�
		       if(ccount<3) {
		    	   dk.setdeck();               
		           
		           
		    	   for(int u=0; u<5; u++) {
		    		   for(int y=0; y<20; y++) {
		    			 if ( dk.handcard[u]== dk.tpdeck[y]) {
		    				 dk.tpdeck[y]=0;
		    				 break;
		    			 }
		    			 else {
		    				 
		    			 }
		    			 
		    		   }
		    		   
		    	   } 
		    	   
		    	   dk.shuffle(dk.tpdeck, 15);
		    	   
		       }
		       
		    
		       b=0;
		       //�󽽷����� üũ�ϰ� ���ڸ��� ī��ֱ�  
		       for(int k=0; k<dk.handcard.length; k++) { //ī�� 5��̰� ����

		    	   if(dk.handcard[k]==0) {
		    	   
		   		if(dk.tpdeck[b]!=0) {
		       		dk.handcard[k]=dk.tpdeck[b];
		       		dk.tpdeck[b]=0;
		       		b++;
		       		
		       		
		       	}
		       	else if(dk.tpdeck[b]==0){
		       		b++;
		       		k--;
		       		
		       	}	
		   		
		    	   }
		    	   else {
		    		   
		    	   }
		   		
		   }

				}//�����ݺ� ������ ���ȣ
			

			
			mp.mapping(mylocation);
			mylocation=52;
			//��ٷȴٰ������̺�Ʈ
			System.out.println("========================����========================");
        	System.out.println("������:"+us.money);
        	System.out.println("�������! ���°� ���� ���ֽ��ϴ�!");
        	System.out.println("1.����ī��:30��   2.���ī��:10��  3.����Ư��ī��:80��   4.��Ŀī��:200��   5.�����Ǻ���:150��   6.������");
        	while(ch!=6) {
        		
        ch=sc.nextInt();
        switch(ch) {
        case 1:
        	if(aa==0) {
        	if(us.money>=30) {
        if(us.job==1) {
        	System.out.println("ī�带�����߽��ϴ�");
        	 us.cardcount= us.cardcount+1;
        	dk.deck[10]=1; aa=1;
        	us.money=us.money-30;
        }
        else if(us.job==2) {
        	System.out.println("ī�带�����߽��ϴ�");
        	 us.cardcount= us.cardcount+1;
        	dk.deck[10]=4; aa=1;
        	us.money=us.money-30;
        }
        else if(us.job==3) {
        	System.out.println("ī�带�����߽��ϴ�");
        	 us.cardcount= us.cardcount+1;
        	dk.deck[10]=7; aa=1;
        	us.money=us.money-30;
        }
        	}else {
        		System.out.println("���̺����մϴ�.");
        	}
        	}else {System.out.println("��������!");}
        	
        	break;
        	
case 2:
	if(bb==0) {
	if(us.money>=10) {
	if(us.job==1) {
		System.out.println("ī�带�����߽��ϴ�");
		 us.cardcount= us.cardcount+1;
    	dk.deck[11]=2;bb=1;
    	us.money=us.money-10;
    }
    else if(us.job==2) {
    	System.out.println("ī�带�����߽��ϴ�");
    	 us.cardcount= us.cardcount+1;
    	dk.deck[11]=5;bb=1;
    	us.money=us.money-10;
    }
    else if(us.job==3) {
    	System.out.println("ī�带�����߽��ϴ�");
    	 us.cardcount= us.cardcount+1;
    	dk.deck[11]=8;bb=1;
    	us.money=us.money-10;
    }
	}
    else {
		System.out.println("���̺����մϴ�.");
	}}else {System.out.println("��������!");}

        	break;
case 3:
	if(cc==0) {
	if(us.money>=80) {
		if(us.job==1) {
			System.out.println("ī�带�����߽��ϴ�");
			 us.cardcount= us.cardcount+1;
	    	dk.deck[12]=3;cc=1;
	    	us.money=us.money-80;
	    }
	    else if(us.job==2) {
	    	System.out.println("ī�带�����߽��ϴ�");
	    	 us.cardcount= us.cardcount+1;
	    	dk.deck[12]=6;cc=1;
	    	us.money=us.money-80;
	    }
	    else if(us.job==3) {
	    	System.out.println("ī�带�����߽��ϴ�");
	    	 us.cardcount= us.cardcount+1;
	    	dk.deck[12]=9;cc=1;
	    	us.money=us.money-80;
	    }
		}
	    else {
			System.out.println("���̺����մϴ�.");
		}}else {System.out.println("��������");}
	break;
	
case 4:
	if(us.money>=200) {
		System.out.println("�������������� ��ձ� ��վ�!");
		System.out.println("�ڳ� ��𰡼��� �����ϴ°� �����ϰԳ� ������");
		 
	us.money=us.money-200;
	break;
	}else {
		System.out.println("���̺����մϴ�.");
	}
	break;
	
case 5:
	if(ee==0) {
	if(us.money>=150) {
		System.out.println("�����������߽��ϴ�");
		ee=1;
		us.cardcount=us.cardcount+1;
		us.HP=us.HP+20;
		us.money=us.money-150;
		relic1[1]=1;
		if(us.job==1) {
	    	dk.deck[13]=3;
	    }
	    else if(us.job==2) {
	    	dk.deck[13]=6;	
	    }
	    else if(us.job==3) {
	    	dk.deck[13]=9;
	    }
	}else {
		System.out.println("���̺����մϴ�.");
	}}else {System.out.println("��������ϴ�!");}
	break;
case 6:
	System.out.println("����� �����ϴ�.");
	break;
        default:
        	System.out.println("����� ������!");
        	break;
        
   
        }
        	
        	
        	}

			
			mp.mapping(mylocation);
			mylocation=61;
			//��ٷȴٰ� ������
			System.out.println("===============��������===============");
			System.out.println("���հ� ���� �߻�!");
			enemy satan = new enemy();
			satan.monname="���ձ� �屳";
			satan.HP=50;
			satan.em=500;
			satan.monnum=0;
			dk.setdeck();               //deck�� tpdeck�� ����
	        dk.shuffle(dk.tpdeck, 15);	//ī�����
	       
	        b=0;
	        for(int k=0; k<dk.handcard.length; k++) { //ī�� 5��̰� ����
	        	
	        	
	        	
	        		if(dk.tpdeck[b]!=0) {
	            		dk.handcard[k]=dk.tpdeck[b];
	            		dk.tpdeck[b]=0;
	            		b++;
	     		
	            	}
	            	else if(dk.tpdeck[b]==0){
	            		b++;
	            		k--;	
	            	}	
	        }
	        
	        
	        while(us.HP>0 || satan.HP>0) {
	        	b=0;
	       int ccount=0;
	       
	       for(int d= 0; d<20; d++) {
	    	   if(dk.tpdeck[d]!=0) {
	    		   ccount=ccount+1;
	    	   }
	    	   else {
	    		   
	    	   }
	       }
	     
	       System.out.print("����: ");rc.showrelic(relic);rc.showrelic(relic1); rc.showrelic(relic2);System.out.println(""); 	
	       dk.showcard();
	       System.out.println("");
	       
	       
	       int defense=0;
	       System.out.println("��ī���"+us.cardcount);
	       System.out.println("����ī���"+ccount);
	       System.out.println("�����ü��:"+us.HP);
	       System.out.println("����ü��:"+satan.HP);
	       System.out.println("����� ī�带  3�� �����Ͻÿ�. ��ҺҰ� ������ ����!");
	       System.out.println("1.  2.  3.  4.  5. 6.Ȯ��");
	       
	      

	       int attack=0;
	       for(int h=0; h<3; h++) {
	       ch=sc.nextInt();
	       switch(ch) {
	       case 1:
	     	  if(dk.handcard[0]==1) {
	     		  System.out.println("1��ī����");
	     		 attack = attack + 7;
	     		 dk.handcard[0]=0;
	     	  }
	     	  else if (dk.handcard[0]==2) {
	     		 System.out.println("1��ī����");
	     		 defense= defense + 1;
	     		dk.handcard[0]=0;
	     	  }
	     	 else if (dk.handcard[0]==3) {
	     		System.out.println("1��ī����");
	     		 attack = attack + 10;
	    		  defense = defense -2;
	    		  dk.handcard[0]=0;
	    	  }
	     	 else if (dk.handcard[0]==4) {
	     		System.out.println("1��ī����");
	     		attack = attack + 5;
	     		dk.handcard[0]=0;
	    	  }
	     	 else if (dk.handcard[0]==5) {
	     		System.out.println("1��ī����");
	     		defense= defense + 2;
	     		dk.handcard[0]=0;
	    	  }
	     	 else if (dk.handcard[0]==6) {
	     		System.out.println("1��ī����");
	     		attack = attack + 6;
	  		  defense = defense + 2;
	  		dk.handcard[0]=0;
	    	  }
	     	 else if (dk.handcard[1]==7) {
	     		System.out.println("1��ī����");
	    		  attack = attack +3;
	    		  dk.handcard[0]=0;
	    	  }
	     	 else if (dk.handcard[1]==8) {
	     		System.out.println("1��ī����");
	     		defense = defense + 1;
	     		dk.handcard[0]=0;
	    	  }
	     	 else if (dk.handcard[1]==9) {
	     		System.out.println("1��ī����");
	    		  attack= attack + 20;
	    		  dk.handcard[0]=0;
	    	  }
	     	else {
	     		System.out.println("�ٽü����ϼ���");
	    		h--;
	    	  }
	     	  
	     	  break;
	   case 2:
		   if(dk.handcard[1]==1) {
	  		  System.out.println("2��ī����");
	  		 attack = attack + 7;
	  		 dk.handcard[1]=0;
	  	  }
	  	  else if (dk.handcard[1]==2) {
	  		 System.out.println("2��ī����");
	  		 defense= defense + 1;
	  		dk.handcard[1]=0;
	  	  }
	  	 else if (dk.handcard[1]==3) {
	  		System.out.println("2��ī����");
	  		 attack = attack + 10;
	 		  defense = defense -2;
	 		  dk.handcard[1]=0;
	 	  }
	  	 else if (dk.handcard[1]==4) {
	  		System.out.println("2��ī����");
	  		attack = attack + 5;
	  		dk.handcard[1]=0;
	 	  }
	  	 else if (dk.handcard[1]==5) {
	  		System.out.println("2��ī����");
	  		defense= defense + 2;
	  		dk.handcard[1]=0;
	 	  }
	  	 else if (dk.handcard[1]==6) {
	  		System.out.println("2��ī����");
	  		attack = attack + 6;
			  defense = defense + 2;
			dk.handcard[1]=0;
	 	  }
	  	 else if (dk.handcard[1]==7) {
	  		System.out.println("2��ī����");
	 		  attack = attack +3;
	 		  dk.handcard[1]=0;
	 	  }
	  	 else if (dk.handcard[1]==8) {
	  		System.out.println("2��ī����");
	  		defense = defense + 1;
	  		dk.handcard[1]=0;
	 	  }
	  	 else if (dk.handcard[1]==9) {
	  		System.out.println("2��ī����");
	 		  attack= attack + 20;
	 		  dk.handcard[1]=0;
	 	  }  
	  	else  {
	 		System.out.println("�ٽü����ϼ���");
			h--;
		  }
	     	  break;
	     	  
	   case 3:
		   if(dk.handcard[2]==1) {
	  		  System.out.println("3��ī����");
	  		 attack = attack + 7;
	  		 dk.handcard[2]=0;
	  	  }
	  	  else if (dk.handcard[2]==2) {
	  		 System.out.println("3��ī����");
	  		 defense= defense + 1;
	  		dk.handcard[2]=0;
	  	  }
	  	 else if (dk.handcard[2]==3) {
	  		System.out.println("3��ī����");
	  		 attack = attack + 10;
	 		  defense = defense -2;
	 		  dk.handcard[2]=0;
	 	  }
	  	 else if (dk.handcard[2]==4) {
	  		System.out.println("3��ī����");
	  		attack = attack + 5;
	  		dk.handcard[2]=0;
	 	  }
	  	 else if (dk.handcard[2]==5) {
	  		System.out.println("3��ī����");
	  		defense= defense + 2;
	  		dk.handcard[2]=0;
	 	  }
	  	 else if (dk.handcard[2]==6) {
	  		System.out.println("3��ī����");
	  		attack = attack + 6;
			  defense = defense + 2;
			dk.handcard[2]=0;
	 	  }
	  	 else if (dk.handcard[2]==7) {
	  		System.out.println("3��ī����");
	 		  attack = attack +3;
	 		  dk.handcard[2]=0;
	 	  }
	  	 else if (dk.handcard[2]==8) {
	  		System.out.println("3��ī����");
	  		defense = defense + 1;
	  		dk.handcard[2]=0;
	 	  }
	  	 else if (dk.handcard[2]==9) {
	  		System.out.println("3��ī����");
	 		  attack= attack + 20;
	 		  dk.handcard[2]=0;
	 	  }
	  	else  {
	 		System.out.println("�ٽü����ϼ���");
			h--;
		  }
	 	  break;
	   case 4:
		   if(dk.handcard[3]==1) {
	  		  System.out.println("4��ī����");
	  		 attack = attack + 7;
	  		 dk.handcard[3]=0;
	  	  }
	  	  else if (dk.handcard[3]==2) {
	  		 System.out.println("4��ī����");
	  		 defense= defense + 1;
	  		dk.handcard[3]=0;
	  	  }
	  	 else if (dk.handcard[3]==3) {
	  		System.out.println("4��ī����");
	  		 attack = attack + 10;
	 		  defense = defense -2;
	 		  dk.handcard[3]=0;
	 	  }
	  	 else if (dk.handcard[3]==4) {
	  		System.out.println("4��ī����");
	  		attack = attack + 5;
	  		dk.handcard[3]=0;
	 	  }
	  	 else if (dk.handcard[3]==5) {
	  		System.out.println("4��ī����");
	  		defense= defense + 2;
	  		dk.handcard[3]=0;
	 	  }
	  	 else if (dk.handcard[3]==6) {
	  		System.out.println("4��ī����");
	  		attack = attack + 6;
			  defense = defense + 2;
			dk.handcard[3]=0;
	 	  }
	  	 else if (dk.handcard[3]==7) {
	  		System.out.println("4��ī����");
	 		  attack = attack +3;
	 		  dk.handcard[3]=0;
	 	  }
	  	 else if (dk.handcard[3]==8) {
	  		System.out.println("4��ī����");
	  		defense = defense + 1;
	  		dk.handcard[3]=0;
	 	  }
	  	 else if (dk.handcard[3]==9) {
	  		System.out.println("4��ī����");
	 		  attack= attack + 20;
	 		  dk.handcard[3]=0;
	 	  }
	  	else if (dk.handcard[3]==0) {
	 		System.out.println("�ٽü����ϼ���");
			h--;
		  }
	 	  break;
	   case 5:
		   if(dk.handcard[4]==1) {
	  		  System.out.println("5��ī����");
	  		 attack = attack + 7;
	  		 dk.handcard[4]=0;
	  	  }
	  	  else if (dk.handcard[4]==2) {
	  		 System.out.println("5��ī����");
	  		 defense= defense + 1;
	  		dk.handcard[4]=0;
	  	  }
	  	 else if (dk.handcard[4]==3) {
	  		System.out.println("5��ī����");
	  		 attack = attack + 10;
	 		  defense = defense -2;
	 		  dk.handcard[4]=0;
	 	  }
	  	 else if (dk.handcard[4]==4) {
	  		System.out.println("5��ī����");
	  		attack = attack + 5;
	  		dk.handcard[4]=0;
	 	  }
	  	 else if (dk.handcard[4]==5) {
	  		System.out.println("5��ī����");
	  		defense= defense + 2;
	  		dk.handcard[4]=0;
	 	  }
	  	 else if (dk.handcard[4]==6) {
	  		System.out.println("5��ī����");
	  		attack = attack + 6;
			  defense = defense + 2;
			dk.handcard[4]=0;
	 	  }
	  	 else if (dk.handcard[4]==7) {
	  		System.out.println("5��ī����");
	 		  attack = attack +3;
	 		  dk.handcard[4]=0;
	 	  }
	  	 else if (dk.handcard[4]==8) {
	  		System.out.println("5��ī����");
	  		defense = defense + 1;
	  		dk.handcard[4]=0;
	 	  }
	  	 else if (dk.handcard[4]==9) {
	  		System.out.println("5��ī����");
	 		  attack= attack + 20;
	 		  dk.handcard[4]=0;
	 	  }
	  	else  {
	 		System.out.println("�ٽü����ϼ���");
			h--;
		  }
	 	  break;
	   case 6:
		   System.out.println("Ȯ��");
		   break;
	 	  default :
	 		 System.out.println("�ٽü����ϼ���");
	 		 h--;
	 		  break;
	       
	       }
	       }
	       
	       System.out.println("����� ����!");
	       satan.HP = satan.HP - attack;
	       System.out.println("����"+attack+"��ŭ�� ���ظ� �Ծ���.");
	       if(satan.HP<=0) {
	    	   System.out.println("������ ��������!");
	    	   System.out.println("�����"+satan.em+"��ŭ�� ���� ȹ���Ͽ���.");
	    	   us.money = us.money+satan.em;
	    	   boss=1;
	    	   break;
	       }
	      
	       int beh = (int)(Math.random()*10);
	       if(beh<9) {
	    	   System.out.println("������ ����!");
	    	   us.HP = us.HP + defense - 15; 
	    	   System.out.println("�����"+-(defense - 15)+"��ŭ�� ���ظ� �Ծ���.");
	       }
	       else {
	    	   System.out.println("������ �ϰ�!");
	    	   us.HP = us.HP + defense - 40;
	    	   System.out.println("�����"+-(defense - 40)+"��ŭ�� ���ظ� �Ծ���.");
	       }
	       
	     
	       if(us.HP<=0) {
	    	   System.out.println("����� ��������!");
	    	   break;
	       }
	      attack=0;
	      defense = 0;
	      ccount=0;
	       for(int d= 0; d<20; d++) {
	    	   if(dk.tpdeck[d]!=0) {
	    		   ccount=ccount+1;
	    	   }
	    	   else {
	    		   
	    	   }
	       }
	       System.out.println("���Ⳳ������"+ccount);
	      //����ī��� 3�� �̸��϶�
	       if(ccount<3) {
	    	   dk.setdeck();               
	           
	           
	    	   for(int u=0; u<5; u++) {
	    		   for(int y=0; y<20; y++) {
	    			 if ( dk.handcard[u]== dk.tpdeck[y]) {
	    				 dk.tpdeck[y]=0;
	    				 break;
	    			 }
	    			 else {
	    				 
	    			 }
	    			 
	    		   }
	    		   
	    	   } 
	    	   
	    	   dk.shuffle(dk.tpdeck, 15);
	    	   
	       }
	       
	    
	       b=0;
	       //�󽽷����� üũ�ϰ� ���ڸ��� ī��ֱ�  
	       for(int k=0; k<dk.handcard.length; k++) { //ī�� 5��̰� ����

	    	   if(dk.handcard[k]==0) {
	    	   
	   		if(dk.tpdeck[b]!=0) {
	       		dk.handcard[k]=dk.tpdeck[b];
	       		dk.tpdeck[b]=0;
	       		b++;
	       		
	       		
	       	}
	       	else if(dk.tpdeck[b]==0){
	       		b++;
	       		k--;
	       		
	       	}	
	   		
	    	   }
	    	   else {
	    		   
	    	   }
	   		
	   }
			}//�����ݺ� ������ ���ȣ

		}
		
	}
	
	}catch(InputMismatchException e){
		System.out.println("����� �׷� ���������� ������� ���տ� �¼� �� �����ϴ�. ������ �����մϴ�.");
		break;
	}

	//	}//��������ü���� �ݺ��� ������ ���ȣ

		}//���Ϲ���
		 if(us.HP<=0) {
		 System.out.println("���ӿ���");
		 }
		 if(boss==1) {
			 System.out.println("����� ������ ����Ʈ���� ���� ��ȭ�� �����Խ��ϴ�!");
			 System.out.println("����� ������ �������� ���� �ļ��� ���̱��� �������Դϴ�.");
			 System.out.println("���� Ŭ����");

		 }
	
		
	//������ ��	
	}

}
