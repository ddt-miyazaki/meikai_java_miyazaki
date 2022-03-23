package ensyu13_1;
// Scannerのインポート
import java.util.Scanner;
/*
	図形クラス群をテストするプログラムを作成せよ
	List13-9と同じく、Shape型の配列を利用して、インスタンスの生成と表示を行うこと
	ただし、個々の要素が参照するインスタンスは、プログラム内に与えるのではなく、
	キーボードから読み込むようにすること
*/
public class ensyu13_1 {
	public static void main(String[] args) {
		// 変数の初期化
		Scanner stdIn = new Scanner(System.in);
		// 図形の個数をキーボードから読み込む
		System.out.print("図形は何個：");
		// 入力された個数で配列を生成
		Shape[] p = new Shape[stdIn.nextInt()];
		
		// 入力された個数の図形を生成する
		for (int i = 0; i < p.length; i++) {
			// 生成する図形の種類の提示
			System.out.print((i + 1) + "番の図形の種類（1…点／2…水平直線／3…垂直直線／4…長方形）：" );
			// 入力されたキーから分岐
			switch (stdIn.nextInt()) {
				// 入力されたキーが1のとき	
				case 1:
					// 点のインスタンスを配列に生成
					p[i] = new Point();
					// 次の処理へ
					break;
				// 入力されたキーが2のとき	
				case 2:
					// 長さを入力させ
					System.out.print("長さ：");
					// 入力された長さで水平直線のインスタンスを配列に生成
					p[i] = new HorzLine(stdIn.nextInt());
					// 次の処理へ
					break;
				// 入力されたキーが3のとき	
				case 3:
					// 長さを入力させ
					System.out.print("長さ：");
					// 入力された長さで垂直直線のインスタンスを配列に生成
					p[i] = new VirtLine(stdIn.nextInt());
					// 次の処理へ
					break;
				// 入力されたキーが4のとき	
				case 4:
					// 幅と
					System.out.print("幅：");
					int w = stdIn.nextInt();
					// 高さを入力させ
					System.out.print("高さ：");
					// 入力された値で長方形のインスタンスを配列に生成
					p[i] = new Rectangle(w, stdIn.nextInt());
					// 次の処理へ
					break;
			}
		}
		// 生成した図形の描画
		for (Shape s : p)
			s.print();
		
	}
}
