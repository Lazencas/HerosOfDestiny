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

	
		//타이틀뜨고 1초 기다림
		try{
			
			Thread.sleep(6000);
		}catch(Exception e){}
		
		
		
		
		//선택지 번호를 담을 변수 ch
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
		 System.out.println("강력한 마왕과 그의 군대에 대항할 영웅을 고르시오. 신중하게 고르시오!(문자나 특수문자입력시 종료하고 3이상 숫자는 3으로취급)");
		 System.out.println("1.마왕군토벌병사  2.고원부족의전사  3.대마법사의제자");
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
					
					 
					
					 System.out.println("강력한 마왕이 그의 군대와 함께 출현하여 세상을 멸망의 위기에 몰아넣었습니다.");
					 try{Thread.sleep(2000);
						}catch(Exception e){}
					 System.out.println("당신은 자신의 가족과 마을을 학살한 마왕군에게 복수하기 위하여 마왕군을 토벌하는 부대에 지원하였습니다.");
					 try{Thread.sleep(2000);
						}catch(Exception e){}
					 System.out.println("수많은 사람들의 기대와 희망을 안고 출전하지만  강력한 마왕군에 의하여 군대는 궤멸하고 흩어졌고");
					 try{Thread.sleep(2000);
						}catch(Exception e){}
					 System.out.println("심각한 부상을 입은 당신은 전장을 이탈하여 어느 바위 아래에서 몸을 기대어 죽음을 기다리고 있었습니다.");
					 try{Thread.sleep(2000);
						}catch(Exception e){}
					 System.out.println("당신은 이런상황의 모든 원인인 마왕에게 분노가 치밀었습니다. 그러자 갑자기 머리속에 어느 목소리가 울려퍼집니다.");
					 try{Thread.sleep(2000);
						}catch(Exception e){}
					 System.out.println("\"힘을 원하는가? 내가 그 힘을 주겠다. 대신 너의 영혼은 내가 가져가겠다. 내 제안에 응하려면 너 자신의 심장을 찔러라!\"");
					 try{Thread.sleep(2000);
						}catch(Exception e){}
					 System.out.println("당신은 망설임 없이 들려있던 검을 거꾸로 쥐고 자신의 심장을 향해 찌릅니다.");
					 try{Thread.sleep(2000);
						}catch(Exception e){}
					 System.out.println("엄청난 고통이 밀려왔고 검은안개가 몸을 감싸더니 잠시 후 모든 상처가 없어지고 몸안에서 힘이 느껴집니다.");
					 try{Thread.sleep(2000);
						}catch(Exception e){}
					 System.out.println("당신은 마왕을 향한 분노와 복수심을 불태우며 일어섭니다.");

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
					 
					 System.out.println("당신은 어느 한 고원에있는 전통있는 부족의 일원입니다. 당신의 부족은 세상과 동떨어져있습니다.");
					 try{Thread.sleep(2000);
						}catch(Exception e){}
					 System.out.println("하지만 대대로 세상에 큰 위협이 있을때마다 그들 부족은 가장 뛰어난 부족원을 세상에 보내 돕게하였습니다.");
					 try{Thread.sleep(2000);
						}catch(Exception e){}
					 System.out.println("부족은 세상에 마왕이 출현한 것을 전해 듣고 부족에서 가장 강하고 용맹한 전사인 당신을 보내기로 하였습니다.");
					 try{Thread.sleep(2000);
						}catch(Exception e){}
					 System.out.println("이제 당신은 부족의 명예와 전통을 짊어지고 자신을 증명하기 위하여 마왕을 사냥하러 나섭니다.");

					 
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
					
					 
					 System.out.println("어느 고명한 귀족의 자제였던 당신은 어느날 위대한 마법사의 눈에 띄어 제자로 들어가게 됩니다.");
					 try{Thread.sleep(2000);
						}catch(Exception e){}
					 System.out.println("당신은 마법사의 제자로 지내며 그 마법사의 실력과 인품에 진심으로 감탄하고 그와같이 되기위해 마법을 수련합니다.");
					 try{Thread.sleep(2000);
						}catch(Exception e){}
					 System.out.println("어느 날 강력한 마왕이 출현하였고 그의 스승은 왕국의 구원요청에 지체없이 짐을 싸서 당신을 남기고 떠납니다.");
					 try{Thread.sleep(2000);
						}catch(Exception e){}
					 System.out.println("당신은 스승을 기다리며 계속해서 마법을 수련하지만 언제가 지나도 스승은 돌아오지 않습니다.");
					 try{Thread.sleep(2000);
						}catch(Exception e){}
					 System.out.println("당신은 결국 스승을 찾아 마왕의성을 향하여 떠나기로 결심합니다.");


					 
					 
				 }
				
		 
				 
				}catch(InputMismatchException e){
					System.out.println("문자나 특수문자를 입력했으므로 종료합니다.");
					
				}
/*		
*/		
		//게임의 전체적인 반복문
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
			//현재 내 위치
			int mylocation=11;
			mp.mapping(mylocation);
			//책갈피
			
				System.out.println("현재가지고있는카드들");
				for(int z=0; z<20; z++) {
					if(dk.deck[z]==1) {
					
						System.out.println("베기");
					}
					else if (dk.deck[z]==2)	{
						System.out.println("방패방어");
					}
		else if (dk.deck[z]==3)	{
			System.out.println("악마의일격");
					}
		else if (dk.deck[z]==4)	{
			System.out.println("사격");
		}
		else if (dk.deck[z]==5)	{
			System.out.println("회피");
		}
		else if (dk.deck[z]==6)	{
			System.out.println("회피사격");
		}
		else if (dk.deck[z]==7)	{
			System.out.println("후리기");
		}
		else if (dk.deck[z]==8)	{
			System.out.println("막기");
		}
		else if (dk.deck[z]==9)	{
			System.out.println("파이어");
		}
						
				}
				try{Thread.sleep(2000);
				}catch(Exception e){}
			
			
			System.out.println("체력:"+us.HP);
			System.out.print("유물: ");rc.showrelic(relic);rc.showrelic(relic1); rc.showrelic(relic2);System.out.println("");
			System.out.println("소지금:"+us.money);
			System.out.println("어디로 갈 것인가?(문자나특수문자입력시 종료하고 2이상 숫자는 2로취급)");
			System.out.println("1.휴식  2.상인");
try {
	ch=sc.nextInt();
	if(ch==1) {
		mylocation=21;
		
		//휴식
		System.out.println("휴식");
		System.out.println("체력을 20회복합니다.");
		us.HP=us.HP + 20;

		
		mp.mapping(mylocation);
		//기다렸다가
		 try{Thread.sleep(2000);
			}catch(Exception e){}
		
		mylocation=31;
		//중간보스배틀
		
		System.out.println("===============중보===============");
		System.out.println("마왕군 군단장과 전투 발생!");
		enemy middle = new enemy();
	       middle.monname="마왕군 군단장";
	       middle.HP=20;
	       middle.em=100;
	       middle.monnum=1;
		dk.setdeck();               //deck를 tpdeck로 복사
        dk.shuffle(dk.tpdeck, 15);	//카드셔플
        
        int b=0;
        for(int k=0; k<dk.handcard.length; k++) { //카드 5장뽑고 저장
        	
        	
        	
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
     
       System.out.print("유물: ");rc.showrelic(relic);rc.showrelic(relic1); rc.showrelic(relic2);System.out.println(""); 	
       dk.showcard();
       System.out.println("");
       
       
       int defense=0;
       System.out.println("총카드수"+us.cardcount);
       System.out.println("남은카드수"+ccount);
       System.out.println("당신의체력:"+us.HP);
       System.out.println("적의체력:"+middle.HP);
       System.out.println("사용할 카드를  3개 선택하시오. 취소불가 신중히 선택!");
       System.out.println("1.  2.  3.  4.  5. 6.확인");
       
      

       
       int attack=0;
       for(int h=0; h<3; h++) {
       ch=sc.nextInt();
       switch(ch) {
       case 1:
     	  if(dk.handcard[0]==1) {
     		  System.out.println("1번카드사용");
     		 attack = attack + 7;
     		 dk.handcard[0]=0;
     	  }
     	  else if (dk.handcard[0]==2) {
     		 System.out.println("1번카드사용");
     		 defense= defense + 1;
     		dk.handcard[0]=0;
     	  }
     	 else if (dk.handcard[0]==3) {
     		System.out.println("1번카드사용");
     		 attack = attack + 10;
    		  defense = defense -2;
    		  dk.handcard[0]=0;
    	  }
     	 else if (dk.handcard[0]==4) {
     		System.out.println("1번카드사용");
     		attack = attack + 5;
     		dk.handcard[0]=0;
    	  }
     	 else if (dk.handcard[0]==5) {
     		System.out.println("1번카드사용");
     		defense= defense + 2;
     		dk.handcard[0]=0;
    	  }
     	 else if (dk.handcard[0]==6) {
     		System.out.println("1번카드사용");
     		attack = attack + 6;
  		  defense = defense + 2;
  		dk.handcard[0]=0;
    	  }
     	 else if (dk.handcard[1]==7) {
     		System.out.println("1번카드사용");
    		  attack = attack +3;
    		  dk.handcard[0]=0;
    	  }
     	 else if (dk.handcard[1]==8) {
     		System.out.println("1번카드사용");
     		defense = defense + 1;
     		dk.handcard[0]=0;
    	  }
     	 else if (dk.handcard[1]==9) {
     		System.out.println("1번카드사용");
    		  attack= attack + 20;
    		  dk.handcard[0]=0;
    	  }
     	else {
     		System.out.println("다시선택하세요");
    		h--;
    	  }
     	  
     	  break;
   case 2:
	   if(dk.handcard[1]==1) {
  		  System.out.println("2번카드사용");
  		 attack = attack + 7;
  		 dk.handcard[1]=0;
  	  }
  	  else if (dk.handcard[1]==2) {
  		 System.out.println("2번카드사용");
  		 defense= defense + 1;
  		dk.handcard[1]=0;
  	  }
  	 else if (dk.handcard[1]==3) {
  		System.out.println("2번카드사용");
  		 attack = attack + 10;
 		  defense = defense -2;
 		  dk.handcard[1]=0;
 	  }
  	 else if (dk.handcard[1]==4) {
  		System.out.println("2번카드사용");
  		attack = attack + 5;
  		dk.handcard[1]=0;
 	  }
  	 else if (dk.handcard[1]==5) {
  		System.out.println("2번카드사용");
  		defense= defense + 2;
  		dk.handcard[1]=0;
 	  }
  	 else if (dk.handcard[1]==6) {
  		System.out.println("2번카드사용");
  		attack = attack + 6;
		  defense = defense + 2;
		dk.handcard[1]=0;
 	  }
  	 else if (dk.handcard[1]==7) {
  		System.out.println("2번카드사용");
 		  attack = attack +3;
 		  dk.handcard[1]=0;
 	  }
  	 else if (dk.handcard[1]==8) {
  		System.out.println("2번카드사용");
  		defense = defense + 1;
  		dk.handcard[1]=0;
 	  }
  	 else if (dk.handcard[1]==9) {
  		System.out.println("2번카드사용");
 		  attack= attack + 20;
 		  dk.handcard[1]=0;
 	  }  
  	else  {
 		System.out.println("다시선택하세요");
		h--;
	  }
     	  break;
     	  
   case 3:
	   if(dk.handcard[2]==1) {
  		  System.out.println("3번카드사용");
  		 attack = attack + 7;
  		 dk.handcard[2]=0;
  	  }
  	  else if (dk.handcard[2]==2) {
  		 System.out.println("3번카드사용");
  		 defense= defense + 1;
  		dk.handcard[2]=0;
  	  }
  	 else if (dk.handcard[2]==3) {
  		System.out.println("3번카드사용");
  		 attack = attack + 10;
 		  defense = defense -2;
 		  dk.handcard[2]=0;
 	  }
  	 else if (dk.handcard[2]==4) {
  		System.out.println("3번카드사용");
  		attack = attack + 5;
  		dk.handcard[2]=0;
 	  }
  	 else if (dk.handcard[2]==5) {
  		System.out.println("3번카드사용");
  		defense= defense + 2;
  		dk.handcard[2]=0;
 	  }
  	 else if (dk.handcard[2]==6) {
  		System.out.println("3번카드사용");
  		attack = attack + 6;
		  defense = defense + 2;
		dk.handcard[2]=0;
 	  }
  	 else if (dk.handcard[2]==7) {
  		System.out.println("3번카드사용");
 		  attack = attack +3;
 		  dk.handcard[2]=0;
 	  }
  	 else if (dk.handcard[2]==8) {
  		System.out.println("3번카드사용");
  		defense = defense + 1;
  		dk.handcard[2]=0;
 	  }
  	 else if (dk.handcard[2]==9) {
  		System.out.println("3번카드사용");
 		  attack= attack + 20;
 		  dk.handcard[2]=0;
 	  }
  	else  {
 		System.out.println("다시선택하세요");
		h--;
	  }
 	  break;
   case 4:
	   if(dk.handcard[3]==1) {
  		  System.out.println("4번카드사용");
  		 attack = attack + 7;
  		 dk.handcard[3]=0;
  	  }
  	  else if (dk.handcard[3]==2) {
  		 System.out.println("4번카드사용");
  		 defense= defense + 1;
  		dk.handcard[3]=0;
  	  }
  	 else if (dk.handcard[3]==3) {
  		System.out.println("4번카드사용");
  		 attack = attack + 10;
 		  defense = defense -2;
 		  dk.handcard[3]=0;
 	  }
  	 else if (dk.handcard[3]==4) {
  		System.out.println("4번카드사용");
  		attack = attack + 5;
  		dk.handcard[3]=0;
 	  }
  	 else if (dk.handcard[3]==5) {
  		System.out.println("4번카드사용");
  		defense= defense + 2;
  		dk.handcard[3]=0;
 	  }
  	 else if (dk.handcard[3]==6) {
  		System.out.println("4번카드사용");
  		attack = attack + 6;
		  defense = defense + 2;
		dk.handcard[3]=0;
 	  }
  	 else if (dk.handcard[3]==7) {
  		System.out.println("4번카드사용");
 		  attack = attack +3;
 		  dk.handcard[3]=0;
 	  }
  	 else if (dk.handcard[3]==8) {
  		System.out.println("4번카드사용");
  		defense = defense + 1;
  		dk.handcard[3]=0;
 	  }
  	 else if (dk.handcard[3]==9) {
  		System.out.println("4번카드사용");
 		  attack= attack + 20;
 		  dk.handcard[3]=0;
 	  }
  	else if (dk.handcard[3]==0) {
 		System.out.println("다시선택하세요");
		h--;
	  }
 	  break;
   case 5:
	   if(dk.handcard[4]==1) {
  		  System.out.println("5번카드사용");
  		 attack = attack + 7;
  		 dk.handcard[4]=0;
  	  }
  	  else if (dk.handcard[4]==2) {
  		 System.out.println("5번카드사용");
  		 defense= defense + 1;
  		dk.handcard[4]=0;
  	  }
  	 else if (dk.handcard[4]==3) {
  		System.out.println("5번카드사용");
  		 attack = attack + 10;
 		  defense = defense -2;
 		  dk.handcard[4]=0;
 	  }
  	 else if (dk.handcard[4]==4) {
  		System.out.println("5번카드사용");
  		attack = attack + 5;
  		dk.handcard[4]=0;
 	  }
  	 else if (dk.handcard[4]==5) {
  		System.out.println("5번카드사용");
  		defense= defense + 2;
  		dk.handcard[4]=0;
 	  }
  	 else if (dk.handcard[4]==6) {
  		System.out.println("5번카드사용");
  		attack = attack + 6;
		  defense = defense + 2;
		dk.handcard[4]=0;
 	  }
  	 else if (dk.handcard[4]==7) {
  		System.out.println("5번카드사용");
 		  attack = attack +3;
 		  dk.handcard[4]=0;
 	  }
  	 else if (dk.handcard[4]==8) {
  		System.out.println("5번카드사용");
  		defense = defense + 1;
  		dk.handcard[4]=0;
 	  }
  	 else if (dk.handcard[4]==9) {
  		System.out.println("5번카드사용");
 		  attack= attack + 20;
 		  dk.handcard[4]=0;
 	  }
  	else  {
 		System.out.println("다시선택하세요");
		h--;
	  }
 	  break;
   case 6:
	   System.out.println("확인");
	   break;
 	  default :
 		 System.out.println("다시선택하세요");
 		 h--;
 		  break;
       
       }
       }
       
       System.out.println("당신의 공격!");
       middle.HP = middle.HP - attack;
       System.out.println("상대는"+attack+"만큼의 피해를 입었다.");
       if(middle.HP<=0) {
    	   System.out.println("적은 쓰러졌다!");
    	   System.out.println("당신은 유물을 획득하였다!");
    	   System.out.println("당신은"+middle.em+"만큼의 돈을 획득하였다.");
    	   relic[0]=1;
    	   us.HP= us.HP+30;
    	   us.money = us.money+middle.em;
    	   break;
       }
       int beh = (int)(Math.random()*10);
       if(beh<8) {
    	   System.out.println("군단장의 공격!");
    	   us.HP = us.HP + defense - 10; 
    	   System.out.println("당신은"+-(defense - 10)+"만큼의 피해를 입었다.");
       }
       else {
    	   System.out.println("군단장의 일격!");
    	   us.HP = us.HP + defense - 25;
    	   System.out.println("당신은"+-(defense - 25)+"만큼의 피해를 입었다.");
       }
       
       if(us.HP<=0) {
    	   System.out.println("당신은 쓰러졌다!");
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
       System.out.println("여기남은수는"+ccount);
      //남은카드수 3장 미만일때
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
       //빈슬롯인지 체크하고 그자리에 카드넣기  
       for(int k=0; k<dk.handcard.length; k++) { //카드 5장뽑고 저장

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
   
   
     

		}//전투반복 끝나는 대괄호
        
        try{Thread.sleep(3000);
		}catch(Exception e){}
        mylocation=31;
        mp.mapping(mylocation);
        

		//몹
        System.out.println("===============일반몹===============");
		System.out.println("마왕군 장교와 전투 발생!");
		enemy mon1 = new enemy();
	       mon1.monname="마왕군 장교";
	       mon1.HP=15;
	       mon1.em=20;
	       mon1.monnum=2;
		dk.setdeck();               //deck를 tpdeck로 복사
        dk.shuffle(dk.tpdeck, 15);	//카드셔플
       
        b=0;
        for(int k=0; k<dk.handcard.length; k++) { //카드 5장뽑고 저장
        	
        	
        	
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
     
       System.out.print("유물: ");rc.showrelic(relic);rc.showrelic(relic1); rc.showrelic(relic2);System.out.println(""); 	
       dk.showcard();
       System.out.println("");
       
       
       int defense=0;
       System.out.println("총카드수"+us.cardcount);
       System.out.println("남은카드수"+ccount);
       System.out.println("당신의체력:"+us.HP);
       System.out.println("적의체력:"+mon1.HP);
       System.out.println("사용할 카드를  3개 선택하시오. 취소불가 신중히 선택!");
       System.out.println("1.  2.  3.  4.  5. 6.확인");
       
      

       
       int attack=0;
       for(int h=0; h<3; h++) {
       ch=sc.nextInt();
       switch(ch) {
       case 1:
     	  if(dk.handcard[0]==1) {
     		  System.out.println("1번카드사용");
     		 attack = attack + 7;
     		 dk.handcard[0]=0;
     	  }
     	  else if (dk.handcard[0]==2) {
     		 System.out.println("1번카드사용");
     		 defense= defense + 1;
     		dk.handcard[0]=0;
     	  }
     	 else if (dk.handcard[0]==3) {
     		System.out.println("1번카드사용");
     		 attack = attack + 10;
    		  defense = defense -2;
    		  dk.handcard[0]=0;
    	  }
     	 else if (dk.handcard[0]==4) {
     		System.out.println("1번카드사용");
     		attack = attack + 5;
     		dk.handcard[0]=0;
    	  }
     	 else if (dk.handcard[0]==5) {
     		System.out.println("1번카드사용");
     		defense= defense + 2;
     		dk.handcard[0]=0;
    	  }
     	 else if (dk.handcard[0]==6) {
     		System.out.println("1번카드사용");
     		attack = attack + 6;
  		  defense = defense + 2;
  		dk.handcard[0]=0;
    	  }
     	 else if (dk.handcard[1]==7) {
     		System.out.println("1번카드사용");
    		  attack = attack +3;
    		  dk.handcard[0]=0;
    	  }
     	 else if (dk.handcard[1]==8) {
     		System.out.println("1번카드사용");
     		defense = defense + 1;
     		dk.handcard[0]=0;
    	  }
     	 else if (dk.handcard[1]==9) {
     		System.out.println("1번카드사용");
    		  attack= attack + 20;
    		  dk.handcard[0]=0;
    	  }
     	else {
     		System.out.println("다시선택하세요");
    		h--;
    	  }
     	  
     	  break;
   case 2:
	   if(dk.handcard[1]==1) {
  		  System.out.println("2번카드사용");
  		 attack = attack + 7;
  		 dk.handcard[1]=0;
  	  }
  	  else if (dk.handcard[1]==2) {
  		 System.out.println("2번카드사용");
  		 defense= defense + 1;
  		dk.handcard[1]=0;
  	  }
  	 else if (dk.handcard[1]==3) {
  		System.out.println("2번카드사용");
  		 attack = attack + 10;
 		  defense = defense -2;
 		  dk.handcard[1]=0;
 	  }
  	 else if (dk.handcard[1]==4) {
  		System.out.println("2번카드사용");
  		attack = attack + 5;
  		dk.handcard[1]=0;
 	  }
  	 else if (dk.handcard[1]==5) {
  		System.out.println("2번카드사용");
  		defense= defense + 2;
  		dk.handcard[1]=0;
 	  }
  	 else if (dk.handcard[1]==6) {
  		System.out.println("2번카드사용");
  		attack = attack + 6;
		  defense = defense + 2;
		dk.handcard[1]=0;
 	  }
  	 else if (dk.handcard[1]==7) {
  		System.out.println("2번카드사용");
 		  attack = attack +3;
 		  dk.handcard[1]=0;
 	  }
  	 else if (dk.handcard[1]==8) {
  		System.out.println("2번카드사용");
  		defense = defense + 1;
  		dk.handcard[1]=0;
 	  }
  	 else if (dk.handcard[1]==9) {
  		System.out.println("2번카드사용");
 		  attack= attack + 20;
 		  dk.handcard[1]=0;
 	  }  
  	else  {
 		System.out.println("다시선택하세요");
		h--;
	  }
     	  break;
     	  
   case 3:
	   if(dk.handcard[2]==1) {
  		  System.out.println("3번카드사용");
  		 attack = attack + 7;
  		 dk.handcard[2]=0;
  	  }
  	  else if (dk.handcard[2]==2) {
  		 System.out.println("3번카드사용");
  		 defense= defense + 1;
  		dk.handcard[2]=0;
  	  }
  	 else if (dk.handcard[2]==3) {
  		System.out.println("3번카드사용");
  		 attack = attack + 10;
 		  defense = defense -2;
 		  dk.handcard[2]=0;
 	  }
  	 else if (dk.handcard[2]==4) {
  		System.out.println("3번카드사용");
  		attack = attack + 5;
  		dk.handcard[2]=0;
 	  }
  	 else if (dk.handcard[2]==5) {
  		System.out.println("3번카드사용");
  		defense= defense + 2;
  		dk.handcard[2]=0;
 	  }
  	 else if (dk.handcard[2]==6) {
  		System.out.println("3번카드사용");
  		attack = attack + 6;
		  defense = defense + 2;
		dk.handcard[2]=0;
 	  }
  	 else if (dk.handcard[2]==7) {
  		System.out.println("3번카드사용");
 		  attack = attack +3;
 		  dk.handcard[2]=0;
 	  }
  	 else if (dk.handcard[2]==8) {
  		System.out.println("3번카드사용");
  		defense = defense + 1;
  		dk.handcard[2]=0;
 	  }
  	 else if (dk.handcard[2]==9) {
  		System.out.println("3번카드사용");
 		  attack= attack + 20;
 		  dk.handcard[2]=0;
 	  }
  	else  {
 		System.out.println("다시선택하세요");
		h--;
	  }
 	  break;
   case 4:
	   if(dk.handcard[3]==1) {
  		  System.out.println("4번카드사용");
  		 attack = attack + 7;
  		 dk.handcard[3]=0;
  	  }
  	  else if (dk.handcard[3]==2) {
  		 System.out.println("4번카드사용");
  		 defense= defense + 1;
  		dk.handcard[3]=0;
  	  }
  	 else if (dk.handcard[3]==3) {
  		System.out.println("4번카드사용");
  		 attack = attack + 10;
 		  defense = defense -2;
 		  dk.handcard[3]=0;
 	  }
  	 else if (dk.handcard[3]==4) {
  		System.out.println("4번카드사용");
  		attack = attack + 5;
  		dk.handcard[3]=0;
 	  }
  	 else if (dk.handcard[3]==5) {
  		System.out.println("4번카드사용");
  		defense= defense + 2;
  		dk.handcard[3]=0;
 	  }
  	 else if (dk.handcard[3]==6) {
  		System.out.println("4번카드사용");
  		attack = attack + 6;
		  defense = defense + 2;
		dk.handcard[3]=0;
 	  }
  	 else if (dk.handcard[3]==7) {
  		System.out.println("4번카드사용");
 		  attack = attack +3;
 		  dk.handcard[3]=0;
 	  }
  	 else if (dk.handcard[3]==8) {
  		System.out.println("4번카드사용");
  		defense = defense + 1;
  		dk.handcard[3]=0;
 	  }
  	 else if (dk.handcard[3]==9) {
  		System.out.println("4번카드사용");
 		  attack= attack + 20;
 		  dk.handcard[3]=0;
 	  }
  	else if (dk.handcard[3]==0) {
 		System.out.println("다시선택하세요");
		h--;
	  }
 	  break;
   case 5:
	   if(dk.handcard[4]==1) {
  		  System.out.println("5번카드사용");
  		 attack = attack + 7;
  		 dk.handcard[4]=0;
  	  }
  	  else if (dk.handcard[4]==2) {
  		 System.out.println("5번카드사용");
  		 defense= defense + 1;
  		dk.handcard[4]=0;
  	  }
  	 else if (dk.handcard[4]==3) {
  		System.out.println("5번카드사용");
  		 attack = attack + 10;
 		  defense = defense -2;
 		  dk.handcard[4]=0;
 	  }
  	 else if (dk.handcard[4]==4) {
  		System.out.println("5번카드사용");
  		attack = attack + 5;
  		dk.handcard[4]=0;
 	  }
  	 else if (dk.handcard[4]==5) {
  		System.out.println("5번카드사용");
  		defense= defense + 2;
  		dk.handcard[4]=0;
 	  }
  	 else if (dk.handcard[4]==6) {
  		System.out.println("5번카드사용");
  		attack = attack + 6;
		  defense = defense + 2;
		dk.handcard[4]=0;
 	  }
  	 else if (dk.handcard[4]==7) {
  		System.out.println("5번카드사용");
 		  attack = attack +3;
 		  dk.handcard[4]=0;
 	  }
  	 else if (dk.handcard[4]==8) {
  		System.out.println("5번카드사용");
  		defense = defense + 1;
  		dk.handcard[4]=0;
 	  }
  	 else if (dk.handcard[4]==9) {
  		System.out.println("5번카드사용");
 		  attack= attack + 20;
 		  dk.handcard[4]=0;
 	  }
  	else  {
 		System.out.println("다시선택하세요");
		h--;
	  }
 	  break;
   case 6:
	   System.out.println("확인");
	   break;
 	  default :
 		 System.out.println("다시선택하세요");
 		 h--;
 		  break;
       
       }
       }
       
       System.out.println("당신의 공격!");
       mon1.HP = mon1.HP - attack;
       System.out.println("상대는"+attack+"만큼의 피해를 입었다.");
       if(mon1.HP<=0) {
    	   System.out.println("적은 쓰러졌다!");
    	   System.out.println("당신은"+mon1.em+"만큼의 돈을 획득하였다.");
    	   us.money = us.money+mon1.em;
    	   break;
       }
       
    	   System.out.println("장교의 공격!");
    	   us.HP = us.HP + defense - 10; 
    	   System.out.println("당신은"+-(defense - 10)+"만큼의 피해를 입었다.");
       
     
       if(us.HP<=0) {
    	   System.out.println("당신은 쓰러졌다!");
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
       System.out.println("여기남은수는"+ccount);
      //남은카드수 3장 미만일때
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
       //빈슬롯인지 체크하고 그자리에 카드넣기  
       for(int k=0; k<dk.handcard.length; k++) { //카드 5장뽑고 저장

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
   
   
     

		}//전투반복 끝나는 대괄호
        mylocation=41;
    	mp.mapping(mylocation);
        
		System.out.println("현재가지고있는카드들");
		for(int z=0; z<20; z++) {
			if(dk.deck[z]==1) {
			
				System.out.println("베기");
			}
			else if (dk.deck[z]==2)	{
				System.out.println("방패방어");
			}
else if (dk.deck[z]==3)	{
	System.out.println("악마의일격");
			}
else if (dk.deck[z]==4)	{
	System.out.println("사격");
}
else if (dk.deck[z]==5)	{
	System.out.println("회피");
}
else if (dk.deck[z]==6)	{
	System.out.println("회피사격");
}
else if (dk.deck[z]==7)	{
	System.out.println("후리기");
}
else if (dk.deck[z]==8)	{
	System.out.println("막기");
}
else if (dk.deck[z]==9)	{
	System.out.println("파이어");
}
				
		}
		try{Thread.sleep(2000);
		}catch(Exception e){}
		
        System.out.println("어디로 갈 것인가?(문자나특수문자입력시 종료하고 2이상 숫자는 2로취급)");
		System.out.println("1.휴식  2.상인");
		ch=sc.nextInt();
        //휴상갈래길
        if(ch==1) {
        	mylocation=51;
        	mp.mapping(mylocation);
        	System.out.println("휴식");
			System.out.println("체력을 20회복합니다.");
			us.HP=us.HP + 20;
        	
			try{Thread.sleep(2000);
			}catch(Exception e){}
			
			System.out.println("===============마왕출현===============");
			System.out.println("마왕과 전투 발생!");
			enemy satan = new enemy();
			satan.monname="마왕군 장교";
			satan.HP=50;
			satan.em=500;
			satan.monnum=0;
			dk.setdeck();               //deck를 tpdeck로 복사
	        dk.shuffle(dk.tpdeck, 15);	//카드셔플
	       
	        b=0;
	        for(int k=0; k<dk.handcard.length; k++) { //카드 5장뽑고 저장
	        	
	        	
	        	
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
	     
	       System.out.print("유물: ");rc.showrelic(relic);rc.showrelic(relic1); rc.showrelic(relic2);System.out.println(""); 	
	       dk.showcard();
	       System.out.println("");
	       
	       
	       int defense=0;
	       System.out.println("총카드수"+us.cardcount);
	       System.out.println("남은카드수"+ccount);
	       System.out.println("당신의체력:"+us.HP);
	       System.out.println("적의체력:"+satan.HP);
	       System.out.println("사용할 카드를  3개 선택하시오. 취소불가 신중히 선택!");
	       System.out.println("1.  2.  3.  4.  5. 6.확인");
	       
	      

	       int attack=0;
	       for(int h=0; h<3; h++) {
	       ch=sc.nextInt();
	       switch(ch) {
	       case 1:
	     	  if(dk.handcard[0]==1) {
	     		  System.out.println("1번카드사용");
	     		 attack = attack + 7;
	     		 dk.handcard[0]=0;
	     	  }
	     	  else if (dk.handcard[0]==2) {
	     		 System.out.println("1번카드사용");
	     		 defense= defense + 1;
	     		dk.handcard[0]=0;
	     	  }
	     	 else if (dk.handcard[0]==3) {
	     		System.out.println("1번카드사용");
	     		 attack = attack + 10;
	    		  defense = defense -2;
	    		  dk.handcard[0]=0;
	    	  }
	     	 else if (dk.handcard[0]==4) {
	     		System.out.println("1번카드사용");
	     		attack = attack + 5;
	     		dk.handcard[0]=0;
	    	  }
	     	 else if (dk.handcard[0]==5) {
	     		System.out.println("1번카드사용");
	     		defense= defense + 2;
	     		dk.handcard[0]=0;
	    	  }
	     	 else if (dk.handcard[0]==6) {
	     		System.out.println("1번카드사용");
	     		attack = attack + 6;
	  		  defense = defense + 2;
	  		dk.handcard[0]=0;
	    	  }
	     	 else if (dk.handcard[1]==7) {
	     		System.out.println("1번카드사용");
	    		  attack = attack +3;
	    		  dk.handcard[0]=0;
	    	  }
	     	 else if (dk.handcard[1]==8) {
	     		System.out.println("1번카드사용");
	     		defense = defense + 1;
	     		dk.handcard[0]=0;
	    	  }
	     	 else if (dk.handcard[1]==9) {
	     		System.out.println("1번카드사용");
	    		  attack= attack + 20;
	    		  dk.handcard[0]=0;
	    	  }
	     	else {
	     		System.out.println("다시선택하세요");
	    		h--;
	    	  }
	     	  
	     	  break;
	   case 2:
		   if(dk.handcard[1]==1) {
	  		  System.out.println("2번카드사용");
	  		 attack = attack + 7;
	  		 dk.handcard[1]=0;
	  	  }
	  	  else if (dk.handcard[1]==2) {
	  		 System.out.println("2번카드사용");
	  		 defense= defense + 1;
	  		dk.handcard[1]=0;
	  	  }
	  	 else if (dk.handcard[1]==3) {
	  		System.out.println("2번카드사용");
	  		 attack = attack + 10;
	 		  defense = defense -2;
	 		  dk.handcard[1]=0;
	 	  }
	  	 else if (dk.handcard[1]==4) {
	  		System.out.println("2번카드사용");
	  		attack = attack + 5;
	  		dk.handcard[1]=0;
	 	  }
	  	 else if (dk.handcard[1]==5) {
	  		System.out.println("2번카드사용");
	  		defense= defense + 2;
	  		dk.handcard[1]=0;
	 	  }
	  	 else if (dk.handcard[1]==6) {
	  		System.out.println("2번카드사용");
	  		attack = attack + 6;
			  defense = defense + 2;
			dk.handcard[1]=0;
	 	  }
	  	 else if (dk.handcard[1]==7) {
	  		System.out.println("2번카드사용");
	 		  attack = attack +3;
	 		  dk.handcard[1]=0;
	 	  }
	  	 else if (dk.handcard[1]==8) {
	  		System.out.println("2번카드사용");
	  		defense = defense + 1;
	  		dk.handcard[1]=0;
	 	  }
	  	 else if (dk.handcard[1]==9) {
	  		System.out.println("2번카드사용");
	 		  attack= attack + 20;
	 		  dk.handcard[1]=0;
	 	  }  
	  	else  {
	 		System.out.println("다시선택하세요");
			h--;
		  }
	     	  break;
	     	  
	   case 3:
		   if(dk.handcard[2]==1) {
	  		  System.out.println("3번카드사용");
	  		 attack = attack + 7;
	  		 dk.handcard[2]=0;
	  	  }
	  	  else if (dk.handcard[2]==2) {
	  		 System.out.println("3번카드사용");
	  		 defense= defense + 1;
	  		dk.handcard[2]=0;
	  	  }
	  	 else if (dk.handcard[2]==3) {
	  		System.out.println("3번카드사용");
	  		 attack = attack + 10;
	 		  defense = defense -2;
	 		  dk.handcard[2]=0;
	 	  }
	  	 else if (dk.handcard[2]==4) {
	  		System.out.println("3번카드사용");
	  		attack = attack + 5;
	  		dk.handcard[2]=0;
	 	  }
	  	 else if (dk.handcard[2]==5) {
	  		System.out.println("3번카드사용");
	  		defense= defense + 2;
	  		dk.handcard[2]=0;
	 	  }
	  	 else if (dk.handcard[2]==6) {
	  		System.out.println("3번카드사용");
	  		attack = attack + 6;
			  defense = defense + 2;
			dk.handcard[2]=0;
	 	  }
	  	 else if (dk.handcard[2]==7) {
	  		System.out.println("3번카드사용");
	 		  attack = attack +3;
	 		  dk.handcard[2]=0;
	 	  }
	  	 else if (dk.handcard[2]==8) {
	  		System.out.println("3번카드사용");
	  		defense = defense + 1;
	  		dk.handcard[2]=0;
	 	  }
	  	 else if (dk.handcard[2]==9) {
	  		System.out.println("3번카드사용");
	 		  attack= attack + 20;
	 		  dk.handcard[2]=0;
	 	  }
	  	else  {
	 		System.out.println("다시선택하세요");
			h--;
		  }
	 	  break;
	   case 4:
		   if(dk.handcard[3]==1) {
	  		  System.out.println("4번카드사용");
	  		 attack = attack + 7;
	  		 dk.handcard[3]=0;
	  	  }
	  	  else if (dk.handcard[3]==2) {
	  		 System.out.println("4번카드사용");
	  		 defense= defense + 1;
	  		dk.handcard[3]=0;
	  	  }
	  	 else if (dk.handcard[3]==3) {
	  		System.out.println("4번카드사용");
	  		 attack = attack + 10;
	 		  defense = defense -2;
	 		  dk.handcard[3]=0;
	 	  }
	  	 else if (dk.handcard[3]==4) {
	  		System.out.println("4번카드사용");
	  		attack = attack + 5;
	  		dk.handcard[3]=0;
	 	  }
	  	 else if (dk.handcard[3]==5) {
	  		System.out.println("4번카드사용");
	  		defense= defense + 2;
	  		dk.handcard[3]=0;
	 	  }
	  	 else if (dk.handcard[3]==6) {
	  		System.out.println("4번카드사용");
	  		attack = attack + 6;
			  defense = defense + 2;
			dk.handcard[3]=0;
	 	  }
	  	 else if (dk.handcard[3]==7) {
	  		System.out.println("4번카드사용");
	 		  attack = attack +3;
	 		  dk.handcard[3]=0;
	 	  }
	  	 else if (dk.handcard[3]==8) {
	  		System.out.println("4번카드사용");
	  		defense = defense + 1;
	  		dk.handcard[3]=0;
	 	  }
	  	 else if (dk.handcard[3]==9) {
	  		System.out.println("4번카드사용");
	 		  attack= attack + 20;
	 		  dk.handcard[3]=0;
	 	  }
	  	else if (dk.handcard[3]==0) {
	 		System.out.println("다시선택하세요");
			h--;
		  }
	 	  break;
	   case 5:
		   if(dk.handcard[4]==1) {
	  		  System.out.println("5번카드사용");
	  		 attack = attack + 7;
	  		 dk.handcard[4]=0;
	  	  }
	  	  else if (dk.handcard[4]==2) {
	  		 System.out.println("5번카드사용");
	  		 defense= defense + 1;
	  		dk.handcard[4]=0;
	  	  }
	  	 else if (dk.handcard[4]==3) {
	  		System.out.println("5번카드사용");
	  		 attack = attack + 10;
	 		  defense = defense -2;
	 		  dk.handcard[4]=0;
	 	  }
	  	 else if (dk.handcard[4]==4) {
	  		System.out.println("5번카드사용");
	  		attack = attack + 5;
	  		dk.handcard[4]=0;
	 	  }
	  	 else if (dk.handcard[4]==5) {
	  		System.out.println("5번카드사용");
	  		defense= defense + 2;
	  		dk.handcard[4]=0;
	 	  }
	  	 else if (dk.handcard[4]==6) {
	  		System.out.println("5번카드사용");
	  		attack = attack + 6;
			  defense = defense + 2;
			dk.handcard[4]=0;
	 	  }
	  	 else if (dk.handcard[4]==7) {
	  		System.out.println("5번카드사용");
	 		  attack = attack +3;
	 		  dk.handcard[4]=0;
	 	  }
	  	 else if (dk.handcard[4]==8) {
	  		System.out.println("5번카드사용");
	  		defense = defense + 1;
	  		dk.handcard[4]=0;
	 	  }
	  	 else if (dk.handcard[4]==9) {
	  		System.out.println("5번카드사용");
	 		  attack= attack + 20;
	 		  dk.handcard[4]=0;
	 	  }
	  	else  {
	 		System.out.println("다시선택하세요");
			h--;
		  }
	 	  break;
	   case 6:
		   System.out.println("확인");
		   break;
	 	  default :
	 		 System.out.println("다시선택하세요");
	 		 h--;
	 		  break;
	       
	       }
	       }
	       
	       System.out.println("당신의 공격!");
	       satan.HP = satan.HP - attack;
	       System.out.println("상대는"+attack+"만큼의 피해를 입었다.");
	       if(satan.HP<=0) {
	    	   System.out.println("마왕은 쓰러졌다!");
	    	   System.out.println("당신은"+satan.em+"만큼의 돈을 획득하였다.");
	    	   us.money = us.money+satan.em;
	    	   boss=1;
	    	   break;
	       }
	       
	       int beh = (int)(Math.random()*10);
	       if(beh<9) {
	    	   System.out.println("마왕의 공격!");
	    	   us.HP = us.HP + defense - 15; 
	    	   System.out.println("당신은"+-(defense - 15)+"만큼의 피해를 입었다.");
	       }
	       else {
	    	   System.out.println("마왕의 일격!");
	    	   us.HP = us.HP + defense - 40;
	    	   System.out.println("당신은"+-(defense - 40)+"만큼의 피해를 입었다.");
	       }
	       
	     
	       if(us.HP<=0) {
	    	   System.out.println("당신은 쓰러졌다!");
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
	       System.out.println("여기남은수는"+ccount);
	      //남은카드수 3장 미만일때
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
	       //빈슬롯인지 체크하고 그자리에 카드넣기  
	       for(int k=0; k<dk.handcard.length; k++) { //카드 5장뽑고 저장

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
			}//전투반복 끝나는 대괄호
        }
        
     
        
        
        
        
        
        //여기 휴상갈래길에서 상인갈경우
        else {
    		System.out.println("현재가지고있는카드들");
			for(int z=0; z<20; z++) {
				if(dk.deck[z]==1) {
				
					System.out.println("베기");
				}
				else if (dk.deck[z]==2)	{
					System.out.println("방패방어");
				}
	else if (dk.deck[z]==3)	{
		System.out.println("악마의일격");
				}
	else if (dk.deck[z]==4)	{
		System.out.println("사격");
	}
	else if (dk.deck[z]==5)	{
		System.out.println("회피");
	}
	else if (dk.deck[z]==6)	{
		System.out.println("회피사격");
	}
	else if (dk.deck[z]==7)	{
		System.out.println("후리기");
	}
	else if (dk.deck[z]==8)	{
		System.out.println("막기");
	}
	else if (dk.deck[z]==9)	{
		System.out.println("파이어");
	}
					
			}
			try{Thread.sleep(2000);
			}catch(Exception e){}
        	//보스전에 상인
			System.out.println("========================상인========================");
        	int aa=0; int bb=0; int cc=0; int dd=0; int ee=0; 
        	System.out.println("소지금:"+us.money);
        	System.out.println("어서오세요! 없는거 빼고 다있습니다!");
        	System.out.println("1.공격카드:30원   2.방어카드:10원  3.직업특수카드:80원   4.조커카드:200원   5.상인의부적:150원   6.떠나기");
        	while(ch!=6) {
        		
        ch=sc.nextInt();
        switch(ch) {
        case 1:
        	if(aa==0) {
        	if(us.money>=30) {
        if(us.job==1) {
        	System.out.println("카드를구입했습니다");
        	 us.cardcount= us.cardcount+1;
        	dk.deck[10]=1; aa=1;
        	us.money=us.money-30;
        }
        else if(us.job==2) {
        	System.out.println("카드를구입했습니다");
        	 us.cardcount= us.cardcount+1;
        	dk.deck[10]=4; aa=1;
        	us.money=us.money-30;
        }
        else if(us.job==3) {
        	System.out.println("카드를구입했습니다");
        	 us.cardcount= us.cardcount+1;
        	dk.deck[10]=7; aa=1;
        	us.money=us.money-30;
        }
        	}else {
        		System.out.println("돈이부족합니다.");
        	}
        	}else {System.out.println("재고가없어요!");}
        	
        	break;
        	
case 2:
	if(bb==0) {
	if(us.money>=10) {
	if(us.job==1) {
		System.out.println("카드를구입했습니다");
		 us.cardcount= us.cardcount+1;   	dk.deck[11]=2;bb=1;
    	us.money=us.money-10;
    }
    else if(us.job==2) {
    	System.out.println("카드를구입했습니다");
    	 us.cardcount= us.cardcount+1;
    	dk.deck[11]=5;bb=1;
    	us.money=us.money-10;
    }
    else if(us.job==3) {
    	System.out.println("카드를구입했습니다");
    	 us.cardcount= us.cardcount+1;
    	dk.deck[11]=8;bb=1;
    	us.money=us.money-10;
    }
	}
    else {
		System.out.println("돈이부족합니다.");
	}}else {System.out.println("재고가없어요!");}

        	break;
case 3:
	if(cc==0) {
	if(us.money>=80) {
		if(us.job==1) {
			System.out.println("카드를구입했습니다");
			 us.cardcount= us.cardcount+1;
	    	dk.deck[12]=3;cc=1;
	    	us.money=us.money-80;
	    }
	    else if(us.job==2) {
	    	System.out.println("카드를구입했습니다");
	    	 us.cardcount= us.cardcount+1;
	    	dk.deck[12]=6;cc=1;
	    	us.money=us.money-80;
	    }
	    else if(us.job==3) {
	    	System.out.println("카드를구입했습니다");
	    	 us.cardcount= us.cardcount+1;
	    	dk.deck[12]=9;cc=1;
	    	us.money=us.money-80;
	    }
		}
	    else {
			System.out.println("돈이부족합니다.");
		}}else {System.out.println("재고가없어요");}
	break;
	
case 4:
	if(us.money>=200) {
		System.out.println("하하하하하하하 재밌군 재밌어!");
		System.out.println("자네 어디가서도 사기당하는거 조심하게나 하하하");
		 
	us.money=us.money-200;
	break;
	}else {
		System.out.println("돈이부족합니다.");
	}
	break;
	
case 5:
	if(ee==0) {
	if(us.money>=150) {
		System.out.println("유물을구입했습니다");
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
		System.out.println("돈이부족합니다.");
	}}else {System.out.println("재고가없습니다!");}
	break;
case 6:
	System.out.println("당신은 떠납니다.");
	break;
        default:
        	System.out.println("제대로 고르세요!");
        	break;
        
   
        }
        	
        	
        	}
    		System.out.println("현재가지고있는카드들");
			for(int z=0; z<20; z++) {
				if(dk.deck[z]==1) {
				
					System.out.println("베기");
				}
				else if (dk.deck[z]==2)	{
					System.out.println("방패방어");
				}
	else if (dk.deck[z]==3)	{
		System.out.println("악마의일격");
				}
	else if (dk.deck[z]==4)	{
		System.out.println("사격");
	}
	else if (dk.deck[z]==5)	{
		System.out.println("회피");
	}
	else if (dk.deck[z]==6)	{
		System.out.println("회피사격");
	}
	else if (dk.deck[z]==7)	{
		System.out.println("후리기");
	}
	else if (dk.deck[z]==8)	{
		System.out.println("막기");
	}
	else if (dk.deck[z]==9)	{
		System.out.println("파이어");
	}
					
			}
			try{Thread.sleep(2000);
			}catch(Exception e){}
        	
        	
        	
        	
        	
        	//기다렷다가 마왕
        	
        	
        	System.out.println("===============마왕출현===============");
			System.out.println("마왕과 전투 발생!");
			enemy satan = new enemy();
			satan.monname="마왕군 장교";
			satan.HP=50;
			satan.em=500;
			satan.monnum=0;
			dk.setdeck();               //deck를 tpdeck로 복사
	        dk.shuffle(dk.tpdeck, 15);	//카드셔플
	       
	        b=0;
	        for(int k=0; k<dk.handcard.length; k++) { //카드 5장뽑고 저장
	        	
	        	
	        	
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
	     
	       System.out.print("유물: ");rc.showrelic(relic);rc.showrelic(relic1); rc.showrelic(relic2);System.out.println("");  	
	       dk.showcard();
	       System.out.println("");
	       
	       
	       int defense=0;
	       System.out.println("총카드수"+us.cardcount);
	       System.out.println("남은카드수"+ccount);
	       System.out.println("당신의체력:"+us.HP);
	       System.out.println("적의체력:"+satan.HP);
	       System.out.println("사용할 카드를  3개 선택하시오. 취소불가 신중히 선택!");
	       System.out.println("1.  2.  3.  4.  5. 6.확인");
	       
	     

	       
	       int attack=0;
	       for(int h=0; h<3; h++) {
	       ch=sc.nextInt();
	       switch(ch) {
	       case 1:
	     	  if(dk.handcard[0]==1) {
	     		  System.out.println("1번카드사용");
	     		 attack = attack + 7;
	     		 dk.handcard[0]=0;
	     	  }
	     	  else if (dk.handcard[0]==2) {
	     		 System.out.println("1번카드사용");
	     		 defense= defense + 1;
	     		dk.handcard[0]=0;
	     	  }
	     	 else if (dk.handcard[0]==3) {
	     		System.out.println("1번카드사용");
	     		 attack = attack + 10;
	    		  defense = defense -2;
	    		  dk.handcard[0]=0;
	    	  }
	     	 else if (dk.handcard[0]==4) {
	     		System.out.println("1번카드사용");
	     		attack = attack + 5;
	     		dk.handcard[0]=0;
	    	  }
	     	 else if (dk.handcard[0]==5) {
	     		System.out.println("1번카드사용");
	     		defense= defense + 2;
	     		dk.handcard[0]=0;
	    	  }
	     	 else if (dk.handcard[0]==6) {
	     		System.out.println("1번카드사용");
	     		attack = attack + 6;
	  		  defense = defense + 2;
	  		dk.handcard[0]=0;
	    	  }
	     	 else if (dk.handcard[1]==7) {
	     		System.out.println("1번카드사용");
	    		  attack = attack +3;
	    		  dk.handcard[0]=0;
	    	  }
	     	 else if (dk.handcard[1]==8) {
	     		System.out.println("1번카드사용");
	     		defense = defense + 1;
	     		dk.handcard[0]=0;
	    	  }
	     	 else if (dk.handcard[1]==9) {
	     		System.out.println("1번카드사용");
	    		  attack= attack + 20;
	    		  dk.handcard[0]=0;
	    	  }
	     	else {
	     		System.out.println("다시선택하세요");
	    		h--;
	    	  }
	     	  
	     	  break;
	   case 2:
		   if(dk.handcard[1]==1) {
	  		  System.out.println("2번카드사용");
	  		 attack = attack + 7;
	  		 dk.handcard[1]=0;
	  	  }
	  	  else if (dk.handcard[1]==2) {
	  		 System.out.println("2번카드사용");
	  		 defense= defense + 1;
	  		dk.handcard[1]=0;
	  	  }
	  	 else if (dk.handcard[1]==3) {
	  		System.out.println("2번카드사용");
	  		 attack = attack + 10;
	 		  defense = defense -2;
	 		  dk.handcard[1]=0;
	 	  }
	  	 else if (dk.handcard[1]==4) {
	  		System.out.println("2번카드사용");
	  		attack = attack + 5;
	  		dk.handcard[1]=0;
	 	  }
	  	 else if (dk.handcard[1]==5) {
	  		System.out.println("2번카드사용");
	  		defense= defense + 2;
	  		dk.handcard[1]=0;
	 	  }
	  	 else if (dk.handcard[1]==6) {
	  		System.out.println("2번카드사용");
	  		attack = attack + 6;
			  defense = defense + 2;
			dk.handcard[1]=0;
	 	  }
	  	 else if (dk.handcard[1]==7) {
	  		System.out.println("2번카드사용");
	 		  attack = attack +3;
	 		  dk.handcard[1]=0;
	 	  }
	  	 else if (dk.handcard[1]==8) {
	  		System.out.println("2번카드사용");
	  		defense = defense + 1;
	  		dk.handcard[1]=0;
	 	  }
	  	 else if (dk.handcard[1]==9) {
	  		System.out.println("2번카드사용");
	 		  attack= attack + 20;
	 		  dk.handcard[1]=0;
	 	  }  
	  	else  {
	 		System.out.println("다시선택하세요");
			h--;
		  }
	     	  break;
	     	  
	   case 3:
		   if(dk.handcard[2]==1) {
	  		  System.out.println("3번카드사용");
	  		 attack = attack + 7;
	  		 dk.handcard[2]=0;
	  	  }
	  	  else if (dk.handcard[2]==2) {
	  		 System.out.println("3번카드사용");
	  		 defense= defense + 1;
	  		dk.handcard[2]=0;
	  	  }
	  	 else if (dk.handcard[2]==3) {
	  		System.out.println("3번카드사용");
	  		 attack = attack + 10;
	 		  defense = defense -2;
	 		  dk.handcard[2]=0;
	 	  }
	  	 else if (dk.handcard[2]==4) {
	  		System.out.println("3번카드사용");
	  		attack = attack + 5;
	  		dk.handcard[2]=0;
	 	  }
	  	 else if (dk.handcard[2]==5) {
	  		System.out.println("3번카드사용");
	  		defense= defense + 2;
	  		dk.handcard[2]=0;
	 	  }
	  	 else if (dk.handcard[2]==6) {
	  		System.out.println("3번카드사용");
	  		attack = attack + 6;
			  defense = defense + 2;
			dk.handcard[2]=0;
	 	  }
	  	 else if (dk.handcard[2]==7) {
	  		System.out.println("3번카드사용");
	 		  attack = attack +3;
	 		  dk.handcard[2]=0;
	 	  }
	  	 else if (dk.handcard[2]==8) {
	  		System.out.println("3번카드사용");
	  		defense = defense + 1;
	  		dk.handcard[2]=0;
	 	  }
	  	 else if (dk.handcard[2]==9) {
	  		System.out.println("3번카드사용");
	 		  attack= attack + 20;
	 		  dk.handcard[2]=0;
	 	  }
	  	else  {
	 		System.out.println("다시선택하세요");
			h--;
		  }
	 	  break;
	   case 4:
		   if(dk.handcard[3]==1) {
	  		  System.out.println("4번카드사용");
	  		 attack = attack + 7;
	  		 dk.handcard[3]=0;
	  	  }
	  	  else if (dk.handcard[3]==2) {
	  		 System.out.println("4번카드사용");
	  		 defense= defense + 1;
	  		dk.handcard[3]=0;
	  	  }
	  	 else if (dk.handcard[3]==3) {
	  		System.out.println("4번카드사용");
	  		 attack = attack + 10;
	 		  defense = defense -2;
	 		  dk.handcard[3]=0;
	 	  }
	  	 else if (dk.handcard[3]==4) {
	  		System.out.println("4번카드사용");
	  		attack = attack + 5;
	  		dk.handcard[3]=0;
	 	  }
	  	 else if (dk.handcard[3]==5) {
	  		System.out.println("4번카드사용");
	  		defense= defense + 2;
	  		dk.handcard[3]=0;
	 	  }
	  	 else if (dk.handcard[3]==6) {
	  		System.out.println("4번카드사용");
	  		attack = attack + 6;
			  defense = defense + 2;
			dk.handcard[3]=0;
	 	  }
	  	 else if (dk.handcard[3]==7) {
	  		System.out.println("4번카드사용");
	 		  attack = attack +3;
	 		  dk.handcard[3]=0;
	 	  }
	  	 else if (dk.handcard[3]==8) {
	  		System.out.println("4번카드사용");
	  		defense = defense + 1;
	  		dk.handcard[3]=0;
	 	  }
	  	 else if (dk.handcard[3]==9) {
	  		System.out.println("4번카드사용");
	 		  attack= attack + 20;
	 		  dk.handcard[3]=0;
	 	  }
	  	else if (dk.handcard[3]==0) {
	 		System.out.println("다시선택하세요");
			h--;
		  }
	 	  break;
	   case 5:
		   if(dk.handcard[4]==1) {
	  		  System.out.println("5번카드사용");
	  		 attack = attack + 7;
	  		 dk.handcard[4]=0;
	  	  }
	  	  else if (dk.handcard[4]==2) {
	  		 System.out.println("5번카드사용");
	  		 defense= defense + 1;
	  		dk.handcard[4]=0;
	  	  }
	  	 else if (dk.handcard[4]==3) {
	  		System.out.println("5번카드사용");
	  		 attack = attack + 10;
	 		  defense = defense -2;
	 		  dk.handcard[4]=0;
	 	  }
	  	 else if (dk.handcard[4]==4) {
	  		System.out.println("5번카드사용");
	  		attack = attack + 5;
	  		dk.handcard[4]=0;
	 	  }
	  	 else if (dk.handcard[4]==5) {
	  		System.out.println("5번카드사용");
	  		defense= defense + 2;
	  		dk.handcard[4]=0;
	 	  }
	  	 else if (dk.handcard[4]==6) {
	  		System.out.println("5번카드사용");
	  		attack = attack + 6;
			  defense = defense + 2;
			dk.handcard[4]=0;
	 	  }
	  	 else if (dk.handcard[4]==7) {
	  		System.out.println("5번카드사용");
	 		  attack = attack +3;
	 		  dk.handcard[4]=0;
	 	  }
	  	 else if (dk.handcard[4]==8) {
	  		System.out.println("5번카드사용");
	  		defense = defense + 1;
	  		dk.handcard[4]=0;
	 	  }
	  	 else if (dk.handcard[4]==9) {
	  		System.out.println("5번카드사용");
	 		  attack= attack + 20;
	 		  dk.handcard[4]=0;
	 	  }
	  	else  {
	 		System.out.println("다시선택하세요");
			h--;
		  }
	 	  break;
	   case 6:
		   System.out.println("확인");
		   break;
	 	  default :
	 		 System.out.println("다시선택하세요");
	 		 h--;
	 		  break;
	       
	       }
	       }
	       
	       System.out.println("당신의 공격!");
	       satan.HP = satan.HP - attack;
	       System.out.println("상대는"+attack+"만큼의 피해를 입었다.");
	       if(satan.HP<=0) {
	    	   System.out.println("마왕은 쓰러졌다!");
	    	   System.out.println("당신은"+satan.em+"만큼의 돈을 획득하였다.");
	    	   us.money = us.money+satan.em;
	    	   boss=1;
	    	   break;
	       }

	       int beh = (int)(Math.random()*10);
	       if(beh<9) {
	    	   System.out.println("마왕의 공격!");
	    	   us.HP = us.HP + defense - 15; 
	    	   System.out.println("당신은"+-(defense - 15)+"만큼의 피해를 입었다.");
	       }
	       else {
	    	   System.out.println("마왕의 일격!");
	    	   us.HP = us.HP + defense - 40;
	    	   System.out.println("당신은"+-(defense - 40)+"만큼의 피해를 입었다.");
	       }
	       
	     
	       if(us.HP<=0) {
	    	   System.out.println("당신은 쓰러졌다!");
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
	       System.out.println("여기남은수는"+ccount);
	      //남은카드수 3장 미만일때
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
	       //빈슬롯인지 체크하고 그자리에 카드넣기  
	       for(int k=0; k<dk.handcard.length; k++) { //카드 5장뽑고 저장

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
	   
	   
	     

			}//전투반복 끝나는 대괄호
        	
        	
        	
        	
        	
        	
        	
        }
        
		
		
		
	}
	//만들던거책

	
	
	else {
		mylocation=22;
		//상인
		System.out.println("========================상인========================");
		int aa=0; int bb=0; int cc=0; int dd=0; int ee=0; 
		
    	System.out.println("소지금:"+us.money);
    	System.out.println("어서오세요! 없는거 빼고 다있습니다!");
    	System.out.println("1.공격카드:30원   2.방어카드:10원  3.직업특수카드:80원   4.조커카드:200원   5.상인의부적:150원   6.떠나기");
    	while(ch!=6) {
    		
    ch=sc.nextInt();
    switch(ch) {
    case 1:
    	if(aa==0) {
    	if(us.money>=30) {
    if(us.job==1) {
    	System.out.println("카드를구입했습니다");
    	 us.cardcount= us.cardcount+1;
    	dk.deck[10]=1; aa=1;
    	us.money=us.money-30;
    }
    else if(us.job==2) {
    	System.out.println("카드를구입했습니다");
    	 us.cardcount= us.cardcount+1;
    	dk.deck[10]=4; aa=1;
    	us.money=us.money-30;
    }
    else if(us.job==3) {
    	System.out.println("카드를구입했습니다");
    	 us.cardcount= us.cardcount+1;
    	dk.deck[10]=7; aa=1;
    	us.money=us.money-30;
    }
    	}else {
    		System.out.println("돈이부족합니다.");
    	}
    	}else {System.out.println("재고가없어요!");}
    	
    	break;
    	
case 2:
if(bb==0) {
if(us.money>=10) {
if(us.job==1) {
	System.out.println("카드를구입했습니다");
	 us.cardcount= us.cardcount+1;
	dk.deck[11]=2;bb=1;
	us.money=us.money-10;
}
else if(us.job==2) {
	System.out.println("카드를구입했습니다");
	 us.cardcount= us.cardcount+1;
	dk.deck[11]=5;bb=1;
	us.money=us.money-10;
}
else if(us.job==3) {
	System.out.println("카드를구입했습니다");
	 us.cardcount= us.cardcount+1;
	dk.deck[11]=8;bb=1;
	us.money=us.money-10;
}
}
else {
	System.out.println("돈이부족합니다.");
}}else {System.out.println("재고가없어요!");}

    	break;
case 3:
if(cc==0) {
if(us.money>=80) {
	if(us.job==1) {
		System.out.println("카드를구입했습니다");
		 us.cardcount= us.cardcount+1;
    	dk.deck[12]=3;cc=1;
    	us.money=us.money-80;
    }
    else if(us.job==2) {
    	System.out.println("카드를구입했습니다");
    	 us.cardcount= us.cardcount+1;
    	dk.deck[12]=6;cc=1;
    	us.money=us.money-80;
    }
    else if(us.job==3) {
    	System.out.println("카드를구입했습니다");
    	 us.cardcount= us.cardcount+1;
    	dk.deck[12]=9;cc=1;
    	us.money=us.money-80;
    }
	}
    else {
		System.out.println("돈이부족합니다.");
	}}else {System.out.println("재고가없어요");}
break;

case 4:
if(us.money>=200) {
	System.out.println("하하하하하하하 재밌군 재밌어!");
	System.out.println("자네 어디가서도 사기당하는거 조심하게나 하하하");
	 
us.money=us.money-200;
break;
}else {
	System.out.println("돈이부족합니다.");
}
break;

case 5:
if(ee==0) {
if(us.money>=150) {
	System.out.println("유물을구입했습니다");
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
	System.out.println("돈이부족합니다.");
}}else {System.out.println("재고가없습니다!");}
break;
case 6:
System.out.println("당신은 떠납니다.");
break;
    default:
    	System.out.println("제대로 고르세요!");
    	break; 
    }		    	
    	}			
		mp.mapping(mylocation);
		
		
		
		System.out.println("현재가지고있는카드들");
		for(int z=0; z<20; z++) {
			if(dk.deck[z]==1) {
			
				System.out.println("베기");
			}
			else if (dk.deck[z]==2)	{
				System.out.println("방패방어");
			}
else if (dk.deck[z]==3)	{
	System.out.println("악마의일격");
			}
else if (dk.deck[z]==4)	{
	System.out.println("사격");
}
else if (dk.deck[z]==5)	{
	System.out.println("회피");
}
else if (dk.deck[z]==6)	{
	System.out.println("회피사격");
}
else if (dk.deck[z]==7)	{
	System.out.println("후리기");
}
else if (dk.deck[z]==8)	{
	System.out.println("막기");
}
else if (dk.deck[z]==9)	{
	System.out.println("파이어");
}
				
		}
		try{Thread.sleep(2000);
		}catch(Exception e){}
    	
		mp.mapping(mylocation);
		System.out.println("어디로 갈 것인가?(문자나특수문자입력시 종료하고 2이상 숫자는 2로취급)");
		System.out.println("1.이벤트  2.몹 ");
		ch=sc.nextInt();
		if(ch==1) {
			mylocation=32;
			//이벤트
			System.out.println("알 수 없는 신전이 있다 이곳에 들를것인가?");
			System.out.println("1.들른다  2.그냥간다");
			ch=sc.nextInt();
			if(ch==1) {
				System.out.println("신전에 들어갑니다.");
				int no;
				no=(int)(Math.random()*100);
				if(no<15) {
					System.out.println("신전에서 유물을 발견했습니다!");
					us.HP=us.HP+100;
					relic2[2]=1;
				}
				else if(no<30) {
					System.out.println("신전에서 축복을 받았습니다!");
					System.out.println("체력회복!");
					us.HP=us.HP+15;
				}
				else {
					us.HP=us.HP-150;
					System.out.println("신전에서 저주를 받았습니다!");
					System.out.println("체력이 깎입니다! 150의 데미지!");
					System.out.println("당신의체력:"+us.HP);
					
					if(us.HP<=0) {
						break;
					}
				}
				
			}
			else {
				System.out.println("당신은 그냥 지나갑니다.");
			}
			
			
			
			
			
			mp.mapping(mylocation);
			System.out.println("어디로 갈 것인가?(문자나특수문자입력시 종료하고 2이상 숫자는 2로취급)");
			System.out.println("1.왼쪽몹  2.오른쪽몹");
			ch=sc.nextInt();
			if(ch==1) {
				mylocation=41;
				//몹배틀
				System.out.println("배틀");
				 System.out.println("===============일반몹===============");
					System.out.println("마왕군 장교와 전투 발생!");
					enemy mon1 = new enemy();
				       mon1.monname="마왕군 장교";
				       mon1.HP=15;
				       mon1.em=20;
				       mon1.monnum=2;
					dk.setdeck();               //deck를 tpdeck로 복사
			        dk.shuffle(dk.tpdeck, 15);	//카드셔플
			       
			      int  b=0;
			        for(int k=0; k<dk.handcard.length; k++) { //카드 5장뽑고 저장
			        	
			        	
			        	
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
			     
			       System.out.print("유물: ");rc.showrelic(relic);rc.showrelic(relic1); rc.showrelic(relic2);System.out.println(""); 	
			       dk.showcard();
			       System.out.println("");
			       
			       
			       int defense=0;
			       System.out.println("총카드수"+us.cardcount);
			       System.out.println("남은카드수"+ccount);
			       System.out.println("당신의체력:"+us.HP);
			       System.out.println("적의체력:"+mon1.HP);
			       System.out.println("사용할 카드를  3개 선택하시오. 취소불가 신중히 선택!");
			       System.out.println("1.  2.  3.  4.  5. 6.확인");
			       
			      

			       
			       int attack=0;
			       for(int h=0; h<3; h++) {
			       ch=sc.nextInt();
			       switch(ch) {
			       case 1:
			     	  if(dk.handcard[0]==1) {
			     		  System.out.println("1번카드사용");
			     		 attack = attack + 7;
			     		 dk.handcard[0]=0;
			     	  }
			     	  else if (dk.handcard[0]==2) {
			     		 System.out.println("1번카드사용");
			     		 defense= defense + 1;
			     		dk.handcard[0]=0;
			     	  }
			     	 else if (dk.handcard[0]==3) {
			     		System.out.println("1번카드사용");
			     		 attack = attack + 10;
			    		  defense = defense -2;
			    		  dk.handcard[0]=0;
			    	  }
			     	 else if (dk.handcard[0]==4) {
			     		System.out.println("1번카드사용");
			     		attack = attack + 5;
			     		dk.handcard[0]=0;
			    	  }
			     	 else if (dk.handcard[0]==5) {
			     		System.out.println("1번카드사용");
			     		defense= defense + 2;
			     		dk.handcard[0]=0;
			    	  }
			     	 else if (dk.handcard[0]==6) {
			     		System.out.println("1번카드사용");
			     		attack = attack + 6;
			  		  defense = defense + 2;
			  		dk.handcard[0]=0;
			    	  }
			     	 else if (dk.handcard[1]==7) {
			     		System.out.println("1번카드사용");
			    		  attack = attack +3;
			    		  dk.handcard[0]=0;
			    	  }
			     	 else if (dk.handcard[1]==8) {
			     		System.out.println("1번카드사용");
			     		defense = defense + 1;
			     		dk.handcard[0]=0;
			    	  }
			     	 else if (dk.handcard[1]==9) {
			     		System.out.println("1번카드사용");
			    		  attack= attack + 20;
			    		  dk.handcard[0]=0;
			    	  }
			     	else {
			     		System.out.println("다시선택하세요");
			    		h--;
			    	  }
			     	  
			     	  break;
			   case 2:
				   if(dk.handcard[1]==1) {
			  		  System.out.println("2번카드사용");
			  		 attack = attack + 7;
			  		 dk.handcard[1]=0;
			  	  }
			  	  else if (dk.handcard[1]==2) {
			  		 System.out.println("2번카드사용");
			  		 defense= defense + 1;
			  		dk.handcard[1]=0;
			  	  }
			  	 else if (dk.handcard[1]==3) {
			  		System.out.println("2번카드사용");
			  		 attack = attack + 10;
			 		  defense = defense -2;
			 		  dk.handcard[1]=0;
			 	  }
			  	 else if (dk.handcard[1]==4) {
			  		System.out.println("2번카드사용");
			  		attack = attack + 5;
			  		dk.handcard[1]=0;
			 	  }
			  	 else if (dk.handcard[1]==5) {
			  		System.out.println("2번카드사용");
			  		defense= defense + 2;
			  		dk.handcard[1]=0;
			 	  }
			  	 else if (dk.handcard[1]==6) {
			  		System.out.println("2번카드사용");
			  		attack = attack + 6;
					  defense = defense + 2;
					dk.handcard[1]=0;
			 	  }
			  	 else if (dk.handcard[1]==7) {
			  		System.out.println("2번카드사용");
			 		  attack = attack +3;
			 		  dk.handcard[1]=0;
			 	  }
			  	 else if (dk.handcard[1]==8) {
			  		System.out.println("2번카드사용");
			  		defense = defense + 1;
			  		dk.handcard[1]=0;
			 	  }
			  	 else if (dk.handcard[1]==9) {
			  		System.out.println("2번카드사용");
			 		  attack= attack + 20;
			 		  dk.handcard[1]=0;
			 	  }  
			  	else  {
			 		System.out.println("다시선택하세요");
					h--;
				  }
			     	  break;
			     	  
			   case 3:
				   if(dk.handcard[2]==1) {
			  		  System.out.println("3번카드사용");
			  		 attack = attack + 7;
			  		 dk.handcard[2]=0;
			  	  }
			  	  else if (dk.handcard[2]==2) {
			  		 System.out.println("3번카드사용");
			  		 defense= defense + 1;
			  		dk.handcard[2]=0;
			  	  }
			  	 else if (dk.handcard[2]==3) {
			  		System.out.println("3번카드사용");
			  		 attack = attack + 10;
			 		  defense = defense -2;
			 		  dk.handcard[2]=0;
			 	  }
			  	 else if (dk.handcard[2]==4) {
			  		System.out.println("3번카드사용");
			  		attack = attack + 5;
			  		dk.handcard[2]=0;
			 	  }
			  	 else if (dk.handcard[2]==5) {
			  		System.out.println("3번카드사용");
			  		defense= defense + 2;
			  		dk.handcard[2]=0;
			 	  }
			  	 else if (dk.handcard[2]==6) {
			  		System.out.println("3번카드사용");
			  		attack = attack + 6;
					  defense = defense + 2;
					dk.handcard[2]=0;
			 	  }
			  	 else if (dk.handcard[2]==7) {
			  		System.out.println("3번카드사용");
			 		  attack = attack +3;
			 		  dk.handcard[2]=0;
			 	  }
			  	 else if (dk.handcard[2]==8) {
			  		System.out.println("3번카드사용");
			  		defense = defense + 1;
			  		dk.handcard[2]=0;
			 	  }
			  	 else if (dk.handcard[2]==9) {
			  		System.out.println("3번카드사용");
			 		  attack= attack + 20;
			 		  dk.handcard[2]=0;
			 	  }
			  	else  {
			 		System.out.println("다시선택하세요");
					h--;
				  }
			 	  break;
			   case 4:
				   if(dk.handcard[3]==1) {
			  		  System.out.println("4번카드사용");
			  		 attack = attack + 7;
			  		 dk.handcard[3]=0;
			  	  }
			  	  else if (dk.handcard[3]==2) {
			  		 System.out.println("4번카드사용");
			  		 defense= defense + 1;
			  		dk.handcard[3]=0;
			  	  }
			  	 else if (dk.handcard[3]==3) {
			  		System.out.println("4번카드사용");
			  		 attack = attack + 10;
			 		  defense = defense -2;
			 		  dk.handcard[3]=0;
			 	  }
			  	 else if (dk.handcard[3]==4) {
			  		System.out.println("4번카드사용");
			  		attack = attack + 5;
			  		dk.handcard[3]=0;
			 	  }
			  	 else if (dk.handcard[3]==5) {
			  		System.out.println("4번카드사용");
			  		defense= defense + 2;
			  		dk.handcard[3]=0;
			 	  }
			  	 else if (dk.handcard[3]==6) {
			  		System.out.println("4번카드사용");
			  		attack = attack + 6;
					  defense = defense + 2;
					dk.handcard[3]=0;
			 	  }
			  	 else if (dk.handcard[3]==7) {
			  		System.out.println("4번카드사용");
			 		  attack = attack +3;
			 		  dk.handcard[3]=0;
			 	  }
			  	 else if (dk.handcard[3]==8) {
			  		System.out.println("4번카드사용");
			  		defense = defense + 1;
			  		dk.handcard[3]=0;
			 	  }
			  	 else if (dk.handcard[3]==9) {
			  		System.out.println("4번카드사용");
			 		  attack= attack + 20;
			 		  dk.handcard[3]=0;
			 	  }
			  	else if (dk.handcard[3]==0) {
			 		System.out.println("다시선택하세요");
					h--;
				  }
			 	  break;
			   case 5:
				   if(dk.handcard[4]==1) {
			  		  System.out.println("5번카드사용");
			  		 attack = attack + 7;
			  		 dk.handcard[4]=0;
			  	  }
			  	  else if (dk.handcard[4]==2) {
			  		 System.out.println("5번카드사용");
			  		 defense= defense + 1;
			  		dk.handcard[4]=0;
			  	  }
			  	 else if (dk.handcard[4]==3) {
			  		System.out.println("5번카드사용");
			  		 attack = attack + 10;
			 		  defense = defense -2;
			 		  dk.handcard[4]=0;
			 	  }
			  	 else if (dk.handcard[4]==4) {
			  		System.out.println("5번카드사용");
			  		attack = attack + 5;
			  		dk.handcard[4]=0;
			 	  }
			  	 else if (dk.handcard[4]==5) {
			  		System.out.println("5번카드사용");
			  		defense= defense + 2;
			  		dk.handcard[4]=0;
			 	  }
			  	 else if (dk.handcard[4]==6) {
			  		System.out.println("5번카드사용");
			  		attack = attack + 6;
					  defense = defense + 2;
					dk.handcard[4]=0;
			 	  }
			  	 else if (dk.handcard[4]==7) {
			  		System.out.println("5번카드사용");
			 		  attack = attack +3;
			 		  dk.handcard[4]=0;
			 	  }
			  	 else if (dk.handcard[4]==8) {
			  		System.out.println("5번카드사용");
			  		defense = defense + 1;
			  		dk.handcard[4]=0;
			 	  }
			  	 else if (dk.handcard[4]==9) {
			  		System.out.println("5번카드사용");
			 		  attack= attack + 20;
			 		  dk.handcard[4]=0;
			 	  }
			  	else  {
			 		System.out.println("다시선택하세요");
					h--;
				  }
			 	  break;
			   case 6:
				   System.out.println("확인");
				   break;
			 	  default :
			 		 System.out.println("다시선택하세요");
			 		 h--;
			 		  break;
			       
			       }
			       }
			       
			       System.out.println("당신의 공격!");
			       mon1.HP = mon1.HP - attack;
			       System.out.println("상대는"+attack+"만큼의 피해를 입었다.");
			       if(mon1.HP<=0) {
			    	   System.out.println("적은 쓰러졌다!");
			    	   System.out.println("당신은"+mon1.em+"만큼의 돈을 획득하였다.");
			    	   us.money = us.money+mon1.em;
			    	   break;
			       }
			       
			    	   System.out.println("장교의 공격!");
			    	   us.HP = us.HP + defense - 10; 
			    	   System.out.println("당신은"+-(defense - 10)+"만큼의 피해를 입었다.");
			       
			     
			       if(us.HP<=0) {
			    	   System.out.println("당신은 쓰러졌다!");
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
			       System.out.println("여기남은수는"+ccount);
			      //남은카드수 3장 미만일때
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
			       //빈슬롯인지 체크하고 그자리에 카드넣기  
			       for(int k=0; k<dk.handcard.length; k++) { //카드 5장뽑고 저장

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
			   
			   
			     

					}//전투반복 끝나는 대괄호
				
				
				
				
				
				
				
				
				
				mp.mapping(mylocation);
				System.out.println("어디로 갈 것인가?(문자나특수문자입력시 종료하고 2이상 숫자는 2로취급)");
				System.out.println("1.휴식  2.상인 ");
				ch=sc.nextInt();
				if(ch==1) {
					mylocation=51;
					//휴식이벤트
					
					System.out.println("휴식");
					System.out.println("체력을 20회복합니다.");
					us.HP=us.HP + 20;

					
					
					mp.mapping(mylocation);
					//기다렸다가 보스전
					try{Thread.sleep(2000);
					}catch(Exception e){}

					System.out.println("===============마왕출현===============");
					System.out.println("마왕과 전투 발생!");
					enemy satan = new enemy();
					satan.monname="마왕군 장교";
					satan.HP=50;
					satan.em=500;
					satan.monnum=0;
					dk.setdeck();               //deck를 tpdeck로 복사
			        dk.shuffle(dk.tpdeck, 15);	//카드셔플
			       
			        b=0;
			        for(int k=0; k<dk.handcard.length; k++) { //카드 5장뽑고 저장
			        	
			        	
			        	
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
			     
			       System.out.print("유물: ");rc.showrelic(relic);rc.showrelic(relic1); rc.showrelic(relic2);System.out.println("");  	
			       dk.showcard();
			       System.out.println("");
			       
			       
			       int defense=0;
			       System.out.println("총카드수"+us.cardcount);
			       System.out.println("남은카드수"+ccount);
			       System.out.println("당신의체력:"+us.HP);
			       System.out.println("적의체력:"+satan.HP);
			       System.out.println("사용할 카드를  3개 선택하시오. 취소불가 신중히 선택!");
			       System.out.println("1.  2.  3.  4.  5. 6.확인");
			       
			      

			       
			       int attack=0;
			       for(int h=0; h<3; h++) {
			       ch=sc.nextInt();
			       switch(ch) {
			       case 1:
			     	  if(dk.handcard[0]==1) {
			     		  System.out.println("1번카드사용");
			     		 attack = attack + 7;
			     		 dk.handcard[0]=0;
			     	  }
			     	  else if (dk.handcard[0]==2) {
			     		 System.out.println("1번카드사용");
			     		 defense= defense + 1;
			     		dk.handcard[0]=0;
			     	  }
			     	 else if (dk.handcard[0]==3) {
			     		System.out.println("1번카드사용");
			     		 attack = attack + 10;
			    		  defense = defense -2;
			    		  dk.handcard[0]=0;
			    	  }
			     	 else if (dk.handcard[0]==4) {
			     		System.out.println("1번카드사용");
			     		attack = attack + 5;
			     		dk.handcard[0]=0;
			    	  }
			     	 else if (dk.handcard[0]==5) {
			     		System.out.println("1번카드사용");
			     		defense= defense + 2;
			     		dk.handcard[0]=0;
			    	  }
			     	 else if (dk.handcard[0]==6) {
			     		System.out.println("1번카드사용");
			     		attack = attack + 6;
			  		  defense = defense + 2;
			  		dk.handcard[0]=0;
			    	  }
			     	 else if (dk.handcard[1]==7) {
			     		System.out.println("1번카드사용");
			    		  attack = attack +3;
			    		  dk.handcard[0]=0;
			    	  }
			     	 else if (dk.handcard[1]==8) {
			     		System.out.println("1번카드사용");
			     		defense = defense + 1;
			     		dk.handcard[0]=0;
			    	  }
			     	 else if (dk.handcard[1]==9) {
			     		System.out.println("1번카드사용");
			    		  attack= attack + 20;
			    		  dk.handcard[0]=0;
			    	  }
			     	else {
			     		System.out.println("다시선택하세요");
			    		h--;
			    	  }
			     	  
			     	  break;
			   case 2:
				   if(dk.handcard[1]==1) {
			  		  System.out.println("2번카드사용");
			  		 attack = attack + 7;
			  		 dk.handcard[1]=0;
			  	  }
			  	  else if (dk.handcard[1]==2) {
			  		 System.out.println("2번카드사용");
			  		 defense= defense + 1;
			  		dk.handcard[1]=0;
			  	  }
			  	 else if (dk.handcard[1]==3) {
			  		System.out.println("2번카드사용");
			  		 attack = attack + 10;
			 		  defense = defense -2;
			 		  dk.handcard[1]=0;
			 	  }
			  	 else if (dk.handcard[1]==4) {
			  		System.out.println("2번카드사용");
			  		attack = attack + 5;
			  		dk.handcard[1]=0;
			 	  }
			  	 else if (dk.handcard[1]==5) {
			  		System.out.println("2번카드사용");
			  		defense= defense + 2;
			  		dk.handcard[1]=0;
			 	  }
			  	 else if (dk.handcard[1]==6) {
			  		System.out.println("2번카드사용");
			  		attack = attack + 6;
					  defense = defense + 2;
					dk.handcard[1]=0;
			 	  }
			  	 else if (dk.handcard[1]==7) {
			  		System.out.println("2번카드사용");
			 		  attack = attack +3;
			 		  dk.handcard[1]=0;
			 	  }
			  	 else if (dk.handcard[1]==8) {
			  		System.out.println("2번카드사용");
			  		defense = defense + 1;
			  		dk.handcard[1]=0;
			 	  }
			  	 else if (dk.handcard[1]==9) {
			  		System.out.println("2번카드사용");
			 		  attack= attack + 20;
			 		  dk.handcard[1]=0;
			 	  }  
			  	else  {
			 		System.out.println("다시선택하세요");
					h--;
				  }
			     	  break;
			     	  
			   case 3:
				   if(dk.handcard[2]==1) {
			  		  System.out.println("3번카드사용");
			  		 attack = attack + 7;
			  		 dk.handcard[2]=0;
			  	  }
			  	  else if (dk.handcard[2]==2) {
			  		 System.out.println("3번카드사용");
			  		 defense= defense + 1;
			  		dk.handcard[2]=0;
			  	  }
			  	 else if (dk.handcard[2]==3) {
			  		System.out.println("3번카드사용");
			  		 attack = attack + 10;
			 		  defense = defense -2;
			 		  dk.handcard[2]=0;
			 	  }
			  	 else if (dk.handcard[2]==4) {
			  		System.out.println("3번카드사용");
			  		attack = attack + 5;
			  		dk.handcard[2]=0;
			 	  }
			  	 else if (dk.handcard[2]==5) {
			  		System.out.println("3번카드사용");
			  		defense= defense + 2;
			  		dk.handcard[2]=0;
			 	  }
			  	 else if (dk.handcard[2]==6) {
			  		System.out.println("3번카드사용");
			  		attack = attack + 6;
					  defense = defense + 2;
					dk.handcard[2]=0;
			 	  }
			  	 else if (dk.handcard[2]==7) {
			  		System.out.println("3번카드사용");
			 		  attack = attack +3;
			 		  dk.handcard[2]=0;
			 	  }
			  	 else if (dk.handcard[2]==8) {
			  		System.out.println("3번카드사용");
			  		defense = defense + 1;
			  		dk.handcard[2]=0;
			 	  }
			  	 else if (dk.handcard[2]==9) {
			  		System.out.println("3번카드사용");
			 		  attack= attack + 20;
			 		  dk.handcard[2]=0;
			 	  }
			  	else  {
			 		System.out.println("다시선택하세요");
					h--;
				  }
			 	  break;
			   case 4:
				   if(dk.handcard[3]==1) {
			  		  System.out.println("4번카드사용");
			  		 attack = attack + 7;
			  		 dk.handcard[3]=0;
			  	  }
			  	  else if (dk.handcard[3]==2) {
			  		 System.out.println("4번카드사용");
			  		 defense= defense + 1;
			  		dk.handcard[3]=0;
			  	  }
			  	 else if (dk.handcard[3]==3) {
			  		System.out.println("4번카드사용");
			  		 attack = attack + 10;
			 		  defense = defense -2;
			 		  dk.handcard[3]=0;
			 	  }
			  	 else if (dk.handcard[3]==4) {
			  		System.out.println("4번카드사용");
			  		attack = attack + 5;
			  		dk.handcard[3]=0;
			 	  }
			  	 else if (dk.handcard[3]==5) {
			  		System.out.println("4번카드사용");
			  		defense= defense + 2;
			  		dk.handcard[3]=0;
			 	  }
			  	 else if (dk.handcard[3]==6) {
			  		System.out.println("4번카드사용");
			  		attack = attack + 6;
					  defense = defense + 2;
					dk.handcard[3]=0;
			 	  }
			  	 else if (dk.handcard[3]==7) {
			  		System.out.println("4번카드사용");
			 		  attack = attack +3;
			 		  dk.handcard[3]=0;
			 	  }
			  	 else if (dk.handcard[3]==8) {
			  		System.out.println("4번카드사용");
			  		defense = defense + 1;
			  		dk.handcard[3]=0;
			 	  }
			  	 else if (dk.handcard[3]==9) {
			  		System.out.println("4번카드사용");
			 		  attack= attack + 20;
			 		  dk.handcard[3]=0;
			 	  }
			  	else if (dk.handcard[3]==0) {
			 		System.out.println("다시선택하세요");
					h--;
				  }
			 	  break;
			   case 5:
				   if(dk.handcard[4]==1) {
			  		  System.out.println("5번카드사용");
			  		 attack = attack + 7;
			  		 dk.handcard[4]=0;
			  	  }
			  	  else if (dk.handcard[4]==2) {
			  		 System.out.println("5번카드사용");
			  		 defense= defense + 1;
			  		dk.handcard[4]=0;
			  	  }
			  	 else if (dk.handcard[4]==3) {
			  		System.out.println("5번카드사용");
			  		 attack = attack + 10;
			 		  defense = defense -2;
			 		  dk.handcard[4]=0;
			 	  }
			  	 else if (dk.handcard[4]==4) {
			  		System.out.println("5번카드사용");
			  		attack = attack + 5;
			  		dk.handcard[4]=0;
			 	  }
			  	 else if (dk.handcard[4]==5) {
			  		System.out.println("5번카드사용");
			  		defense= defense + 2;
			  		dk.handcard[4]=0;
			 	  }
			  	 else if (dk.handcard[4]==6) {
			  		System.out.println("5번카드사용");
			  		attack = attack + 6;
					  defense = defense + 2;
					dk.handcard[4]=0;
			 	  }
			  	 else if (dk.handcard[4]==7) {
			  		System.out.println("5번카드사용");
			 		  attack = attack +3;
			 		  dk.handcard[4]=0;
			 	  }
			  	 else if (dk.handcard[4]==8) {
			  		System.out.println("5번카드사용");
			  		defense = defense + 1;
			  		dk.handcard[4]=0;
			 	  }
			  	 else if (dk.handcard[4]==9) {
			  		System.out.println("5번카드사용");
			 		  attack= attack + 20;
			 		  dk.handcard[4]=0;
			 	  }
			  	else  {
			 		System.out.println("다시선택하세요");
					h--;
				  }
			 	  break;
			   case 6:
				   System.out.println("확인");
				   break;
			 	  default :
			 		 System.out.println("다시선택하세요");
			 		 h--;
			 		  break;
			       
			       }
			       }
			       
			       System.out.println("당신의 공격!");
			       satan.HP = satan.HP - attack;
			       System.out.println("상대는"+attack+"만큼의 피해를 입었다.");
			       if(satan.HP<=0) {
			    	   System.out.println("마왕은 쓰러졌다!");
			    	   System.out.println("당신은"+satan.em+"만큼의 돈을 획득하였다.");
			    	   us.money = us.money+satan.em;
			    	   boss=1;
			    	   break;
			       }
			      
			       int beh = (int)(Math.random()*10);
			       if(beh<9) {
			    	   System.out.println("마왕의 공격!");
			    	   us.HP = us.HP + defense - 15; 
			    	   System.out.println("당신은"+-(defense - 15)+"만큼의 피해를 입었다.");
			       }
			       else {
			    	   System.out.println("마왕의 일격!");
			    	   us.HP = us.HP + defense - 40;
			    	   System.out.println("당신은"+-(defense - 40)+"만큼의 피해를 입었다.");
			       }
			       
			     
			       if(us.HP<=0) {
			    	   System.out.println("당신은 쓰러졌다!");
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
			       System.out.println("여기남은수는"+ccount);
			      //남은카드수 3장 미만일때
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
			       //빈슬롯인지 체크하고 그자리에 카드넣기  
			       for(int k=0; k<dk.handcard.length; k++) { //카드 5장뽑고 저장

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
			   
			   
			     

					}//전투반복 끝나는 대괄호
			        
					
					
					
					
					
					
					
					
					
					
					
				}
				
				
				else {
					mylocation=52;
					//상인이벤트
					System.out.println("========================상인========================");
		        	System.out.println("소지금:"+us.money);
		        	System.out.println("어서오세요! 없는거 빼고 다있습니다!");
		        	System.out.println("1.공격카드:30원   2.방어카드:10원  3.직업특수카드:80원   4.조커카드:200원   5.상인의부적:150원   6.떠나기");
		        	while(ch!=6) {
		        		
		        ch=sc.nextInt();
		        switch(ch) {
		        case 1:
		        	if(aa==0) {
		        	if(us.money>=30) {
		        if(us.job==1) {
		        	System.out.println("카드를구입했습니다");
		        	 us.cardcount= us.cardcount+1;
		        	dk.deck[10]=1; aa=1;
		        	us.money=us.money-30;
		        }
		        else if(us.job==2) {
		        	System.out.println("카드를구입했습니다");
		        	 us.cardcount= us.cardcount+1;
		        	dk.deck[10]=4; aa=1;
		        	us.money=us.money-30;
		        }
		        else if(us.job==3) {
		        	System.out.println("카드를구입했습니다");
		        	 us.cardcount= us.cardcount+1;
		        	dk.deck[10]=7; aa=1;
		        	us.money=us.money-30;
		        }
		        	}else {
		        		System.out.println("돈이부족합니다.");
		        	}
		        	}else {System.out.println("재고가없어요!");}
		        	
		        	break;
		        	
		case 2:
			if(bb==0) {
			if(us.money>=10) {
			if(us.job==1) {
				System.out.println("카드를구입했습니다");
				 us.cardcount= us.cardcount+1;
		    	dk.deck[11]=2;bb=1;
		    	us.money=us.money-10;
		    }
		    else if(us.job==2) {
		    	System.out.println("카드를구입했습니다");
		    	 us.cardcount= us.cardcount+1;
		    	dk.deck[11]=5;bb=1;
		    	us.money=us.money-10;
		    }
		    else if(us.job==3) {
		    	System.out.println("카드를구입했습니다");
		    	 us.cardcount= us.cardcount+1;
		    	dk.deck[11]=8;bb=1;
		    	us.money=us.money-10;
		    }
			}
		    else {
				System.out.println("돈이부족합니다.");
			}}else {System.out.println("재고가없어요!");}

		        	break;
		case 3:
			if(cc==0) {
			if(us.money>=80) {
				if(us.job==1) {
					System.out.println("카드를구입했습니다");
					 us.cardcount= us.cardcount+1;
			    	dk.deck[12]=3;cc=1;
			    	us.money=us.money-80;
			    }
			    else if(us.job==2) {
			    	System.out.println("카드를구입했습니다");
			    	 us.cardcount= us.cardcount+1;
			    	dk.deck[12]=6;cc=1;
			    	us.money=us.money-80;
			    }
			    else if(us.job==3) {
			    	System.out.println("카드를구입했습니다");
			    	 us.cardcount= us.cardcount+1;
			    	dk.deck[12]=9;cc=1;
			    	us.money=us.money-80;
			    }
				}
			    else {
					System.out.println("돈이부족합니다.");
				}}else {System.out.println("재고가없어요");}
			break;
			
		case 4:
			if(us.money>=200) {
				System.out.println("하하하하하하하 재밌군 재밌어!");
				System.out.println("자네 어디가서도 사기당하는거 조심하게나 하하하");
				 
			us.money=us.money-200;
			break;
			}else {
				System.out.println("돈이부족합니다.");
			}
			break;
			
		case 5:
			if(ee==0) {
			if(us.money>=150) {
				System.out.println("유물을구입했습니다");
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
				System.out.println("돈이부족합니다.");
			}}else {System.out.println("재고가없습니다!");}
			break;
		case 6:
			System.out.println("당신은 떠납니다.");
			break;
		        default:
		        	System.out.println("제대로 고르세요!");
		        	break; 
		        }		    	
		        	}			
					mp.mapping(mylocation);
					
					
					
					System.out.println("현재가지고있는카드들");
					for(int z=0; z<20; z++) {
						if(dk.deck[z]==1) {
						
							System.out.println("베기");
						}
						else if (dk.deck[z]==2)	{
							System.out.println("방패방어");
						}
			else if (dk.deck[z]==3)	{
				System.out.println("악마의일격");
						}
			else if (dk.deck[z]==4)	{
				System.out.println("사격");
			}
			else if (dk.deck[z]==5)	{
				System.out.println("회피");
			}
			else if (dk.deck[z]==6)	{
				System.out.println("회피사격");
			}
			else if (dk.deck[z]==7)	{
				System.out.println("후리기");
			}
			else if (dk.deck[z]==8)	{
				System.out.println("막기");
			}
			else if (dk.deck[z]==9)	{
				System.out.println("파이어");
			}
							
					}
					try{Thread.sleep(2000);
					}catch(Exception e){}
					
					//기다렷다가 보스전
					System.out.println("===============마왕출현===============");
					System.out.println("마왕과 전투 발생!");
					enemy satan = new enemy();
					satan.monname="마왕군 장교";
					satan.HP=50;
					satan.em=500;
					satan.monnum=0;
					dk.setdeck();               //deck를 tpdeck로 복사
			        dk.shuffle(dk.tpdeck, 15);	//카드셔플
			       
			        b=0;
			        for(int k=0; k<dk.handcard.length; k++) { //카드 5장뽑고 저장
			        	
			        	
			        	
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
			     
			       System.out.print("유물: ");rc.showrelic(relic);rc.showrelic(relic1); rc.showrelic(relic2);System.out.println(""); 	
			       dk.showcard();
			       System.out.println("");
			       
			       
			       int defense=0;
			       System.out.println("총카드수"+us.cardcount);
			       System.out.println("남은카드수"+ccount);
			       System.out.println("당신의체력:"+us.HP);
			       System.out.println("적의체력:"+satan.HP);
			       System.out.println("사용할 카드를  3개 선택하시오. 취소불가 신중히 선택!");
			       System.out.println("1.  2.  3.  4.  5. 6.확인");
			       
			      

			       int attack=0;
			       for(int h=0; h<3; h++) {
			       ch=sc.nextInt();
			       switch(ch) {
			       case 1:
			     	  if(dk.handcard[0]==1) {
			     		  System.out.println("1번카드사용");
			     		 attack = attack + 7;
			     		 dk.handcard[0]=0;
			     	  }
			     	  else if (dk.handcard[0]==2) {
			     		 System.out.println("1번카드사용");
			     		 defense= defense + 1;
			     		dk.handcard[0]=0;
			     	  }
			     	 else if (dk.handcard[0]==3) {
			     		System.out.println("1번카드사용");
			     		 attack = attack + 10;
			    		  defense = defense -2;
			    		  dk.handcard[0]=0;
			    	  }
			     	 else if (dk.handcard[0]==4) {
			     		System.out.println("1번카드사용");
			     		attack = attack + 5;
			     		dk.handcard[0]=0;
			    	  }
			     	 else if (dk.handcard[0]==5) {
			     		System.out.println("1번카드사용");
			     		defense= defense + 2;
			     		dk.handcard[0]=0;
			    	  }
			     	 else if (dk.handcard[0]==6) {
			     		System.out.println("1번카드사용");
			     		attack = attack + 6;
			  		  defense = defense + 2;
			  		dk.handcard[0]=0;
			    	  }
			     	 else if (dk.handcard[1]==7) {
			     		System.out.println("1번카드사용");
			    		  attack = attack +3;
			    		  dk.handcard[0]=0;
			    	  }
			     	 else if (dk.handcard[1]==8) {
			     		System.out.println("1번카드사용");
			     		defense = defense + 1;
			     		dk.handcard[0]=0;
			    	  }
			     	 else if (dk.handcard[1]==9) {
			     		System.out.println("1번카드사용");
			    		  attack= attack + 20;
			    		  dk.handcard[0]=0;
			    	  }
			     	else {
			     		System.out.println("다시선택하세요");
			    		h--;
			    	  }
			     	  
			     	  break;
			   case 2:
				   if(dk.handcard[1]==1) {
			  		  System.out.println("2번카드사용");
			  		 attack = attack + 7;
			  		 dk.handcard[1]=0;
			  	  }
			  	  else if (dk.handcard[1]==2) {
			  		 System.out.println("2번카드사용");
			  		 defense= defense + 1;
			  		dk.handcard[1]=0;
			  	  }
			  	 else if (dk.handcard[1]==3) {
			  		System.out.println("2번카드사용");
			  		 attack = attack + 10;
			 		  defense = defense -2;
			 		  dk.handcard[1]=0;
			 	  }
			  	 else if (dk.handcard[1]==4) {
			  		System.out.println("2번카드사용");
			  		attack = attack + 5;
			  		dk.handcard[1]=0;
			 	  }
			  	 else if (dk.handcard[1]==5) {
			  		System.out.println("2번카드사용");
			  		defense= defense + 2;
			  		dk.handcard[1]=0;
			 	  }
			  	 else if (dk.handcard[1]==6) {
			  		System.out.println("2번카드사용");
			  		attack = attack + 6;
					  defense = defense + 2;
					dk.handcard[1]=0;
			 	  }
			  	 else if (dk.handcard[1]==7) {
			  		System.out.println("2번카드사용");
			 		  attack = attack +3;
			 		  dk.handcard[1]=0;
			 	  }
			  	 else if (dk.handcard[1]==8) {
			  		System.out.println("2번카드사용");
			  		defense = defense + 1;
			  		dk.handcard[1]=0;
			 	  }
			  	 else if (dk.handcard[1]==9) {
			  		System.out.println("2번카드사용");
			 		  attack= attack + 20;
			 		  dk.handcard[1]=0;
			 	  }  
			  	else  {
			 		System.out.println("다시선택하세요");
					h--;
				  }
			     	  break;
			     	  
			   case 3:
				   if(dk.handcard[2]==1) {
			  		  System.out.println("3번카드사용");
			  		 attack = attack + 7;
			  		 dk.handcard[2]=0;
			  	  }
			  	  else if (dk.handcard[2]==2) {
			  		 System.out.println("3번카드사용");
			  		 defense= defense + 1;
			  		dk.handcard[2]=0;
			  	  }
			  	 else if (dk.handcard[2]==3) {
			  		System.out.println("3번카드사용");
			  		 attack = attack + 10;
			 		  defense = defense -2;
			 		  dk.handcard[2]=0;
			 	  }
			  	 else if (dk.handcard[2]==4) {
			  		System.out.println("3번카드사용");
			  		attack = attack + 5;
			  		dk.handcard[2]=0;
			 	  }
			  	 else if (dk.handcard[2]==5) {
			  		System.out.println("3번카드사용");
			  		defense= defense + 2;
			  		dk.handcard[2]=0;
			 	  }
			  	 else if (dk.handcard[2]==6) {
			  		System.out.println("3번카드사용");
			  		attack = attack + 6;
					  defense = defense + 2;
					dk.handcard[2]=0;
			 	  }
			  	 else if (dk.handcard[2]==7) {
			  		System.out.println("3번카드사용");
			 		  attack = attack +3;
			 		  dk.handcard[2]=0;
			 	  }
			  	 else if (dk.handcard[2]==8) {
			  		System.out.println("3번카드사용");
			  		defense = defense + 1;
			  		dk.handcard[2]=0;
			 	  }
			  	 else if (dk.handcard[2]==9) {
			  		System.out.println("3번카드사용");
			 		  attack= attack + 20;
			 		  dk.handcard[2]=0;
			 	  }
			  	else  {
			 		System.out.println("다시선택하세요");
					h--;
				  }
			 	  break;
			   case 4:
				   if(dk.handcard[3]==1) {
			  		  System.out.println("4번카드사용");
			  		 attack = attack + 7;
			  		 dk.handcard[3]=0;
			  	  }
			  	  else if (dk.handcard[3]==2) {
			  		 System.out.println("4번카드사용");
			  		 defense= defense + 1;
			  		dk.handcard[3]=0;
			  	  }
			  	 else if (dk.handcard[3]==3) {
			  		System.out.println("4번카드사용");
			  		 attack = attack + 10;
			 		  defense = defense -2;
			 		  dk.handcard[3]=0;
			 	  }
			  	 else if (dk.handcard[3]==4) {
			  		System.out.println("4번카드사용");
			  		attack = attack + 5;
			  		dk.handcard[3]=0;
			 	  }
			  	 else if (dk.handcard[3]==5) {
			  		System.out.println("4번카드사용");
			  		defense= defense + 2;
			  		dk.handcard[3]=0;
			 	  }
			  	 else if (dk.handcard[3]==6) {
			  		System.out.println("4번카드사용");
			  		attack = attack + 6;
					  defense = defense + 2;
					dk.handcard[3]=0;
			 	  }
			  	 else if (dk.handcard[3]==7) {
			  		System.out.println("4번카드사용");
			 		  attack = attack +3;
			 		  dk.handcard[3]=0;
			 	  }
			  	 else if (dk.handcard[3]==8) {
			  		System.out.println("4번카드사용");
			  		defense = defense + 1;
			  		dk.handcard[3]=0;
			 	  }
			  	 else if (dk.handcard[3]==9) {
			  		System.out.println("4번카드사용");
			 		  attack= attack + 20;
			 		  dk.handcard[3]=0;
			 	  }
			  	else if (dk.handcard[3]==0) {
			 		System.out.println("다시선택하세요");
					h--;
				  }
			 	  break;
			   case 5:
				   if(dk.handcard[4]==1) {
			  		  System.out.println("5번카드사용");
			  		 attack = attack + 7;
			  		 dk.handcard[4]=0;
			  	  }
			  	  else if (dk.handcard[4]==2) {
			  		 System.out.println("5번카드사용");
			  		 defense= defense + 1;
			  		dk.handcard[4]=0;
			  	  }
			  	 else if (dk.handcard[4]==3) {
			  		System.out.println("5번카드사용");
			  		 attack = attack + 10;
			 		  defense = defense -2;
			 		  dk.handcard[4]=0;
			 	  }
			  	 else if (dk.handcard[4]==4) {
			  		System.out.println("5번카드사용");
			  		attack = attack + 5;
			  		dk.handcard[4]=0;
			 	  }
			  	 else if (dk.handcard[4]==5) {
			  		System.out.println("5번카드사용");
			  		defense= defense + 2;
			  		dk.handcard[4]=0;
			 	  }
			  	 else if (dk.handcard[4]==6) {
			  		System.out.println("5번카드사용");
			  		attack = attack + 6;
					  defense = defense + 2;
					dk.handcard[4]=0;
			 	  }
			  	 else if (dk.handcard[4]==7) {
			  		System.out.println("5번카드사용");
			 		  attack = attack +3;
			 		  dk.handcard[4]=0;
			 	  }
			  	 else if (dk.handcard[4]==8) {
			  		System.out.println("5번카드사용");
			  		defense = defense + 1;
			  		dk.handcard[4]=0;
			 	  }
			  	 else if (dk.handcard[4]==9) {
			  		System.out.println("5번카드사용");
			 		  attack= attack + 20;
			 		  dk.handcard[4]=0;
			 	  }
			  	else  {
			 		System.out.println("다시선택하세요");
					h--;
				  }
			 	  break;
			   case 6:
				   System.out.println("확인");
				   break;
			 	  default :
			 		 System.out.println("다시선택하세요");
			 		 h--;
			 		  break;
			       
			       }
			       }
			       
			       System.out.println("당신의 공격!");
			       satan.HP = satan.HP - attack;
			       System.out.println("상대는"+attack+"만큼의 피해를 입었다.");
			       if(satan.HP<=0) {
			    	   System.out.println("마왕은 쓰러졌다!");
			    	   System.out.println("당신은"+satan.em+"만큼의 돈을 획득하였다.");
			    	   us.money = us.money+satan.em;
			    	   boss=1;
			    	   break;
			       }
			     
			       int beh = (int)(Math.random()*10);
			       if(beh<9) {
			    	   System.out.println("마왕의 공격!");
			    	   us.HP = us.HP + defense - 15; 
			    	   System.out.println("당신은"+-(defense - 15)+"만큼의 피해를 입었다.");
			       }
			       else {
			    	   System.out.println("마왕의 일격!");
			    	   us.HP = us.HP + defense - 40;
			    	   System.out.println("당신은"+-(defense - 40)+"만큼의 피해를 입었다.");
			       }
			       
			     
			       if(us.HP<=0) {
			    	   System.out.println("당신은 쓰러졌다!");
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
			       System.out.println("여기남은수는"+ccount);
			      //남은카드수 3장 미만일때
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
			       //빈슬롯인지 체크하고 그자리에 카드넣기  
			       for(int k=0; k<dk.handcard.length; k++) { //카드 5장뽑고 저장

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
					}//전투반복 끝나는 대괄호
					
				}
				
				
				
			}
		
			
			
			else {
				mylocation=42;
				//몹배틀
				System.out.println("몹배틀");
				 System.out.println("===============일반몹===============");
					System.out.println("마왕군 장교와 전투 발생!");
					enemy mon1 = new enemy();
				       mon1.monname="마왕군 장교";
				       mon1.HP=1;
				       mon1.em=20;
				       mon1.monnum=2;
					dk.setdeck();               //deck를 tpdeck로 복사
			        dk.shuffle(dk.tpdeck, 15);	//카드셔플
			       
			      int  b=0;
			        for(int k=0; k<dk.handcard.length; k++) { //카드 5장뽑고 저장
			        	
			        	
			        	
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
			     
			       System.out.print("유물: ");rc.showrelic(relic);rc.showrelic(relic1); rc.showrelic(relic2);System.out.println(""); 	
			       dk.showcard();
			       System.out.println("");
			       
			       
			       int defense=0;
			       System.out.println("총카드수"+us.cardcount);
			       System.out.println("남은카드수"+ccount);
			       System.out.println("당신의체력:"+us.HP);
			       System.out.println("적의체력:"+mon1.HP);
			       System.out.println("사용할 카드를  3개 선택하시오. 취소불가 신중히 선택!");
			       System.out.println("1.  2.  3.  4.  5. 6.확인");
			       
			      

			       
			       int attack=0;
			       for(int h=0; h<3; h++) {
			       ch=sc.nextInt();
			       switch(ch) {
			       case 1:
			     	  if(dk.handcard[0]==1) {
			     		  System.out.println("1번카드사용");
			     		 attack = attack + 7;
			     		 dk.handcard[0]=0;
			     	  }
			     	  else if (dk.handcard[0]==2) {
			     		 System.out.println("1번카드사용");
			     		 defense= defense + 1;
			     		dk.handcard[0]=0;
			     	  }
			     	 else if (dk.handcard[0]==3) {
			     		System.out.println("1번카드사용");
			     		 attack = attack + 10;
			    		  defense = defense -2;
			    		  dk.handcard[0]=0;
			    	  }
			     	 else if (dk.handcard[0]==4) {
			     		System.out.println("1번카드사용");
			     		attack = attack + 5;
			     		dk.handcard[0]=0;
			    	  }
			     	 else if (dk.handcard[0]==5) {
			     		System.out.println("1번카드사용");
			     		defense= defense + 2;
			     		dk.handcard[0]=0;
			    	  }
			     	 else if (dk.handcard[0]==6) {
			     		System.out.println("1번카드사용");
			     		attack = attack + 6;
			  		  defense = defense + 2;
			  		dk.handcard[0]=0;
			    	  }
			     	 else if (dk.handcard[1]==7) {
			     		System.out.println("1번카드사용");
			    		  attack = attack +3;
			    		  dk.handcard[0]=0;
			    	  }
			     	 else if (dk.handcard[1]==8) {
			     		System.out.println("1번카드사용");
			     		defense = defense + 1;
			     		dk.handcard[0]=0;
			    	  }
			     	 else if (dk.handcard[1]==9) {
			     		System.out.println("1번카드사용");
			    		  attack= attack + 20;
			    		  dk.handcard[0]=0;
			    	  }
			     	else {
			     		System.out.println("다시선택하세요");
			    		h--;
			    	  }
			     	  
			     	  break;
			   case 2:
				   if(dk.handcard[1]==1) {
			  		  System.out.println("2번카드사용");
			  		 attack = attack + 7;
			  		 dk.handcard[1]=0;
			  	  }
			  	  else if (dk.handcard[1]==2) {
			  		 System.out.println("2번카드사용");
			  		 defense= defense + 1;
			  		dk.handcard[1]=0;
			  	  }
			  	 else if (dk.handcard[1]==3) {
			  		System.out.println("2번카드사용");
			  		 attack = attack + 10;
			 		  defense = defense -2;
			 		  dk.handcard[1]=0;
			 	  }
			  	 else if (dk.handcard[1]==4) {
			  		System.out.println("2번카드사용");
			  		attack = attack + 5;
			  		dk.handcard[1]=0;
			 	  }
			  	 else if (dk.handcard[1]==5) {
			  		System.out.println("2번카드사용");
			  		defense= defense + 2;
			  		dk.handcard[1]=0;
			 	  }
			  	 else if (dk.handcard[1]==6) {
			  		System.out.println("2번카드사용");
			  		attack = attack + 6;
					  defense = defense + 2;
					dk.handcard[1]=0;
			 	  }
			  	 else if (dk.handcard[1]==7) {
			  		System.out.println("2번카드사용");
			 		  attack = attack +3;
			 		  dk.handcard[1]=0;
			 	  }
			  	 else if (dk.handcard[1]==8) {
			  		System.out.println("2번카드사용");
			  		defense = defense + 1;
			  		dk.handcard[1]=0;
			 	  }
			  	 else if (dk.handcard[1]==9) {
			  		System.out.println("2번카드사용");
			 		  attack= attack + 20;
			 		  dk.handcard[1]=0;
			 	  }  
			  	else  {
			 		System.out.println("다시선택하세요");
					h--;
				  }
			     	  break;
			     	  
			   case 3:
				   if(dk.handcard[2]==1) {
			  		  System.out.println("3번카드사용");
			  		 attack = attack + 7;
			  		 dk.handcard[2]=0;
			  	  }
			  	  else if (dk.handcard[2]==2) {
			  		 System.out.println("3번카드사용");
			  		 defense= defense + 1;
			  		dk.handcard[2]=0;
			  	  }
			  	 else if (dk.handcard[2]==3) {
			  		System.out.println("3번카드사용");
			  		 attack = attack + 10;
			 		  defense = defense -2;
			 		  dk.handcard[2]=0;
			 	  }
			  	 else if (dk.handcard[2]==4) {
			  		System.out.println("3번카드사용");
			  		attack = attack + 5;
			  		dk.handcard[2]=0;
			 	  }
			  	 else if (dk.handcard[2]==5) {
			  		System.out.println("3번카드사용");
			  		defense= defense + 2;
			  		dk.handcard[2]=0;
			 	  }
			  	 else if (dk.handcard[2]==6) {
			  		System.out.println("3번카드사용");
			  		attack = attack + 6;
					  defense = defense + 2;
					dk.handcard[2]=0;
			 	  }
			  	 else if (dk.handcard[2]==7) {
			  		System.out.println("3번카드사용");
			 		  attack = attack +3;
			 		  dk.handcard[2]=0;
			 	  }
			  	 else if (dk.handcard[2]==8) {
			  		System.out.println("3번카드사용");
			  		defense = defense + 1;
			  		dk.handcard[2]=0;
			 	  }
			  	 else if (dk.handcard[2]==9) {
			  		System.out.println("3번카드사용");
			 		  attack= attack + 20;
			 		  dk.handcard[2]=0;
			 	  }
			  	else  {
			 		System.out.println("다시선택하세요");
					h--;
				  }
			 	  break;
			   case 4:
				   if(dk.handcard[3]==1) {
			  		  System.out.println("4번카드사용");
			  		 attack = attack + 7;
			  		 dk.handcard[3]=0;
			  	  }
			  	  else if (dk.handcard[3]==2) {
			  		 System.out.println("4번카드사용");
			  		 defense= defense + 1;
			  		dk.handcard[3]=0;
			  	  }
			  	 else if (dk.handcard[3]==3) {
			  		System.out.println("4번카드사용");
			  		 attack = attack + 10;
			 		  defense = defense -2;
			 		  dk.handcard[3]=0;
			 	  }
			  	 else if (dk.handcard[3]==4) {
			  		System.out.println("4번카드사용");
			  		attack = attack + 5;
			  		dk.handcard[3]=0;
			 	  }
			  	 else if (dk.handcard[3]==5) {
			  		System.out.println("4번카드사용");
			  		defense= defense + 2;
			  		dk.handcard[3]=0;
			 	  }
			  	 else if (dk.handcard[3]==6) {
			  		System.out.println("4번카드사용");
			  		attack = attack + 6;
					  defense = defense + 2;
					dk.handcard[3]=0;
			 	  }
			  	 else if (dk.handcard[3]==7) {
			  		System.out.println("4번카드사용");
			 		  attack = attack +3;
			 		  dk.handcard[3]=0;
			 	  }
			  	 else if (dk.handcard[3]==8) {
			  		System.out.println("4번카드사용");
			  		defense = defense + 1;
			  		dk.handcard[3]=0;
			 	  }
			  	 else if (dk.handcard[3]==9) {
			  		System.out.println("4번카드사용");
			 		  attack= attack + 20;
			 		  dk.handcard[3]=0;
			 	  }
			  	else if (dk.handcard[3]==0) {
			 		System.out.println("다시선택하세요");
					h--;
				  }
			 	  break;
			   case 5:
				   if(dk.handcard[4]==1) {
			  		  System.out.println("5번카드사용");
			  		 attack = attack + 7;
			  		 dk.handcard[4]=0;
			  	  }
			  	  else if (dk.handcard[4]==2) {
			  		 System.out.println("5번카드사용");
			  		 defense= defense + 1;
			  		dk.handcard[4]=0;
			  	  }
			  	 else if (dk.handcard[4]==3) {
			  		System.out.println("5번카드사용");
			  		 attack = attack + 10;
			 		  defense = defense -2;
			 		  dk.handcard[4]=0;
			 	  }
			  	 else if (dk.handcard[4]==4) {
			  		System.out.println("5번카드사용");
			  		attack = attack + 5;
			  		dk.handcard[4]=0;
			 	  }
			  	 else if (dk.handcard[4]==5) {
			  		System.out.println("5번카드사용");
			  		defense= defense + 2;
			  		dk.handcard[4]=0;
			 	  }
			  	 else if (dk.handcard[4]==6) {
			  		System.out.println("5번카드사용");
			  		attack = attack + 6;
					  defense = defense + 2;
					dk.handcard[4]=0;
			 	  }
			  	 else if (dk.handcard[4]==7) {
			  		System.out.println("5번카드사용");
			 		  attack = attack +3;
			 		  dk.handcard[4]=0;
			 	  }
			  	 else if (dk.handcard[4]==8) {
			  		System.out.println("5번카드사용");
			  		defense = defense + 1;
			  		dk.handcard[4]=0;
			 	  }
			  	 else if (dk.handcard[4]==9) {
			  		System.out.println("5번카드사용");
			 		  attack= attack + 20;
			 		  dk.handcard[4]=0;
			 	  }
			  	else  {
			 		System.out.println("다시선택하세요");
					h--;
				  }
			 	  break;
			   case 6:
				   System.out.println("확인");
				   break;
			 	  default :
			 		 System.out.println("다시선택하세요");
			 		 h--;
			 		  break;
			       
			       }
			       }
			       
			       System.out.println("당신의 공격!");
			       mon1.HP = mon1.HP - attack;
			       System.out.println("상대는"+attack+"만큼의 피해를 입었다.");
			       if(mon1.HP<=0) {
			    	   System.out.println("적은 쓰러졌다!");
			    	   System.out.println("당신은"+mon1.em+"만큼의 돈을 획득하였다.");
			    	   us.money = us.money+mon1.em;
			    	   break;
			       }
			       
			    	   System.out.println("장교의 공격!");
			    	   us.HP = us.HP + defense - 10; 
			    	   System.out.println("당신은"+-(defense - 10)+"만큼의 피해를 입었다.");
			       
			     
			       if(us.HP<=0) {
			    	   System.out.println("당신은 쓰러졌다!");
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
			       System.out.println("여기남은수는"+ccount);
			      //남은카드수 3장 미만일때
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
			       //빈슬롯인지 체크하고 그자리에 카드넣기  
			       for(int k=0; k<dk.handcard.length; k++) { //카드 5장뽑고 저장

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
			   
			   
			     

					}//전투반복 끝나는 대괄호
				

				mp.mapping(mylocation);
				mylocation=52;
				
				

				//기다렸다가 상인이벤트
				System.out.println("========================상인========================");
	        	System.out.println("소지금:"+us.money);
	        	System.out.println("어서오세요! 없는거 빼고 다있습니다!");
	        	System.out.println("1.공격카드:30원   2.방어카드:10원  3.직업특수카드:80원   4.조커카드:200원   5.상인의부적:150원   6.떠나기");
	        	while(ch!=6) {
	        		
	        ch=sc.nextInt();
	        switch(ch) {
	        case 1:
	        	if(aa==0) {
	        	if(us.money>=30) {
	        if(us.job==1) {
	        	System.out.println("카드를구입했습니다");
	        	 us.cardcount= us.cardcount+1;
	        	dk.deck[10]=1; aa=1;
	        	us.money=us.money-30;
	        }
	        else if(us.job==2) {
	        	System.out.println("카드를구입했습니다");
	        	 us.cardcount= us.cardcount+1;
	        	dk.deck[10]=4; aa=1;
	        	us.money=us.money-30;
	        }
	        else if(us.job==3) {
	        	System.out.println("카드를구입했습니다");
	        	 us.cardcount= us.cardcount+1;
	        	dk.deck[10]=7; aa=1;
	        	us.money=us.money-30;
	        }
	        	}else {
	        		System.out.println("돈이부족합니다.");
	        	}
	        	}else {System.out.println("재고가없어요!");}
	        	
	        	break;
	        	
	case 2:
		if(bb==0) {
		if(us.money>=10) {
		if(us.job==1) {
			System.out.println("카드를구입했습니다");
			 us.cardcount= us.cardcount+1;
	    	dk.deck[11]=2;bb=1;
	    	us.money=us.money-10;
	    }
	    else if(us.job==2) {
	    	System.out.println("카드를구입했습니다");
	    	 us.cardcount= us.cardcount+1;
	    	dk.deck[11]=5;bb=1;
	    	us.money=us.money-10;
	    }
	    else if(us.job==3) {
	    	System.out.println("카드를구입했습니다");
	    	 us.cardcount= us.cardcount+1;
	    	dk.deck[11]=8;bb=1;
	    	us.money=us.money-10;
	    }
		}
	    else {
			System.out.println("돈이부족합니다.");
		}}else {System.out.println("재고가없어요!");}

	        	break;
	case 3:
		if(cc==0) {
		if(us.money>=80) {
			if(us.job==1) {
				System.out.println("카드를구입했습니다");
				 us.cardcount= us.cardcount+1;
		    	dk.deck[12]=3;cc=1;
		    	us.money=us.money-80;
		    }
		    else if(us.job==2) {
		    	System.out.println("카드를구입했습니다");
		    	 us.cardcount= us.cardcount+1;
		    	dk.deck[12]=6;cc=1;
		    	us.money=us.money-80;
		    }
		    else if(us.job==3) {
		    	System.out.println("카드를구입했습니다");
		    	 us.cardcount= us.cardcount+1;
		    	dk.deck[12]=9;cc=1;
		    	us.money=us.money-80;
		    }
			}
		    else {
				System.out.println("돈이부족합니다.");
			}}else {System.out.println("재고가없어요");}
		break;
		
	case 4:
		if(us.money>=200) {
			System.out.println("하하하하하하하 재밌군 재밌어!");
			System.out.println("자네 어디가서도 사기당하는거 조심하게나 하하하");
			 
		us.money=us.money-200;
		break;
		}else {
			System.out.println("돈이부족합니다.");
		}
		break;
		
	case 5:
		if(ee==0) {
		if(us.money>=150) {
			System.out.println("유물을구입했습니다");
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
			System.out.println("돈이부족합니다.");
		}}else {System.out.println("재고가없습니다!");}
		break;
	case 6:
		System.out.println("당신은 떠납니다.");
		break;
	        default:
	        	System.out.println("제대로 고르세요!");
	        	break;
	        
	   
	        }
	        	
	        	
	        	}

				
				
				mp.mapping(mylocation);
				//기다렸다가 보스전
				System.out.println("현재가지고있는카드들");
				for(int z=0; z<20; z++) {
					if(dk.deck[z]==1) {
					
						System.out.println("베기");
					}
					else if (dk.deck[z]==2)	{
						System.out.println("방패방어");
					}
		else if (dk.deck[z]==3)	{
			System.out.println("악마의일격");
					}
		else if (dk.deck[z]==4)	{
			System.out.println("사격");
		}
		else if (dk.deck[z]==5)	{
			System.out.println("회피");
		}
		else if (dk.deck[z]==6)	{
			System.out.println("회피사격");
		}
		else if (dk.deck[z]==7)	{
			System.out.println("후리기");
		}
		else if (dk.deck[z]==8)	{
			System.out.println("막기");
		}
		else if (dk.deck[z]==9)	{
			System.out.println("파이어");
		}
						
				}
				try{Thread.sleep(2000);
				}catch(Exception e){}
				System.out.println("===============마왕출현===============");
				System.out.println("마왕과 전투 발생!");
				enemy satan = new enemy();
				satan.monname="마왕군 장교";
				satan.HP=50;
				satan.em=500;
				satan.monnum=0;
				dk.setdeck();               //deck를 tpdeck로 복사
		        dk.shuffle(dk.tpdeck, 15);	//카드셔플
		       
		        b=0;
		        for(int k=0; k<dk.handcard.length; k++) { //카드 5장뽑고 저장
		        	
		        	
		        	
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
		     
		       System.out.print("유물: ");rc.showrelic(relic);rc.showrelic(relic1); rc.showrelic(relic2);System.out.println(""); 	
		       dk.showcard();
		       System.out.println("");
		       
		       
		       int defense=0;
		       System.out.println("총카드수"+us.cardcount);
		       System.out.println("남은카드수"+ccount);
		       System.out.println("당신의체력:"+us.HP);
		       System.out.println("적의체력:"+satan.HP);
		       System.out.println("사용할 카드를  3개 선택하시오. 취소불가 신중히 선택!");
		       System.out.println("1.  2.  3.  4.  5. 6.확인");
		       
		      

		       int attack=0;
		       for(int h=0; h<3; h++) {
		       ch=sc.nextInt();
		       switch(ch) {
		       case 1:
		     	  if(dk.handcard[0]==1) {
		     		  System.out.println("1번카드사용");
		     		 attack = attack + 7;
		     		 dk.handcard[0]=0;
		     	  }
		     	  else if (dk.handcard[0]==2) {
		     		 System.out.println("1번카드사용");
		     		 defense= defense + 1;
		     		dk.handcard[0]=0;
		     	  }
		     	 else if (dk.handcard[0]==3) {
		     		System.out.println("1번카드사용");
		     		 attack = attack + 10;
		    		  defense = defense -2;
		    		  dk.handcard[0]=0;
		    	  }
		     	 else if (dk.handcard[0]==4) {
		     		System.out.println("1번카드사용");
		     		attack = attack + 5;
		     		dk.handcard[0]=0;
		    	  }
		     	 else if (dk.handcard[0]==5) {
		     		System.out.println("1번카드사용");
		     		defense= defense + 2;
		     		dk.handcard[0]=0;
		    	  }
		     	 else if (dk.handcard[0]==6) {
		     		System.out.println("1번카드사용");
		     		attack = attack + 6;
		  		  defense = defense + 2;
		  		dk.handcard[0]=0;
		    	  }
		     	 else if (dk.handcard[1]==7) {
		     		System.out.println("1번카드사용");
		    		  attack = attack +3;
		    		  dk.handcard[0]=0;
		    	  }
		     	 else if (dk.handcard[1]==8) {
		     		System.out.println("1번카드사용");
		     		defense = defense + 1;
		     		dk.handcard[0]=0;
		    	  }
		     	 else if (dk.handcard[1]==9) {
		     		System.out.println("1번카드사용");
		    		  attack= attack + 20;
		    		  dk.handcard[0]=0;
		    	  }
		     	else {
		     		System.out.println("다시선택하세요");
		    		h--;
		    	  }
		     	  
		     	  break;
		   case 2:
			   if(dk.handcard[1]==1) {
		  		  System.out.println("2번카드사용");
		  		 attack = attack + 7;
		  		 dk.handcard[1]=0;
		  	  }
		  	  else if (dk.handcard[1]==2) {
		  		 System.out.println("2번카드사용");
		  		 defense= defense + 1;
		  		dk.handcard[1]=0;
		  	  }
		  	 else if (dk.handcard[1]==3) {
		  		System.out.println("2번카드사용");
		  		 attack = attack + 10;
		 		  defense = defense -2;
		 		  dk.handcard[1]=0;
		 	  }
		  	 else if (dk.handcard[1]==4) {
		  		System.out.println("2번카드사용");
		  		attack = attack + 5;
		  		dk.handcard[1]=0;
		 	  }
		  	 else if (dk.handcard[1]==5) {
		  		System.out.println("2번카드사용");
		  		defense= defense + 2;
		  		dk.handcard[1]=0;
		 	  }
		  	 else if (dk.handcard[1]==6) {
		  		System.out.println("2번카드사용");
		  		attack = attack + 6;
				  defense = defense + 2;
				dk.handcard[1]=0;
		 	  }
		  	 else if (dk.handcard[1]==7) {
		  		System.out.println("2번카드사용");
		 		  attack = attack +3;
		 		  dk.handcard[1]=0;
		 	  }
		  	 else if (dk.handcard[1]==8) {
		  		System.out.println("2번카드사용");
		  		defense = defense + 1;
		  		dk.handcard[1]=0;
		 	  }
		  	 else if (dk.handcard[1]==9) {
		  		System.out.println("2번카드사용");
		 		  attack= attack + 20;
		 		  dk.handcard[1]=0;
		 	  }  
		  	else  {
		 		System.out.println("다시선택하세요");
				h--;
			  }
		     	  break;
		     	  
		   case 3:
			   if(dk.handcard[2]==1) {
		  		  System.out.println("3번카드사용");
		  		 attack = attack + 7;
		  		 dk.handcard[2]=0;
		  	  }
		  	  else if (dk.handcard[2]==2) {
		  		 System.out.println("3번카드사용");
		  		 defense= defense + 1;
		  		dk.handcard[2]=0;
		  	  }
		  	 else if (dk.handcard[2]==3) {
		  		System.out.println("3번카드사용");
		  		 attack = attack + 10;
		 		  defense = defense -2;
		 		  dk.handcard[2]=0;
		 	  }
		  	 else if (dk.handcard[2]==4) {
		  		System.out.println("3번카드사용");
		  		attack = attack + 5;
		  		dk.handcard[2]=0;
		 	  }
		  	 else if (dk.handcard[2]==5) {
		  		System.out.println("3번카드사용");
		  		defense= defense + 2;
		  		dk.handcard[2]=0;
		 	  }
		  	 else if (dk.handcard[2]==6) {
		  		System.out.println("3번카드사용");
		  		attack = attack + 6;
				  defense = defense + 2;
				dk.handcard[2]=0;
		 	  }
		  	 else if (dk.handcard[2]==7) {
		  		System.out.println("3번카드사용");
		 		  attack = attack +3;
		 		  dk.handcard[2]=0;
		 	  }
		  	 else if (dk.handcard[2]==8) {
		  		System.out.println("3번카드사용");
		  		defense = defense + 1;
		  		dk.handcard[2]=0;
		 	  }
		  	 else if (dk.handcard[2]==9) {
		  		System.out.println("3번카드사용");
		 		  attack= attack + 20;
		 		  dk.handcard[2]=0;
		 	  }
		  	else  {
		 		System.out.println("다시선택하세요");
				h--;
			  }
		 	  break;
		   case 4:
			   if(dk.handcard[3]==1) {
		  		  System.out.println("4번카드사용");
		  		 attack = attack + 7;
		  		 dk.handcard[3]=0;
		  	  }
		  	  else if (dk.handcard[3]==2) {
		  		 System.out.println("4번카드사용");
		  		 defense= defense + 1;
		  		dk.handcard[3]=0;
		  	  }
		  	 else if (dk.handcard[3]==3) {
		  		System.out.println("4번카드사용");
		  		 attack = attack + 10;
		 		  defense = defense -2;
		 		  dk.handcard[3]=0;
		 	  }
		  	 else if (dk.handcard[3]==4) {
		  		System.out.println("4번카드사용");
		  		attack = attack + 5;
		  		dk.handcard[3]=0;
		 	  }
		  	 else if (dk.handcard[3]==5) {
		  		System.out.println("4번카드사용");
		  		defense= defense + 2;
		  		dk.handcard[3]=0;
		 	  }
		  	 else if (dk.handcard[3]==6) {
		  		System.out.println("4번카드사용");
		  		attack = attack + 6;
				  defense = defense + 2;
				dk.handcard[3]=0;
		 	  }
		  	 else if (dk.handcard[3]==7) {
		  		System.out.println("4번카드사용");
		 		  attack = attack +3;
		 		  dk.handcard[3]=0;
		 	  }
		  	 else if (dk.handcard[3]==8) {
		  		System.out.println("4번카드사용");
		  		defense = defense + 1;
		  		dk.handcard[3]=0;
		 	  }
		  	 else if (dk.handcard[3]==9) {
		  		System.out.println("4번카드사용");
		 		  attack= attack + 20;
		 		  dk.handcard[3]=0;
		 	  }
		  	else if (dk.handcard[3]==0) {
		 		System.out.println("다시선택하세요");
				h--;
			  }
		 	  break;
		   case 5:
			   if(dk.handcard[4]==1) {
		  		  System.out.println("5번카드사용");
		  		 attack = attack + 7;
		  		 dk.handcard[4]=0;
		  	  }
		  	  else if (dk.handcard[4]==2) {
		  		 System.out.println("5번카드사용");
		  		 defense= defense + 1;
		  		dk.handcard[4]=0;
		  	  }
		  	 else if (dk.handcard[4]==3) {
		  		System.out.println("5번카드사용");
		  		 attack = attack + 10;
		 		  defense = defense -2;
		 		  dk.handcard[4]=0;
		 	  }
		  	 else if (dk.handcard[4]==4) {
		  		System.out.println("5번카드사용");
		  		attack = attack + 5;
		  		dk.handcard[4]=0;
		 	  }
		  	 else if (dk.handcard[4]==5) {
		  		System.out.println("5번카드사용");
		  		defense= defense + 2;
		  		dk.handcard[4]=0;
		 	  }
		  	 else if (dk.handcard[4]==6) {
		  		System.out.println("5번카드사용");
		  		attack = attack + 6;
				  defense = defense + 2;
				dk.handcard[4]=0;
		 	  }
		  	 else if (dk.handcard[4]==7) {
		  		System.out.println("5번카드사용");
		 		  attack = attack +3;
		 		  dk.handcard[4]=0;
		 	  }
		  	 else if (dk.handcard[4]==8) {
		  		System.out.println("5번카드사용");
		  		defense = defense + 1;
		  		dk.handcard[4]=0;
		 	  }
		  	 else if (dk.handcard[4]==9) {
		  		System.out.println("5번카드사용");
		 		  attack= attack + 20;
		 		  dk.handcard[4]=0;
		 	  }
		  	else  {
		 		System.out.println("다시선택하세요");
				h--;
			  }
		 	  break;
		   case 6:
			   System.out.println("확인");
			   break;
		 	  default :
		 		 System.out.println("다시선택하세요");
		 		 h--;
		 		  break;
		       
		       }
		       }
		       
		       System.out.println("당신의 공격!");
		       satan.HP = satan.HP - attack;
		       System.out.println("상대는"+attack+"만큼의 피해를 입었다.");
		       if(satan.HP<=0) {
		    	   System.out.println("마왕은 쓰러졌다!");
		    	   System.out.println("당신은"+satan.em+"만큼의 돈을 획득하였다.");
		    	   us.money = us.money+satan.em;
		    	   boss=1;
		    	   break;
		       }
		       
		       int beh = (int)(Math.random()*10);
		       if(beh<9) {
		    	   System.out.println("마왕의 공격!");
		    	   us.HP = us.HP + defense - 15; 
		    	   System.out.println("당신은"+-(defense - 15)+"만큼의 피해를 입었다.");
		       }
		       else {
		    	   System.out.println("마왕의 일격!");
		    	   us.HP = us.HP + defense - 40;
		    	   System.out.println("당신은"+-(defense - 40)+"만큼의 피해를 입었다.");
		       }
		       
		     
		       if(us.HP<=0) {
		    	   System.out.println("당신은 쓰러졌다!");
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
		       System.out.println("여기남은수는"+ccount);
		      //남은카드수 3장 미만일때
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
		       //빈슬롯인지 체크하고 그자리에 카드넣기  
		       for(int k=0; k<dk.handcard.length; k++) { //카드 5장뽑고 저장

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
				}//전투반복 끝나는 대괄호

			}
			
		}
		//여기밖앙
		
		
		else {
			mylocation=33;
			//몹배틀
			System.out.println("배틀");
			 System.out.println("===============일반몹===============");
				System.out.println("마왕군 장교와 전투 발생!");
				enemy mon1 = new enemy();
			       mon1.monname="마왕군 장교";
			       mon1.HP=1;
			       mon1.em=20;
			       mon1.monnum=2;
				dk.setdeck();               //deck를 tpdeck로 복사
		        dk.shuffle(dk.tpdeck, 15);	//카드셔플
		       
		      int  b=0;
		        for(int k=0; k<dk.handcard.length; k++) { //카드 5장뽑고 저장
		        	
		        	
		        	
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
		     
		       System.out.print("유물: ");rc.showrelic(relic);rc.showrelic(relic1); rc.showrelic(relic2);System.out.println(""); 	
		       dk.showcard();
		       System.out.println("");
		       
		       
		       int defense=0;
		       System.out.println("총카드수"+us.cardcount);
		       System.out.println("남은카드수"+ccount);
		       System.out.println("당신의체력:"+us.HP);
		       System.out.println("적의체력:"+mon1.HP);
		       System.out.println("사용할 카드를  3개 선택하시오. 취소불가 신중히 선택!");
		       System.out.println("1.  2.  3.  4.  5. 6.확인");
		       
		      

		       
		       int attack=0;
		       for(int h=0; h<3; h++) {
		       ch=sc.nextInt();
		       switch(ch) {
		       case 1:
		     	  if(dk.handcard[0]==1) {
		     		  System.out.println("1번카드사용");
		     		 attack = attack + 7;
		     		 dk.handcard[0]=0;
		     	  }
		     	  else if (dk.handcard[0]==2) {
		     		 System.out.println("1번카드사용");
		     		 defense= defense + 1;
		     		dk.handcard[0]=0;
		     	  }
		     	 else if (dk.handcard[0]==3) {
		     		System.out.println("1번카드사용");
		     		 attack = attack + 10;
		    		  defense = defense -2;
		    		  dk.handcard[0]=0;
		    	  }
		     	 else if (dk.handcard[0]==4) {
		     		System.out.println("1번카드사용");
		     		attack = attack + 5;
		     		dk.handcard[0]=0;
		    	  }
		     	 else if (dk.handcard[0]==5) {
		     		System.out.println("1번카드사용");
		     		defense= defense + 2;
		     		dk.handcard[0]=0;
		    	  }
		     	 else if (dk.handcard[0]==6) {
		     		System.out.println("1번카드사용");
		     		attack = attack + 6;
		  		  defense = defense + 2;
		  		dk.handcard[0]=0;
		    	  }
		     	 else if (dk.handcard[1]==7) {
		     		System.out.println("1번카드사용");
		    		  attack = attack +3;
		    		  dk.handcard[0]=0;
		    	  }
		     	 else if (dk.handcard[1]==8) {
		     		System.out.println("1번카드사용");
		     		defense = defense + 1;
		     		dk.handcard[0]=0;
		    	  }
		     	 else if (dk.handcard[1]==9) {
		     		System.out.println("1번카드사용");
		    		  attack= attack + 20;
		    		  dk.handcard[0]=0;
		    	  }
		     	else {
		     		System.out.println("다시선택하세요");
		    		h--;
		    	  }
		     	  
		     	  break;
		   case 2:
			   if(dk.handcard[1]==1) {
		  		  System.out.println("2번카드사용");
		  		 attack = attack + 7;
		  		 dk.handcard[1]=0;
		  	  }
		  	  else if (dk.handcard[1]==2) {
		  		 System.out.println("2번카드사용");
		  		 defense= defense + 1;
		  		dk.handcard[1]=0;
		  	  }
		  	 else if (dk.handcard[1]==3) {
		  		System.out.println("2번카드사용");
		  		 attack = attack + 10;
		 		  defense = defense -2;
		 		  dk.handcard[1]=0;
		 	  }
		  	 else if (dk.handcard[1]==4) {
		  		System.out.println("2번카드사용");
		  		attack = attack + 5;
		  		dk.handcard[1]=0;
		 	  }
		  	 else if (dk.handcard[1]==5) {
		  		System.out.println("2번카드사용");
		  		defense= defense + 2;
		  		dk.handcard[1]=0;
		 	  }
		  	 else if (dk.handcard[1]==6) {
		  		System.out.println("2번카드사용");
		  		attack = attack + 6;
				  defense = defense + 2;
				dk.handcard[1]=0;
		 	  }
		  	 else if (dk.handcard[1]==7) {
		  		System.out.println("2번카드사용");
		 		  attack = attack +3;
		 		  dk.handcard[1]=0;
		 	  }
		  	 else if (dk.handcard[1]==8) {
		  		System.out.println("2번카드사용");
		  		defense = defense + 1;
		  		dk.handcard[1]=0;
		 	  }
		  	 else if (dk.handcard[1]==9) {
		  		System.out.println("2번카드사용");
		 		  attack= attack + 20;
		 		  dk.handcard[1]=0;
		 	  }  
		  	else  {
		 		System.out.println("다시선택하세요");
				h--;
			  }
		     	  break;
		     	  
		   case 3:
			   if(dk.handcard[2]==1) {
		  		  System.out.println("3번카드사용");
		  		 attack = attack + 7;
		  		 dk.handcard[2]=0;
		  	  }
		  	  else if (dk.handcard[2]==2) {
		  		 System.out.println("3번카드사용");
		  		 defense= defense + 1;
		  		dk.handcard[2]=0;
		  	  }
		  	 else if (dk.handcard[2]==3) {
		  		System.out.println("3번카드사용");
		  		 attack = attack + 10;
		 		  defense = defense -2;
		 		  dk.handcard[2]=0;
		 	  }
		  	 else if (dk.handcard[2]==4) {
		  		System.out.println("3번카드사용");
		  		attack = attack + 5;
		  		dk.handcard[2]=0;
		 	  }
		  	 else if (dk.handcard[2]==5) {
		  		System.out.println("3번카드사용");
		  		defense= defense + 2;
		  		dk.handcard[2]=0;
		 	  }
		  	 else if (dk.handcard[2]==6) {
		  		System.out.println("3번카드사용");
		  		attack = attack + 6;
				  defense = defense + 2;
				dk.handcard[2]=0;
		 	  }
		  	 else if (dk.handcard[2]==7) {
		  		System.out.println("3번카드사용");
		 		  attack = attack +3;
		 		  dk.handcard[2]=0;
		 	  }
		  	 else if (dk.handcard[2]==8) {
		  		System.out.println("3번카드사용");
		  		defense = defense + 1;
		  		dk.handcard[2]=0;
		 	  }
		  	 else if (dk.handcard[2]==9) {
		  		System.out.println("3번카드사용");
		 		  attack= attack + 20;
		 		  dk.handcard[2]=0;
		 	  }
		  	else  {
		 		System.out.println("다시선택하세요");
				h--;
			  }
		 	  break;
		   case 4:
			   if(dk.handcard[3]==1) {
		  		  System.out.println("4번카드사용");
		  		 attack = attack + 7;
		  		 dk.handcard[3]=0;
		  	  }
		  	  else if (dk.handcard[3]==2) {
		  		 System.out.println("4번카드사용");
		  		 defense= defense + 1;
		  		dk.handcard[3]=0;
		  	  }
		  	 else if (dk.handcard[3]==3) {
		  		System.out.println("4번카드사용");
		  		 attack = attack + 10;
		 		  defense = defense -2;
		 		  dk.handcard[3]=0;
		 	  }
		  	 else if (dk.handcard[3]==4) {
		  		System.out.println("4번카드사용");
		  		attack = attack + 5;
		  		dk.handcard[3]=0;
		 	  }
		  	 else if (dk.handcard[3]==5) {
		  		System.out.println("4번카드사용");
		  		defense= defense + 2;
		  		dk.handcard[3]=0;
		 	  }
		  	 else if (dk.handcard[3]==6) {
		  		System.out.println("4번카드사용");
		  		attack = attack + 6;
				  defense = defense + 2;
				dk.handcard[3]=0;
		 	  }
		  	 else if (dk.handcard[3]==7) {
		  		System.out.println("4번카드사용");
		 		  attack = attack +3;
		 		  dk.handcard[3]=0;
		 	  }
		  	 else if (dk.handcard[3]==8) {
		  		System.out.println("4번카드사용");
		  		defense = defense + 1;
		  		dk.handcard[3]=0;
		 	  }
		  	 else if (dk.handcard[3]==9) {
		  		System.out.println("4번카드사용");
		 		  attack= attack + 20;
		 		  dk.handcard[3]=0;
		 	  }
		  	else if (dk.handcard[3]==0) {
		 		System.out.println("다시선택하세요");
				h--;
			  }
		 	  break;
		   case 5:
			   if(dk.handcard[4]==1) {
		  		  System.out.println("5번카드사용");
		  		 attack = attack + 7;
		  		 dk.handcard[4]=0;
		  	  }
		  	  else if (dk.handcard[4]==2) {
		  		 System.out.println("5번카드사용");
		  		 defense= defense + 1;
		  		dk.handcard[4]=0;
		  	  }
		  	 else if (dk.handcard[4]==3) {
		  		System.out.println("5번카드사용");
		  		 attack = attack + 10;
		 		  defense = defense -2;
		 		  dk.handcard[4]=0;
		 	  }
		  	 else if (dk.handcard[4]==4) {
		  		System.out.println("5번카드사용");
		  		attack = attack + 5;
		  		dk.handcard[4]=0;
		 	  }
		  	 else if (dk.handcard[4]==5) {
		  		System.out.println("5번카드사용");
		  		defense= defense + 2;
		  		dk.handcard[4]=0;
		 	  }
		  	 else if (dk.handcard[4]==6) {
		  		System.out.println("5번카드사용");
		  		attack = attack + 6;
				  defense = defense + 2;
				dk.handcard[4]=0;
		 	  }
		  	 else if (dk.handcard[4]==7) {
		  		System.out.println("5번카드사용");
		 		  attack = attack +3;
		 		  dk.handcard[4]=0;
		 	  }
		  	 else if (dk.handcard[4]==8) {
		  		System.out.println("5번카드사용");
		  		defense = defense + 1;
		  		dk.handcard[4]=0;
		 	  }
		  	 else if (dk.handcard[4]==9) {
		  		System.out.println("5번카드사용");
		 		  attack= attack + 20;
		 		  dk.handcard[4]=0;
		 	  }
		  	else  {
		 		System.out.println("다시선택하세요");
				h--;
			  }
		 	  break;
		   case 6:
			   System.out.println("확인");
			   break;
		 	  default :
		 		 System.out.println("다시선택하세요");
		 		 h--;
		 		  break;
		       
		       }
		       }
		       
		       System.out.println("당신의 공격!");
		       mon1.HP = mon1.HP - attack;
		       System.out.println("상대는"+attack+"만큼의 피해를 입었다.");
		       if(mon1.HP<=0) {
		    	   System.out.println("적은 쓰러졌다!");
		    	   System.out.println("당신은"+mon1.em+"만큼의 돈을 획득하였다.");
		    	   us.money = us.money+mon1.em;
		    	   break;
		       }
		       
		    	   System.out.println("장교의 공격!");
		    	   us.HP = us.HP + defense - 10; 
		    	   System.out.println("당신은"+-(defense - 10)+"만큼의 피해를 입었다.");
		       
		     
		       if(us.HP<=0) {
		    	   System.out.println("당신은 쓰러졌다!");
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
		       System.out.println("여기남은수는"+ccount);
		      //남은카드수 3장 미만일때
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
		       //빈슬롯인지 체크하고 그자리에 카드넣기  
		       for(int k=0; k<dk.handcard.length; k++) { //카드 5장뽑고 저장

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
		   
		   
		     

				}//전투반복 끝나는 대괄호
			
			
			mp.mapping(mylocation);
			mylocation=42;
			//기다렸다가몹배틀
			System.out.println("배틀");
			 System.out.println("===============일반몹===============");
				System.out.println("마왕군 장교와 전투 발생!");
			//	enemy mon1 = new enemy();
			       mon1.monname="마왕군 장교";
			       mon1.HP=1;
			       mon1.em=20;
			       mon1.monnum=2;
				dk.setdeck();               //deck를 tpdeck로 복사
		        dk.shuffle(dk.tpdeck, 15);	//카드셔플
		       
		        b=0;
		        for(int k=0; k<dk.handcard.length; k++) { //카드 5장뽑고 저장
		        	
		        	
		        	
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
		     
		       System.out.print("유물: ");rc.showrelic(relic);rc.showrelic(relic1); rc.showrelic(relic2);System.out.println(""); 	
		       dk.showcard();
		       System.out.println("");
		       
		       
		       int defense=0;
		       System.out.println("총카드수"+us.cardcount);
		       System.out.println("남은카드수"+ccount);
		       System.out.println("당신의체력:"+us.HP);
		       System.out.println("적의체력:"+mon1.HP);
		       System.out.println("사용할 카드를  3개 선택하시오. 취소불가 신중히 선택!");
		       System.out.println("1.  2.  3.  4.  5. 6.확인");
		       
		      

		       
		       int attack=0;
		       for(int h=0; h<3; h++) {
		       ch=sc.nextInt();
		       switch(ch) {
		       case 1:
		     	  if(dk.handcard[0]==1) {
		     		  System.out.println("1번카드사용");
		     		 attack = attack + 7;
		     		 dk.handcard[0]=0;
		     	  }
		     	  else if (dk.handcard[0]==2) {
		     		 System.out.println("1번카드사용");
		     		 defense= defense + 1;
		     		dk.handcard[0]=0;
		     	  }
		     	 else if (dk.handcard[0]==3) {
		     		System.out.println("1번카드사용");
		     		 attack = attack + 10;
		    		  defense = defense -2;
		    		  dk.handcard[0]=0;
		    	  }
		     	 else if (dk.handcard[0]==4) {
		     		System.out.println("1번카드사용");
		     		attack = attack + 5;
		     		dk.handcard[0]=0;
		    	  }
		     	 else if (dk.handcard[0]==5) {
		     		System.out.println("1번카드사용");
		     		defense= defense + 2;
		     		dk.handcard[0]=0;
		    	  }
		     	 else if (dk.handcard[0]==6) {
		     		System.out.println("1번카드사용");
		     		attack = attack + 6;
		  		  defense = defense + 2;
		  		dk.handcard[0]=0;
		    	  }
		     	 else if (dk.handcard[1]==7) {
		     		System.out.println("1번카드사용");
		    		  attack = attack +3;
		    		  dk.handcard[0]=0;
		    	  }
		     	 else if (dk.handcard[1]==8) {
		     		System.out.println("1번카드사용");
		     		defense = defense + 1;
		     		dk.handcard[0]=0;
		    	  }
		     	 else if (dk.handcard[1]==9) {
		     		System.out.println("1번카드사용");
		    		  attack= attack + 20;
		    		  dk.handcard[0]=0;
		    	  }
		     	else {
		     		System.out.println("다시선택하세요");
		    		h--;
		    	  }
		     	  
		     	  break;
		   case 2:
			   if(dk.handcard[1]==1) {
		  		  System.out.println("2번카드사용");
		  		 attack = attack + 7;
		  		 dk.handcard[1]=0;
		  	  }
		  	  else if (dk.handcard[1]==2) {
		  		 System.out.println("2번카드사용");
		  		 defense= defense + 1;
		  		dk.handcard[1]=0;
		  	  }
		  	 else if (dk.handcard[1]==3) {
		  		System.out.println("2번카드사용");
		  		 attack = attack + 10;
		 		  defense = defense -2;
		 		  dk.handcard[1]=0;
		 	  }
		  	 else if (dk.handcard[1]==4) {
		  		System.out.println("2번카드사용");
		  		attack = attack + 5;
		  		dk.handcard[1]=0;
		 	  }
		  	 else if (dk.handcard[1]==5) {
		  		System.out.println("2번카드사용");
		  		defense= defense + 2;
		  		dk.handcard[1]=0;
		 	  }
		  	 else if (dk.handcard[1]==6) {
		  		System.out.println("2번카드사용");
		  		attack = attack + 6;
				  defense = defense + 2;
				dk.handcard[1]=0;
		 	  }
		  	 else if (dk.handcard[1]==7) {
		  		System.out.println("2번카드사용");
		 		  attack = attack +3;
		 		  dk.handcard[1]=0;
		 	  }
		  	 else if (dk.handcard[1]==8) {
		  		System.out.println("2번카드사용");
		  		defense = defense + 1;
		  		dk.handcard[1]=0;
		 	  }
		  	 else if (dk.handcard[1]==9) {
		  		System.out.println("2번카드사용");
		 		  attack= attack + 20;
		 		  dk.handcard[1]=0;
		 	  }  
		  	else  {
		 		System.out.println("다시선택하세요");
				h--;
			  }
		     	  break;
		     	  
		   case 3:
			   if(dk.handcard[2]==1) {
		  		  System.out.println("3번카드사용");
		  		 attack = attack + 7;
		  		 dk.handcard[2]=0;
		  	  }
		  	  else if (dk.handcard[2]==2) {
		  		 System.out.println("3번카드사용");
		  		 defense= defense + 1;
		  		dk.handcard[2]=0;
		  	  }
		  	 else if (dk.handcard[2]==3) {
		  		System.out.println("3번카드사용");
		  		 attack = attack + 10;
		 		  defense = defense -2;
		 		  dk.handcard[2]=0;
		 	  }
		  	 else if (dk.handcard[2]==4) {
		  		System.out.println("3번카드사용");
		  		attack = attack + 5;
		  		dk.handcard[2]=0;
		 	  }
		  	 else if (dk.handcard[2]==5) {
		  		System.out.println("3번카드사용");
		  		defense= defense + 2;
		  		dk.handcard[2]=0;
		 	  }
		  	 else if (dk.handcard[2]==6) {
		  		System.out.println("3번카드사용");
		  		attack = attack + 6;
				  defense = defense + 2;
				dk.handcard[2]=0;
		 	  }
		  	 else if (dk.handcard[2]==7) {
		  		System.out.println("3번카드사용");
		 		  attack = attack +3;
		 		  dk.handcard[2]=0;
		 	  }
		  	 else if (dk.handcard[2]==8) {
		  		System.out.println("3번카드사용");
		  		defense = defense + 1;
		  		dk.handcard[2]=0;
		 	  }
		  	 else if (dk.handcard[2]==9) {
		  		System.out.println("3번카드사용");
		 		  attack= attack + 20;
		 		  dk.handcard[2]=0;
		 	  }
		  	else  {
		 		System.out.println("다시선택하세요");
				h--;
			  }
		 	  break;
		   case 4:
			   if(dk.handcard[3]==1) {
		  		  System.out.println("4번카드사용");
		  		 attack = attack + 7;
		  		 dk.handcard[3]=0;
		  	  }
		  	  else if (dk.handcard[3]==2) {
		  		 System.out.println("4번카드사용");
		  		 defense= defense + 1;
		  		dk.handcard[3]=0;
		  	  }
		  	 else if (dk.handcard[3]==3) {
		  		System.out.println("4번카드사용");
		  		 attack = attack + 10;
		 		  defense = defense -2;
		 		  dk.handcard[3]=0;
		 	  }
		  	 else if (dk.handcard[3]==4) {
		  		System.out.println("4번카드사용");
		  		attack = attack + 5;
		  		dk.handcard[3]=0;
		 	  }
		  	 else if (dk.handcard[3]==5) {
		  		System.out.println("4번카드사용");
		  		defense= defense + 2;
		  		dk.handcard[3]=0;
		 	  }
		  	 else if (dk.handcard[3]==6) {
		  		System.out.println("4번카드사용");
		  		attack = attack + 6;
				  defense = defense + 2;
				dk.handcard[3]=0;
		 	  }
		  	 else if (dk.handcard[3]==7) {
		  		System.out.println("4번카드사용");
		 		  attack = attack +3;
		 		  dk.handcard[3]=0;
		 	  }
		  	 else if (dk.handcard[3]==8) {
		  		System.out.println("4번카드사용");
		  		defense = defense + 1;
		  		dk.handcard[3]=0;
		 	  }
		  	 else if (dk.handcard[3]==9) {
		  		System.out.println("4번카드사용");
		 		  attack= attack + 20;
		 		  dk.handcard[3]=0;
		 	  }
		  	else if (dk.handcard[3]==0) {
		 		System.out.println("다시선택하세요");
				h--;
			  }
		 	  break;
		   case 5:
			   if(dk.handcard[4]==1) {
		  		  System.out.println("5번카드사용");
		  		 attack = attack + 7;
		  		 dk.handcard[4]=0;
		  	  }
		  	  else if (dk.handcard[4]==2) {
		  		 System.out.println("5번카드사용");
		  		 defense= defense + 1;
		  		dk.handcard[4]=0;
		  	  }
		  	 else if (dk.handcard[4]==3) {
		  		System.out.println("5번카드사용");
		  		 attack = attack + 10;
		 		  defense = defense -2;
		 		  dk.handcard[4]=0;
		 	  }
		  	 else if (dk.handcard[4]==4) {
		  		System.out.println("5번카드사용");
		  		attack = attack + 5;
		  		dk.handcard[4]=0;
		 	  }
		  	 else if (dk.handcard[4]==5) {
		  		System.out.println("5번카드사용");
		  		defense= defense + 2;
		  		dk.handcard[4]=0;
		 	  }
		  	 else if (dk.handcard[4]==6) {
		  		System.out.println("5번카드사용");
		  		attack = attack + 6;
				  defense = defense + 2;
				dk.handcard[4]=0;
		 	  }
		  	 else if (dk.handcard[4]==7) {
		  		System.out.println("5번카드사용");
		 		  attack = attack +3;
		 		  dk.handcard[4]=0;
		 	  }
		  	 else if (dk.handcard[4]==8) {
		  		System.out.println("5번카드사용");
		  		defense = defense + 1;
		  		dk.handcard[4]=0;
		 	  }
		  	 else if (dk.handcard[4]==9) {
		  		System.out.println("5번카드사용");
		 		  attack= attack + 20;
		 		  dk.handcard[4]=0;
		 	  }
		  	else  {
		 		System.out.println("다시선택하세요");
				h--;
			  }
		 	  break;
		   case 6:
			   System.out.println("확인");
			   break;
		 	  default :
		 		 System.out.println("다시선택하세요");
		 		 h--;
		 		  break;
		       
		       }
		       }
		       
		       System.out.println("당신의 공격!");
		       mon1.HP = mon1.HP - attack;
		       System.out.println("상대는"+attack+"만큼의 피해를 입었다.");
		       if(mon1.HP<=0) {
		    	   System.out.println("적은 쓰러졌다!");
		    	   System.out.println("당신은"+mon1.em+"만큼의 돈을 획득하였다.");
		    	   us.money = us.money+mon1.em;
		    	   break;
		       }
		       
		    	   System.out.println("장교의 공격!");
		    	   us.HP = us.HP + defense - 10; 
		    	   System.out.println("당신은"+-(defense - 10)+"만큼의 피해를 입었다.");
		       
		     
		       if(us.HP<=0) {
		    	   System.out.println("당신은 쓰러졌다!");
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
		       System.out.println("여기남은수는"+ccount);
		      //남은카드수 3장 미만일때
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
		       //빈슬롯인지 체크하고 그자리에 카드넣기  
		       for(int k=0; k<dk.handcard.length; k++) { //카드 5장뽑고 저장

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

				}//전투반복 끝나는 대괄호
			

			
			mp.mapping(mylocation);
			mylocation=52;
			//기다렸다가상인이벤트
			System.out.println("========================상인========================");
        	System.out.println("소지금:"+us.money);
        	System.out.println("어서오세요! 없는거 빼고 다있습니다!");
        	System.out.println("1.공격카드:30원   2.방어카드:10원  3.직업특수카드:80원   4.조커카드:200원   5.상인의부적:150원   6.떠나기");
        	while(ch!=6) {
        		
        ch=sc.nextInt();
        switch(ch) {
        case 1:
        	if(aa==0) {
        	if(us.money>=30) {
        if(us.job==1) {
        	System.out.println("카드를구입했습니다");
        	 us.cardcount= us.cardcount+1;
        	dk.deck[10]=1; aa=1;
        	us.money=us.money-30;
        }
        else if(us.job==2) {
        	System.out.println("카드를구입했습니다");
        	 us.cardcount= us.cardcount+1;
        	dk.deck[10]=4; aa=1;
        	us.money=us.money-30;
        }
        else if(us.job==3) {
        	System.out.println("카드를구입했습니다");
        	 us.cardcount= us.cardcount+1;
        	dk.deck[10]=7; aa=1;
        	us.money=us.money-30;
        }
        	}else {
        		System.out.println("돈이부족합니다.");
        	}
        	}else {System.out.println("재고가없어요!");}
        	
        	break;
        	
case 2:
	if(bb==0) {
	if(us.money>=10) {
	if(us.job==1) {
		System.out.println("카드를구입했습니다");
		 us.cardcount= us.cardcount+1;
    	dk.deck[11]=2;bb=1;
    	us.money=us.money-10;
    }
    else if(us.job==2) {
    	System.out.println("카드를구입했습니다");
    	 us.cardcount= us.cardcount+1;
    	dk.deck[11]=5;bb=1;
    	us.money=us.money-10;
    }
    else if(us.job==3) {
    	System.out.println("카드를구입했습니다");
    	 us.cardcount= us.cardcount+1;
    	dk.deck[11]=8;bb=1;
    	us.money=us.money-10;
    }
	}
    else {
		System.out.println("돈이부족합니다.");
	}}else {System.out.println("재고가없어요!");}

        	break;
case 3:
	if(cc==0) {
	if(us.money>=80) {
		if(us.job==1) {
			System.out.println("카드를구입했습니다");
			 us.cardcount= us.cardcount+1;
	    	dk.deck[12]=3;cc=1;
	    	us.money=us.money-80;
	    }
	    else if(us.job==2) {
	    	System.out.println("카드를구입했습니다");
	    	 us.cardcount= us.cardcount+1;
	    	dk.deck[12]=6;cc=1;
	    	us.money=us.money-80;
	    }
	    else if(us.job==3) {
	    	System.out.println("카드를구입했습니다");
	    	 us.cardcount= us.cardcount+1;
	    	dk.deck[12]=9;cc=1;
	    	us.money=us.money-80;
	    }
		}
	    else {
			System.out.println("돈이부족합니다.");
		}}else {System.out.println("재고가없어요");}
	break;
	
case 4:
	if(us.money>=200) {
		System.out.println("하하하하하하하 재밌군 재밌어!");
		System.out.println("자네 어디가서도 사기당하는거 조심하게나 하하하");
		 
	us.money=us.money-200;
	break;
	}else {
		System.out.println("돈이부족합니다.");
	}
	break;
	
case 5:
	if(ee==0) {
	if(us.money>=150) {
		System.out.println("유물을구입했습니다");
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
		System.out.println("돈이부족합니다.");
	}}else {System.out.println("재고가없습니다!");}
	break;
case 6:
	System.out.println("당신은 떠납니다.");
	break;
        default:
        	System.out.println("제대로 고르세요!");
        	break;
        
   
        }
        	
        	
        	}

			
			mp.mapping(mylocation);
			mylocation=61;
			//기다렸다가 보스전
			System.out.println("===============마왕출현===============");
			System.out.println("마왕과 전투 발생!");
			enemy satan = new enemy();
			satan.monname="마왕군 장교";
			satan.HP=50;
			satan.em=500;
			satan.monnum=0;
			dk.setdeck();               //deck를 tpdeck로 복사
	        dk.shuffle(dk.tpdeck, 15);	//카드셔플
	       
	        b=0;
	        for(int k=0; k<dk.handcard.length; k++) { //카드 5장뽑고 저장
	        	
	        	
	        	
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
	     
	       System.out.print("유물: ");rc.showrelic(relic);rc.showrelic(relic1); rc.showrelic(relic2);System.out.println(""); 	
	       dk.showcard();
	       System.out.println("");
	       
	       
	       int defense=0;
	       System.out.println("총카드수"+us.cardcount);
	       System.out.println("남은카드수"+ccount);
	       System.out.println("당신의체력:"+us.HP);
	       System.out.println("적의체력:"+satan.HP);
	       System.out.println("사용할 카드를  3개 선택하시오. 취소불가 신중히 선택!");
	       System.out.println("1.  2.  3.  4.  5. 6.확인");
	       
	      

	       int attack=0;
	       for(int h=0; h<3; h++) {
	       ch=sc.nextInt();
	       switch(ch) {
	       case 1:
	     	  if(dk.handcard[0]==1) {
	     		  System.out.println("1번카드사용");
	     		 attack = attack + 7;
	     		 dk.handcard[0]=0;
	     	  }
	     	  else if (dk.handcard[0]==2) {
	     		 System.out.println("1번카드사용");
	     		 defense= defense + 1;
	     		dk.handcard[0]=0;
	     	  }
	     	 else if (dk.handcard[0]==3) {
	     		System.out.println("1번카드사용");
	     		 attack = attack + 10;
	    		  defense = defense -2;
	    		  dk.handcard[0]=0;
	    	  }
	     	 else if (dk.handcard[0]==4) {
	     		System.out.println("1번카드사용");
	     		attack = attack + 5;
	     		dk.handcard[0]=0;
	    	  }
	     	 else if (dk.handcard[0]==5) {
	     		System.out.println("1번카드사용");
	     		defense= defense + 2;
	     		dk.handcard[0]=0;
	    	  }
	     	 else if (dk.handcard[0]==6) {
	     		System.out.println("1번카드사용");
	     		attack = attack + 6;
	  		  defense = defense + 2;
	  		dk.handcard[0]=0;
	    	  }
	     	 else if (dk.handcard[1]==7) {
	     		System.out.println("1번카드사용");
	    		  attack = attack +3;
	    		  dk.handcard[0]=0;
	    	  }
	     	 else if (dk.handcard[1]==8) {
	     		System.out.println("1번카드사용");
	     		defense = defense + 1;
	     		dk.handcard[0]=0;
	    	  }
	     	 else if (dk.handcard[1]==9) {
	     		System.out.println("1번카드사용");
	    		  attack= attack + 20;
	    		  dk.handcard[0]=0;
	    	  }
	     	else {
	     		System.out.println("다시선택하세요");
	    		h--;
	    	  }
	     	  
	     	  break;
	   case 2:
		   if(dk.handcard[1]==1) {
	  		  System.out.println("2번카드사용");
	  		 attack = attack + 7;
	  		 dk.handcard[1]=0;
	  	  }
	  	  else if (dk.handcard[1]==2) {
	  		 System.out.println("2번카드사용");
	  		 defense= defense + 1;
	  		dk.handcard[1]=0;
	  	  }
	  	 else if (dk.handcard[1]==3) {
	  		System.out.println("2번카드사용");
	  		 attack = attack + 10;
	 		  defense = defense -2;
	 		  dk.handcard[1]=0;
	 	  }
	  	 else if (dk.handcard[1]==4) {
	  		System.out.println("2번카드사용");
	  		attack = attack + 5;
	  		dk.handcard[1]=0;
	 	  }
	  	 else if (dk.handcard[1]==5) {
	  		System.out.println("2번카드사용");
	  		defense= defense + 2;
	  		dk.handcard[1]=0;
	 	  }
	  	 else if (dk.handcard[1]==6) {
	  		System.out.println("2번카드사용");
	  		attack = attack + 6;
			  defense = defense + 2;
			dk.handcard[1]=0;
	 	  }
	  	 else if (dk.handcard[1]==7) {
	  		System.out.println("2번카드사용");
	 		  attack = attack +3;
	 		  dk.handcard[1]=0;
	 	  }
	  	 else if (dk.handcard[1]==8) {
	  		System.out.println("2번카드사용");
	  		defense = defense + 1;
	  		dk.handcard[1]=0;
	 	  }
	  	 else if (dk.handcard[1]==9) {
	  		System.out.println("2번카드사용");
	 		  attack= attack + 20;
	 		  dk.handcard[1]=0;
	 	  }  
	  	else  {
	 		System.out.println("다시선택하세요");
			h--;
		  }
	     	  break;
	     	  
	   case 3:
		   if(dk.handcard[2]==1) {
	  		  System.out.println("3번카드사용");
	  		 attack = attack + 7;
	  		 dk.handcard[2]=0;
	  	  }
	  	  else if (dk.handcard[2]==2) {
	  		 System.out.println("3번카드사용");
	  		 defense= defense + 1;
	  		dk.handcard[2]=0;
	  	  }
	  	 else if (dk.handcard[2]==3) {
	  		System.out.println("3번카드사용");
	  		 attack = attack + 10;
	 		  defense = defense -2;
	 		  dk.handcard[2]=0;
	 	  }
	  	 else if (dk.handcard[2]==4) {
	  		System.out.println("3번카드사용");
	  		attack = attack + 5;
	  		dk.handcard[2]=0;
	 	  }
	  	 else if (dk.handcard[2]==5) {
	  		System.out.println("3번카드사용");
	  		defense= defense + 2;
	  		dk.handcard[2]=0;
	 	  }
	  	 else if (dk.handcard[2]==6) {
	  		System.out.println("3번카드사용");
	  		attack = attack + 6;
			  defense = defense + 2;
			dk.handcard[2]=0;
	 	  }
	  	 else if (dk.handcard[2]==7) {
	  		System.out.println("3번카드사용");
	 		  attack = attack +3;
	 		  dk.handcard[2]=0;
	 	  }
	  	 else if (dk.handcard[2]==8) {
	  		System.out.println("3번카드사용");
	  		defense = defense + 1;
	  		dk.handcard[2]=0;
	 	  }
	  	 else if (dk.handcard[2]==9) {
	  		System.out.println("3번카드사용");
	 		  attack= attack + 20;
	 		  dk.handcard[2]=0;
	 	  }
	  	else  {
	 		System.out.println("다시선택하세요");
			h--;
		  }
	 	  break;
	   case 4:
		   if(dk.handcard[3]==1) {
	  		  System.out.println("4번카드사용");
	  		 attack = attack + 7;
	  		 dk.handcard[3]=0;
	  	  }
	  	  else if (dk.handcard[3]==2) {
	  		 System.out.println("4번카드사용");
	  		 defense= defense + 1;
	  		dk.handcard[3]=0;
	  	  }
	  	 else if (dk.handcard[3]==3) {
	  		System.out.println("4번카드사용");
	  		 attack = attack + 10;
	 		  defense = defense -2;
	 		  dk.handcard[3]=0;
	 	  }
	  	 else if (dk.handcard[3]==4) {
	  		System.out.println("4번카드사용");
	  		attack = attack + 5;
	  		dk.handcard[3]=0;
	 	  }
	  	 else if (dk.handcard[3]==5) {
	  		System.out.println("4번카드사용");
	  		defense= defense + 2;
	  		dk.handcard[3]=0;
	 	  }
	  	 else if (dk.handcard[3]==6) {
	  		System.out.println("4번카드사용");
	  		attack = attack + 6;
			  defense = defense + 2;
			dk.handcard[3]=0;
	 	  }
	  	 else if (dk.handcard[3]==7) {
	  		System.out.println("4번카드사용");
	 		  attack = attack +3;
	 		  dk.handcard[3]=0;
	 	  }
	  	 else if (dk.handcard[3]==8) {
	  		System.out.println("4번카드사용");
	  		defense = defense + 1;
	  		dk.handcard[3]=0;
	 	  }
	  	 else if (dk.handcard[3]==9) {
	  		System.out.println("4번카드사용");
	 		  attack= attack + 20;
	 		  dk.handcard[3]=0;
	 	  }
	  	else if (dk.handcard[3]==0) {
	 		System.out.println("다시선택하세요");
			h--;
		  }
	 	  break;
	   case 5:
		   if(dk.handcard[4]==1) {
	  		  System.out.println("5번카드사용");
	  		 attack = attack + 7;
	  		 dk.handcard[4]=0;
	  	  }
	  	  else if (dk.handcard[4]==2) {
	  		 System.out.println("5번카드사용");
	  		 defense= defense + 1;
	  		dk.handcard[4]=0;
	  	  }
	  	 else if (dk.handcard[4]==3) {
	  		System.out.println("5번카드사용");
	  		 attack = attack + 10;
	 		  defense = defense -2;
	 		  dk.handcard[4]=0;
	 	  }
	  	 else if (dk.handcard[4]==4) {
	  		System.out.println("5번카드사용");
	  		attack = attack + 5;
	  		dk.handcard[4]=0;
	 	  }
	  	 else if (dk.handcard[4]==5) {
	  		System.out.println("5번카드사용");
	  		defense= defense + 2;
	  		dk.handcard[4]=0;
	 	  }
	  	 else if (dk.handcard[4]==6) {
	  		System.out.println("5번카드사용");
	  		attack = attack + 6;
			  defense = defense + 2;
			dk.handcard[4]=0;
	 	  }
	  	 else if (dk.handcard[4]==7) {
	  		System.out.println("5번카드사용");
	 		  attack = attack +3;
	 		  dk.handcard[4]=0;
	 	  }
	  	 else if (dk.handcard[4]==8) {
	  		System.out.println("5번카드사용");
	  		defense = defense + 1;
	  		dk.handcard[4]=0;
	 	  }
	  	 else if (dk.handcard[4]==9) {
	  		System.out.println("5번카드사용");
	 		  attack= attack + 20;
	 		  dk.handcard[4]=0;
	 	  }
	  	else  {
	 		System.out.println("다시선택하세요");
			h--;
		  }
	 	  break;
	   case 6:
		   System.out.println("확인");
		   break;
	 	  default :
	 		 System.out.println("다시선택하세요");
	 		 h--;
	 		  break;
	       
	       }
	       }
	       
	       System.out.println("당신의 공격!");
	       satan.HP = satan.HP - attack;
	       System.out.println("상대는"+attack+"만큼의 피해를 입었다.");
	       if(satan.HP<=0) {
	    	   System.out.println("마왕은 쓰러졌다!");
	    	   System.out.println("당신은"+satan.em+"만큼의 돈을 획득하였다.");
	    	   us.money = us.money+satan.em;
	    	   boss=1;
	    	   break;
	       }
	      
	       int beh = (int)(Math.random()*10);
	       if(beh<9) {
	    	   System.out.println("마왕의 공격!");
	    	   us.HP = us.HP + defense - 15; 
	    	   System.out.println("당신은"+-(defense - 15)+"만큼의 피해를 입었다.");
	       }
	       else {
	    	   System.out.println("마왕의 일격!");
	    	   us.HP = us.HP + defense - 40;
	    	   System.out.println("당신은"+-(defense - 40)+"만큼의 피해를 입었다.");
	       }
	       
	     
	       if(us.HP<=0) {
	    	   System.out.println("당신은 쓰러졌다!");
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
	       System.out.println("여기남은수는"+ccount);
	      //남은카드수 3장 미만일때
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
	       //빈슬롯인지 체크하고 그자리에 카드넣기  
	       for(int k=0; k<dk.handcard.length; k++) { //카드 5장뽑고 저장

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
			}//전투반복 끝나는 대괄호

		}
		
	}
	
	}catch(InputMismatchException e){
		System.out.println("당신의 그런 부주의함을 가지고는 마왕에 맞설 수 없습니다. 게임을 종료합니다.");
		break;
	}

	//	}//게임의전체적인 반복문 끝나는 대괄호

		}//와일문끝
		 if(us.HP<=0) {
		 System.out.println("게임오버");
		 }
		 if(boss==1) {
			 System.out.println("당신은 마왕을 쓰러트리고 세상에 평화를 가져왔습니다!");
			 System.out.println("당신은 육신은 스러져도 명성은 후세에 길이길이 남을것입니다.");
			 System.out.println("게임 클리어");

		 }
	
		
	//끝나는 곳	
	}

}
