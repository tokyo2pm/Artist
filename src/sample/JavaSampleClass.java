package sample;

public class JavaSampleClass {
	public static void main(String[] args) {
		System.out.println("おすすめのアーティストを紹介します( ＾ω＾ )");
		System.out.println("あなたの名前を入力してください。");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください。");
		String ageString = new java.util.Scanner(System.in).nextLine();
		int age = Integer.parseInt(ageString);
		int fortune = new java.util.Random().nextInt(4);
		fortune++;
		System.out.println("結果が出ました！");
		System.out.println(age + "歳の" + name + "さんにおすすめのアーティストは" + fortune + "です！ぜひ聴いてみてくださいね！");
		System.out.println("1:サカナクション 2:[Alexandros] 3:きのこ帝国 4:クリープハイプ");
	}
}