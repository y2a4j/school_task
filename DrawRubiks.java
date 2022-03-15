import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DrawRubiks {
	public static void main(String[] args) {
		DrawFrame1 f = new DrawFrame1("Rubiks");
	}
}

class DrawFrame1 extends Frame{
	//描画オブジェクトのインスタンスを記録するフィールド
	GRubiks1[] grubiks1;
	GRubiks2[] grubiks2;
	GRubiks3[] grubiks3;
	GStand[] gstand;
	GDeco1[] gdeco1;
	GDeco2[] gdeco2;
	GDeco3[] gdeco3;

	public DrawFrame1(String title) {
		//ウィンドウのタイトル設定
		super(title);

		//ウィンドウを閉じる機能
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent evt) {
				System.exit(0);
			}
		});

		//インスタンスを生成
		grubiks1 = new GRubiks1[1];
		grubiks1[0] = new GRubiks1(0, 0, Color.yellow);

		grubiks2 = new GRubiks2[1];
		grubiks2[0] = new GRubiks2(0, 0, Color.red);

		grubiks3 = new GRubiks3[1];
		grubiks3[0] = new GRubiks3(0, 0, Color.blue);

		gstand = new GStand[1];
		gstand[0] = new GStand(0, 0, Color.white);

		gdeco1 = new GDeco1[1];
		gdeco1[0] = new GDeco1(0, 0, Color.yellow);

		gdeco2 = new GDeco2[1];
		gdeco2[0] = new GDeco2(0, 0, Color.blue);

		gdeco3 = new GDeco3[1];
		gdeco3[0] = new GDeco3(0, 0, Color.red);

		//ウィンドウのサイズ
		setSize(500,500);
		//ウィンドウを可視化
		setVisible(true);
		setBackground(Color.black);
	}

	public void paint(Graphics g) {
		//各描画オブジェクトに描画を依頼
		for(int i = 0; i < grubiks1.length; i++) {
			grubiks1[i].draw(g);
		}

		for(int i = 0; i < grubiks2.length; i++) {
			grubiks2[i].draw(g);
		}

		for(int i = 0; i < grubiks3.length; i++) {
			grubiks3[i].draw(g);
		}

		for(int i = 0; i < gstand.length; i++) {
			gstand[i].draw(g);
		}

		for(int i = 0; i < gdeco1.length; i++) {
			gdeco1[i].draw(g);
		}

		for(int i = 0; i < gdeco2.length; i++) {
			gdeco2[i].draw(g);
		}

		for(int i = 0; i < gdeco3.length; i++) {
			gdeco3[i].draw(g);
		}
	}
}

//左面
class GRubiks1{
	int x0, y0;
	Color c;

	public GRubiks1(int x, int y, Color c) {
		this.x0 = x;
		this.y0 = y;
		this.c = c;
	}

	public void draw(Graphics g) {
		g.setColor(c);

		//外枠
		g.drawLine(248, 100, 248, 300);
		g.drawLine(100, 175, 250, 100);
		g.drawLine(100, 375, 100, 175);
		g.drawLine(100, 375, 250, 300);

		//内側
		g.drawLine(100, 241, 250, 166);
		g.drawLine(100, 308, 250, 233);
		g.drawLine(150, 150, 150, 350);
		g.drawLine(200, 125, 200, 325);

	}
}

//右面
class GRubiks2{
	int x0, y0;
	Color c;

	public GRubiks2(int x, int y, Color c) {
		this.x0 = x;
		this.y0 = y;
		this.c = c;
	}

	public void draw(Graphics g) {
		g.setColor(c);

		//外枠
		g.drawLine(250, 100, 250, 300);
		g.drawLine(400, 175, 250, 100);
		g.drawLine(400, 375, 400, 175);
		g.drawLine(400, 375, 250, 300);

		//内側
		g.drawLine(400, 241, 250, 166);
		g.drawLine(400, 308, 250, 233);
		g.drawLine(300, 125, 300, 325);
		g.drawLine(350, 150, 350, 350);

	}
}

//下面
class GRubiks3{
	int x0, y0;
	Color c;

	public GRubiks3(int x, int y, Color c) {
		this.x0 = x;
		this.y0 = y;
		this.c = c;
	}

	public void draw(Graphics g) {
		g.setColor(c);

		//外枠
		g.drawLine(100, 377, 250, 302);
		g.drawLine(400, 377, 250, 302);
		g.drawLine(175, 412, 100, 375);
		g.drawLine(325, 412, 400, 375);

		//内側
		g.drawLine(200, 325, 350, 400);
		g.drawLine(150, 350, 275, 412);
		g.drawLine(300, 325, 150, 400);
		g.drawLine(350, 350, 225, 412);
	}
}

//台
class GStand{
	int x0, y0;
	Color c;

	public GStand(int x, int y, Color c) {
		this.x0 = x;
		this.y0 = y;
		this.c = c;
	}

	public void draw(Graphics g) {
		g.setColor(c);

		//外枠
		g.drawLine(165, 412, 335, 412);
		g.drawLine(165, 412, 75, 450);
		g.drawLine(335, 412, 425, 450);
		g.drawLine(75, 450, 425, 450);

	}
}

//台の装飾１
class GDeco1{
	int x0, y0;
	Color c;

	public GDeco1(int x, int y, Color c) {
		this.x0 = x;
		this.y0 = y;
		this.c = c;
	}

	public void draw(Graphics g) {
		g.setColor(c);

		g.drawOval(165, 412, 33, 33);

	}
}

//台の装飾２
class GDeco2{
	int x0, y0;
	Color c;

	public GDeco2(int x, int y, Color c) {
		this.x0 = x;
		this.y0 = y;
		this.c = c;
	}

	public void draw(Graphics g) {
		g.setColor(c);

		g.drawOval(233, 412, 33, 33);

	}
}

//台の装飾３
class GDeco3{
	int x0, y0;
	Color c;

	public GDeco3(int x, int y, Color c) {
		this.x0 = x;
		this.y0 = y;
		this.c = c;
	}

	public void draw(Graphics g) {
		g.setColor(c);

		g.drawOval(302, 412, 33, 33);

	}
}








