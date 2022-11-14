package hodmain;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ToolTipManager;

public class HeroOfDestiny extends JFrame  {
String hour;
String min;
String sec;
String dot=":";
	
	private Image screenImage;
	private Graphics screenGraphic;
	private Image ib;
	private Image background = new ImageIcon(main.class.getResource("../images/introBackground.jpg")).getImage();
	
	//private ImageIcon start = new ImageIcon(main.class.getResource("../images/start.png"));
	//private ImageIcon chall = new ImageIcon(main.class.getResource("../images/chall.png"));
	//private ImageIcon rank = new ImageIcon(main.class.getResource("../images/rank.png"));
	//private ImageIcon quit = new ImageIcon(main.class.getResource("../images/quit.png"));
	private ImageIcon exbtet = new ImageIcon(main.class.getResource("../images/exbtet.png"));
	private ImageIcon exbt = new ImageIcon(main.class.getResource("../images/exbt.png"));
	//private ImageIcon backbtn = new ImageIcon(main.class.getResource("../images/backbtn.png"));
	
	int move1 =1;
	int move2 =1;
	int move3 =1;
	int move4 =1;
	int move5 =1;
	//여러 글자들
	//튜토불리
	public int tuto = 0;
	private ImageIcon tt1 = new ImageIcon(main.class.getResource("../images/tuto2.png"));
	Image tuto1 = tt1.getImage();
	private ImageIcon tt2 = new ImageIcon(main.class.getResource("../images/tuto3.png"));
	Image tuto2= tt2.getImage();
	private ImageIcon tt3 = new ImageIcon(main.class.getResource("../images/tuto4.png"));
	Image tuto3 = tt3.getImage();
	private ImageIcon tt4 = new ImageIcon(main.class.getResource("../images/tuto5.png"));
	Image tuto4 = tt4.getImage();
	
	card cd = new card();
	battle bt = new battle();
	
	private JLabel menuBar = new JLabel(new ImageIcon(main.class.getResource("../images/menubar.png")));
	private JButton exitButton = new JButton(new ImageIcon(main.class.getResource("../images/exbt.png")));
	private JButton startButton = new JButton(new ImageIcon(main.class.getResource("../images/start.png")));
	private JButton challButton = new JButton(new ImageIcon(main.class.getResource("../images/chall.png")));
	private JButton rankButton = new JButton(new ImageIcon(main.class.getResource("../images/rank.png")));
	private JButton quitButton = new JButton(new ImageIcon(main.class.getResource("../images/quit.png")));
	
	private JButton backButton = new JButton(new ImageIcon(main.class.getResource("../images/backbtn.png")));
	private JButton next = new JButton(new ImageIcon(main.class.getResource("../images/next.png")));
	
	//게임화면에붙는 버튼들
	private JButton deckButton = new JButton(new ImageIcon(main.class.getResource("../images/deck.png")));
	private JButton timeButton = new JButton(new ImageIcon(main.class.getResource("../images/time.png")));
	private JButton moneyButton = new JButton(new ImageIcon(main.class.getResource("../images/money.png")));
	private JButton hpButton = new JButton(new ImageIcon(main.class.getResource("../images/hp.png")));
	private JButton tutoButton = new JButton(new ImageIcon(main.class.getResource("../images/tuto.png")));
	private JButton tutonButton = new JButton(new ImageIcon(main.class.getResource("../images/next.png")));
	
	//맵에들어가는버튼들
	private JButton bossButton = new JButton(new ImageIcon(main.class.getResource("../images/deck.png")));
	
	private JButton elitemonButton = new JButton(new ImageIcon(main.class.getResource("../images/elitemon.png")));
	private JButton monButton = new JButton(new ImageIcon(main.class.getResource("../images/mon.png")));
	private JButton merchantButton = new JButton(new ImageIcon(main.class.getResource("../images/merchant.png")));
	private JButton restButton = new JButton(new ImageIcon(main.class.getResource("../images/rest.png")));
	private JButton eventButton = new JButton(new ImageIcon(main.class.getResource("../images/revent.png")));
	private JButton treasureButton = new JButton(new ImageIcon(main.class.getResource("../images/treasure.png")));
	
	//주인공
	private ImageIcon warr = new ImageIcon(main.class.getResource("../images/warrior.png"));
	Image warrior = warr.getImage();
	
	//몬스터
	//식인식물
	private ImageIcon monn1 = new ImageIcon(main.class.getResource("../images/mon1.png"));
	Image mon1 = monn1.getImage();
	//식인괴물
	private ImageIcon monn2 = new ImageIcon(main.class.getResource("../images/mon2.png"));
	Image mon2 = monn2.getImage();
	//흉포한괴수
	private ImageIcon monn3 = new ImageIcon(main.class.getResource("../images/mon0.png"));
	Image mon3 = monn3.getImage();
	
	//엘리트몹
	//
	private ImageIcon monn4 = new ImageIcon(main.class.getResource("../images/mon3.png"));
	Image mon4 = monn4.getImage();
	private ImageIcon monn5 = new ImageIcon(main.class.getResource("../images/elitemon5.png"));
	Image mon5 = monn5.getImage();
	private ImageIcon monn6 = new ImageIcon(main.class.getResource("../images/mon8.png"));
	Image mon6 = monn6.getImage();
	
	private ImageIcon monn7 = new ImageIcon(main.class.getResource("../images/bossmon.png"));
	Image mon7 = monn7.getImage();
	//전투아이콘들
	private ImageIcon att = new ImageIcon(main.class.getResource("../images/attack.png"));
	Image attack = att.getImage();
	
	private ImageIcon dep = new ImageIcon(main.class.getResource("../images/depend.png"));
	Image depend = dep.getImage();
	
	//카드들
	// = new JButton(new ImageIcon(main.class.getResource("../images/defense.png")));
	
	//private JButton cut = new JButton();
	//private JButton devilcut= new JButton();
	//private JButton defense= new JButton();
	//ImageIcon acut = new ImageIcon(main.class.getResource("../images/cut.png"));
	 ImageIcon cutr = new ImageIcon(main.class.getResource("../images/cut.png"));
	 ImageIcon devilcutr = new ImageIcon(main.class.getResource("../images/devilcut.png"));
	ImageIcon defenser = new ImageIcon(main.class.getResource("../images/defense.png"));
	//Image cut = cutr.getImage(); Image devilcut = devilcutr.getImage(); Image defense = defenser.getImage();
	 ImageIcon pois = new ImageIcon(main.class.getResource("../images/poison.png"));
	 ImageIcon bloodd = new ImageIcon(main.class.getResource("../images/blood.png"));
	 ImageIcon weakk = new ImageIcon(main.class.getResource("../images/weak.png"));
	 ImageIcon vulner = new ImageIcon(main.class.getResource("../images/vulner.png"));
	Image poisonn = pois.getImage();
	Image blooddd = bloodd.getImage();
	Image weakkk = weakk.getImage();
	Image vulnerr = vulner.getImage();
	
	private JButton poi = new JButton(new ImageIcon(main.class.getResource("../images/poison.png")));
	private JButton blo = new JButton(new ImageIcon(main.class.getResource("../images/blood.png")));
	private JButton wea = new JButton(new ImageIcon(main.class.getResource("../images/weak.png")));
	private JButton vul = new JButton(new ImageIcon(main.class.getResource("../images/vulner.png")));
	
	private JButton epoi = new JButton(new ImageIcon(main.class.getResource("../images/poison.png")));
	private JButton eblo = new JButton(new ImageIcon(main.class.getResource("../images/blood.png")));
	private JButton ewea = new JButton(new ImageIcon(main.class.getResource("../images/weak.png")));
	private JButton evul = new JButton(new ImageIcon(main.class.getResource("../images/vulner.png")));
	
	//5장핸드
	private JButton hand1 = new JButton();
	private JButton hand2 = new JButton();
	private JButton hand3 = new JButton();
	private JButton hand4 = new JButton();
	private JButton hand5 = new JButton();
	//= new JButton();
	//상태이상들
	private boolean poison=false;
	private boolean blood=false;
	private boolean weak=false;
	private boolean vulnerable=false;
	
	private boolean epoison=false;
	private boolean eblood=false;
	private boolean eweak=false;
	private boolean evulnerable=false;
	//잠깐만
	//private JLabel poisonn = new JLabel(new ImageIcon(main.class.getResource("../images/poison.png")));
	
	
	//뽑을카드 사용카드
	private JButton drawdeck = new JButton(new ImageIcon(main.class.getResource("../images/drawdeck.png")));
	private JButton usedeck = new JButton(new ImageIcon(main.class.getResource("../images/usedeck.png")));
	
	
	private boolean re=false;
	private boolean gameover=false;
	private int mouseX, mouseY;
    private boolean isMainScreen=false;
    private boolean isbattle=false;
    private int cardgm1; //어떤카드그릴지
    private int cardgm2;private int cardgm3;private int cardgm4;private int cardgm5;
    deck dk = new deck();
	Character ch = new Character();
	Status th = new Status();
	Abnormal ab = new Abnormal();


	//주인공 공/방
	
			String userattack = "15";
			String userdefense = "3";
			int useatk=0;
			int usedef=0;
			//몬스터 공/방 
			String monhp ="50";
			String monattack = "0";
			String mondefense = "0";
			int mohp=50; int monatk =0; int mondef=0;
			
			monster ms = new monster();
			
	String sla = "/";
    
    
//게임실행창설정
	public HeroOfDestiny() {	
		dk.startdeck();
		
		setUndecorated(true);
		setTitle("Hero Of Destiny");
		setSize(main.SCREEN_WIDTH, main.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setBackground(new Color(0, 0, 0, 0));
		setLayout(null);
       
		menuBar.setBounds(0, 0, 1600, 10);
		menuBar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();
			}

		});
		menuBar.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				setLocation(x - mouseX, y - mouseY);
			}

		});

		

		exitButton.setBounds(1560, 0, 40, 40);
		exitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {

				exitButton.setIcon(exbtet);
				exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			
			public void mouseExited(MouseEvent e) {
				exitButton.setIcon(exbt);
				exitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			public void mousePressed(MouseEvent e) {
				System.exit(0);
			}
			
		});
		exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		exitButton.setBorderPainted(false);
		exitButton.setContentAreaFilled(false);
		exitButton.setFocusPainted(false);
		add(exitButton);
		
		
		
		// Image ib = new Image("images/dddd.jpg");
		add(menuBar);
		
		challButton.setBounds(600, 450, 400, 100);
		challButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {

				
				challButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			
			public void mouseExited(MouseEvent e) {
				
				challButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			public void mousePressed(MouseEvent e) {
				//도전과제확인이벤트
				backButton.setVisible(true);
				startButton.setVisible(false);
				challButton.setVisible(false);
				rankButton.setVisible(false);
				quitButton.setVisible(false);
				background = new ImageIcon(main.class.getResource("../images/challback.png")).getImage();
				
			}
			
		});
		challButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		challButton.setBorderPainted(false);
		challButton.setContentAreaFilled(false);
		challButton.setFocusPainted(false);
		add(challButton);
		
		
		
		startButton.setBounds(600, 300, 400, 100);
		startButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {

				
				startButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			
			public void mouseExited(MouseEvent e) {
				
				startButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			public void mousePressed(MouseEvent e) {
				//게임시작할때이벤트
			timer thh = new timer();
			thh.ab=ab;
			
			if(thh.getState()==Thread.State.NEW) {
				thh.start();	
			}
			
				
				ch.warrset();
				
				//쓰레드와상태이상
				//Status st = new Status();
				
				
				
				
				
				
				ch.attack="0";
				//각종게임위쪽버튼들
				moneyButton.setVisible(true);
				hpButton.setVisible(true);
				timeButton.setVisible(true);
				tutoButton.setVisible(true);
				deckButton.setVisible(true);
				backButton.setVisible(true);
				//게임 처음화면버튼들
				startButton.setVisible(false);
				challButton.setVisible(false);
				rankButton.setVisible(false);
				quitButton.setVisible(false);
				
				//맵에들어가는버튼들
				monButton.setVisible(true);
				elitemonButton.setVisible(true);
				merchantButton.setVisible(true);
				restButton.setVisible(true);
				eventButton.setVisible(true);
				treasureButton.setVisible(true);
				
				isMainScreen= true;
				
				
				
				background = new ImageIcon(main.class.getResource("../images/mainback.png")).getImage();
				
			}
			
		});
		startButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		startButton.setBorderPainted(false);
		startButton.setContentAreaFilled(false);
		startButton.setFocusPainted(false);
		add(startButton);
		
		
		rankButton.setBounds(600, 600, 400, 100);
		rankButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {

				
				rankButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			
			public void mouseExited(MouseEvent e) {
				
				rankButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			public void mousePressed(MouseEvent e) {
				//랭킹확인이벤트
				backButton.setVisible(true);
				startButton.setVisible(false);
				challButton.setVisible(false);
				rankButton.setVisible(false);
				quitButton.setVisible(false);
				background = new ImageIcon(main.class.getResource("../images/rankback.png")).getImage();
				
			}
			
		});
		rankButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		rankButton.setBorderPainted(false);
		rankButton.setContentAreaFilled(false);
		rankButton.setFocusPainted(false);
		add(rankButton);
		
		
		
		quitButton.setBounds(600, 750, 400, 100);
		quitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {

				
				quitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			
			public void mouseExited(MouseEvent e) {
				
				quitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			public void mousePressed(MouseEvent e) {
				System.exit(0);
				
				
			}
			
		});
		quitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		quitButton.setBorderPainted(false);
		quitButton.setContentAreaFilled(false);
		quitButton.setFocusPainted(false);
		add(quitButton);
		
		//게임맵화면에서 메인화면으로 돌아가는 버튼
		
		backButton.setBounds(-60, 800, 400, 100);
		backButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {

				
				backButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			
			public void mouseExited(MouseEvent e) {
				
				backButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			public void mousePressed(MouseEvent e) {
				//메인화면으로돌아가는이벤트
				startButton.setVisible(true);
				challButton.setVisible(true);
				rankButton.setVisible(true); 
				quitButton.setVisible(true);
				backButton.setVisible(false);
				tutoButton.setVisible(false);
				moneyButton.setVisible(false);
				deckButton.setVisible(false);
				timeButton.setVisible(false);
				hpButton.setVisible(false);
				drawdeck.setVisible(false);
				usedeck.setVisible(false);
				gameover=false;
				isMainScreen=false;
				background = new ImageIcon(main.class.getResource("../images/introBackground.jpg")).getImage();
				
			}
			
		});
		backButton.setVisible(false);
		backButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		backButton.setBorderPainted(false);
		backButton.setContentAreaFilled(false);
		backButton.setFocusPainted(false);
		add(backButton);
		
		
		//게임화면에붙는버튼들 덱, 체력, 돈, 시간, 튜토
        
		//덱
		deckButton.setBounds(1370, 15, 50, 50);
		deckButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {

				
				deckButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
				deckButton.setToolTipText("현재 가지고 있는 카드를 확인합니다.");
			}
			
			public void mouseExited(MouseEvent e) {
				
				deckButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			public void mousePressed(MouseEvent e) {
				//나의 덱을 확인하는 이벤트
				
			}
			
		});
		deckButton.setVisible(false);
		deckButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		deckButton.setBorderPainted(false);
		deckButton.setContentAreaFilled(false);
		deckButton.setFocusPainted(false);
		add(deckButton);
		
		//튜토리얼진행버튼
		tutonButton.setBounds(1300, 100, 212, 116);
		tutonButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {

				
				tutonButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
				
				tutonButton.setToolTipText("튜토리얼을 봅니다.");
			}
			
			public void mouseExited(MouseEvent e) {
				
				tutonButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			public void mousePressed(MouseEvent e) {
				//튜토리얼을 보는 이벤트
			
				tuto= tuto+1;
				if(tuto==5) {
					  next.setVisible(true);
						monButton.setVisible(true);
						elitemonButton.setVisible(true);
						merchantButton.setVisible(true);
						restButton.setVisible(true);
						eventButton.setVisible(true);
						treasureButton.setVisible(true);
						backButton.setVisible(true);
				}
			 
			}
			
		});
		tutonButton.setVisible(false);
		tutonButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		tutonButton.setBorderPainted(false);
		tutonButton.setContentAreaFilled(false);
		tutonButton.setFocusPainted(false);
		add(tutonButton);
		
		
		//튜토리얼버튼
		tutoButton.setBounds(1500, 15, 50, 50);
		tutoButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {

				
				tutoButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
				
				tutoButton.setToolTipText("튜토리얼을 봅니다.");
			}
			
			public void mouseExited(MouseEvent e) {
				
				tutoButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			public void mousePressed(MouseEvent e) {
				//튜토리얼을 보는 이벤트
				
				tutonButton.setVisible(true);
			    next.setVisible(false);
				monButton.setVisible(false);
				elitemonButton.setVisible(false);
				merchantButton.setVisible(false);
				restButton.setVisible(false);
				eventButton.setVisible(false);
				treasureButton.setVisible(false);
				backButton.setVisible(false);
				tuto=1;
				
			}
			
		});
		tutoButton.setVisible(false);
		tutoButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		tutoButton.setBorderPainted(false);
		tutoButton.setContentAreaFilled(false);
		tutoButton.setFocusPainted(false);
		add(tutoButton);
		
		//시간버튼
	    timeButton.setBounds(710, 15, 50, 50);
	    timeButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {

				
				timeButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			
			public void mouseExited(MouseEvent e) {
				
				timeButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			public void mousePressed(MouseEvent e) {
				//타이머인데 딱히클릭없음
				
			}
			
		});
	    timeButton.setVisible(false);
	    timeButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
	    timeButton.setBorderPainted(false);
	    timeButton.setContentAreaFilled(false);
	    timeButton.setFocusPainted(false);
		add(timeButton);
		
	    //체력버튼
		hpButton.setBounds(300, 15, 50, 50);
		hpButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {

				
				hpButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			
			public void mouseExited(MouseEvent e) {
				
				hpButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			public void mousePressed(MouseEvent e) {
				//체력버튼인데 딱히없음
				
			}
			
		});
		hpButton.setVisible(false);
		hpButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		hpButton.setBorderPainted(false);
		hpButton.setContentAreaFilled(false);
		hpButton.setFocusPainted(false);
		add(hpButton);
		
		//돈버튼
		moneyButton.setBounds(450, 15, 50, 50);
		moneyButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {

				
				moneyButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			
			public void mouseExited(MouseEvent e) {
				
				moneyButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			public void mousePressed(MouseEvent e) {
				//돈버튼인데 딱히없음
				
			}
			
		});
		moneyButton.setVisible(false);
		moneyButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		moneyButton.setBorderPainted(false);
		moneyButton.setContentAreaFilled(false);
		moneyButton.setFocusPainted(false);
		add(moneyButton);
		/*
		//상태이상버튼들
		//캐릭터상태이상걸린거
		//독
		poi.setBounds(100, 500, 50, 50);
		poi.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {

				
				poi.setCursor(new Cursor(Cursor.HAND_CURSOR));
				poi.setToolTipText("중독상태입니다. 매 턴 체력을 잃습니다.");
			}
			
			public void mouseExited(MouseEvent e) {
				
				poi.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		
			
		});
		
		poi.setVisible(false);
		poi.setCursor(new Cursor(Cursor.HAND_CURSOR));
		poi.setBorderPainted(false);
		poi.setContentAreaFilled(false);
		poi.setFocusPainted(false);
		add(poi);
		
		//출혈
		blo.setBounds(150, 500, 50, 50);
		blo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {

				
				blo.setCursor(new Cursor(Cursor.HAND_CURSOR));
				blo.setToolTipText("출혈상태입니다. 3초마다 체력을 잃습니다.");
			}
			
			public void mouseExited(MouseEvent e) {
				
				blo.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		
			
		});
		
		blo.setVisible(false);
		blo.setCursor(new Cursor(Cursor.HAND_CURSOR));
		blo.setBorderPainted(false);
		blo.setContentAreaFilled(false);
		blo.setFocusPainted(false);
		add(blo);
		
		//약화
		wea.setBounds(200, 500, 50, 50);
		wea.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {

				
				wea.setCursor(new Cursor(Cursor.HAND_CURSOR));
				wea.setToolTipText("약화상태입니다. 공격력이 떨어집니다.");
			}
			
			public void mouseExited(MouseEvent e) {
				
				wea.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		
			
		});
		
		wea.setVisible(false);
		wea.setCursor(new Cursor(Cursor.HAND_CURSOR));
		wea.setBorderPainted(false);
		wea.setContentAreaFilled(false);
		wea.setFocusPainted(false);
		add(wea);
		
		//쇠약
		vul.setBounds(260, 500, 50, 50);
		vul.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {

				
				vul.setCursor(new Cursor(Cursor.HAND_CURSOR));
				vul.setToolTipText("쇠약상태입니다. 방어력이 떨어집니다.");
			}
			
			public void mouseExited(MouseEvent e) {
				
				vul.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		
			
		});
		
		vul.setVisible(false);
		vul.setCursor(new Cursor(Cursor.HAND_CURSOR));
		vul.setBorderPainted(false);
		vul.setContentAreaFilled(false);
		vul.setFocusPainted(false);
		add(vul);		
		
		
		//몬스터상태이상걸린거
		epoi.setBounds(1300, 550, 50, 50);
		epoi.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {

				
				epoi.setCursor(new Cursor(Cursor.HAND_CURSOR));
				epoi.setToolTipText("중독상태입니다. 매 턴 체력을 잃습니다.");
			}
			
			public void mouseExited(MouseEvent e) {
				
				epoi.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		
			
		});
		
		epoi.setVisible(false);
		epoi.setCursor(new Cursor(Cursor.HAND_CURSOR));
		epoi.setBorderPainted(false);
		epoi.setContentAreaFilled(false);
		epoi.setFocusPainted(false);
		add(epoi);
		
		//출혈
		eblo.setBounds(1350, 550, 50, 50);
		eblo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {

				
				eblo.setCursor(new Cursor(Cursor.HAND_CURSOR));
				eblo.setToolTipText("출혈상태입니다. 3초마다 체력을 잃습니다.");
			}
			
			public void mouseExited(MouseEvent e) {
				
				eblo.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		
			
		});
		
		eblo.setVisible(false);
		eblo.setCursor(new Cursor(Cursor.HAND_CURSOR));
		eblo.setBorderPainted(false);
		eblo.setContentAreaFilled(false);
		eblo.setFocusPainted(false);
		add(eblo);
		
		//약화
		ewea.setBounds(1400, 550, 50, 50);
		ewea.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {

				
				ewea.setCursor(new Cursor(Cursor.HAND_CURSOR));
				ewea.setToolTipText("약화상태입니다. 공격력이 떨어집니다.");
			}
			
			public void mouseExited(MouseEvent e) {
				
				ewea.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		
			
		});
		
		ewea.setVisible(false);
		ewea.setCursor(new Cursor(Cursor.HAND_CURSOR));
		ewea.setBorderPainted(false);
		ewea.setContentAreaFilled(false);
		ewea.setFocusPainted(false);
		add(ewea);
		
		//약화
		evul.setBounds(1460, 550, 50, 50);
		evul.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {

				
				evul.setCursor(new Cursor(Cursor.HAND_CURSOR));
				evul.setToolTipText("쇠약상태입니다. 방어력이 떨어집니다.");
			}
			
			public void mouseExited(MouseEvent e) {
				
				evul.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		
			
		});
		
		evul.setVisible(false);
		evul.setCursor(new Cursor(Cursor.HAND_CURSOR));
		evul.setBorderPainted(false);
		evul.setContentAreaFilled(false);
		evul.setFocusPainted(false);
		add(evul);		
		
		
		
		*/
		
		
		//===============================================
		//뽑을카드덱
		drawdeck.setBounds(1400, 700, 213, 263);
		drawdeck.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {

				
				drawdeck.setCursor(new Cursor(Cursor.HAND_CURSOR));
				drawdeck.setToolTipText("뽑을카드더미 입니다. 매 턴 시작시, 여기에서 랜덤으로 5장의 카드를 손으로 가져옵니다.");
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				drawdeck.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			public void mousePressed(MouseEvent e) {
				
				
			}
			
		});
		
		drawdeck.setVisible(false);
		drawdeck.setCursor(new Cursor(Cursor.HAND_CURSOR));
		drawdeck.setBorderPainted(false);
		drawdeck.setContentAreaFilled(false);
		drawdeck.setFocusPainted(false);
		add(drawdeck);
		
		//사용카드덱
		usedeck.setBounds(0, 700, 213, 263);
		usedeck.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {

				
				usedeck.setCursor(new Cursor(Cursor.HAND_CURSOR));
				
				usedeck.setToolTipText("사용카드더미입니다. 사용한카드는 여기에 넣어집니다.\r "
						+ "더이상 뽑을 수 있는 카드가 없다면 여기에있는 카드를 뽑을카드더미에 넣습니다.");
				//사용카드더미에 툴팁매니저가?>
				ToolTipManager m = ToolTipManager.sharedInstance();
			    m.setInitialDelay(0);
			    m.setDismissDelay(10000);

			}
			
			public void mouseExited(MouseEvent e) {
				
				usedeck.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			public void mousePressed(MouseEvent e) {
			
				
				
			}
			
		});
		usedeck.setVisible(false);
		usedeck.setCursor(new Cursor(Cursor.HAND_CURSOR));
		usedeck.setBorderPainted(false);
		usedeck.setContentAreaFilled(false);
		usedeck.setFocusPainted(false);
		add(usedeck);
		
		//실험임시넥스트
		
		
		
		
		
		
		//******************************여기서부터는 맵에 들어가는 직접적인 버튼들> 상인 보물 배틀 이벤트 휴식
		//배틀
		monButton.setBounds(800, 800, 50, 50);
		monButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {

				
				monButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			
			public void mouseExited(MouseEvent e) {
				
				monButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			public void mousePressed(MouseEvent e) {
				//배틀화면뜨는거
				drawdeck.setVisible(true);
				usedeck.setVisible(true);
			    next.setVisible(false);
				monButton.setVisible(false);
				elitemonButton.setVisible(false);
				merchantButton.setVisible(false);
				restButton.setVisible(false);
				eventButton.setVisible(false);
				treasureButton.setVisible(false);
				backButton.setVisible(false);
				dk.cardcount=0;
				isbattle=true;
				ms.regenmon();
				/*
		       if(ms.regenmon()==1) {
		    		ms.maxhp="50";
					ms.hp="50";
					ms.hpi=50;
					ms.atki=10;
					ms.atk="10";
					ms.def="3";
					ms.defi=3;
				    ms.name="식인식물";
				    ms.monster1=true;
		       }
		       else if (ms.regenmon()==2) {
		    		ms.maxhp="50";
					ms.hp="50";
					ms.hpi=50;
					ms.atki=15;
					ms.atk="15";
					ms.def="0";
					ms.defi=0;
				    ms.name="식인괴물";
		       }else {
		    		ms.maxhp="60";
					ms.hp="60";
					ms.hpi=60;
					ms.atki=12;
					ms.atk="12";
					ms.def="5";
					ms.defi=5;
				    ms.name="흉포한괴수";
		       }
				*/
			
			    
                dk.recard();
               hand1 = new JButton();
            	hand2 = new JButton();
            	hand3 = new JButton();
            	 hand4 = new JButton();
            hand5 = new JButton();
				battle();
                
			}
			
		});
		monButton.setVisible(false);
		monButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		monButton.setBorderPainted(false);
		monButton.setContentAreaFilled(false);
		monButton.setFocusPainted(false);
		add(monButton);
		
		//엘리트
		elitemonButton.setBounds(600, 800, 50, 50);
		elitemonButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {

				
				elitemonButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			
			public void mouseExited(MouseEvent e) {
				
				elitemonButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			public void mousePressed(MouseEvent e) {
				//배틀화면뜨는거
				drawdeck.setVisible(true);
				usedeck.setVisible(true);
			    next.setVisible(false);
				monButton.setVisible(false);
				elitemonButton.setVisible(false);
				merchantButton.setVisible(false);
				restButton.setVisible(false);
				eventButton.setVisible(false);
				treasureButton.setVisible(false);
				backButton.setVisible(false);
				isbattle=true;
				ms.regenelitemon();
				dk.cardcount=0;
	            dk.recard();
	            hand1 = new JButton();
            	hand2 = new JButton();
            	hand3 = new JButton();
            	 hand4 = new JButton();
            hand5 = new JButton();
					battle();
	                
              
			}
			
		});
		elitemonButton.setVisible(false);
		elitemonButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		elitemonButton.setBorderPainted(false);
		elitemonButton.setContentAreaFilled(false);
		elitemonButton.setFocusPainted(false);
		add(elitemonButton);
		
		//이벤트
		eventButton.setBounds(450, 600, 50, 50);
		eventButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {

				
				eventButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			
			public void mouseExited(MouseEvent e) {
				
				eventButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			public void mousePressed(MouseEvent e) {
				//이벤트화면 미지
				
			}
			
		});
		eventButton.setVisible(false);
		eventButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		eventButton.setBorderPainted(false);
		eventButton.setContentAreaFilled(false);
		eventButton.setFocusPainted(false);
		add(eventButton);
		
		
		//상인\
		merchantButton.setBounds(600, 600, 50, 50);
		merchantButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {

				
				merchantButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			
			public void mouseExited(MouseEvent e) {
				
				merchantButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			public void mousePressed(MouseEvent e) {
				//상인뜨는거 유물구입/카드구입,제거/소모품 구입 
				merchant();
				
			}
			
		});
		merchantButton.setVisible(false);
		merchantButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		merchantButton.setBorderPainted(false);
		merchantButton.setContentAreaFilled(false);
		merchantButton.setFocusPainted(false);
		add(merchantButton);
		
		
		//보물
		treasureButton.setBounds(900, 600, 50, 50);
		treasureButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {

				
				treasureButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				treasureButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			public void mousePressed(MouseEvent e) {
				//돈버튼인데 딱히없음
				
			}
			
		});
		treasureButton.setVisible(false);
		treasureButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		treasureButton.setBorderPainted(false);
		treasureButton.setContentAreaFilled(false);
		treasureButton.setFocusPainted(false);
		add(treasureButton);
		
		
		//휴식
		restButton.setBounds(750, 600, 50, 50);
		restButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {

				
				restButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			
			public void mouseExited(MouseEvent e) {
				
				restButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			public void mousePressed(MouseEvent e) {
				//돈버튼인데 딱히없음
				
			}
			
		});
		restButton.setVisible(false);
		restButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		restButton.setBorderPainted(false);
		restButton.setContentAreaFilled(false);
		restButton.setFocusPainted(false);
		add(restButton);
		
		
		
	}

	
	
	
	//rrrr
	public void paint(Graphics g) {
		screenImage = createImage(main.SCREEN_WIDTH, main.SCREEN_HEIGHT);
		screenGraphic = screenImage.getGraphics();
		screenDraw((Graphics2D) screenGraphic);
		g.drawImage(screenImage, 0, 0, null);
	}

	public void screenDraw(Graphics2D g) {
	
		g.drawImage(background, 0, 0, null);
		g.setColor(Color.white);
		g.setFont(new Font("궁서", Font.BOLD, 25));
		
		if(isMainScreen) {
			//ch.hpi="80"; ch.maxhpi="80"; ch.moneyi="100";
			g.drawString(ch.hpi, 350, 45);
			g.drawString(sla, 385, 45);
			g.drawString(ch.maxhpi, 405, 45);
			g.drawString(ch.moneyi, 515, 45);
			//타이머공사
			g.drawString(ab.m, 775, 45);
			g.drawString(dot, 800, 45);
			g.drawString(ab.s, 820, 45);
			
			if(tuto==1) {
				g.drawImage(tuto1, 0, 0,null);
			}
			else if(tuto==2) {
				g.drawImage(tuto2, 0, 0,null);
			}
	else if(tuto==3) {
	g.drawImage(tuto3, 0, 0,null);
			}
	else if(tuto==4) {
	g.drawImage(tuto4, 0, 0,null);
	}else {
		
	  
		
	tutonButton.setVisible(false);
	tuto=0;
	}
			
			
		}
	
	
		
		if(isbattle) {
			background = new ImageIcon(main.class.getResource("../images/battle.png")).getImage();
			
			//주인공하고 적 이미지
			g.drawImage(warrior, 400, 470, null);
			
			
			//주인공 체력/공격/방어
			
			
			g.drawImage(attack, 100, 440, null);			
			g.drawString(ch.attack, 175, 470);
			
			
			
			g.drawImage(depend, 250, 440, null);
			g.drawString(ch.depend, 325, 470);
			
			//몬스터 이름/체력/공격/방어
			//식인식물일때
			if(ms.monster1) {
			g.drawImage(mon1,950,500, null);
			g.drawString(ms.name, 1165, 500);
			
			g.drawString(ms.hp, 1165, 550);
			g.drawString(sla, 1220, 550);
			g.drawString(ms.maxhp, 1255, 550);
			
			g.drawImage(attack, 1100, 570, null);
			g.drawString(ms.atk, 1175, 600);
			
			g.drawImage(depend, 1250, 570, null);
		    g.drawString(ms.def, 1325, 600);
			}
		    //식인괴물일때
			if(ms.monster2) {
				g.drawImage(mon2,950,420, null);
				g.drawString(ms.name, 1365, 500);
				
				g.drawString(ms.hp, 1345, 550);
				g.drawString(sla, 1420, 550);
				g.drawString(ms.maxhp, 1455, 550);
				
				g.drawImage(attack, 1300, 570, null);
				g.drawString(ms.atk, 1375, 600);
				
				g.drawImage(depend, 1450, 570, null);
			    g.drawString(ms.def, 1525, 600);
				}
		    //흉포한괴수일때
			if(ms.monster3) {
				g.drawImage(mon3,820,350, null);
				g.drawString(ms.name, 1365, 400);
				
				g.drawString(ms.hp, 1345, 450);
				g.drawString(sla, 1420, 450);
				g.drawString(ms.maxhp, 1455, 450);
				
				g.drawImage(attack, 1300, 470, null);
				g.drawString(ms.atk, 1375, 500);
				
				g.drawImage(depend, 1450, 470, null);
			    g.drawString(ms.def, 1525, 500);
				}
			//탐욕의화신
			if(ms.monster4) {
				g.drawImage(mon4,820,300, null);
				g.drawString(ms.name, 1365, 400);
				
				g.drawString(ms.hp, 1345, 450);
				g.drawString(sla, 1420, 450);
				g.drawString(ms.maxhp, 1455, 450);
				
				g.drawImage(attack, 1300, 470, null);
				g.drawString(ms.atk, 1375, 500);
				
				g.drawImage(depend, 1450, 470, null);
			    g.drawString(ms.def, 1525, 500);
				}
			//약탈자
			if(ms.monster5) {
				g.drawImage(mon5,820,250, null);
				g.drawString(ms.name, 1365, 400);
				
				g.drawString(ms.hp, 1345, 450);
				g.drawString(sla, 1420, 450);
				g.drawString(ms.maxhp, 1455, 450);
				
				g.drawImage(attack, 1300, 470, null);
				g.drawString(ms.atk, 1375, 500);
				
				g.drawImage(depend, 1450, 470, null);
			    g.drawString(ms.def, 1525, 500);
				}
			//파괴의마수
			if(ms.monster6) {
				g.drawImage(mon6,800,235, null);
				g.drawString(ms.name, 1365, 400);
				
				g.drawString(ms.hp, 1345, 450);
				g.drawString(sla, 1420, 450);
				g.drawString(ms.maxhp, 1455, 450);
				
				g.drawImage(attack, 1300, 470, null);
				g.drawString(ms.atk, 1375, 500);
				
				g.drawImage(depend, 1450, 470, null);
			    g.drawString(ms.def, 1525, 500);
				}
	
		}
		
		if(gameover) {
			tutoButton.setVisible(false);
			moneyButton.setVisible(false);
			deckButton.setVisible(false);
			timeButton.setVisible(false);
			hpButton.setVisible(false);
			drawdeck.setVisible(false);
			usedeck.setVisible(false);
			backButton.setVisible(true);
			background = new ImageIcon(main.class.getResource("../images/over.png")).getImage();
		}
		
		   if(ab.poison) {
		    	g.drawImage(poisonn, 100, 550, null);
		    }
	        if(ab.blood) {
	        	g.drawImage(blooddd, 150, 550, null);
	        }
	        if(ab.weak) {
	        	g.drawImage(weakkk, 200, 550, null);
	        }
	        if(ab.vulner) {
	        	g.drawImage(vulnerr, 260, 550, null);
	        }
	        
	        if(ab.epoison) {
		    	g.drawImage(poisonn, 1300, 550, null);
		    }
	        if(ab.eblood) {
	        	g.drawImage(blooddd, 1350, 550, null);
	        }
	        if(ab.eweak) {
	      	g.drawImage(weakkk, 1400, 550, null);
	        }
	        if(ab.evulner) {
	        	g.drawImage(vulnerr, 1460, 550, null);
	        }
		
		this.repaint();
		paintComponents(g);
		// this.repaint();
	
		
		
	}
	
	
	
	
//배틀에들어갔을때 메소드  배틀메소드
	public void battle() {
		  if(dk.deck.size()<=5) {
			  dk.deck.addAll(dk.use);
			 dk.use.clear();
		  }
		//상태이상동기화
		poidd pd = new poidd();		weakdd wd = new weakdd();		vulnerdd vl = new vulnerdd();
		epoidd epd = new epoidd(); eblood eb = new eblood(); eweak ew = new eweak();
		ms.ab = ab;		pd.ab = ab;		pd.ch = ch;		th.ch = ch;		th.ab = ab;		ch.ab = ab;
		wd.ab = ab;		vl.ab = ab;		vl.ch = ch; epd.ab=ab; epd.ms=ms; eb.ab=ab; eb.ms = ms; ew.ab =ab;
		
		if(vl.getState()==Thread.State.NEW) {
			vl.start();	
		}
		if(wd.getState()==Thread.State.NEW) {
			wd.start();	
		}
		if(pd.getState()==Thread.State.NEW) {
			pd.start();	
		}
		if(th.getState()==Thread.State.NEW) {
			th.start();	
		}
		if(epd.getState()==Thread.State.NEW) {
			epd.start();	
		}
		if(eb.getState()==Thread.State.NEW) {
			eb.start();	
		}		
		if(ew.getState()==Thread.State.NEW) {
			ew.start();	
		}
		
ab.blood=true;
	ab.poison=true;
	ab.weak=true;	
	ab.vulner=true;	
	//상태이상공사중
	//ab.epoison=true;
//	ab.eblood=true;
	//ab.eweak=true;
	//ab.evulner=true;
	
		dk.cardcount=0;
		  dk.drawcard();
			if(dk.hand[0]==1) {
				cardgm1 = 1;
				hand1.setIcon(cutr);
				}
				else if(dk.hand[0]==2) {
					cardgm1 = 2;	
					hand1.setIcon(defenser);
				}
	            else if(dk.hand[0]==3) {
	            	cardgm1 = 3;       
	            	hand1.setIcon(devilcutr);
				}
			
			if(dk.hand[1]==1) {
				cardgm2 = 1;
				hand2.setIcon(cutr);
				}
				else if(dk.hand[1]==2) {
					cardgm2 = 2;	
					hand2.setIcon(defenser);
				}
	            else if(dk.hand[1]==3) {
	            	cardgm2 = 3;      
	            	hand2.setIcon(devilcutr);
				}
			
			if(dk.hand[2]==1) {
				cardgm3 = 1;
				hand3.setIcon(cutr);
				}
				else if(dk.hand[2]==2) {
					cardgm3 = 2;		
					hand3.setIcon(defenser);
				}
	            else if(dk.hand[2]==3) {
	            	cardgm3 = 3;     
	            	hand3.setIcon(devilcutr);
				}
			
			if(dk.hand[3]==1) {
				cardgm4 = 1;
				hand4.setIcon(cutr);
				}
				else if(dk.hand[3]==2) {
					cardgm4 = 2;		
					hand4.setIcon(defenser);
				}
	            else if(dk.hand[3]==3) {
	            	cardgm4 = 3;      
	            	hand4.setIcon(devilcutr);
				}
			
			if(dk.hand[4]==1) {
				cardgm5 = 1;
				hand5.setIcon(cutr);
				}
				else if(dk.hand[4]==2) {
					cardgm5 = 2;		
					hand5.setIcon(defenser);
				}
	            else if(dk.hand[4]==3) {
	            	cardgm5 = 3;           	
	            	hand5.setIcon(devilcutr);
				}
			//poison=true;
			//blood=true;
			//weak=true;
			//vulnerable = true;
			//epoison=true;
			//eblood=true;
			//eweak=true;
			//evulnerable = true;
		/*
			if(ab.mstat==2) {
				blo.setVisible(true);
				blo.setVisible(false);
			}
			*/
			//상태이상시
			/*
			if(poison) {
				poi.setVisible(true);
			}
			
			if(blood) {
				blo.setVisible(true);
			}
		
			if(weak) {
				wea.setVisible(true);
			}
			
			if(vulnerable) {
				vul.setVisible(true);
			}
			
			if(epoison) {
				epoi.setVisible(true);
			}
			if(eblood) {
				eblo.setVisible(true);
			}
			if(eweak) {
				ewea.setVisible(true);
			}
			if(evulnerable) {
				evul.setVisible(true);
			}
			*/
			
	//	isMainScreen=false;
	
		
		
        
		//뽑을카드가 있는지 확인하고 없으면 사용카드를 뽑을카드로 가져온다
		/*
		if(dk.deck.size()==0) {
	    	for(int i=0; i<dk.use.size(); i++) {
	    	dk.deck.add(dk.use.get(i));
	    	
	    	}
		}
		else {
			dk.drawcard();
		}
		*/

		
		//
		
		//5번째카드 핸드를 배열로바꾸자
				hand5.setBounds(980, 700, 150, 243);
				hand5.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {

						
						hand5.setCursor(new Cursor(Cursor.HAND_CURSOR));
						
					}
					
					public void mouseExited(MouseEvent e) {
						
						hand5.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
					}
					public void mousePressed(MouseEvent e) {
						//5카드사용이벤트!!!!!
					
						
						if(dk.hand[4]==1) {
							ch.useatk = ch.useatk + cd.attackcard(dk.hand[4]);
							 ch.attack =Integer.toString(ch.useatk); 
							 
							}
							else if(dk.hand[4]==3) {
								ch.useatk = ch.useatk + cd.attackcard(dk.hand[4]);
								   ch.attack = Integer.toString(ch.useatk); 
								
								}
							else if(dk.hand[4]==2) {
								ch.usedef  = ch.usedef + cd.defensecard(dk.hand[4]);
								  ch.depend= Integer.toString(ch.usedef); 
								}
						
					
						
						//System.out.println(dk.usecount(1));
						
						hand5.setVisible(false);
						
						dk.cardcount=dk.cardcount+1;
						dk.use.add(dk.hand[4]);
						dk.hand[4]=0;
						System.out.println("카드카운터"+move1+move2+move3+move4+move5);
						if(move1+move2+move3+move4+move5==3) {
							next.setVisible(true);
							hand1.setVisible(false);hand2.setVisible(false);hand3.setVisible(false);
							hand4.setVisible(false);	
							dk.cardcount=0;
						
							if(move1==1) {
								dk.use.add(dk.hand[0]);
								dk.hand[0]=0;
								
							}
                            if(move2==1) {
                            	dk.use.add(dk.hand[1]);
								dk.hand[1]=0;
								
							}
if(move3==1) {
	dk.use.add(dk.hand[2]);
	dk.hand[2]=0;	
	
							}
if(move4==1) {
	dk.use.add(dk.hand[3]);
	dk.hand[3]=0;	

}

							
							
						}
						move5 =0;
					}
					
				});
				hand5.setVisible(true);
				hand5.setCursor(new Cursor(Cursor.HAND_CURSOR));
				hand5.setBorderPainted(false);
				hand5.setContentAreaFilled(false);
				hand5.setFocusPainted(false);
				add(hand5);
				
				//카드
				hand4.setBounds(860, 700, 150, 243);
				hand4.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {

						
						hand4.setCursor(new Cursor(Cursor.HAND_CURSOR));
						
					}
					
					public void mouseExited(MouseEvent e) {
						
						hand4.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
					}
					public void mousePressed(MouseEvent e) {
						//4카드사용이벤트!!!!!
						if(dk.hand[3]==1) {
							ch.useatk = ch.useatk + cd.attackcard(dk.hand[3]);
							 ch.attack =Integer.toString(ch.useatk); 
							 
							}
							else if(dk.hand[3]==3) {
								ch.useatk = ch.useatk + cd.attackcard(dk.hand[3]);
								   ch.attack = Integer.toString(ch.useatk); 
								
								}
							else if(dk.hand[3]==2) {
								ch.usedef  = ch.usedef + cd.defensecard(dk.hand[3]);
								  ch.depend= Integer.toString(ch.usedef); 
								}
			
						hand4.setVisible(false);
						dk.cardcount=dk.cardcount+1;
						dk.use.add(dk.hand[3]);
						dk.hand[3]=0;
						System.out.println("카드카운터"+move1+move2+move3+move4+move5);
						if(move1+move2+move3+move4+move5==3) {		
							next.setVisible(true);
							hand1.setVisible(false);hand2.setVisible(false);hand3.setVisible(false);
							hand5.setVisible(false);
							
							dk.cardcount=0;
							if(move1==1) {
								dk.use.add(dk.hand[0]);
								dk.hand[0]=0;
							}
                            if(move2==1) {
                            	dk.use.add(dk.hand[1]);
								dk.hand[1]=0;
							}
if(move3==1) {
	dk.use.add(dk.hand[2]);
	dk.hand[2]=0;						
							}
if(move5==1) {
	dk.use.add(dk.hand[4]);
	dk.hand[4]=0;
}
							
						}
						move4 =0;
					}
					
				});
				hand4.setVisible(true);
				hand4.setCursor(new Cursor(Cursor.HAND_CURSOR));
				hand4.setBorderPainted(false);
				hand4.setContentAreaFilled(false);
				hand4.setFocusPainted(false);
				add(hand4);
				
				//3번째카드
				hand3.setBounds(740, 700, 150, 243);
				hand3.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {

						
						hand3.setCursor(new Cursor(Cursor.HAND_CURSOR));
						
					}
					
					public void mouseExited(MouseEvent e) {
						
						hand3.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
					}
					public void mousePressed(MouseEvent e) {
						//3카드사용이벤트!!!!!
						if(dk.hand[2]==1) {
							ch.useatk = ch.useatk + cd.attackcard(dk.hand[2]);
							 ch.attack =Integer.toString(ch.useatk); 
							 
							}
							else if(dk.hand[2]==3) {
								ch.useatk = ch.useatk + cd.attackcard(dk.hand[2]);
								   ch.attack = Integer.toString(ch.useatk); 
								
								}
							else if(dk.hand[2]==2) {
								ch.usedef  = ch.usedef + cd.defensecard(dk.hand[2]);
								  ch.depend= Integer.toString(ch.usedef); 
								}
						
						
						hand3.setVisible(false);
						
						dk.cardcount=dk.cardcount+1;
						dk.use.add(dk.hand[2]);
						dk.hand[2]=0;
						System.out.println("카드카운터"+move1+move2+move3+move4+move5);
						if(move1+move2+move3+move4+move5==3) {		
							next.setVisible(true);
							hand1.setVisible(false);hand2.setVisible(false);
							hand4.setVisible(false);hand5.setVisible(false);
						
							dk.cardcount=0;
							if(move1==1) {
								dk.use.add(dk.hand[0]);
								dk.hand[0]=0;
							}
                            if(move2==1) {
                            	dk.use.add(dk.hand[1]);
								dk.hand[1]=0;
							}
if(move4==1) {
	dk.use.add(dk.hand[3]);
	dk.hand[3]=0;						
							}
if(move5==1) {
	dk.use.add(dk.hand[4]);
	dk.hand[4]=0;
}
							
						}
						move3 =0;
			
					}
					
				});
				hand3.setVisible(true);
				hand3.setCursor(new Cursor(Cursor.HAND_CURSOR));
				hand3.setBorderPainted(false);
				hand3.setContentAreaFilled(false);
				hand3.setFocusPainted(false);
				add(hand3);
				
				//2번째카드
				hand2.setBounds(620, 700, 150, 243);
				hand2.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {

						
						hand2.setCursor(new Cursor(Cursor.HAND_CURSOR));
						
					}
					
					public void mouseExited(MouseEvent e) {
						
						hand2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
					}
					public void mousePressed(MouseEvent e) {
						//2카드사용이벤트!!!!!
						if(dk.hand[1]==1) {
							ch.useatk = ch.useatk + cd.attackcard(dk.hand[1]);
							 ch.attack =Integer.toString(ch.useatk); 
							 
							}
							else if(dk.hand[1]==3) {
								ch.useatk = ch.useatk + cd.attackcard(dk.hand[1]);
								   ch.attack = Integer.toString(ch.useatk); 
								
								}
							else if(dk.hand[1]==2) {
								ch.usedef  = ch.usedef + cd.defensecard(dk.hand[1]);
								  ch.depend= Integer.toString(ch.usedef); 
								}
						
						hand2.setVisible(false);
						
						dk.cardcount=dk.cardcount+1;
						dk.use.add(dk.hand[1]);
						dk.hand[1]=0;
						System.out.println("카드카운터"+move1+move2+move3+move4+move5);
						if(move1+move2+move3+move4+move5==3) {
							next.setVisible(true);
							
							hand1.setVisible(false);hand3.setVisible(false);
							hand4.setVisible(false);hand5.setVisible(false);
						
							dk.cardcount=0;
							if(move1==1) {
								dk.use.add(dk.hand[0]);
								dk.hand[0]=0;
							}
                            if(move4==1) {
                            	dk.use.add(dk.hand[3]);
								dk.hand[3]=0;
							}
if(move3==1) {
	dk.use.add(dk.hand[2]);
	dk.hand[2]=0;						
							}
if(move5==1) {
	dk.use.add(dk.hand[4]);
	dk.hand[4]=0;
}
						}
						move2 =0;
					}
					
				});
				hand2.setVisible(true);
				hand2.setCursor(new Cursor(Cursor.HAND_CURSOR));
				hand2.setBorderPainted(false);
				hand2.setContentAreaFilled(false);
				hand2.setFocusPainted(false);
				add(hand2);
				
				
		
		//1번째카드
	
		hand1.setBounds(500, 700, 150, 243);
		hand1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {

				
				hand1.setCursor(new Cursor(Cursor.HAND_CURSOR));
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				hand1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			public void mousePressed(MouseEvent e) {
				//1카드사용이벤트!!!!!
				if(dk.hand[0]==1) {
					ch.useatk = ch.useatk + cd.attackcard(dk.hand[0]);
					 ch.attack =Integer.toString(ch.useatk); 
					 
					}
					else if(dk.hand[0]==3) {
						ch.useatk = ch.useatk + cd.attackcard(dk.hand[0]);
						   ch.attack = Integer.toString(ch.useatk); 
						
						}
					else if(dk.hand[0]==2) {
						ch.usedef  = ch.usedef + cd.defensecard(dk.hand[0]);
						  ch.depend= Integer.toString(ch.usedef); 
						}
				
				
				hand1.setVisible(false);
				
				dk.cardcount=dk.cardcount+1;
				dk.use.add(dk.hand[0]);
				dk.hand[0]=0;
				System.out.println("카드카운터"+move1+move2+move3+move4+move5);
				if(move1+move2+move3+move4+move5==3) {
					next.setVisible(true);
					hand2.setVisible(false);hand3.setVisible(false);
					hand4.setVisible(false);hand5.setVisible(false);
					
					dk.cardcount=0;
					if(move5==1) {
						dk.use.add(dk.hand[4]);
						dk.hand[4]=0;
					}
                    if(move2==1) {
                    	dk.use.add(dk.hand[1]);
						dk.hand[1]=0;
					}
if(move3==1) {
dk.use.add(dk.hand[2]);
dk.hand[2]=0;						
					}
if(move4==1) {
dk.use.add(dk.hand[3]);
dk.hand[3]=0;
}
				}
				move1 =0;
			

                 
		
			}
			

		});
		hand1.setVisible(true);
		hand1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		hand1.setBorderPainted(false);
		hand1.setContentAreaFilled(false);
		hand1.setFocusPainted(false);
		add(hand1);
		
		next.setBounds(0, 500, 213, 263);
		next.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {

				
				next.setCursor(new Cursor(Cursor.HAND_CURSOR));
				
			

			}
			
			public void mouseExited(MouseEvent e) {
				
				next.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			public void mousePressed(MouseEvent e) {
				next.setVisible(false);
				
				System.out.println("카드카운터"+dk.cardcount);
				//여기 넥스트누르면 전투진행해보자
				//내가몬스터때릴때 딜계산
				
				if(ab.weak) {
					ch.weak(ch.useatk);
					ab.wcount = ab.wcount+1;
					if(ab.wcount==2) {
						ab.wcount=0;
						ab.weak=false;
					}
				}
				
				if(ab.evulner) {
					ms.vulner(ms.defi);
					ab.evcount=ab.evcount+1;
					if(ab.evcount==2) {
						ab.evulner=false;
						ab.evcount=0;
					}
				}
				ms.hpi = bt.deal(ch.useatk, ms.hpi, ms.defi);
				
				if(ms.hpi<=0) {
				hand1.setVisible(false);hand2.setVisible(false);hand3.setVisible(false);hand4.setVisible(false);
				hand5.setVisible(false);
				ms.mondead(ms.hpi);	
				
					//전투끝
				dk.recard();
					isbattle = false;
					background = new ImageIcon(main.class.getResource("../images/mainback.png")).getImage();
					drawdeck.setVisible(false);
					usedeck.setVisible(false);
				    next.setVisible(true);
					monButton.setVisible(true);
					elitemonButton.setVisible(true);
					merchantButton.setVisible(true);
					restButton.setVisible(true);
					eventButton.setVisible(true);
					treasureButton.setVisible(true);
					backButton.setVisible(true);
					isbattle=false;
					monButton.setVisible(false);
					vl.interrupt();		wd.interrupt();		pd.interrupt();		th.interrupt();	
					epd.interrupt();	 eb.interrupt();	 ew.interrupt();	
					
				}
				
				ms.hp = Integer.toString(ms.hpi); 
				
				
			
				//몬스터가나때릴때
				if(ab.vulner) {
					ch.vulner(usedef);
					ab.vcount=ab.vcount+1;
					if(ab.vcount==2) {
						ab.vulner=false;
						ab.vcount=0;
					}
				}
				
				if(ab.eweak) {
					ms.weak(ms.atki);
					ab.ewcount = ab.ewcount+1;
					if(ab.ewcount==2) {
						ab.ewcount=0;
						ab.eweak=false;
					}
				}
				System.out.println("몬스터공격력"+ms.atki);
			ch.hp = bt.deal(ms.atki, ch.hp, ch.usedef);
				if(ch.hp<=0) {
					dk.recard();
					vl.interrupt();		wd.interrupt();		pd.interrupt();		th.interrupt();	
					epd.interrupt();	 eb.interrupt();	 ew.interrupt();	
					
					isbattle = false;
					isMainScreen=false;
					gameover = true;
					return;
				}
				
				ch.hpi = Integer.toString(ch.hp);
				

			
				      //  ms.atk="0"; ms.atki=0;
				      //  ms.defi=0; ms.def="0";
				//몹 공방초기화구간
				ms.atki=5;
				ms.defi=5;
				        ch.attack="0";
						ch.depend="0";
						ch.useatk=0;
						ch.usedef=0;
			
				
				
				
				
				//다음턴
				move1=1;move2=1;move3=1;move4=1;move5=1;
				
			
				
				if(dk.deck.size()<=5) {
					  dk.deck.addAll(dk.use);
					 dk.use.clear();
					  
				
				  }
				
				dk.drawcard();
				
				if(dk.hand[0]==1) {
					cardgm1 = 1;
					hand1.setIcon(cutr);
					}
					else if(dk.hand[0]==2) {
						cardgm1 = 2;	
						hand1.setIcon(defenser);
					}
		            else if(dk.hand[0]==3) {
		            	cardgm1 = 3;       
		            	hand1.setIcon(devilcutr);
					}
				
				if(dk.hand[1]==1) {
					cardgm2 = 1;
					hand2.setIcon(cutr);
					}
					else if(dk.hand[1]==2) {
						cardgm2 = 2;	
						hand2.setIcon(defenser);
					}
		            else if(dk.hand[1]==3) {
		            	cardgm2 = 3;      
		            	hand2.setIcon(devilcutr);
					}
				
				if(dk.hand[2]==1) {
					cardgm3 = 1;
					hand3.setIcon(cutr);
					}
					else if(dk.hand[2]==2) {
						cardgm3 = 2;		
						hand3.setIcon(defenser);
					}
		            else if(dk.hand[2]==3) {
		            	cardgm3 = 3;     
		            	hand3.setIcon(devilcutr);
					}
				
				if(dk.hand[3]==1) {
					cardgm4 = 1;
					hand4.setIcon(cutr);
					}
					else if(dk.hand[3]==2) {
						cardgm4 = 2;		
						hand4.setIcon(defenser);
					}
		            else if(dk.hand[3]==3) {
		            	cardgm4 = 3;      
		            	hand4.setIcon(devilcutr);
					}
				
				if(dk.hand[4]==1) {
					cardgm5 = 1;
					hand5.setIcon(cutr);
					}
					else if(dk.hand[4]==2) {
						cardgm5 = 2;		
						hand5.setIcon(defenser);
					}
		            else if(dk.hand[4]==3) {
		            	cardgm5 = 3;           	
		            	hand5.setIcon(devilcutr);
					}
				dk.cardcount=0;
			
				
			if(isbattle) {
				hand1.setVisible(true);hand2.setVisible(true);hand3.setVisible(true);
				hand4.setVisible(true);hand5.setVisible(true);
					
			}
			
					
				
			}
			
		});
		
		//next.setVisible(false);
		next.setCursor(new Cursor(Cursor.HAND_CURSOR));
		next.setBorderPainted(false);
		next.setContentAreaFilled(false);
		next.setFocusPainted(false);
		add(next);
		
		
	
		
		
	
	}
	
	//상인만났을때 메소드
	public void merchant() {
		monButton.setVisible(false);
		elitemonButton.setVisible(false);
		merchantButton.setVisible(false);
		restButton.setVisible(false);
		eventButton.setVisible(false);
		treasureButton.setVisible(false);
		backButton.setVisible(false);
		
		background = new ImageIcon(main.class.getResource("../images/merchantb.png")).getImage();
	}
	
	//휴식할때 메소드
public void rest() {
		
	}

//보물 메소드
public void treasure() {
	
}

//미지이벤트메소드
public void event() {
	
}
public void powerget(){
	
	
}




	
}
